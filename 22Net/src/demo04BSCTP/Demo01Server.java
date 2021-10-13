package demo04BSCTP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLOutput;

/*
创建BS版本TCP服务器
 */
public class Demo01Server {
    public static void main(String[] args) throws IOException {
        ServerSocket server=new ServerSocket(8080);
        Socket socket = server.accept();
        InputStream is = socket.getInputStream();
        byte[] bytes=new byte[1024];
        int len=0;
        /*while ((len=is.read(bytes))!=-1){
            System.out.println(new String(bytes));
        }*/
        //GET /22Net/web/index.thml HTTP/1.1
        BufferedReader br=new BufferedReader(new InputStreamReader(is));
        String line = br.readLine();
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
        server.close();
    }
}
