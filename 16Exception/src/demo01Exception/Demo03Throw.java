package demo01Exception;

/*
throw关键字：
作用：
    可以使用throw关键字在指定的方法中抛出指定的异常
    使用格式：throw new xxxException("异常产生的原因");
    注意：
        1.throw关键字必须在方法的内部
        2.throw关键字后边new的对象必须是Exception或者Exception的子对象
        3.throw关键字抛出指定的一场对I型昂，我们就必须处理这个异常对象
                throw关键字后创建的是RuntimeException或者是RuntimeException的子类对象，
                我们可以不处理，默认交给JVM（打印异常对象，中断程序）
                throw关键字后边创建的是编译异常（写代码的时候报错），我们就必须处理这个异常，要么throws，要么try...catch
 */
public class Demo03Throw {
    public static void main(String[] args) {
        int[] arr = new int[3];
        int e = getElement(arr, 3);
        System.out.println(e);
    }

    /*
            定义一个方法,获取数组指定索引处的元素
            参数:
                int[] arr
                int index
            以后(工作中)我们首先必须对方法传递过来的参数进行合法性校验
            如果参数不合法,那么我们就必须使用抛出异常的方式,告知方法的调用者,传递的参数有问题
            注意:
                NullPointerException是一个运行期异常,我们不用处理,默认交给JVM处理
                ArrayIndexOutOfBoundsException是一个运行期异常,我们不用处理,默认交给JVM处理
         */
    private static int getElement(int[] array, int index) {
/*
            我们可以对传递过来的参数数组,进行合法性校验
            如果数组arr的值是null
            那么我们就抛出空指针异常,告知方法的调用者"传递的数组的值是null"
         */
        if (array == null) {
            throw new ArrayIndexOutOfBoundsException("传递的数组的值是null");
            //该异常类是继承了IndexOutOfBoundException,其又继承了RuntimeException
        }
        if (index < 0 || index >= array.length) {
            throw new ArrayIndexOutOfBoundsException("传递的索引超出了数组的使用范围");
        }
        return array[index];
    }
}
