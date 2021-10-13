package demo01;

import java.util.ArrayList;
import java.util.Random;

public class Manager extends User {
    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }
//平均红包
    public ArrayList<Integer> send(int totalMoney, int count) {
//        首先需要一个集合来存储若干个红包金额
        ArrayList<Integer> redList = new ArrayList<>();
        int leftMoney = super.getMoney();
//        看一下群主有多少钱
        if (totalMoney > leftMoney) {
            System.out.println("余额不足！");
            return redList;
        }
//        扣钱
        super.setMoney(leftMoney - totalMoney);
//        发红包需要平均分成count份
        int avg = totalMoney / count;
        int left = totalMoney % count;
        for (int i = 0; i < count - left; i++) {
            redList.add(avg);
        }
        for (int j = 0; j < left; j++) {
            redList.add(avg+1);
        }
        //redList.add(avg + left);
        return redList;
    }
//手气红包
    public ArrayList<Integer> send2(final int totalMoney,final int totalCount){
        ArrayList<Integer> redList = new ArrayList<>();
        //1.随机分配,有可能多，有可能少
        //2.最少1分钱，最多不超过"剩下金额平均数的2倍,现假设红包金额10元，发给3个人
        //3.第一次红包，随机金额为0.01元~6.66元
        //第一次发完之后，剩下的至少是3.34元
        //此时还需要再发2个红包
        //此时的再发范围应该是0.01元~3.34元(取不到右边，剩下0.01)
        //总结一下，范围的公式是:1+random.nextInt(leftMoney/leftCont*2);
        Random r= new Random();
        setMoney(getMoney()-totalMoney);
        int leftMoney=totalMoney;
        int leftCont=totalCount;
        int money=0;
        //随机发前n-1个，最后一个不需要随机
        for (int i = 0; i < totalCount - 1; i++) {
//            按照公式随机生成金额
            money=r.nextInt((leftMoney/leftCont)*2)+1;
            if(i==totalCount-2&&money==leftMoney){
                money-=1;
            }
            redList.add(money);//将一个随机红包放入集合
            leftMoney-=money;//剩下的金额越发越少
            leftCont--;//剩下还应该再发的红包个数，递减
        }
        //最后一个不需要随机，直接被放进去得了。
        redList.add(leftMoney);
        return redList;
    }
}
