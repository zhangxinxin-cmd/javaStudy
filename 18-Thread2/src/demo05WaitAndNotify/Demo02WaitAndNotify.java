package demo05WaitAndNotify;
/*
进入到TimeWaiting(计时)有两种方式
1.使用sleep(long m)方法,在毫秒值结束之后，线程睡醒进入到Runnable/Blacked状态
2.使用Wait(long m)方法，wait方法如果在毫秒值结束之后，还没有被notify唤醒，就会自动唤醒
 */
public class Demo02WaitAndNotify {
    public static void main(String[] args) {
        Object obj=new Object();
        //创建一个顾客线程(消费者)
        new Thread(){
            @Override
            public void run() {
                while (true){
                    synchronized (obj) {
                        System.out.println("顾客1告知老板要的包子数量和种类");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("顾客1，包子已经好了。");
                    }
                    try {
                        sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                }
        }.start();

        new Thread(){
            @Override
            public void run() {
                while (true){
                    synchronized (obj) {
                        System.out.println("顾客2告知老板要的包子数量和种类");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("顾客2，包子已经好了。");
                    }
                    try {
                        sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                while (true){
                    try {
                        sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj){
                        System.out.println("老板5秒钟之后做好包子，告知顾客，可以吃包子了");
                        obj.notifyAll();
                    }
                }
                }

        }.start();
    }
}
