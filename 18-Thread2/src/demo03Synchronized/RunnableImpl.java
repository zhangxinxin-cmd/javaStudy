package demo03Synchronized;
/*

 */
public class RunnableImpl implements Runnable {
    //定义一个多线程共享的资源
    private static int ticket = 100;

    @Override
    public void run() {
        payTicket();
    }

    public static synchronized void payTicket() {
        //System.out.println(this);
        while (true) {
            if (ticket > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "票");
                ticket--;
            } else {
                break;
            }
        }

    }
}