package Demo07Function;

import java.util.function.Function;

/*
    Function接口中的默认方法andThen：用来进行组合操作

    需求：
        把String类型的"123"转换成Integer类型，把转换后的结果+10
        把增加之后的Integer类型的数据转换为String类型

 */
public class Demo02Function_andThen {
    public static void change(String str, Function<String,Integer> fun1,Function<Integer,String> fun2){
        String result = fun1.andThen(fun2).apply(str);
        System.out.println(result);
    }

    public static void main(String[] args) {
        String s="123";
        change(s,(R1)->{
           return  Integer.parseInt(R1)+10;
        },(R2)->{
            return R2.toString();
        });
    }
}
