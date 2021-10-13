package demo01Functional;

public class DemoMain {
    public static void main(String[] args) {

        method(new MyFunctionalInterfaceImpl());
        method(new MyFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("使用匿名内部类重写的抽象接口方法");
            }
        });

        method(()->System.out.println("使用函数式接口的抽象方法"));
    }
    public static void method(MyFunctionalInterface myInter){
        myInter.method();
    }
}
