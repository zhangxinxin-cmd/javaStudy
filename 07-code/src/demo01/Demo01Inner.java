package demo01;

public class Demo01Inner {
    public static void main(String[] args) {
        Outer.Inner obj= new Outer().new Inner();
        obj.methodInner();
    }
}
