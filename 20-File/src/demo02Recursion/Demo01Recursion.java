package demo02Recursion;
/*
构造方法不能递归，递归必须要有结束条件
 */
public class Demo01Recursion {
    public static void main(String[] args) {
        b(1);
    }
    public static void b(int i){
        System.out.println(i);
        if(i==10000){
            return;
        }
        i++;
        b(i);
    }
}
