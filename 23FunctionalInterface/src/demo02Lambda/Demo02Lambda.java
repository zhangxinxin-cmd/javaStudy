package demo02Lambda;

public class Demo02Lambda {
    public static void main(String[] args) {
     String msg1="hello";
     String msg2="world";
     String msg3="java";
     showLog(2,()->{System.out.println("方法已执行");
                            return msg1+msg2+msg3;});
    }

    public static void showLog(int level,MessageBuilder mb){
        if(level==1){
            System.out.println(mb.builderMessage());
        }
    }
}
