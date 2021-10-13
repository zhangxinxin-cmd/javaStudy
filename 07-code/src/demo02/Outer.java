package demo02;
/*
定义一个类的权限修饰符：
1.外部类public default
2.成员内部类：public protected (default) private
3.局部内部类:什么都不能写
 */
public class Outer {
    public void methodOuter(){
        int num=9;
         class Inner{//局部内部类
            int num=10;
            public void methodInner(){
                System.out.println(num);
            }
        }
        Inner inner=new Inner();
        inner.methodInner();
    }
}
