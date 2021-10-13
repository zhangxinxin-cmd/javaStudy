package demo04;
/*
向上转型一定是安全的，没有问题的，但是也有一个弊端：
对象一旦转型为父类，那么就无法调用子类原本特有的内容。

解决方案：用对象的向下转型[还原]
 */
public class Demo01Main {
    public static void main(String[] args) {
//          对象的向上转型，就是：父类引用指向子类对象。
        Animal animal = new Cat();
        animal.eat();//猫吃鱼

//        animal.catchMouse(); //错误写法
//        向下转型，进行还原动作。
        Cat animal1 = (Cat)animal;
        animal1.catchMouse();

//        错误写法
        //java.lang.ClassCastException
//        Dog dog = (Dog)animal;

        Dog dog1=new Dog();
        Dog dog = (Dog)dog1;
    }
}
