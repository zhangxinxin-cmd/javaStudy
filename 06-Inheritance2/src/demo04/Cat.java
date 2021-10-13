package demo04;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼。");
    }
//    猫抓老鼠的方法。
    public void catchMouse(){
        System.out.println("猫抓老鼠。");
    }
}
