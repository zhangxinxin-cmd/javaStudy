package annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
框架类
 */
@Pro(className = "annotation.Demo1",methodName ="show" )
public class ReflectTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //解析注解
        //获取该类的字节码文件
        Class<ReflectTest> reflectTestClass = ReflectTest.class;
        //获取上边的字节码对象
        Pro an = reflectTestClass.getAnnotation(Pro.class);//其实就是在内存中生成了一个该注解接口的子类实现对象
        //调用注解对象中定义的抽象方法，获取返回值
        String className = an.className();
        String methodName = an.methodName();
        //加载该类进内存
        Class<?> cls = Class.forName(className);
        Object obj = cls.newInstance();
        Method method = cls.getMethod(methodName);
        method.invoke(obj);
    }
}
