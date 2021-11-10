package Demo02SetName;

public class Demo01SetThreadName {
    public static void main(String[] args) {
        MyThread mt = new MyThread("number1");
        MyThread mt2 = new MyThread("number2");
        mt.start();
        mt2.start();
    }
}
