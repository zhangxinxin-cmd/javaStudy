package demo01Set;

import java.util.HashSet;

/*
Set集合不允许重估元素的原理
Set集合根据元素的hashCode来判断是否重复
而String的hashCode算法为：s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
使用 int 算法，这里 s[i] 是字符串的第 i 个字符的 ASCII 码，n 是字符串的长度，^ 表示求幂。空字符串的哈希值为 0。
 */
public class Demo02HashSetSaveString {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        String s1 = new String("abc");
        String s2 = new String("abc");
        set.add(s1);
        set.add(s2);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println("abc".hashCode());
        set.add("重地");
        set.add("通话");
        set.add("abc");
        System.out.println(set);
    }
}
