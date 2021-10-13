package demo04;
/*
如果接口的实现类，或者是父类的子类，只需要使用唯一的一次，那么这种情况下就可以省略掉该类的定义，二改为使用匿名内部类。

匿名内部类的定义格式：
接口名称 对象名 = new 接口名称()｛
覆盖重写所有的抽象方法
｝;

对格式“new 接口名称() {...}"进行解析
1.new代表创建对像的动作。
2.接口名称就是匿名内部类需要实现哪个接口。
3.匿名内部类，在创建对像的时候，只能使用唯一一次。
注意事项：
1.如果希望多次创建对像，而且类的内容一样的话，那么就必须使用单独定义的实现类。
2.匿名对象，在调用方法的时候，只能调用惟一一次。
如果希望同一个对象，调用多次方法，那么必须给对象起个名字

匿名内部类是省略了实现类/子类名称，但匿名对象是省略了对象名称。
 */
public class DemoMain {
    public static void main(String[] args) {
        /*MyInterface impl = new MyInterfaceImpl();
        impl.method();*/
        System.out.println("======");
        MyInterface objA = new MyInterface() {
            @Override
            public void method1() {
                System.out.println("匿名局部类实现了方法。111-A");
            }

            @Override
            public void method2() {
                System.out.println("匿名局部类实现了方法。222-A");
            }
        };
        objA.method1();
        objA.method1();
        System.out.println("======");

        new MyInterface() {
            @Override
            public void method1() {
                System.out.println("匿名局部类实现了方法。111-B");
            }

            @Override
            public void method2() {
                System.out.println("匿名局部类实现了方法。111-B");
            }
        }.method1();
            //因为匿名对象无法调用第二次方法，所以需要再创建一个匿名内部类的匿名对象
        new MyInterface() {
            @Override
            public void method1() {
                System.out.println("匿名局部类实现了方法。111-B");
            }

            @Override
            public void method2() {
                System.out.println("匿名局部类实现了方法。111-B");
            }
        }.method2();
    }
}
