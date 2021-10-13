package demo02;

import java.util.ArrayList;

public class Demo01ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("宋慧乔");
        list.add("孙俪");
        list.add("邓超");
        list.add("刘亦菲");
       // System.out.println(list);
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
           if(i==3){
               System.out.println(list.get(i)+"}");
           }
           else{
               System.out.print(list.get(i)+"@");
           }
        }
    }
}
