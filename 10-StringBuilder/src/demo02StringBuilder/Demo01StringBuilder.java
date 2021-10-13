package demo02StringBuilder;
/*
java.lang.StringBuilder类：字符串缓冲区
构造方法：
StringBuilder()构造一个布袋任何字符的字符串生成器，其初始化容量为16个字符。
StringBuilder(String str 构造一个字符串的生成器，并初始化为指定的字符串内容
 */
public class Demo01StringBuilder {
    public static void main(String[] args) {
        //空参构造
        StringBuilder bu1=new StringBuilder();
        //无参构造
        StringBuilder bu2=new StringBuilder("迪丽热巴");

        System.out.println("无参构造"+bu1);
        System.out.println("有参构造"+bu2);
    }
}
