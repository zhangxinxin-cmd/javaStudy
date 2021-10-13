package Demo05Debug;

import org.w3c.dom.ls.LSOutput;

import java.io.File;

/*
Debug调试程序：
    可以让代码逐行执行，查看代码执行的过程，调试程序中出现的bug
    使用方式：
    在行号的右边，鼠标左键单机，添加断点（每个方法的第一行，哪里有bug添加到哪里）
    F8：逐行执行程序
    F7：进入到方法中
    shift+F8:跳出方法
    F9:跳到下一个断点，如果没有下一个断点，那么就程序结束。
    Ctrl+F2:退出Debug模式，停止程序
    Console:切换到控制台
 */
public class Demo01Debug {
    public static void main(String[] args) {
         /*int a=1;
         int b=2;
         int c=3;
         int sum=a+b+c;
        System.out.println(sum);*/

        /*for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }*/
        print();
    }

    private static void print() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }
}
