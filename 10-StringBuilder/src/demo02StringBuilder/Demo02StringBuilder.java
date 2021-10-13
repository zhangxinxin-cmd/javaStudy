package demo02StringBuilder;
/*
StringBuilder的常用方法：
public StringBuilder append(...):添加任意类型数据的字符串形式，并返回当前对象。

 */
public class Demo02StringBuilder {
    public static void main(String[] args) {
        StringBuilder bu1 = new StringBuilder();
        //创建append方法往StringBuilder中添加数据
        //append方法返回的是this，调用方法的对象
        /*bu1.append(3);//使用append方法无需接收返回值
       StringBuilder bu2= bu1.append("aaa");//把bu的地址赋值给了bu2
        System.out.println(bu1);
        System.out.println(bu2);
        System.out.println(bu1==bu2);*/

        bu1.append("abc" );
        bu1.append(1);
        bu1.append(true);
        bu1.append(8.8);
        bu1.append("中");
        System.out.println(bu1);
        /*
        链式编程：方法返回值是一个对象，可以继续调用方法
         */
        System.out.println("abc".toUpperCase().toLowerCase().toUpperCase().toLowerCase());
        bu1.append("abc").append(21).append("中").append(true).append(43.87);
        System.out.println(bu1);
    }
}
