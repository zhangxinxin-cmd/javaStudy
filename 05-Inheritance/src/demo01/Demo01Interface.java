package demo01;

import demo02.MyInterfaceAbstractImpl;

/*
* 定义一个接口的格式：
* public interface 接口名称{
* }
* 备注：换成了关键字interface后，编译生成的字节符文件java--->class
* */
public class Demo01Interface {
    public static void main(String[] args) {
//        错误写法：不能直接new接口对象的使用。
//            MyInterfaceAbstract inter = new MyInterfaceAbstract();
        MyInterfaceAbstractImpl impl = new MyInterfaceAbstractImpl();
        impl.methodAbs1();
        impl.methodAbs2();
        impl.methodAbs3();
        impl.methodAbs4();
    }

}
