package demo05;
/*匿名对象就是只有右边的对像，没有左边的名字和赋值运算符。
注意事项：匿名对象只能使用唯一的一次，下次再用必须再创建一个对象。
使用建议：如果确定有一个对象只需要使用唯一的一次，就可以用匿名对象。
new 类名称；
* */
public class Demo01Anonymous {

    public static void main(String[] args) {
        //左边的对象名就是对象名字
        Person one = new Person();
        one.name="周JK";
        one.show();
        System.out.println("============");

        new Person().name="劫";
        new Person().show();

    }
}
