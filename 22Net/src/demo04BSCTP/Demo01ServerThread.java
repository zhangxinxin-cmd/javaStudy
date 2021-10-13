package demo04BSCTP;

import javax.swing.plaf.BorderUIResource;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
创建BS版本TCP服务器
 */
public class Demo01ServerThread {
    public static void main(String[] args) throws IOException {
        ServerSocket server=new ServerSocket(8080);

        /*
        浏览器解析服务器回写的html页面如果有图片，那么浏览器就会单独的开启一个线程，读取服务器的图片
        我们就让服务器一直处于监听状态，服务器就回写一次
         */
        while (true){
            Socket socket = server.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                   try{
                       InputStream is = socket.getInputStream();
                       byte[] bytes=new byte[1024];
                       int len=0;

                       //GET /22Net/web/index.thml HTTP/1.1
                       BufferedReader br=new BufferedReader(new InputStreamReader(is));
                       String line = br.readLine();
                       System.out.println(line);
                       System.out.println(Thread.currentThread().getName());
                       String[] arr = line.split(" ");
                       String htmlPath = arr[1].substring(1);
                       FileInputStream fis=new FileInputStream(htmlPath);
                       OutputStream os = socket.getOutputStream();

//        写入HTTP协议响应头固定写法
                       os.write("HTTP/1.1 200 OK\r\n".getBytes());
                       os.write("Content-Type:text/html\r\n".getBytes());
                       os.write("\r\n".getBytes());

                       while ((len=fis.read(bytes))!=-1){
                           os.write(bytes,0,len);
                       }
                       fis.close();
                       socket.close();
                   }catch (IOException e){
                       System.out.println(e);
                   }
                }
            }).start();
        }
        //server.close();
    }
}
