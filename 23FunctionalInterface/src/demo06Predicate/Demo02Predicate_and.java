package demo06Predicate;

import java.util.function.Predicate;

/*
    逻辑表达式：可以连接多个判断的条件
    &&：与运算符，有false则false
    ||:或运算符，有true则true
    !:非（取反运算符），非真则假，非假则真

    需求：判断一个字符串，有两个判断的条件
        1.判断字符串的长度是否大于5
        2.判断字符串中是否包含a
        两个条件必须同时满足，我们就可以使用&&运算符连接两个条件

        Predicate接口中有一个方法and
 */
public class Demo02Predicate_and {
    public static boolean checkString(String str, Predicate<String> pr1, Predicate<String> pr2) {
//        return pr1.test(str)&&pr2.test(str);
        return pr1.and(pr2).test(str);
    }

    public static void main(String[] args) {
        String str = "abcdef";
        boolean b = checkString(str, s -> {
            return s.length() > 3;
        }, s -> {
            return s.contains("a");
        });
        System.out.println(b);
    }
}
