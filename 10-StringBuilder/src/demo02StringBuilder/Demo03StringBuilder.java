package demo02StringBuilder;

import java.util.Arrays;

/*
StringBuilder和String可以相互转化
String->StringBuilder:可以使用StringBuilder的构造方法
public String toString(String[] args)
 */
public class Demo03StringBuilder {
    public static void main(String[] args) {
        String string="hello";
        //String->StringBuilder
        StringBuilder stringBuilder=new StringBuilder(string);
        System.out.println(stringBuilder);
        stringBuilder.append(" world");
        //StringBuilder->String
        String str=stringBuilder.toString();
        System.out.println(str);

    }
}
