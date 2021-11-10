package demo01Exception;

/*
异常的产生过程即系（分析异常的怎么产生的，如何处理异常）
 */
public class Demo02Exception {
    public static void main(String[] args) {
        /*int[] array=new int[]{12,22,12};
        int e = geElement(array, 3);
        System.out.println(e);*/
        /*
        以后（工作中）我们首先必须对方法传递过来的参数进行合法习惯校验
        如果参数不合法，那么我们就必须使用抛出异常的方式，告知方法的调用者，传递的参数有问题
         */
        int[] array = null;
//        System.out.println(geElement(array, 0));
        array = new int[]{2, 3, 4, 5, 2};
        System.out.println(geElement(array, array.length));
    }

    public static int geElement(int[] array, int index) {
        /*
        我们可以对传递过来的参数数组，进行合法性校验
        如果数组array的值是null
        那么我们就抛出空指针异常，告知方法的调用者“传递的数组的值是null”
         */
        if (array == null) {
            throw new NullPointerException("传递的数组是null");
        }
        if (array.length <= index || index < 0) {
            throw new ArrayIndexOutOfBoundsException("数组下标" + index + "越界");
        }
        int ele = array[index];
        return ele;
    }
}
