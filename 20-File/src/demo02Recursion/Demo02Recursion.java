package demo02Recursion;

public class Demo02Recursion {
    public static void main(String[] args) {
        int sum = addSum(10000);
        System.out.println(sum);
    }

    /*
    定义一个方法，使用递归计算1-n之间的和
    1+2+3+...+n
    n+(n-1)+(n-2)+...+1;
    已知最大值：n
    已知最小值：1
    使用递归必须明确：
    1.递归的结束条件
        获取到1的时候结束
        2.递归的目的
            获取下一个被加的数字(n-1)
     */
    private static int addSum(int i) {
        if(i==1){
            return i;
        }
        return i+addSum(i-1);
    }
}
