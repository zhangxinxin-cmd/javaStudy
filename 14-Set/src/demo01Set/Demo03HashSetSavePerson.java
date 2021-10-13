package demo01Set;

import java.util.HashSet;

/*
    HashSet存储自定义元素

    set集合报错元素唯一：
    存储的元素(String,Integer,...Student,Person),必须重写hashCode方法和equals方法
    要求：
    同名同年龄的人，视为同一个人，只能存储一次
 */
public class Demo03HashSetSavePerson {
    public static void main(String[] args) {
        HashSet<Person> s1=new HashSet<>();
        Person p1=new Person("小明",12);
        Person p2=new Person("小明",12);
        Person p3=new Person("小红",22);
        System.out.println(p1==p2);
        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode()+" "+p2.hashCode());
        s1.add(p1);
        s1.add(p2);
        s1.add(p3);
        System.out.println(s1);
    }
}
