package demo01;

public class Demo04GenericInterface {
    public static void main(String[] args) {
        GenericInterfaceImpl1 gil=new GenericInterfaceImpl1();
        gil.method("古力娜扎");

        System.out.println("==========");
        GenericInterfaceImpl2<Integer> gi2 =new GenericInterfaceImpl2<>();
        gi2.method(12);
        GenericInterfaceImpl2<Double> gi3=new GenericInterfaceImpl2<>();
        gi3.method(4.21);
    }
}
