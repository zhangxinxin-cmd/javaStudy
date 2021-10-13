package demo02;

public interface MyInterfaceA {
    public abstract void methodA();
    public abstract void methodAbs();
    public default void methodDefault(){
        System.out.println("AAA");
    }
   public static void methodStatic(){
       System.out.println("SSS");
    }
}
