package demo05Lambda;

public class Demo01Calculator {
    public static void main(String[] args) {
        /*invokeCalc(12, 22, new Calculator() {
            @Override
            public int add(int a, int b) {
                return a+b;
            }
        });*/
        //使用Lambda表达式
        invokeCalc(12,22,(int a,int b)-> a+b);
    }
    public static void invokeCalc(int a,int b, Calculator c){
        int sum=c.add(a, b);
        System.out.println(sum);
        System.out.println(A(12, 22));
    }

    public static Object A(int a,int b){
        return a+b;
    }
}
