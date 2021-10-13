package demo01;

import java.lang.reflect.Array;
import java.util.Arrays;

/*题目：
请使用Arrays相关的API,将一个随机字符串的所有字符进行升序排列，并倒序打印。
* */
public class Demo02ArraysPractice {
    public static void main(String[] args) {
//        如何进行升序排列：sort
//        必须是一个数组，才能用Arrays.sort方法
//        String---->数组：用toCharArray方法
        String str="adafcessa";
        char[] chars=str.toCharArray();
        Arrays.sort(chars);
        //System.out.println(Arrays.toString(chars));
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[chars.length-1-i]);
            if(i!=chars.length-1){
                System.out.print(" ");
            }
        }

        System.out.println("\n=========");

        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
            if(i!=0){
                System.out.print(" ");
            }
        }
    }
}
