package demo03;

/*
局部内部类，如果希望访问方法所在的局部变量，那么这个变量就必须是【有效final的】
从java8+开始，只要局部变量事实不变，那么final关键字可以省略

原因：new出来的对象在堆内存中
2.局部变量是跟着方法走的，在栈内存当中
3.方法运行结束后，立刻出栈，局部变量就会立刻消失
4.但是new出来的对象会在堆内存中持续存在，直到垃圾消失。
 */
public class MyOuter {
    public void methodOuter() {
        final int num = 9;//所在方法的局部变量
//        num=8;
        class MyInner {
            public void InnerMethod() {
                System.out.println(num);
            }
        }
    }
}
