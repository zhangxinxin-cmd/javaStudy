package demo03;

import java.util.Scanner;

/*题目：
键盘输入一个字符串，并且统计其中各种字符串出现的次数。
种类有：大写字母，小写字母，数字，其他。

思路；
1.既然用到键盘，那么Scanner
2.键盘输入的是字符串，那么：String str =new Scanner.next();
3.定义四个变量，分别代表四种符号出现的次数
4.需要对字符串一个一个第检查，将String转换成char[]类型，方法就是toCharArray();
5.遍历char[]字符数组，对当前字符的种类进行判断，并且用四个变量进行++动作
6.打印输出四个变量，分别代表四种字符出现的次数。
* */
public class Demo09StringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        String input = sc.next();

        int countUpper = 0;
        int contLower = 0;
        int countNumber = 0;
        int countOther = 0;
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                countUpper++;
            } else if (chars[i] >= 'a' && chars[i] <= 'z') {
                contLower++;
            } else if (chars[i] >= '0' && chars[i] <= '9') {
                countNumber++;
            } else {
                countOther++;
            }
        }
        System.out.println("共输入字符个数："+chars.length);
        System.out.println("大写字母输入个数："+countUpper+"\n"+"小写字母输入个数："+contLower+"\n"+"数字输入个数："+countNumber+"\n"+"其他字符输入个数："+countOther);
    }
}

