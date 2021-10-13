package Demo07Function;

import javax.lang.model.element.NestingKind;
import java.util.function.Function;

/*
    1.将字符串截取数字年龄部分，得到字符串；
    2.将上一步的字符串转换成为int类型的数字
    3.将上一步的int数字累加100，得到结果int数字
 */
public class Demo03Test {
    public static int change(String str, Function<String,Integer> fun){
        return fun.apply(str);
    }
    public static void main(String[] args) {
        String str="赵丽颖，23";
        int result = change(str, (R) -> {
            String s = R.split("，")[1];
            return Integer.parseInt(s) + 100;
        });
        System.out.println(result);
    }
}
