package demo02;

public class MyInterfaceImpl /*extends object*/ implements MyInterfaceA,MyInterfaceB {
    @Override
    public void methodA() {
        System.out.println("覆盖重写了A方法");
    }

    @Override
    public void methodDefault() {
        System.out.println("对多个接口中冲突的方法进行了重写");
    }

    @Override
    public void
    methodAbs() {
        System.out.println("覆盖重写了A，B接口都有的抽象方法");
    }

    @Override
    public void methodB() {
        System.out.println("覆盖重写了方法");
    }
}
