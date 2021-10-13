package demo02;

/*动态初始化：在创建数组的时候，直接指定数组当中的数据元素个数
* 静态初始化：在创建数组的时候，不直接指定数据个数的多少，而是直接将具体的数据内容进行指定
*
* 静态初始化的基本格式：
* 数据类型[] 数组名称 = new 数据类型[]{元素1，元素2，元素3，。。。}
*  */

public class Demo04Array {
    public static void main(String[] args) {
        //    创建一个数组，里面装的都是int数字，具体为：5,15,25
        int[] arrayA = new int[] {2,3,4};
//        创建一个数组，用来封装字符串："hello" "world" "java"
        String[] arrayB = new String[] {"hello","world","java"};
    }
}
