package demo01Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
    java.util.LinkedHashSet集合 extends HashSet集合
    LinkedHashSet集合特点：
    底层是一个哈希表（数组+链表/红黑树+链表：多了一条链表：记录元素的存储顺序，保证元素有序）
 */
public class Demo04LinkedHashSet {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        set.add("itCast");
        set.add("abc");
        set.add("abc");
        set.add("www");
        System.out.println(set);//[abc, itCast, www]//无序，不允许重复元素
        System.out.println("===========");

        LinkedHashSet<String> linked=new LinkedHashSet<>();
        linked.add("itCast");
        linked.add("abc");
        linked.add("abc");
        linked.add("www");
        System.out.println(linked);//[itCast, abc, www]//有序，不允许重复元素
    }
}
