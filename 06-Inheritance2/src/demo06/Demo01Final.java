package demo06;
/*
final关键字代表最终，不可改变的。

常见四种用法：
1.可以用来修饰一个类。
2.可以用来修饰一个方法。
3.还可以用来修饰一个局部变量。
4.还可以用来修饰一个成员变量。
 */
public class Demo01Final {
    public static void main(String[] args) {
        int num1=10;
        System.out.println(num1);

        num1=20;
        System.out.println(num1);

//        一旦使用final用来修饰变量，那么这个变量就不能进行更改。
//        “一次赋值，终生不变”
        final int num2=200;
        System.out.println(num2);
//        num2=250; //错误写法，不能改变。
//        num2=200; //错误写法。
//        正确，只要保证有唯一一次赋值即可
        final int num3;
        num3=21;

//        对于基本类型来说，不可变说的是变量当中的数据不可改变
//        对于引用类型来说，不可变说的是变量当中的地址值不可改变

        Student stu =new Student("赵丽颖");
        System.out.println(stu.getName());
        stu = new Student("霍建华");
        System.out.println(stu.getName());
        System.out.println("========");

        final Student stu2=new Student("高圆圆");
        System.out.println(stu2.getName());
//        stu2=new Student("赵又廷");
        stu2.setName("赵又廷");
        System.out.println(stu2.getName());
    }
}
