package demo03LambddTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Demo02Comparator {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        Collections.addAll(arrayList,"迪丽巴","娜扎","玛尔扎哈");
        arrayList.sort(getComparator());
        for (String s : arrayList) {
            System.out.println(s);
        }
        String[] str={"aaa","bb","dddd"};
        Arrays.sort(str,getComparator());
        for (String s : str) {
            System.out.println(s);
        }
    }
    public static Comparator<String> getComparator(){
        /*return new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return t1.length()-s.length();
            }
        };*/
        //方法的返回值是一个函数式接口，所以我们可以用Lambda表达式
//        return (s,t1)->{return t1.length()-s.length();};
        //继续优化Lambda表达式
        return (s,t1)->t1.length()-s.length();
    }
}
