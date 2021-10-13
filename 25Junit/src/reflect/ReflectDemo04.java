package reflect;

import java.lang.reflect.Method;

public class ReflectDemo04 {
    public static void main(String[] args) throws Exception {
        //获取Person对象的Class对象
        Class<Person> personClass = Person.class;
        /*
         *Method[ ]  getMethods( )
         *Method  getMethod(String name,类<?>...parameterTypes)
         *Method  getDeclaredMethod(String name,类<?>...parameterTypes)
         *Method[ ]  getDeclaredMethods( )
         */
        Method eat_method = personClass.getMethod("eat");//参数类型决定了invoke方法中的参数类型
        Person person = new Person();
        eat_method.invoke(person);
        Method eat_method2 = personClass.getMethod("eat", String.class);
        eat_method2.invoke(person,"米饭");
        //获取所有public修饰的方法
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            String name = method.getName();
            System.out.println(name);
        }

        //获取类名
        String Classname = personClass.getName();
        System.out.println(Classname);//reflect.Person
    }
}
