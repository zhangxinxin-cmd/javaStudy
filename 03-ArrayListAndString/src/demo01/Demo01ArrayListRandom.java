package demo01;

import java.util.ArrayList;
import java.util.Random;

/*
* 题目：生成6个1~33之间的数字，添加到集合中，并遍历集合
*
* 思路：
* 1.需要存储6个数字，创建一个集合，<Integer>
* 2.产生随机数，需要用到Random
* 3.需要用到for循环来产生6个随机数字
* 4.把数字添加倒集合中
* 5.遍历集合：for，size get
* */
public class Demo01ArrayListRandom {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r= new Random();
        for (int i = 0; i < 32; i++) {
            list.add(r.nextInt(33)+1);
        }

        for (int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j));
        }
    }
}
