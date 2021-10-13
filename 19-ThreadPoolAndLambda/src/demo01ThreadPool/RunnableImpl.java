package demo01ThreadPool;

public class RunnableImpl implements Runnable {

    @Override
    public void run() {
        System.out.println("创建了一个新的线程："+Thread.currentThread().getName()+"执行");
    }
}
