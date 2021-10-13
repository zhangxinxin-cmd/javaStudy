package demo04Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/*
        - java.utils.Collections是集合工具类，用来对集合进行操作。部分方法如下：
        - public static <T> boolean addAll(Collection<T> c, T... elements):往集合中添加一些元素。
        - public static void shuffle(List<?> list) 打乱顺序:打乱集合顺序。
        */
public class Demo01Collections {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Collections.addAll(list,12,22,11,32,22);
        System.out.println(list);//[12, 22, 11, 32, 22]
        Collections.shuffle(list);
        System.out.println(list);
    }
}
