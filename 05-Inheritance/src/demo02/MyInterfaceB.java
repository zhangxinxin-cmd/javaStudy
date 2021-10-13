package demo02;

public interface MyInterfaceB {
    public abstract void methodB();
    public abstract void methodAbs();
    public default void methodDefault(){
        System.out.println("AAA");
    }
    public static void methodStatic(){
        System.out.println("sss");
    }
}
