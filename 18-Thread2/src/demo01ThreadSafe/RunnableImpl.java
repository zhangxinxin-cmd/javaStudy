package demo01ThreadSafe;
/*

 */
public class RunnableImpl implements Runnable {
    //定义一个多线程共享的资源
    private int ticket=100;

    @Override
    public void run() {
        while (true){
            if(ticket>0){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"正在卖第"+ticket+"票");
                ticket--;

            }else{
                break;
            }
        }
    }
}
