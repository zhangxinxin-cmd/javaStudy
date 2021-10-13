package demo05Consumer;

import java.util.function.Consumer;

/*
java.util.functionConsumer<T>接口与Supplier接口相反
    它不生产数据，而是一个消费一个数据，其数据类型有泛型决定。
    Consumer接口中包含抽象方法 void accept(T t),意为消费一个制定泛型的数据。

    Consumer接口是一个消费型接口，泛型执行什么类型，就可以使用accept方法消费什么类型的数据
 */
public class Demo01Consumer {
    public static void method(String name, Consumer<String> con) {
        /*
        定义一个方法
        方法的参数传递一个字符串的姓名，方法的参数传递Consumer接口，泛型使用String
        可以使用Consumer接口，消费字符串的姓名。
         */
        con.accept(name);
    }

    public static void main(String[] args) {
        method("迪丽热巴a",(name)-> {
            /*String Name;
            char t;
            char[] chars = name.toCharArray();
            for (int i = 0; i < name.length()/2; i++) {
                   t=chars[i];
                   chars[i]= chars[name.length()-i-1];
                   chars[name.length()-1-i]=t;
            }
            System.out.println(new String(chars));*/
            System.out.println(new StringBuilder(name).reverse().toString());
        });
    }
}
