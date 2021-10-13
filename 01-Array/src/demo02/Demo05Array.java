package demo02;

/*
 * 使用静态初始化数组的时候，格式还可以省略。
 * 标准格式：
 * 数据类型[] 数组名称 = ｛元素1，，元素2，元素...}
 * 静态初始化没有直接指定长度，但是仍然会自动推算长度
 * 静态初始化标准格式可以拆分为两个步骤
 * 静态初始化一旦使用省略两个格式，就不能拆分为两个步骤了
 * */
public class Demo05Array {
    public static void main(String[] args) {
//        省略格式的静态初始化
        int[] arrayA = {3, 3, 5};
//        静态初始化的标准格式，可以拆分为两个步骤
        int[] arrayB;
        arrayB = new int[]{3, 4, 2};
//        动态初始化也可以拆分为两个步骤
        int[] arrayC;
        arrayC = new int[5];
    }
}
