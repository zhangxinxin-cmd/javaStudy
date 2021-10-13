package demo08CopyFile;

import java.io.*;
import java.util.logging.Level;

public class Demo01CopyFile {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        FileInputStream fis=new FileInputStream("D:\\photo\\ccc79ab72ab94cf067917a4a83766ae2.jpg");
            FileOutputStream fos=new FileOutputStream("D:\\photo\\copy2.jpg");
            BufferedInputStream bis=new BufferedInputStream(fis,1024);
            BufferedOutputStream bos=new BufferedOutputStream(fos,1024);
            byte[] bytes =new byte[10240];
            int len=0;
            while ((len=bis.read(bytes))!=-1){
                bos.write(bytes,0, len);
            }
            bis.close();
            bos.close();
        System.out.println("共花"+(System.currentTimeMillis()-s)+"毫秒");
    }
}
