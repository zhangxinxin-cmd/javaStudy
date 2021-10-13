package demo01Junit;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
简单地测试框架

挡住方法执行后，会自动进行被检测的所有方法，判断方法是否有异常，记录到文件中
 */
public class TestCheck {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException, IOException {
        
        //1.创建计算器对象
        Calculator2 c=new Calculator2();
        //2.获取字节码文件对象
        Class<? extends Calculator2> cls = c.getClass();
        //3.获取所有方法
        Method[] methods = cls.getMethods();
        int number=0;
        BufferedWriter bw=new BufferedWriter(new FileWriter("bug.txt"));
        //4.判断方法是否有Check注解
        for (Method method : methods) {
            if(method.isAnnotationPresent(Check.class)){
                //5.有，执行
                try {
                    method.invoke(c);
                }catch (Exception e){
                    number++;
                    bw.write(method.getName()+"方法出异常了");
                    bw.newLine();
                    bw.write("异常的名称"+ e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("异常的原因"+e.getCause().getMessage());
                    bw.newLine();
                    bw.write("========================");
                    bw.newLine();
                }
            }
        }
        bw.write("本次测试一共出现"+number+"次异常。");
        bw.flush();
        bw.close();
    }
}
