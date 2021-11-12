/*
 * 守护线程
 * jvm会在用户线程结束后自动结束守护线程
 * */
public class DaemonTest {
    public static void main(String[] args) {
        Thread you = new Thread(new You(), "你");
        Thread god = new Thread(new God(), "上帝");
        god.setDaemon(true);//默认是false，表示是用户线程，正常的线程都是用户线程,设置true后是守护线程
        god.start();
        you.start();
    }
}

//你
class You implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 365; i++) {
            System.out.println("你一生都开心活着");
        }
        System.out.println("==============good bye!world");
    }
}

//上帝
class God implements Runnable {

    @Override
    public void run() {
        while (true) {
            System.out.println("上帝保佑着你");
        }
    }
}
