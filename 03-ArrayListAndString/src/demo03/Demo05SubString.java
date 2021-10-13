package demo03;

/*字符串的截取方法：

public String substring(int index):截取从参数位置一直到字符串末尾，返回新字符串。
public吃String substring（int begin,int end):截取从begin开始，一直到end结束，中间的字符串。
注意：[begin，end)包含左边，不包含右边
* */
public class Demo05SubString {
    public static void main(String[] args) {
        String str1="Hello World";
        String str2=str1.substring(6);
        String str3=str1.substring(0,5);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println("=======");

        String strA="hello";
        System.out.println(strA);
        strA="java";
        System.out.println(strA);
        System.out.println("=======");

        String str4="hello";
        String str5=str4;
        System.out.println("str4="+str4+",str5="+str5);
        str5="java";
        System.out.println("str4="+str4+",str5"+str5);
    }
}
