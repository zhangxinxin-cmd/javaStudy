package demo02GetStream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

/*
    Stream流中的常用方法_count:用于统计Stream流中元素的个数
    long count();
    count方法是一个终结方法,返回值是一个long类型的整数
    所以不能再继续调用Stream流中的其他方法了
 */
public class Demo05Stream_Count {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 32, 22, 11, 22, 32);
        Stream<Integer> stream = list.stream();
        long count = stream.count();
        System.out.println(count);//5
    }
}
