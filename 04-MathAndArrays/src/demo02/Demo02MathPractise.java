package demo02;

/*题目：
计算在-10.8到5.9之间，绝对值大于6或小于2.1的整数有多少个
思路：
1.既然已经确定了范围，for循环
2.起点位置：-10.8应该转换成-10，两种办法：
可以使用Math.ceil方法，自动舍弃所有小数位。
强制转化为int，自动舍弃所有小数位
3.每一个数字都是整数，所以步进表达式应该是num++，这样每次都是+1的
4.使用Math.abs方法得到绝对值
5.一旦发现了一个符合的数字，num++
* */
public class Demo02MathPractise {
    public static void main(String[] args) {
        double min =-10.8;
        double max=5.9;
        int num=0;
        for (int i = (int)min; i <max ; i++) {
            if(Math.abs(i)>6|| Math.abs(i)<2.1){
                num++;
            }
        }
        System.out.println("整数有："+num+"个");
    }
}
