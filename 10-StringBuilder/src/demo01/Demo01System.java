package demo01;

import java.util.Arrays;

/*
        java.lang.System类中提供了大量的静态方法，可以获取与系统相关的信息或系统级操作，在System类的API文档中，常用的方法有：
public static long currentTimeMillis()：返回以毫秒为单位的当前时间。
public static void arrayCopy(Object src, int srcPos, Object dest, int destPos, int length)：将数组中指定的数据拷贝到另一个数组中。
        */
public class Demo01System {
    public static void main(String[] args) {
        //demo01();
        dem02();
    }

    /*
       public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)：将数组中指定的数据拷贝到另一个数组中。
       参数:
           src - 源数组。
           srcPos - 源数组中的起始位置(起始索引)。
           dest - 目标数组。
           destPos - 目标数据中的起始位置。
           length - 要复制的数组元素的数量。
       练习:
           将src数组中前3个元素，复制到dest数组的前3个位置上
               复制元素前：
               src数组元素[1,2,3,4,5]，dest数组元素[6,7,8,9,10]
               复制元素后：
               src数组元素[1,2,3,4,5]，dest数组元素[1,2,3,9,10]
    */
    private static void dem02() {
        //定义源数组
        int[] src={1,2,3,4,5};
        //定义目标数组
        int[] dest={32,22,32};
        System.out.println("复制前："+Arrays.toString(dest));
        System.arraycopy(src,0,dest,0,2);
        System.out.println("复制后："+Arrays.toString(dest));
    }

    private static void demo01() {
        long s=System.currentTimeMillis();
        System.out.println(s);
        for (int i = 0; i <= 0X1A; i++) {
            System.out.println(i );
        }
        long e=System.currentTimeMillis();
        System.out.println("\n"+"程序共耗时："+(e-s)+"毫秒");
    }
}
