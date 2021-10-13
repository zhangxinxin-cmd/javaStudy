package demo03Map;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Demo03MapTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char[] ch=str.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        for (char c : ch) {
            if(map.containsKey(c)){
               Integer value=map.get(c);
                value++;
                map.put(c,value);
            }else{
                map.put(c,1);
            }
        }
        Set<Character> set = map.keySet();
        for (Character key : set) {
            System.out.println(key+":"+map.get(key));
        }
    }
}
