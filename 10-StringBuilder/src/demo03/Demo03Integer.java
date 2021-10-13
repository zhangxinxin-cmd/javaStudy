package demo03;
/*
    基本类型与字符串类型之间的相互转换
    基本类型->字符串(String)
        1.基本类型的值+""  最简单的方法(工作中常用)
        2.包装类的静态方法toString(参数),不是Object类的toString() 重载
            static String toString(int i) 返回一个表示指定整数的 String 对象。
        3.String类的静态方法valueOf(参数)
            static String valueOf(int i) 返回 int 参数的字符串表示形式。
    字符串(String)->基本类型
        使用包装类的静态方法parseXXX("字符串");
            Integer类: static int parseInt(String s)
            Double类: static double parseDouble(String s)
 */
public class Demo03Integer {
    public static void main(String[] args) {
     //基本类型->字符串（String）
     int i1=121;
     String str=i1+"";
        System.out.println(str+121);//121121

        String str2=Integer.toString(21);
        System.out.println(str2);//21

        String str3=String.valueOf(21);
        System.out.println(str3+12);//2112

        //字符串->基本类型
        int i2=Integer.parseInt(str);
        System.out.println(i2-21);//100
    }
}
