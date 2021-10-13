package demo06;

import java.util.ArrayList;
import java.util.List;

public class DemoInterface {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        //左边是接口，右边是实现类名称，这就是多态写法
        List<String> list = new ArrayList();
        List<String> result=addName(list);
        System.out.println(list);
    }

   public static List<String> addName(List<String> list){
       list.add("玛尔扎哈");
       list.add("古丽娜扎");
       list.add("沙扬娜拉");
       list.add("迪丽热巴");

       return list;
   }
}
