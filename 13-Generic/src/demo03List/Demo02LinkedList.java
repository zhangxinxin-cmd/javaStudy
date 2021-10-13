package demo03List;

import java.util.LinkedList;

/*
    java.util.LinkedList集合 implements List接口
    LinkedList集合的特点:
        1.底层是一个链表结构:查询慢,增删快
        2.里边包含了大量操作首尾元素的方法
        注意:使用LinkedList集合特有的方法,不能使用多态

        - public void addFirst(E e):将指定元素插入此列表的开头。
        - public void addLast(E e):将指定元素添加到此列表的结尾。
        - public void push(E e):将元素推入此列表所表示的堆栈。

        - public E getFirst():返回此列表的第一个元素。
        - public E getLast():返回此列表的最后一个元素。

        - public E removeFirst():移除并返回此列表的第一个元素。
        - public E removeLast():移除并返回此列表的最后一个元素。
        - public E pop():从此列表所表示的堆栈处弹出一个元素。

        - public boolean isEmpty()：如果列表不包含元素，则返回true。

 */
public class Demo02LinkedList {
    public static void main(String[] args) {
//        demo01();
//        demo02();
        demo03();
    }

    private static void demo03() {
        //创建LinkedList集合对象
        LinkedList<String> linked=new LinkedList<>();
        //使用add方法添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");
        linked.add("d");
        System.out.println(linked);

        String first=linked.removeFirst();
        System.out.println("被移除的第一个元素是："+first);

        String last=linked.removeLast();
        System.out.println("被移除的最后一个元素是："+last);

        System.out.println(linked);

        String pop= linked.pop();
        System.out.println("弹栈的元素是："+pop);
    }

    /*
    -public E getFirst(void):返回此列表第一元素
    -public E getLast(void):返回此列表最后一个元素
     */
    private static void demo02() {
        //创建LinkedList集合对象
        LinkedList<String> linked=new LinkedList<>();
        //使用add方法添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");
        linked.add("d");

        linked.clear();//清空集合中的元素，在获取集合中的元素会抛出NoSuchElementException
        //public boolean isEmpty():判断集合是否为空。
        if(!linked.isEmpty()) {
            String first = linked.getFirst();
            System.out.println(first);
            String last = linked.getLast();
            System.out.println(last);
        }
    }

    private static void demo01() {
        //创建LinkedList集合对象
        LinkedList<String> linked=new LinkedList<>();
        //使用add方法添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");
        linked.add("d");
        System.out.println(linked);
        System.out.println("=============");
        //public void addFirst(E e):将指定元素插入此列元素的开头
        linked.addFirst("abc");
        System.out.println(linked);
        System.out.println("=============");
        //public void addLast(E e):将指定元素插入此列元素的末尾，相当于public void add(E e);
        linked.addLast("cba");
        System.out.println(linked);
    }
}
