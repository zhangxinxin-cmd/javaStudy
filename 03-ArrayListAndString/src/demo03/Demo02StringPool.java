package demo03;

/*字符串常量池：程序当中直接写上的双引号字符串，就在字符串常量池中。

对于基本类型来说，==是进行数值的比较
对于引用类型来说，==是进行地址值的比较
* */
public class Demo02StringPool {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        char[] charArray = {'a', 'b', 'c'};
        String str3 = new String(charArray);
        System.out.println(str1 == str2);//true
        System.out.println(str1 == str3);//false
        System.out.println(str2 == str3);//false
        A a = new A(5);//执行顺序:静态代码块->非静态代码块->构造方法

    }
}

class A {
    private int a;
    private static int b;
    public static int c;

    public A(int a) {
        this.a = a;
        System.out.println("构造方法代码块");
    }

    static {
        System.out.println("static代码块");
    }

    {
        System.out.println("非静态代码块");
    }

    public void method() {
        System.out.println("方法代码块");
    }
}