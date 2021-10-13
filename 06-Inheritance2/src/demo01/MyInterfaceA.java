package demo01;

public interface MyInterfaceA {
    void methodA();
    void methodCommon();
    public default void methodDefault(){
        System.out.println("DDD");
    }
}
