package demo09ConstructorMethodReference;

public class Demo {
    public static void printName(String name,PersonBuilder pb){
        System.out.println(pb.buildPerson(name));
    }

    public static void main(String[] args) {
        //printName("迪丽热巴",(name)->new Person(name));
        /*
            使用方法引用优化Lambda表达式
            构造方法new Person(String name) 已知
            创建对象已知 new
            就可以使用Person引用new创建对象
         */
        printName("迪丽热巴", Person::new);
        printName("古力娜扎",Person::new);
    }
}
