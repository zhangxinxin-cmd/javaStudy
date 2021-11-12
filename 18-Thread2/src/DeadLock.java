/*
* 死锁的原因是两个线程都拿到了对方的锁。B线程要想得到A的锁a，就必须失去B的锁b，而A线程要想得到B的锁b，就必须失去A的锁
* //解决办法是任意一方主动丢掉锁
* */
public class DeadLock {
    public static void main(String[] args) {
        Makeup g1 = new Makeup(0, "灰姑娘");
        Makeup g2 = new Makeup(1, "白雪公主");
        g1.start();
        g2.start();
    }
}

class LipsTick {

}

class Mirror {

}

class Makeup extends Thread {
    final static LipsTick lipsTick = new LipsTick();
    final static Mirror mirror = new Mirror();
    private int choice;
    private String girlName;

    public Makeup(int choice, String girlName) {
        this.choice = choice;
        this.girlName = girlName;
    }

    @Override
    public void run() {
        makeup();
    }

    public void makeup() {
        if (choice == 0) {
            synchronized (lipsTick) {
                System.out.println(this.girlName + "获得了口红的锁");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                /*synchronized (mirror) {
                    System.out.println(this.girlName + "获得了镜子的锁");
                }*/
            }
            synchronized (mirror) {
                System.out.println(this.girlName + "获得了镜子的锁");
            }
        } else {
            synchronized (mirror) {
                System.out.println(this.girlName + "获得了镜子的锁");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lipsTick) {
                    System.out.println(this.girlName + "获得了口红的锁");
                }
            }
        }
    }
}