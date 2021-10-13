package demo05;

import java.util.Scanner;

public class Demo02Anonymous {
    public static void main(String[] args) {
//        匿名对象的使用方式
//        int num = new Scanner(System.in).nextInt();
//        System.out.println("输出："+num);

//        使用一般写法传参：
//        Scanner sc = new Scanner(System.in);
//        methodParam(sc);

//        使用匿名对象来进行传参；
        methodParam(new Scanner(System.in));
        Scanner sc =methodReturn();
        double num = sc.nextDouble();
        System.out.println("输出："+num);
    }
    public static void methodParam(Scanner sc){
        int num=sc.nextInt();
        System.out.println("输出："+num);
    }

    public static Scanner methodReturn(){
//        Scanner SC = new Scanner(System.in);
//        return sc;
        return new Scanner(System.in);
    }
}
