package demo05;

import java.util.concurrent.Callable;

public class DemoMain {
    public static void main(String[] args) {
//        首先创建一个笔记本电脑对象。
        Computer computer = new Computer();
        computer.powerOn();

        USB mouse=new Mouse();
        computer.useDevice(mouse);
        USB keyBoard= new Keyboard();
        computer.useDevice(keyBoard);

        computer.powerOff();
        System.out.println("======");

        /*computer.useDevice(new Mouse());//使用匿名对象也可以。
        System.out.println("======");
        Mouse mouse1=new Mouse();
        computer.useDevice(mouse1);//使用子类对象也可以，也发生了向上转型。*/
    }
}
