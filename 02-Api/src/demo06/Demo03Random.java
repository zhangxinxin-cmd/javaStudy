package demo06;
/*题目要求：
根据int变量的值，来获取随机数字，范围是[1,n]。

思路：
1.定义一个int变量n，随意赋值。
2.要使用Random：三个步骤。
3.如果写10，那么就是0~9,可以发现整体加1即可。
* */
import java.util.Random;

public class Demo03Random {
    public static void main(String[] args) {
        int n=9;
        Random r=new Random();

        for (int i = 0; i < 20; i++) {
            System.out.println(r.nextInt(9)+1);
        }
    }
}
