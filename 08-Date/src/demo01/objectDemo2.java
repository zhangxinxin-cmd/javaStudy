package demo01;
/*
boolean equals(object obj)
使用==来比较两个对象是否相等。
 */
public class objectDemo2 {
    public static void main(String[] args) {
        Person person1=new Person("张三",22);
        Person person2=new Person("张三",22);
        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(person1));
    }
}
class Person{
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public boolean equals(Object o){

        //提高效率
        if(this==o){
            return true;
        }
        Person person=(Person) o;
       if(this.name.equals(person.name)&&this.age==person.age){
           return true;
       }else{
           return false;
       }
    }
}
