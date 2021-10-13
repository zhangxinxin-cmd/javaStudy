package demo03;

import java.text.*;
import java.util.Date;
import java.util.Scanner;

/*
    练习:
        请使用日期时间相关的API，计算出一个人已经出生了多少天。
    分析:
        1.使用Scanner类中的方法next,获取出生日期
        2.使用DateFormat类中的方法parse,把字符串的出生日期,解析为Date格式的出生日期
        3.把Date格式的出生日期转换为毫秒值
        4.获取当前的日期,转换为毫秒值
        5.使用当前日期的毫秒值-出生日期的毫秒值
        6.把毫秒差值转换为天(s/1000/60/60/24)
 */
public class Demo02Test {
    public static void main(String[] args) throws ParseException {
        System.out.println("您已存活："+getDay()+"天");
    }

    private static long getDay() throws ParseException {
        long Day=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入出生年份：");
        long year=sc.nextLong();
        System.out.println("请输入出生月份：");
        long month=sc.nextLong();
        System.out.println("请输入出生日：");
        long day=sc.nextLong();
        String string=year+"年"+month+"月"+day+"日";
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy年MM月dd日");
        Date date =simpleDateFormat.parse(string);
        Day=(new Date().getTime()-date.getTime())/86400000;
        /*System.out.println("========");
        System.out.println(string);
        System.out.println(new Date());
        System.out.println(new Date().getTime());
        System.out.println(date);
        System.out.println(date.getTime());*/
        return Day;
    }
}
