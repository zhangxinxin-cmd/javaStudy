package demo10ArrayMethodReference;
/*
数组的构造器引用
 */
public class Demo {
    public static int[] createArray(int length,ArrayBuilder ab){
        return ab.buildArray(length);
    }

    public static void main(String[] args) {
        int[] array1 = createArray(4, (length) -> new int[length]);
        System.out.println(array1.length);
        /*
        使用方法应用优化Lambda表达式
        一直创建的就是int[]数组
        数组的长度是已知的
        就可以使用方法引用
        int[]引用new,根据参数传递的长度来创建数组
         */
        int[] array2 = createArray(4, int[]::new);
        System.out.println(array2.length);
    }
}
