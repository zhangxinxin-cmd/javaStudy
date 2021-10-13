package demo07SuperMethodReference;

public class Man extends Human {
    @Override
    public void sayHello() {
        System.out.println("hello,我是Man");
    }
    //定义一个方法参数传递Greetable接口
    public void method(Greetable g){
        g.greet();
    }
    public void show(){
        method(super::sayHello);
    }

    public static void main(String[] args) {
        Man man=new Man();
        man.show();
    }
}
