package demo01Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
    使用Stream流的方式,遍历集合,对集合中的数据进行过滤
    Stream流是JDK1.8之后出现的
    关注的是做什么,而不是怎么做
 */
public class Demo02Stream {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        List<String> list1=new ArrayList<>();
        Collections.addAll(list,"张无忌","周芷若","赵敏","赵强","张三丰");
        list.stream().filter((name)->name.startsWith("张"))
                .filter((Name)-> Name.length()==3).
                forEach(list1::add);
        System.out.println(list1);
    }
}
