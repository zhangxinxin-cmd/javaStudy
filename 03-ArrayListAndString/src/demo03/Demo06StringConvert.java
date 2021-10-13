package demo03;
/*
* String 当中与转换相关的常用方法
*
* public char[] toCharArray():将当前字符串拆分为字符串数组作为返回值。
* public byte[] getBytes():获得当前字符串底层的字节数组。
* public String replace(CharSequence oldString,CharSequence newString):
* 将所有出现的老字符替换成为新的字符，返回替换之后的新字符
* 备注：CharSequence意思就是可以接受字符串类型。
* */
public class Demo06StringConvert {
    public static void main(String[] args) {
        char[] chars="hello".toCharArray();
        System.out.println(chars);//hello
        System.out.println(chars[0]);//h
        System.out.println(chars.length);//5
        System.out.println("=========");

//        转换成字节数组
        byte[] bytes="hello".getBytes();
        //System.out.println(bytes);//[B@5fd0d5ae
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("========");

        String str1="How do you do?";
        String str2=str1.replace("o","*");
        System.out.println(str2);
        String lan1="鲨掉";
        String lan2=lan1.replace("鲨掉","鲸落");
        System.out.println(lan2);

    }
}
