package Demo07Function;

import java.util.function.Function;

/*
    java.util.function.Function<T,R>接口用来根据一个类型的数据得到另一个类型的数据，
        前者称为前置条件，后者称为后置条件。
    Function接口中最主要的抽象方法为：R apply(T t)，根据类型T的参数获取类型R的结果。
        使用的场景例如：将String类型转换为Integer类型。
 */
public class Demo01Function {
    /*
        定义一个方法
        方法的参数传递一个字符串类型的整数
        方法的参数传递一个Function接口,泛型使用<String,Integer>
        使用Function接口中的方法apply,把字符串类型的整数,转换为Integer类型的整数
     */
    public static void change(String str, Function<String,Integer> fun){
        Integer in = fun.apply(str);
        System.out.println(in);
    }
    public static void change(String str){
        Function<String,Integer> fun= (s)->Integer.parseInt(s);
        System.out.println(fun.apply(str));
    }
    public static void main(String[] args) {
        String s="12345";
        change(s,(R)->{
            return Integer.parseInt(R,10);
        });
        change(s);
    }
}
