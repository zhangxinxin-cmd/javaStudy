package demo04;

import org.w3c.dom.ls.LSOutput;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃骨头。");
    }

    public void watchHome(){
        System.out.println("狗看家。");
    }
}
