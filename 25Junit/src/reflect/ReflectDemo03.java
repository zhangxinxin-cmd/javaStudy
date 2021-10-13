package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/*
Constructor<T>  getConstructor(类<?>... parameterTypes)
			 Constructor<T>[ ]   getConstructor()
			Constructor<T>  getDeclaredConstructor(类<?>... parameterTypes)
Constructor<T>[ ]  getDeclaredConstructor( )
 */
public class ReflectDemo03 {
    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;
        Constructor<Person> constructor = personClass.getConstructor(String.class, int.class);
        //括号中的参数类型决定了newInstance方法中的参数类型
        Person person = constructor.newInstance("张三", 22);
        System.out.println(person);
        System.out.println("===========");
        Constructor<Person> constructor1 = personClass.getConstructor();
        Person person1 = constructor1.newInstance();
        System.out.println(person1);
        Person o = personClass.newInstance();
        System.out.println(o);
        System.out.println("===========");
        Constructor<Person> declaredConstructor = personClass.getDeclaredConstructor();
        Person person2 = declaredConstructor.newInstance();
        declaredConstructor.setAccessible(true);//暴力反射，目的：可以访问任意权限的构造方法
    }
}
