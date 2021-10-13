package demo06Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Demo05Test {
    public  static ArrayList<String> filter(String[] arr, Predicate<String> pr1,Predicate<String> pr2){
        ArrayList<String> list=new ArrayList<>();
        for (String name : arr) {
            if(pr1.and(pr2).test(name)) list.add(name);
        }
        return list;
    }

    public static void main(String[] args) {
        String[] array={"迪丽热巴，女","古力娜扎，女","玛尔扎哈，男","赵丽颖，女"};
        ArrayList<String> filter = filter(array, (arr1) -> {
            String s = arr1.split("，")[0];
            return s.length()==4;
        }, (arr2) -> {
            return arr2.split("，")[1].equals("女");
        });
        for (String s : filter) {
            System.out.println(s);
        }
    }
}
