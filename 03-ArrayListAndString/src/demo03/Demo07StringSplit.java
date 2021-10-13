package demo03;
/*分割字符串的方法：
public String[] split(String regex):按照参数的规则，将字符串切分为若干个部分。

注意事项：
split方法的参数其实上是一个“正则表达式”。
如果按照英文句号点"."进行切分，必须写"\\."（两个反斜杠）
* */
public class Demo07StringSplit {
    public static void main(String[] args) {
        String str1="aa,bb,cc";
        String[] array1=str1.split(",");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        System.out.println("===========");
        String str2="aa bb cc";
        String[] array2=str2.split(" ");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        System.out.println("=======");

        String str3="XXX.YYY.ZZZ";
        String[] array3 = str3.split(".");
        System.out.println(array3.length);//长度为0

        for (int j = 0; j < array3.length; j++) {
            System.out.println(array3[j]);
        }
        System.out.println("========");

        String str4= "XXX.YYY.ZZZ";
        String[] arrays4 = str4.split("\\.");
        for (int k = 0; k < arrays4.length; k++) {
            System.out.println(arrays4[k]);
        }
    }
}
