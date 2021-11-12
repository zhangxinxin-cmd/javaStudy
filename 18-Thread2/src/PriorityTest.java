/*
* 线程优先级测试
* priority:优先事项
* */
public class PriorityTest {
    public static void main(String[] args) {
        Thread thread1=new Thread(new MyPriority(),"线程一");
        thread1.setPriority(1);
        thread1.start();
        Thread thread2=new Thread(new MyPriority(),"线程二");
        thread2.setPriority(10);
        thread2.start();
    }
}
class MyPriority implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"的线程优先级为"+Thread.currentThread().getPriority());
            System.out.println(i);
        }
    }
}