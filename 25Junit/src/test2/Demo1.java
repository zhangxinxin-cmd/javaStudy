package test2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;

public class Demo1 {
    public static void main(String[] args) {
        LinkedHashMap<String,String> cache=new LinkedHashMap(16,0.75f,true);
        cache.put("tom","tom520");
        cache.put("pony","pony520");
        cache.put("bob","bob520");
        cache.put("jack","jack520");
        //cache.forEach((k,v)-> System.out.println(k+" "+v));
        ArrayList<Integer> list =new ArrayList<>();
        Collections.addAll(list,32,12,33,21);
        list.forEach(System.out::println);
    }
}
