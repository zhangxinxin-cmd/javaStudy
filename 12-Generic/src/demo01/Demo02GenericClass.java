package demo01;

public class Demo02GenericClass {
    public static void main(String[] args) {
        //不写泛型，默认为object类型
        GenericClass gc=new GenericClass();
       gc.setName("只能是字符串");
        Object name = gc.getName();

        //创建genericClass对象，泛型使用Integer类型
        GenericClass<Integer> gc2=new GenericClass<>();
        gc2.setName(21);
        int name2=gc2.getName();
        System.out.println(name2);

        //创建genericClass对象，泛型使用String类型
        GenericClass<String> gc3=new GenericClass<>();
        gc3.setName("迪丽热巴");
        String name3=gc3.getName();
        System.out.println(name3);
    }
}
