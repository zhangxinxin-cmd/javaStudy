package demo03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
java.text.DateFormat:是日期/时间格式化的子类。
作用：格式化（也就是日期->文本，解析（文本->日期）
成员方法：
String format(Date date) 按照指定的模式，把Date日期格式化符合模式的字符串。
Date parse(String source) 把符合模式的字符串，解析为Date日期。
DateFormat类是一个抽象类，无法直接创建对像使用，可以使用DateFormat类的子类。

java.text.SimpleDateFormat

构造方法：
SimpleDateFormat(String pattern)
用给定的模式和默认语言环境的日期格式符号构造 SimpleDateFormat.
参数 String pattern：传递指定的模式
模式：区分大小写的
G  Era designator  Text  AD
y  Year  Year  1996; 96
Y  Week year  Year  2009; 09
M  Month in year (context sensitive)  Month  July; Jul; 07
L  Month in year (standalone form)  Month  July; Jul; 07
w  Week in year  Number  27
W  Week in month  Number  2
D  Day in year  Number  189
d  Day in month  Number  10
F  Day of week in month  Number  2
E  Day name in week  Text  Tuesday; Tue
u  Day number of week (1 = Monday, ..., 7 = Sunday)  Number  1
a  Am/pm marker  Text  PM
H  Hour in day (0-23)  Number  0
k  Hour in day (1-24)  Number  24
K  Hour in am/pm (0-11)  Number  0
h  Hour in am/pm (1-12)  Number  12
m  Minute in hour  Number  30
s  Second in minute  Number  55
S  Millisecond  Number  978
z  Time zone  General time zone  Pacific Standard Time; PST; GMT-08:00
Z  Time zone  RFC 822 time zone  -0800
X  Time zone  ISO 8601 time zone  -08; -0800; -08:00

写对应的模式，会把模式替换为对应的日期和时间。
"yyy-MM-dd HH:mm:ss"
注意：
模式中的字母不能更改，连接模式的符号可以改变。
"yyyy年MM月dd日 HH时ss秒"
 */
public class Demo01DateFormat {
    public static void main(String[] args) throws ParseException {
        demo01();
        System.out.println("======");
        demo02();
    }
/*
使用DateFormat类中的方法parse，把文本解析为日期
使用步骤：
1.创建SimpleDateFormat对象，构造方法中传递指定的模式。
2.调用对象中的parse方法
注意：public Date parse(String source) throws parseException
parse方法声明了一个异常交parseException
如果字符串和构造方法的模式不一样，那么程序就会立刻抛出异常
调用一个抛出异常的方法，就必须的处理这个异常，要么throws 继续抛出这个异常，要么try catch自己处理。
 */
    private static void demo02() throws ParseException {
       //1.创建SimpleDateFormat对象中的方法format，按照构造方法中指定的模式，把Date日期格式转化为符合模式的字符串（文本）
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
        String str="2020年04月27日15时04分48秒";
        System.out.println(simpleDateFormat.parse(str));
        //System.out.println(simpleDateFormat.format(new Date()));
        Date date=simpleDateFormat.parse(simpleDateFormat.format(new Date()));
       // Date date1=simpleDateFormat.parse(simpleDateFormat.format(simpleDateFormat.parse(simpleDateFormat.format(new Date()))));//(娱乐)
        System.out.println(date);
    }
    /*
    使用DateFormat类中的方法format,把日期格式化为文本。
    使用步骤：
    1.创建为SimpleDateFormat对象，构造方法中传递指定的模式。
    2.调用SimpleDateFormat对象中的方法format,按照构造方法中指定的模式，把Date日期格式转化为符合模式的字符串（文本）。
     */

    private static void demo01()  {
        //1.创建SimpleDateFormat对象中的方法format，按照构造方法中指定的模式，把Date日期格式转化为符合模式的字符串（文本）
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
        //2.String format(Date date) 按照指定的模式，把Date日期，格式转化为符合模式的字符串。
        //Date date=new Date();
        String date= simpleDateFormat.format(new Date());
        System.out.println(date);
    }
}
