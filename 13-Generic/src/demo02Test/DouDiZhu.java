package demo02Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

/*
斗地主综合案例：
    1.准备拍
    2.洗牌
    3.发牌
    4.看牌
 */
public class DouDiZhu {
    public static void main(String[] args) {
        //1.准备牌
        //定义一个存储54张牌的ArrayList集合，泛型使用String
        ArrayList<String> poker=new ArrayList<>();
        //定义两个数组，一个数组存储牌的花色，一个数组存储牌的序号
        String []colors={"♠","♥","♣","♦"};
        String[] numbers={"2","A","k","Q","J","10","9","8","7","6","5","4","3"};
        //先把大王和小王存储到poker集合中
        poker.add("小王");
        poker.add("大王");
        for (String number : numbers) {
            for (String color : colors) {
               poker.add(color+number);
                //System.out.println(color+number);
            }
        }
        //2.洗牌
        Collections.shuffle(poker);
        /*for (String str : poker) {
            System.out.println(str);
        }*/
        //3.发牌
        /*
        定义4个集合，存储玩家的牌和底牌
         */
        ArrayList<String> play01=new ArrayList<>();
        ArrayList<String> play02=new ArrayList<>();
        ArrayList<String> play03=new ArrayList<>();
        ArrayList<String> diPi=new ArrayList<>();

        for (int i = 0; i < poker.size(); i++) {
            //获取每一张牌
            String p=poker.get(i);
            if(i>=51){
                diPi.add(p);
            }
            else if(i%3==0){
                //给玩家1发牌
                play01.add(p);
            }
            else if(i%3==1){
                //给玩家2发牌
                play02.add(p);
            }
            else{
                //给玩家3发牌
                play03.add(p);
            }
        }
        //看牌
        System.out.println("刘德华"+play01);
        System.out.println("胡歌"+play02);
        System.out.println("郭富城"+play03);
        System.out.println("底牌"+diPi);
    }
}
