package demo03Stream;

import java.awt.color.ProfileDataException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo02StreamTest {
    public static void main(String[] args) {
        ArrayList<String> one=new ArrayList<>();
        Collections.addAll(one,"迪丽热巴","宋远桥","苏星河","石破天","石中玉","老子","庄子","洪七公");
        ArrayList<String> two=new ArrayList<>();
        Collections.addAll(two,"古力娜扎","张无忌","赵丽颖","张三丰","尼古拉斯.赵四","张天爱","赵二狗");
        Stream<String> oneStream = one.stream().filter((name) -> name.length() == 3).limit(3);
        Stream<String> twoStream = two.stream().filter((name) -> name.startsWith("张")).skip(2);
        Stream<Person> personStream = Stream.concat(oneStream, twoStream).map((name) -> new Person(name));
        ArrayList<Person> collect = personStream.collect(Collectors.toCollection(ArrayList::new));
        System.out.println(collect);

    }
}
