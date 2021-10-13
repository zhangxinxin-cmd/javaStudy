package demo03;

/*String当中获取相关的常用方法：
public int length()：获取字符串含有的字符个数，拿到字符串长度
public String concat(String str):将当前字符串和参数字符串拼接成为新的字符串，并返回。
public char charAt(int index):获取指定索引位置的单个字符（索引从0开始）
public int indexOf(String str):查找参数字符串在本字符串当中首次出现的索引位置，如果没有返回-1值
* */
public class Demo04StringGet {
    public static void main(String[] args) {
        String str="Hello World";
        System.out.println("字符串的长度是："+str.length());

//        字符串拼接
        String str1="Hello ";
        String str2="world";
        String str3=str1.concat(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println("==========");

//         获取指定索引位置的单个字符
        System.out.println(str1.charAt(0));
        System.out.println("Hello".charAt(2));
        System.out.println("==========");

//        查找参数字符串在大字符串中出现的第一次索引位置
        String original = "hello world";
        System.out.println("第一次索引位置是："+original.indexOf("wor"));
    }
}
