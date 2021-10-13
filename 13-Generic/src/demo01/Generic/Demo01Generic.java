package demo01.Generic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

/*
泛型的通配符：
    ?：代表任意的数据类型
使用方式：
    不能创建对象使用
    只能作为方法的参数使用
    既可用于方法的接收参数类型，也可用于返回值参数类型
 */
public class Demo01Generic {
    public static void main(String[] args) {
        ArrayList<Integer> list01=new ArrayList<>();
        list01.add(12);
        list01.add(21);

        ArrayList<String> list02=new ArrayList<>();
        list02.add("迪丽热巴");
        list02.add("古力娜扎");

//        ArrayList<?> list03=new ArrayList<?>();//非法
        System.out.println("========");

        printArray(list01);
        printArray(list02);
    }
    /*
    定义一个方法，能遍历所有类型的ArrayList集合
    这时候我们不知道ArrayList是哪种集合，可以泛型的通配符?来接收数据类型。
    注意：泛型没有继承概念
     */
    public static void printArray(ArrayList<?> list){
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
