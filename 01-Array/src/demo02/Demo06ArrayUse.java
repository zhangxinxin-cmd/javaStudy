package demo02;

public class Demo06ArrayUse {
    public static void main(String[] args) {
//静态初始化的省略模式
        int[] array = {3, 4, 1, 0};
        //System.out.println(array);//[I@5fd0d5ae
        //System.out.println(array[0]);
        A.ArrayPrintln(array);
    }
}
class A{
    public static void ArrayPrintln(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
