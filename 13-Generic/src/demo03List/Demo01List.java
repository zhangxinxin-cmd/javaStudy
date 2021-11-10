package demo03List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
        java.util.List接口 extends Collection接口
        List接口的特点：
        1.有序的集合，存储和取出元素的顺序是一致的（存储123 取出123）
        2.有索引，包含了一些带索引的昂法
        3.允许存储重复的元素

        List接口中带索引的方法（特有）
        - public void add(int index,E element):将指定的元素，添加到该集合中的指定位置。
        - public E get(int index):返回集合中指定位置的元素。
        - public E remove(int index):移除列表中指定位置的元素，返回的是被移除的元素。
        - public E set(int index,E element):用指定元素替换集合中指定位置的元素，返回的更新前的元素。
        注意：
            操作索引的时候，一定要防止索引越界。
            IndexOutOfBoundsException:索引越界异常，集合会报。
            ArrayIndexOutOfBoundsException:数组索引越界异常。
            StringIndexOutOfBoundsException:字符串索引越界异常。
 */
public class Demo01List {
    public static void main(String[] args) {
        //创建一个List 对象
        List<String> list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        //打印集合
        System.out.println(list);//[a,b,c,d] 不是地址，重写了toString()

        //public void add(int index,E elements):将指定的元素，添加到该集合中的指定位置上。
        //在c和d之间添加一个mm.
        list.add(3,"mm");
        System.out.println(list);//[a, b, c, mm, d]
        //public E remove(int index):移除列表中指定位置的元素，返回的是被移除的元素。
        //移除元素
        System.out.println("被移除的元素是："+list.remove(3));

        //public E set(int index,E element):用指定元素替换集合中指定位置的元素，返回的更新前的元素。
        //把最后一个元素替换成D
        String setRemove=list.set(3,"D");
        System.out.println("被替换的元素是："+setRemove);//被替换的元素是：d
        System.out.println("替换后的集合元素是："+list);//替换后的集合元素是：[a, b, c, D]

        //list集合遍历有3中方式：
        //使用普通的for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("=============");

        //使用迭代器来遍历
        Iterator<String> it=list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("=============");

        //使用foreach来遍历
        for (String str : list) {
            System.out.println(str);
        }
        System.out.println("=============");

        System.out.println(list.get(4));
    }
}
