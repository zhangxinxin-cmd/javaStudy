package demo04;

import java.util.Calendar;
import java.util.Date;

/*
        Calendar类的常用成员方法:
public int get(int field)：返回给定日历字段的值。
public void set(int field, int value)：将给定的日历字段设置为给定值。
public abstract void add(int field, int amount)：根据日历的规则，为给定的日历字段添加或减去指定的时间量。
public Date getTime()：返回一个表示此Calendar时间值（从历元到现在的毫秒偏移量）的Date对象。
        成员方法的参数:
        int field:日历类的字段,可以使用Calendar类的静态成员变量获取
public static final int YEAR = 1;	年
public static final int MONTH = 2;	月
public static final int DATE = 5;	月中的某一天
public static final int DAY_OF_MONTH = 5;月中的某一天
public static final int HOUR = 10; 		时
public static final int MINUTE = 12; 	分
public static final int SECOND = 13;	秒
        */
public class Demo02Calendar {
    public static void main(String[] args) {
        demo01();
//        demo02();
//        demo03();
//        demo04();
    }

    private static void demo04() {
        Calendar calendar=Calendar.getInstance();
        Date date=calendar.getTime();
        System.out.println(date);
        System.out.println(date.getTime());
    }

    /*
            public abstract void add(int field, int amount)：根据日历的规则，为给定的日历字段添加或减去指定的时间量。
            把指定的字段增加/减少指定的值
            参数:
                int field:传递指定的日历字段(YEAR,MONTH...)
                int amount:增加/减少指定的值
                    正数:增加
                    负数:减少
         */
    private static void demo03() {
        Calendar calendar=Calendar.getInstance();
        calendar.add(Calendar.YEAR,2);//把年增加2年
        calendar.add(Calendar.MONTH,2);//把月增加2月
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
    }

    /*
    public void set(int field,int value):将给定的日历字段设置为给定值。
     */
    private static void demo02() {
        Calendar calendar=Calendar.getInstance();
        calendar.set(Calendar.YEAR,2021);

        System.out.println(calendar.get(1));
        System.out.println("========");

        calendar.set(Calendar.MONTH,4);
        System.out.println(calendar.get(calendar.MONTH));
        System.out.println("========");

        System.out.println(calendar.get(Calendar.DATE));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("========");

        calendar.set(2020,4,18);
        System.out.println(calendar.get(Calendar.MONTH));
    }
    //public int get(int field):返回给定日历字段的值。
    private static void demo01() {
        Calendar calendar=Calendar.getInstance();
        //下面三种方法都正确。
        System.out.println(calendar.get(1));
        System.out.println(calendar.get(calendar.YEAR));
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println("========");

        System.out.println(calendar.get(2));
        System.out.println(calendar.get(calendar.MONTH));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println("========");

        System.out.println(calendar.get(Calendar.DATE));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
    }
}
