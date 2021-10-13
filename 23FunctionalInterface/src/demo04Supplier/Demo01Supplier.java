package demo04Supplier;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Demo01Supplier {
    //定义一个方法，方法的参数传递Supplier<T>接口，泛型执行String，get方法就会返回一个String
    public static String getString(Supplier<String> sup){
        return sup.get();
    }

    public static void main(String[] args) {
        String str = getString(() -> {
            return "迪丽热巴";
        });
        Consumer<String> consumer=System.out::print;
        System.out.println(str);

    }
}
