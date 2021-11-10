package demo03;

/*java.lang.util类代表字符串。
API当中说：java程序中的所有字符串字面值（如"abc")都作为此类的实例体现

字符串的特点：
字符串的内容永不可变
因为字符串不可改变，所以字符串是可以共享使用的
字符串效果上相当于是char[]字符数组，但是底层原理是byte[]字节数组。

字符串的常见3+1中方式：
三种构造方法：
public String();创建一个空白字符串，不含有任何内容。
public String(char[] array);根据字符数组的内容，来创建对应的字符串。
public String(byte[] array);根据字节数组的内容，来创建对应的字符串。
一种直接创建：
String str ="hello"

注意：直接写上双引号，就是字符串对象。
* */
public class Demo01String {
    public static void main(String[] args) {
//        使用空参构造
        String str1 = new String();
        System.out.println("第一个字符串是：" + str1);
//        根据字符数组来创建字符串
        char[] charArray = {'I', ' ', 'L', 'o', 'v', 'e', ' ', 'Y', 'o', 'u'};
        String str2 = new String(charArray);
        System.out.println("第二个字符串是：" + str2);

//        根据字节数组来创建字符串
        byte[] byteArray = {97, 98, 99};
        String str3 = new String(byteArray);
        System.out.println("第三个字符串是：" + str3);

//        直接创建
        String str = "hello";
        System.out.println("第四个字符串是：" + str);
    }
}
