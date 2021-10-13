package demo03;

import java.util.Arrays;

/*题目：
定义一个方法，把数组｛1，2,3｝按照指定格式拼接成一个字符串，格式参照如下：[word1#word2#word3]
* */
public class Demo08StringPractise {
    public static void main(String[] args) {
        int[] array={1,2,3};
        String str =getString(array);
        System.out.println(str);

    }
    public static String getString(int[] array){
        String str ="[";
        for (int i = 0; i < array.length; i++) {
            if(i==array.length-1){
                str+="word"+array[i]+"]";
            }
            else{
                str+="word"+array[i]+"#";
            }
        }
        return str;
    }
}
