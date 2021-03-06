package dmeo03Exception;
/*
    如果finally有return语句，永远返回finally中的语句，要尽量避免该情况
 */
public class Demo02Exception {
    public static void main(String[] args) {
        System.out.println(getA());
    }

    private static int getA() {
        int a=10;
        try{
            return a;
        }catch (Exception e){
            System.out.println(e);
        }finally {
            a=100;
            return a;
        }
    }
}
