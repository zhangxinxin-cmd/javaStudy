package demo07SuperMethodReference;

/*
* 父类方法引用
* 函数式接口得方法实现仅需要调用父类方法
* */
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
        method(()->super.sayHello());
        method(super::sayHello);
        GreetableImplements greetableImplements=new GreetableImplements();
        method(greetableImplements);
    }

    public static void main(String[] args) {
        Man man=new Man();
        man.show();
    }
}
class GreetableImplements implements Greetable{

    @Override
    public void greet() {
        Human human=new Human();
        human.sayHello();
    }
}