package demo01ThreadSafe;

public class Demo01Ticket {
    public static void main(String[] args) {
        RunnableImpl run = new RunnableImpl();
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        Thread t3 = new Thread(run);
        t1.setName("卖票一");
        t2.setName("卖票二");
        t3.setName("卖票三");
        t1.start();
        t2.start();
        t3.start();

    }
}
