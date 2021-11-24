package reflect;

import java.lang.reflect.Field;

/*
		class对象功能：
		*获取功能：
			1.获取成员变量
			*Field[ ]  getFields( )
			*Filed  getField(String name)
			*Field  getDeclaredField(String name)
			*Field[ ]  getDeclaredField( )
			2.获取构造方法们
			 Constructor<T>  getConstructor(类<?>... parameterTypes)
			 Constructor<T>[ ]   getConstructor()
			Constructor<T>  getDeclaredConstructor(类<?>... parameterTypes)
			Constructor<T>[ ]  getDeclaredConstructor( )
			3.获取成员方法们
			*Method[ ]  getMethods( )
			*Method  getMethod(String name,类<?>...parameterTypes)
			*Method  getDeclaredMethod(String name,类<?>...parameterTypes)
			*Method[ ]  getDeclaredMethods( )
			获取类名
			*String getName()
 */
public class ReflectDemo02 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        //获取Person的Class对象
        Class<Person> personClass = Person.class;
        //获取成员变量
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("===========");
        Field value1 = personClass.getField("a");
        //value1.setAccessible(true);
        System.out.println(value1);
        Person p1 = new Person();
        value1.set(p1, "A");
        System.out.println("p1.a=" + p1.getA());
        Object value = value1.get(p1);
        System.out.println(value);
        System.out.println("===========");
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        Field d = personClass.getDeclaredField("d");
        d.setAccessible(true);//暴力反射
        d.set(p1, "B");
        System.out.println(d.get(p1));
        System.out.println("==========");

    }
}