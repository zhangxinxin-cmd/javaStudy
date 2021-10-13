package demo02;

import java.util.ArrayList;
import java.util.Random;

/*题目：
用一个集合存入20个随机数字，然后筛选其中的偶数元素，放到小集合当中。
要求使用自定义的方法来实现
思路：
需要创建一个集合来储存20个int类型随机数字Integer
随机数字就用Random nextInt()
循环20次，把随机数字放入大集合，for循环，add方法
定义一个方法，筛选符合要求的元素，得到小集合
三要素：
返回值类型：
方法名称：getSmallList
参数列表：ArrayList 大集合（存储20个随机数字）
判断（if）是偶数，num%2==0
如果是偶数，就放到小集合中。
* */
public class Demo02ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> bigList = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            bigList.add(r.nextInt(100)+1);
        }
        ArrayList<Integer> smallList=getSmallList(bigList);
        /*for (int i = 0; i < smallList.size(); i++) {
            System.out.print(smallList.get(i));
        }*/
        System.out.println("偶数共有："+smallList.size()+"个");
        System.out.println(smallList);
    }

    public static ArrayList getSmallList(ArrayList<Integer> bigList){
        ArrayList<Integer> smallList =new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            if(bigList.get(i)%2==0){
                smallList.add(bigList.get(i));
            }
        }
        return smallList;
    }
}
