package demo03;

/*
* ==是进行对象的地址值比较，如果确实需要字符串的内容比较，可以使用两个方法：
* public boolean equals(object obj):参数可以是任何对象，只有参数是一个字符串并且内容相同的才会给true，否则返回false
* 备注：任何对象都能用object进行接收
* equals 方法具有对称性，也就是a.equals(b)和b.equals(a)一样
* 如果比较双方一个常量，一个变量，推荐把常量字符串写在前面。
* 即"abc".equals(str);
*
* public boolean equalsIgnore(String str):忽略大小写，进行内容比较
* */
public class Demo03StringEquals {
    public static void main(String[] args) {
        String str1="hello";
        String str2="hello";
        char[] charArray ={'h','e','l','l','o'};

        System.out.println(str1.equals("hello"));//true
        System.out.println(str1.equals("hello"));//true
        System.out.println("hello".equals(str1));//true
        System.out.println("hello".equals("hello"));//true
       // System.out.println(str1.equals(charArray));//false
       // System.out.println(charArray.equals(str2));//false
        System.out.println("===========");

        String str3=null;
        //System.out.println(str3.equals("abc"));//error
        System.out.println("abc".equals(str3));//false
        System.out.println("===========");

        String str4="java";
        String str5="JAVA";
        System.out.println(str4.equals(str5));//false，严格区分大小写
        System.out.println(str4.equalsIgnoreCase(str5));//true，忽略大小写

        System.out.println("abc".equalsIgnoreCase("aBC"));//true
//        注意：只有英文字母区分大小写，其他都不区分大小写。
        System.out.println("abc一123".equalsIgnoreCase("abc壹123"));//false
    }
}
