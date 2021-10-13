package annotation;

import javax.print.DocFlavor;

/**
 * @ProjectName: basic-code
 * @Author: 19818
 * @Date: 2020/5/11 14:46
 */
@SuppressWarnings("all")
public @interface MyAnno {
    public abstract int value();//抽象方法
    Person per();
    MyAnno2 anno2();
    String[] strs();
//    String name() default "张三";
    /*String show2();
    Person show3();
    MyAnno2 show4();
    String[] show5();*/
}
