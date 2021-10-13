package demo01;

import java.util.Arrays;

/*
* java.util.Arrays是一个与数组相关的工具类，里面提供了大量静态方法，用来实现数组常见方法。
* public static String toString(数组）：将参数数组变成字符串（按照默认格式：[元素1，元素2，元素3，。。。]
* public static void sort(数组）：按照默认升序对数组进行排序。
*
* 备注：
* 1.如果是数值，sort默认按照升序从小到大
*2.如果是字符串，sort默认按照字母升序
* 3.如果是自定义的类型，那么这个自定义的类需要有Comparable或者Comparable接口的支持。（今后学习）
* */
public class Demo01Arrays {
    public static void main(String[] args) {
        int[] intArray ={12,23,44};
//        将int[]默认格式变成字符串。
        String instr= Arrays.toString(intArray);
        //System.out.println(instr.charAt(0));// [
        System.out.println(instr);
        System.out.println("========");

        int [] array1={1,3,2,12,33,45};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
        System.out.println("========");

        String[] array2={"aa","bb","cc","dd"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));
    }
}
