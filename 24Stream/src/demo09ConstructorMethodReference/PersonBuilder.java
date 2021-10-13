package demo09ConstructorMethodReference;
@FunctionalInterface
public interface PersonBuilder {
    //定义一个方法，根据传递的姓名创建Person对象返回
    Person buildPerson(String name);
}
