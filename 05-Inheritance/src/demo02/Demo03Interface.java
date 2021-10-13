package demo02;

import demo01.MyInterfaceStatic;

public class Demo03Interface {
    public static void main(String[] args) {
        InterfaceStaticImpl impl = new InterfaceStaticImpl();
//        静态方法
//        impl.methodStatic();
            MyInterfaceStatic.methodStatic();
    }
}
