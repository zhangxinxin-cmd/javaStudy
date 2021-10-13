package demo05Consumer;

import java.util.function.Consumer;

public class Demo03Test {
    public static void printInfo(String[] arr, Consumer<String> con1,Consumer<String> con2){
        for (String message : arr) {
            con1.andThen(con2).accept(message);
        }
    }

    public static void main(String[] args) {
        String[] arr={"迪丽热巴,女","古力娜扎,女","玛尔扎哈,男"};
        printInfo(arr,s -> {
            String[] split = s.split(",");
            String name = split[0];
            System.out.print("姓名:"+name);
        },s -> {
            String[] split = s.split(",");
            String sex = split[1];
            System.out.println("性别："+sex);
        });
    }
}
