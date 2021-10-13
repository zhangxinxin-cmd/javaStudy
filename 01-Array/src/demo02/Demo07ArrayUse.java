package demo02;

import java.util.Scanner;

/*
 * 使用动态数组的时候，其中的元素会自动拥有一个默认值。规则如下：
 * 如果是整数类型，那么默认是0；
 * 如果是浮点类型，那么默认是0.0；
 * 如果是字符类型，那么默认是'\u0000'；
 * 如果是布尔类型，那么默认是false；
 * 如果是引用类型，那么默认是null；
 *
 * 注意事项；静态初始化也有默认值的过程，只不过系统马上将默认值替换成了大括号当中的具体数值
 * */
public class Demo07ArrayUse {
    public static void main(String[] args) {
        int[] array = new int[3];
        B.ArrayScanner(array);
       // A.ArrayPrintln(array);
        int[] array2=array;
        array2[0]=3;
        System.out.println(array[0]);//结果和array2[0]结果相同，因为array和array2指向同一个数组
    }
}

class B {
    public static void ArrayScanner(int[] array) {
        System.out.println("Input");
        for (int i = 0; i < array.length; i++) {
            Scanner sc = new Scanner(System.in);
            array[i] = sc.nextInt();
        }
    }
}
