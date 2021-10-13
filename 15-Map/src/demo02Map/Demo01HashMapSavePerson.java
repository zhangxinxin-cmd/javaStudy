package demo02Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo01HashMapSavePerson {
    public static void main(String[] args) {
        show01();
        demo02();
    }

    /*
        HashMap存储自定义类型键值
        key:Person类型
            Person类就必须重写hashCode方法和equals方法,以保证key唯一
        value:String类型
            可以重复
     */
    private static void demo02() {
        HashMap<Person,String> map=new HashMap<>();
        map.put(new Person("张三",24),"上海");
        map.put(new Person("李四",22),"上海");
        map.put(new Person("王五",26),"广州");
        map.put(new Person("赵六",18),"深圳");
        Set<Map.Entry<Person, String>> set = map.entrySet();
        for (Map.Entry<Person, String> entry : set) {
            System.out.println(entry.getKey()+"--->"+entry.getValue());
        }
    }

    /*
    HashMap存储自定义类型键值
    key：String类型
        String类重写hashCode方法和equals方法，可以保证key唯一。
     value：Person类型
            value可以重复（同名同龄的人视为同一个）
     */
    private static void show01() {
        HashMap<String,Person> map=new HashMap<>();
        map.put("北京",new Person("张三",24));
        map.put("上海",new Person("李四",25));
        map.put("广州",new Person("王五",26));
        map.put("北京",new Person("赵六",18));
        Set<String> set=map.keySet();
        for (String key : set) {
            System.out.println(key+"="+map.get(key));
        }
    }
}
