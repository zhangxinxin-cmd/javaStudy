package demo01;
/*
* 这个接口中有4个方法。
* methodA来源于接口A
* methodB来源于接口B
* methodCommon来源于A和B
* method来源于自己*/
public interface MyInterface extends MyInterfaceA,MyInterfaceB {
    void method();

    @Override
    public default void methodDefault() {

    }
}
