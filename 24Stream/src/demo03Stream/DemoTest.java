package demo03Stream;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;

public class DemoTest {
    public static void main(String[] args) {
//        ArrayList<Person> list = new ArrayList<>();
        HashSet<Person> list = new HashSet<>();
        Person p1 = new Person("p1");
        Person p2 = new Person("p2");
        Person p3 = new Person("p3");
        Collections.addAll(list, p1, p2, p3);
        System.out.println(list);
        p1.setName("new p1");
        list.add(p1);
        System.out.println("================");
        System.out.println(list);
        list.removeIf((p) -> Objects.equals(p.getName(), p1.getName()));
        System.out.println(list);
    }
}
