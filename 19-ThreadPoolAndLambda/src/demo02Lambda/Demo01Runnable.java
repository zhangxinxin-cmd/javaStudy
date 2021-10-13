package demo02Lambda;

public class Demo01Runnable {
    public static void main(String[] args) {
        Runnable run=new RunnableImpl();
        Thread t=new Thread(run);
        t.start();

        //简化代码，使用匿名内部类，实现多线程程序
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("创建了一个线程：" + Thread.currentThread().getName());
            }
        };
        new Thread(r).start();
    }
}
