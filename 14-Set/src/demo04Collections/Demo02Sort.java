package demo04Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
    - java.utils.Collections是集合工具类，用来对集合进行操作。部分方法如下：
        public static <T> void sort(List<T> list):将集合中元素按照默认规则排序。

    注意:
         sort(List<T> list)使用前提
         被排序的集合里边存储的元素,必须实现Comparable,重写接口中的方法compareTo定义排序的规则

    Comparable接口的排序规则:
        自己(this)-参数:升序
 */
public class Demo02Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Collections.addAll(list,12,22,11,32,21,54,32);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        System.out.println("============");

        ArrayList<String> list2=new ArrayList<>();
        Collections.addAll(list2,"a","d","c","b");
        System.out.println(list2);
        Collections.sort(list2);
        System.out.println(list2);

        ArrayList<Person> list3=new ArrayList<>();
        Person p1=new Person("张三",18);
        Person p2=new Person("李四",20);
        Person p3=new Person("王五",15);
        Collections.addAll(list3,p1,p2,p3);
        System.out.println(list3);
        Collections.sort(list3);
    }
}
