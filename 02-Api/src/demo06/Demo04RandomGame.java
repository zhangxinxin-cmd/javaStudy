package demo06;

import java.util.Random;
import java.util.Scanner;

/*题目：
用代码模拟数字的小游戏。

思路：
1.首先 需要产生一个随机数字，并且一旦产生不在变化。用Random的nextInt方法
2. 需要键盘输入，用到scanner
3.获取键盘输入的数字，用scanner当中的nextInt方法
4.已经得到了两个数字，判断(if)一下：
太大，提示太大，重试；
太小，提示太小，重试
猜中，游戏结束。
5.重试就是再来一次，循环次数不确定，用While(true)
* */
public class Demo04RandomGame {
    public static void main(String[] args) {
        Random r=new Random();
        int Randomise=r.nextInt(10)+1;
        Scanner sc = new Scanner(System.in);
        int guessNum=0;
        System.out.println("请输入：");
        do {
            guessNum=sc.nextInt();
            if(guessNum>Randomise){
                System.out.println("过大！");
            }
            else if(guessNum<Randomise){
                System.out.println("过小！");
            }
            else{
                System.out.println("正确！游戏结束。");
            }

        }while(guessNum!=Randomise);
        System.out.println("带猜数字是："+Randomise);
    }
}
