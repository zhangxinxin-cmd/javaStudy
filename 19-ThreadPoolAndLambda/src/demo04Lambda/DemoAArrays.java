package demo04Lambda;

import java.util.Arrays;
import java.util.Comparator;

public class DemoAArrays {
    public static void main(String[] args) {
        Person[] arr = {
                new Person("柳岩", 38),
                new Person("迪丽热巴", 22),
                new Person("古力娜扎", 24)
        };

        //对数组的Person对象使用Arrays的sort方法通过年龄进行升序排序
        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person person, Person t1) {
                return person.getAge() - t1.getAge();
            }
        });
        for (Person person : arr) {
            System.out.println(person);
        }

        //使用Lambda表达式，简化匿名内部类
        Arrays.sort(arr, (person, t1) -> {
            return t1.getAge() - person.getAge();
        });
        Arrays.sort(arr,(Person person, Person t1) -> {
            return person.getAge()-t1.getAge();
        });

        for (Person person : arr) {
            System.out.println(person);
        }
    }
}
