package demo02Lambda;
/*
Lambda表达式的标准格式：
    由三部分组成：
        a.一些参数
        b.一个箭头
        c.一段代码
        格式：
            (参数) -> (一些重写方法的代码)
        解释说明格式：
            ()：接口抽象方法的参数泪飙，没有参数，就空着；有参数就写出参数，多个参数使用逗号分隔
            ->:传递的意思，把参数传递个方法体
            ():重写接口的抽象方法的方法体
 */
public class DemoLambda {
    public static void main(String[] args) {
        //使用匿名内部类的方式，实现多线程
       /*new Thread(){
           @Override
           public void run() {
               System.out.println("创建了一个线程；"+Thread.currentThread().getName());
           }
       }.start();*/

       new Thread(new Runnable() {
           @Override
           public void run() {
               System.out.println("创建了一个线程："+Thread.currentThread().getName());
           }
       }).start();
        //使用Lambda表达式实现多线程
        new Thread(()->{
            System.out.println("创建了一个线程："+Thread.currentThread().getName());
        }).start();
    }
}
