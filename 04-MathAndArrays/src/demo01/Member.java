package demo01;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> redList){
//        随机获取一个集合当中的索引编号
        int index=new Random().nextInt(redList.size());
//        根据索引，从集合中删除，并且得到被删除的红包。
        int delta = redList.remove(index);
//        重新设置金额
        int leftMoney=super.getMoney();
        super.setMoney(leftMoney+delta);
    }
}
