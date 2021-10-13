package demo02;
/*
* 1.接口的默认方法，可以通过接口实现类直接调用。
* 2.接口的默认方法，也可以调用。
* */
public class Demo02Interface {
    public static void main(String[] args) {
        MyInterfaceDefaultA a =new MyInterfaceDefaultA();
        a.methodAbs();
//        调用默认方法，如果实现类中没有，会向上寻找接口
        a.methodDefault();
        System.out.println("=======");

        MyInterfaceDefaultB b = new MyInterfaceDefaultB();
        b.methodAbs();
        b.methodDefault();
    }
}
