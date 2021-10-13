package demo01.demo03;
/*抽象方法就是加上abstract关键字，去掉大括号，直接分号结束。
如何使用抽象方法？
1.不能直接new抽象类对象；
2.必须用一个子类来继承抽象父类；
3.子类必须覆盖重写抽象父类当中所有的抽象方法；
4.创建子类对象进行使用。
* */
public abstract class Animal {
    public abstract void eat();
}
