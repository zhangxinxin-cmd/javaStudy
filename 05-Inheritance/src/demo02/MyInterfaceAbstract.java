package demo02;
/*在任何java的版本中，接口中都能定义抽象方法。
格式：public abstract 返回值类型 方法名称(参数列表)
接口使用步骤：
1.接口不能直接使用，必须有一个“实现类”来“实现”该接口。
格式：
public class 实现类名称 implements 接口名称{
}
2.接口的实现类必须覆盖重写(实现)接口所有的抽象方法。
实现：去掉abstract 关键字，加上方法体大括号。
3.创建实现类的对象，进行使用。
注意事项：如果实现类并没有覆盖重写接口中所有的抽象方法，那么这个实现类自己就必须是抽象类。
* */
public  interface MyInterfaceAbstract {
    public abstract void methodAbs1();//抽象方法
    public void methodAbs2();//抽象方法
    abstract void methodAbs3();//抽象方法
    void methodAbs4();//抽象方法


}
