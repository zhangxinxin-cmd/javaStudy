package demo03Map;

import java.util.HashMap;
import java.util.LinkedHashMap;

/*
    java.util.LinkedHashMap<k,v> extends HashMap<k,v>
    Map接口的哈希表和链表实现，具有可与之的迭代顺序。
    底层原理：
    哈希表+链表(记录元素的顺序）
 */
public class Demo01LinkedHashMap {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put("a","a");
        map.put("c","c");
        map.put("b","b");
        map.put("a","d");//{a=d, b=b, c=c}
        System.out.println(map);

        LinkedHashMap<String,String> linked=new LinkedHashMap<>();
        linked.put("a","a");
        linked.put("b","b");
        linked.put("c","c");
        linked.put("d","d");
        System.out.println(linked );//{a=a, b=b, c=c, d=d}

    }
}
