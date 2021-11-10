package demo06Predicate;

import javax.swing.*;
import java.awt.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

/*
java.util.function.Predicate<T>接口
作用：对某种数据类型的数据进行判断，结果返回一个boolean值

Predicate接口中包含一个抽象方法：
boolean test(T t):用来对指定数据类型进行判断的方法
 */
public class Demo01Predicate {
    /*
    定义一个方法
    参数传递一个String类型的字符串
    传递一个Predicate接口，泛型使用String
    使用Predicate中的方法test对字符串进行判断，并把判断的结果返回
     */
    public static boolean checkString(String s, Predicate<String> pre) {
        return pre.test(s);
    }

    public static boolean checkString(String s) {
        Predicate<String> predicate = (str) -> str.length() > 5;
        return predicate.test(s);
    }

    public static void main(String[] args) {
        String s = "abcdef";
        boolean b = checkString(s, str -> {
            //对参数传递的字符串进行判断，判断字符串的长度是否大于5，并把判断结果返回
            return str.length() > 5;
        });
        System.out.println(b);


        Predicate<String> predicate = (s1 -> s1.length() > 4);
        Predicate<String> predicate1 = (s1 -> s1.length() < 6);
        Predicate<String> and = predicate.and(predicate1);
        System.out.println(and.test("hello"));
        System.out.println(checkString(s));
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 2, 3, 12, 14, 10, 5, 7, 4);
        list.removeIf((i) -> {
            return i > 4;
        });
        System.out.println(list);
        Timer timer=new Timer(1000,(event)->{
            System.out.println("At the tone,the time is"+ Instant.ofEpochMilli(event.getWhen()));
            Toolkit.getDefaultToolkit().beep();
        });
        timer.start();
        JOptionPane.showMessageDialog(null,"quit?");
        System.exit(0);
    }
}
