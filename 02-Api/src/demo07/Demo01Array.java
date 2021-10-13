package demo07;

/*题目：
定义一个数组，用来储存3个person对象。

数组有一个缺点，一旦创建，程序运行期间长度不可以改变
* */
public class Demo01Array {
    public static void main(String[] args) {
//        首先创建一个长度为3的数组
        Person[] array=new Person[3];

        Person one = new Person("迪丽热巴",23);//Demo07.Person@2d98a335
        Person two = new Person("古力娜扎",26);//Demo07.Person@16b98e56
        Person three = new Person("玛尔扎哈",32);//Demo07.Person@7ef20235
//        将one当中的地址值赋值到数组的0号元素位置
        array[0]=one;
        array[1]=two;
        array[2]=three;
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].getName());
        }
    }
}
