package demo03Stream;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Collections;
/*
    练习:集合元素处理（传统方式）
        现在有两个ArrayList集合存储队伍当中的多个成员姓名，要求使用传统的for循环（或增强for循环）依次进行以下若干操作步骤：
        1. 第一个队伍只要名字为3个字的成员姓名；存储到一个新集合中。
        2. 第一个队伍筛选之后只要前3个人；存储到一个新集合中。
        3. 第二个队伍只要姓张的成员姓名；存储到一个新集合中。
        4. 第二个队伍筛选之后不要前2个人；存储到一个新集合中。
        5. 将两个队伍合并为一个队伍；存储到一个新集合中。
        6. 根据姓名创建Person对象；存储到一个新集合中。
        7. 打印整个队伍的Person对象信息。
 */
public class Demo01StreamTest {
    public static void main(String[] args) {
        ArrayList<String> one=new ArrayList<>();
        Collections.addAll(one,"迪丽热巴","宋远桥","苏星河","石破天","石中玉","老子","庄子","洪七公");
        ArrayList<String> one1=new ArrayList<>();
        ArrayList<String> one2=new ArrayList<>();
        ArrayList<String> two=new ArrayList<>();
        Collections.addAll(two,"古力娜扎","张无忌","赵丽颖","张三丰","尼古拉斯.赵四","张天爱","赵二狗");
        ArrayList<String> two1=new ArrayList<>();
        ArrayList<String> two2=new ArrayList<>();
        for (String name : one) {
            if(name.length()==3) one1.add(name);
        }
        /*while (one1.size()!=3){
            one1.remove(3);
        }*///保留前三个
        for (int i = 0; i < 3; i++) {
            one2.add(one1.get(i));//i=0,1,2
        }
        for (String name : two) {
            if(name.startsWith("张")) two1.add(name);
        }
        for (int i = 2; i < two1.size(); i++) {
            two2.add(two1.get(i));
        }
        ArrayList<String> all=new ArrayList<>();
        all.addAll(one2);
        all.addAll(two2);
        ArrayList<Person> p1=new ArrayList<>();
        for (String name : all) {
            p1.add(new Person(name));
        }
        System.out.println(p1);
    }
}
