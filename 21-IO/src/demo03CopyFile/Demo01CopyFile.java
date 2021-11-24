package demo03CopyFile;

import java.io.*;

public class Demo01CopyFile {
    public static void main(String[] args) throws IOException {
        //method1("D:\\photo\\ccc79ab72ab94cf067917a4a83766ae2.jpg","D:\\photo\\copy.jpg",1482752);
        //method2("D:\\photo\\ccc79ab72ab94cf067917a4a83766ae2.jpg","D:\\photo\\copy.jpg",1482752);
        method3("D:\\photo\\ccc79ab72ab94cf067917a4a83766ae2.jpg","D:\\photo\\copy.jpg");
    }

    public static void method2(String name,String target,int size) throws IOException{
        FileInputStream fis=new FileInputStream(name);
        FileOutputStream fos=new FileOutputStream(target);
        int len=0;
        while((len=fis.read())!=-1){
            fos.write(len);
        }
        //释放资源（先关写的，后关闭读的；如果写完了，肯定读取完毕了）
        fos.close();
        fis.close();
    }
    public static void method3(String name,String target) throws IOException{
        long s=System.currentTimeMillis();
        FileInputStream fis=new FileInputStream(name);
        FileOutputStream fos=new FileOutputStream(target);
        int len=0;
        byte[] bytes=new byte[10240];//复制速度与数组大小有关
        while ((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        fis.close();
        fos.close();
        long e=System.currentTimeMillis();
        System.out.println("复制共耗时："+(e-s)+"毫秒");
    }
}
