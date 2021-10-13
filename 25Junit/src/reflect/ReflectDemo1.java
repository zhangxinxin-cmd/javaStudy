package reflect;

public class ReflectDemo1 {
    /*
    	获取class对象的方式：
		1. class.forName("全类名"):将字节码文件加载进内存返回class对象
		2. 类名.class：通过类名的属性class获取
		3. 对象.getClass():getClass( )方法在Object类中定义。
     */
    public static void main(String[] args) throws ClassNotFoundException {
        Class cls1 = Class.forName("reflect.Person");
        System.out.println(cls1);
        Class<Person> cls2 = Person.class;
        System.out.println(cls2);
        Person person=new Person();
        Class<? extends Person> cls3 = person.getClass();
        System.out.println(cls3);
        System.out.println(cls1==cls2);//true
        System.out.println(cls2==cls3);//true
        Class<Student> cls4 = Student.class;
        System.out.println(cls4==cls1);//false
    }
}
