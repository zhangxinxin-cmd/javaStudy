package demo01;

import java.io.File;

/*
    File类判断功能的方法
        - public boolean exists() ：此File表示的文件或目录是否实际存在。
        - public boolean isDirectory() ：此File表示的是否为目录。
        - public boolean isFile() ：此File表示的是否为文件。
 */
public class Demo04File {
    public static void main(String[] args) {
//        show01();
        show02();
    }
    /*
           public boolean isDirectory() ：此File表示的是否为目录。
               用于判断构造方法中给定的路径是否以文件夹结尾
                   是:true
                   否:false
           public boolean isFile() ：此File表示的是否为文件。
               用于判断构造方法中给定的路径是否以文件结尾
                   是:true
                   否:false
           注意:
               电脑的硬盘中只有文件/文件夹,两个方法是互斥
               这两个方法使用前提,路径必须是存在的,否则都返回false
        */
    private static void show02() {
        File f1=new File("D:\\photo\\ccc79ab72ab94cf067917a4a83766ae2.jpg");
        System.out.println(f1.isDirectory());//false
        System.out.println(f1.isFile());//true

        File f2=new File("D:\\photo");
        System.out.println(f2.isFile());//false
        System.out.println(f2.isDirectory());//true
    }

    /*
           public boolean isDirectory() ：此File表示的是否为目录。
               用于判断构造方法中给定的路径是否以文件夹结尾
                   是:true
                   否:false
           public boolean isFile() ：此File表示的是否为文件。
               用于判断构造方法中给定的路径是否以文件结尾
                   是:true
                   否:false
           注意:
               电脑的硬盘中只有文件/文件夹,两个方法是互斥
               这两个方法使用前提,路径必须是存在的,否则都返回false
        */
    private static void show01() {
        File f1=new File("D:\\photo\\ccc79ab72ab94cf067917a4a83766ae2.jpg");
        System.out.println(f1.exists());
        File f2=new File("D:\\photo\\ccc.jpg");
        System.out.println(f2.exists());
        File f3=new File("20-File\\src\\demo01\\Demo01File.java");
        System.out.println(f3.exists());
        File f4=new File("2-File\\src\\demo01\\Demo01File.java");
        System.out.println(f4.exists());
    }
}
