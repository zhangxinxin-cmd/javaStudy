package demo09ConstructorMethodReference;

public class Demo2 {
    public static Person create(String name,PersonCreator c){return c.createPerson(name);}
    public static void main(String[] args) {
        Person person = create("玛尔扎哈", Person::new);
        System.out.println(person);
    }
}
