package GetName;
public class Demo01GetThreadName {
    public static void main(String[] args) {
        MyThread mt=new MyThread();
        mt.start();
        new MyThread().start();
    }
}
