package Demo06DouDiZhu;

import java.io.File;
import java.util.*;

public class Demo01DouDiZhu {
    public static void main(String[] args) {
        List<String> list1 = List.of("♠", "♥", "♣", "♦");
        List<String> list2 = List.of("A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K");
        HashMap<Integer,String> poker=new HashMap<>();
        ArrayList<Integer> index=new ArrayList<>();
        int key=0;
        for (String l1 : list2) {
            for (String l2 : list1) {
                poker.put(key,l1+l2);
                index.add(key);
                key++;
            }
        }
        poker.put(key,"大王");
        index.add(key);
        key++;
        poker.put(key,"小王");
        index.add(key);
        Collections.shuffle(index);

        ArrayList<Integer> play1=new ArrayList<>();
        ArrayList<Integer> play2=new ArrayList<>();
        ArrayList<Integer> play3=new ArrayList<>();
        ArrayList<Integer> diPi=new ArrayList<>();
        for (int i = 0; i < index.size(); i++) {
            Integer in=index.get(i);
            if(i>=51){
                diPi.add(in);
            }else if(i%3==0){
                play1.add(in);
            }else if(i%3==1){
                play2.add(in);
            }else{
                play3.add(in);
            }
        }
            Collections.sort(play1);
            Collections.sort(play2);
            Collections.sort(play3);
            Collections.sort(diPi);
            method("play1",play1,poker);
            method("play2",play2,poker);
            method("play3",play3,poker);
            method("底牌",diPi,poker);
    }
    public static void method(String name,ArrayList<Integer> player,HashMap<Integer,String> poker){
        System.out.print(name+":");
        for (Integer key : player) {
            System.out.print(poker.get(key)+" ");
        }
        System.out.println("\n");
    }
}
