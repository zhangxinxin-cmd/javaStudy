package demo02;
/*java.lang.Math类是数学相关的工具类，里面提供了大量的静态方法，完成与数学运算相关的操作
public static double abs(double num):获取绝对值。
public static double ceil(double num):向上取整。
public static double floor(double num):向下取整。
public static long round(double num):四舍五入。
* */
public class Demo01Math {
    public static void main(String[] args) {
        System.out.println(Math.abs(-12));//12
        System.out.println(Math.abs(-21.234));//21.234
        System.out.println(Math.abs(32.22));//32.22
        System.out.println(Math.abs(45));//45
        System.out.println("========");

//        向上取整
        System.out.println(Math.ceil(21.0/10));//3.0
        System.out.println(Math.ceil(3.3));//3.0
        System.out.println(Math.ceil(3.5));//3.0
        System.out.println(Math.ceil(3.99));//3.0
        System.out.println("========");

//        向下取整
        System.out.println(Math.floor(4.5));
        System.out.println(Math.floor(4.1));
        System.out.println(Math.floor(4.99));
        System.out.println(Math.floor(4.9));
        System.out.println(Math.floor(5.0));
        System.out.println("========");

//        四舍五入
        System.out.println(Math.round(3.01));//3
        System.out.println(Math.round(3.4));//3
        System.out.println(Math.round(3.5));//4
        System.out.println(Math.round(3.50));//4
        System.out.println(Math.round(3.51));//4
        System.out.println(Math.round(3.9));//4
        System.out.println("=======");
        System.out.println(Math.E);
    }
}
