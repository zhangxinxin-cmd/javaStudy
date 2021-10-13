package demo01;

public class Demo03GenericMethod {
    public static void main(String[] args) {
        GenericMethod gm=new GenericMethod();
        /*
        调用含有泛型的方法method01
        传递什么类型，泛型就是什么类型
        */
        gm.method(12);
        gm.method("迪丽热巴");
        gm.method(true);
        gm.method(3.21);
        System.out.println("=========");
        gm.method2("静态方法，不建议创建对象使用");
        GenericMethod.method2("张欣欣");
        GenericMethod.method2(21);
    }
}
