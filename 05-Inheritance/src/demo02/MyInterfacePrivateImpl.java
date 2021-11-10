package demo02;

public class MyInterfacePrivateImpl implements MyInterfacePrivateA {
    public void methodAnother(){
//        直接访问到了接口中的默认方法，这是不允许的
//        methodCommon();
//        MyInterfaceA.methodStatic();
    }
}
