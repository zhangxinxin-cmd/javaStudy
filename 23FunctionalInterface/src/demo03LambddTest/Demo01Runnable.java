package demo03LambddTest;

public class Demo01Runnable {
    public static void main(String[] args) {
        startRunnable(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"线程启动了");
            }
        });
            //采用函数式编程，方法的参数是一个函数式接口，所以可以传递Lambda表达式
        startRunnable(()->{
            System.out.println(Thread.currentThread().getName()+"线程启动了");
        });
        //优化Lambda表达式
        startRunnable(()-> System.out.println(Thread.currentThread().getName()+"启动了"));
    }

    public static void startRunnable(Runnable run){
        new Thread(run).start();
    }
}
