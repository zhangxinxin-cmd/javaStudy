package demo02;

import java.util.Date;

public class Demo02Date {
    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
        System.out.println(System.currentTimeMillis());
    }

    private static void demo03() {
        /*
        Long getTime()：把日期转换为毫秒值（相当于System.currentTimeMillis()方法）
        返回自1970年1月1日00:00:00GMT以来此Date对象表示的毫秒数。
       */
        Date date = new Date();
        System.out.println(date.getTime());
    }

    private static void demo01() {
        /*
        Date类的空参数构造方法。
        Date()获取当前系统的日期和时间。
         */
        Date date = new Date();
        System.out.println(date);
    }

    private static void demo02() {
        /*
        Date类的带参数构造方法。
        Date(long date):传递毫秒值，把毫秒值转换为Date日期。
         */
        Date date;
        date = new Date(System.currentTimeMillis());
        System.out.println(date);
        System.out.println(date.getTime());
    }
}
