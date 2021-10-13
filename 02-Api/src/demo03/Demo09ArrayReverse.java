package demo03;

import java.util.Arrays;

public class Demo09ArrayReverse {
    public static void main(String[] args) {
            Demo10ArrayParam Array = new Demo10ArrayParam();
           int[] array= Array.create();
           Array.reverse(array);
           Array.arrayPrint(array);
           System.out.println("==========");
//           使用面向对象
//        找一个JDK给我们提供好的Arrays类
//        其中有一个toString方法，直接就能把数组变成想要的格式的字符串
           System.out.println(Arrays.toString(array));

    }
}
