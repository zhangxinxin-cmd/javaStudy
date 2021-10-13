package demo01Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo01List {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        Collections.addAll(list,"张无忌","周芷若","赵敏","张强","张三丰");
        List<String> list2=new ArrayList<>();
        for (String name : list){
            if(name.startsWith("张")){
                list2.add(name);
            }
        }
        List<String> list3=new ArrayList<String>();
        for (String s : list2) {
            if(s.length()==3) list3.add(s);
        }
        for (String s : list3) {
            System.out.println(s);
        }
    }
}
