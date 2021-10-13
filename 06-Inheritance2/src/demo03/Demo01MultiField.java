package demo03;
/*
访问成员变量的两种方式：
1.直接通过对象名称访问成员变量：看等号左边是谁，优先用谁，没有则向上找。
2.间接通过成员方法访问成员变量：看该方法属于谁，优先用谁，没有则向上找。
成员方法的访问规则是：
编译看左边，运行看右边。

与成员变量访问对比：
通过成员变量：编译看左边，运行看左边。
通过成员方法：编译看左边，运行看右边。
 */
public class Demo01MultiField {
    public static void main(String[] args) {
        Fu obj = new Zi();
        System.out.println(obj.num);
//        System.out.println(obj.age); //错误写法。
//        子类没有覆盖重写，就是父：10.
//        子类覆盖重写，就是子：20.
        System.out.println(obj.show());
    }
}
