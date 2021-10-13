package demo04;
import java.util.InputMismatchException;
import java.util.Scanner; //1.导包
/*Scanner类的功能：可以实现从键盘输入数据到程序当中。
引用类型的一般使用步骤

1.倒包
import 包路径.类名称
如果需要使用的目标类，和当前类位于同一个包下，则可以省略包语不写。
2.创建
类名称 对象名 = new 类名称();
3.使用
对象名.成员方法名();

获取键盘输入的一个int数字：int num = sc.nextInt();
获取键盘输入的一个字符串：String str = sc.next();
* */
public class Demo01Scanner {
    public static void main(String[] args) {
        //    2.创建
        Scanner sc =new Scanner(System.in); //System.in代表从键盘输入
         int num=sc.nextInt();
        String str = sc.next();
        System.out.println("输入的数字是；"+num);
        System.out.println("输入的字符串是："+str);

    }
}
