package demo01;

public interface MyInterfaceB {
    void methodB();
    void methodCommon();
    public default void methodDefault(){
        System.out.println("DDD");
    }
}
