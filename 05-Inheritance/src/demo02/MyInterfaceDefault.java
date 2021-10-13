package demo02;

/*从java8开始，接口里允许定义默认方法。
格式：public default 返回值类型 方法名称(参数列表){};
允许静态方法。
格式：public/private static 返回值类型 方法名称(参数列表){};
从java9开始，接口里允许定义私有方法。
格式：private 返回值类型 方法名称(参数列表);(加不加static都允许)
总的来说：java允许抽象方法，默认方法，静态方法，私有方法。
备注：接口中的默认方法，可以解决借口升级的问题。
* */
public interface MyInterfaceDefault {
    public default void methodAbs(){};
    private  void method2(){};
    public static void method3(){};
    public abstract void methodAbs2();
    public abstract void methodAbs3();
}
