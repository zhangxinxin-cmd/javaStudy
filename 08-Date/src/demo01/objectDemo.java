package demo01;
/*
String toString()  :返回该对象的字符串表示。
        return getClass()+@.getName()+"@"+Integer.toHexString(hashCode());
        getClass():返回一个字节码对象。
        Integer.toHexString() :返回制定参数的十六进制字符串形式
        hashCode() :返回对象的哈希码值(内部地址)
 */
public class objectDemo {
    public static void main(String[] args) {
        Student student= new Student("迪丽热巴",23);
        System.out.println(student.toString());
    }
}

class Student{
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*public String toString(){
       return name+"@"+age;
    }*/

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
