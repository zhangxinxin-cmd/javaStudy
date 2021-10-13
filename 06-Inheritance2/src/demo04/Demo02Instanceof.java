package demo04;

public class Demo02Instanceof {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();
//        判断一下父类引用animal本来是不是Dog
        if(animal instanceof Dog){
        Dog dog = (Dog)animal;
        dog.watchHome();
        }
//        判断一下animal是不是Cat
        if(animal instanceof Cat){
            Cat cat = (Cat)animal;
            cat.catchMouse();
        }
        giveMePet(animal);
    }

    public static void giveMePet(Animal animal){
        if(animal instanceof Cat){
            Cat cat =(Cat)animal;
            cat.catchMouse();
        }
        if(animal instanceof  Dog){
            Dog dog =(Dog)animal;
            dog.watchHome();
        }
    }
}
