import java.util.concurrent.CopyOnWriteArrayList;

public class JUCTest {
    public static void main(String[] args) throws InterruptedException {
        CopyOnWriteArrayList<String> list=new CopyOnWriteArrayList<>();
        System.out.println(list.size());
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                list.add(Thread.currentThread().getName());
            }).start();
        }
        Thread.sleep(1000);
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println(list.size());
    }
}
