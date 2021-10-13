package demo06Test;

public class ChiHuo extends Thread {
    private BaoZi bz;

    public ChiHuo(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true){
            synchronized (bz){
                if(!bz.flag){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //被唤醒之后执行的代码
                System.out.println("吃货正在吃："+bz.pi+bz.xian+"的包子");
                bz.flag=false;
                bz.notify();
                System.out.println("吃货已经把："+bz.pi+bz.xian+"包子吃完了，包子铺开始生产包子");
                System.out.println("===============");
            }
        }
    }
}
