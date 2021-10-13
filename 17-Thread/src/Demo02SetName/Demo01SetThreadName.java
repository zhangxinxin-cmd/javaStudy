package Demo02SetName;

public class Demo01SetThreadName {
    public static void main(String[] args) {
       MyThread mt=new MyThread("number1");
       mt.setName("number2");
       mt.start();
    }
}
