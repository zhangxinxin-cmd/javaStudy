package demo02;

/*
接口当中也可以定义“成员变量”，但是必须使用public static final三个关键字进行修饰。
从效果上看：这其实就是借口中的【常量】
格式：
public static final 常量名称 = 数据值;

接口当中的常量，可以省略public static final ，效果相当。
接口中的常量，必须进行赋值，不能不赋值。
接口中的常量的名称，使用完全大写的字母用下划线分隔
* */
public interface MyInterfaceConst {
    //    这其实就是一个常量，一旦赋值，不可以修改。
    public static final int NUM_OF_MY_CLASS=9 ;

}
