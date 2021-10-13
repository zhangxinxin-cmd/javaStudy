package demo01;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo01Generic {
    public static void main(String[] args) {
       // show1();
        show2();
    }

    /*
            创建集合对象,使用泛型
            好处:
                1.避免了类型转换的麻烦,存储的是什么类型,取出的就是什么类型
                2.把运行期异常(代码运行之后会抛出的异常),提升到了编译期(写代码的时候会报错)
             弊端:
                泛型是什么类型,只能存储什么类型的数据
         */
    private static void show2() {
    ArrayList<String> list =new ArrayList<>();
    list.add("afa");
//    list.add(1);//禁止

        //使用迭代器遍历list集合
        for (String str : list) {
            System.out.println(str + "->" + str.length());
        }
    }
    private static void show1() {
        ArrayList list=new ArrayList();
        list.add("abc");
        list.add(1);
        Iterator<java.io.Serializable> it=list.iterator();
        while (it.hasNext()){
            Object obj=it.next();
            System.out.println(obj);
            //想要使用String类特有的方法,length获取字符串的长度;不能使用  多态 Object obj = "abc";
            //需要向下转型
            //会抛出ClassCastException类型转换异常,不能把Integer类型转换为String类型
            String s=(String)obj;
            System.out.println(s.length());
        }
    }
}
