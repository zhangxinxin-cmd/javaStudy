package demo06StaticMethodReference;

/*
    通过类名引用静态成员方法
    类已经存在,静态成员方法也已经存在
    就可以通过类名直接引用静态成员方法
 */
public class Demo01StaticMethodReference {
    //定义一个方法，参数传递要计算绝对值的整数和函数式接口
    public static int method(int number,Callable c){
        return c.calAble(number);
    }

    public static void main(String[] args) {
        int number = method(-23, Math::abs);
        System.out.println(number);
    }
}
