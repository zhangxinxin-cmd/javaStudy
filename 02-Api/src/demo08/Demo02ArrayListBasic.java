package demo08;
/*如果希望向集合ArrayList当中储存基本数据，必须使用基本类型对应的“包装类”。

基本类型 包装类（引用类型，包装类都位于java.lang包下
byte     Byte
short    Short
int      Integer
long     Long
float    Float
double   Double
char     character
boolean  Boolean

从JDK1.5+开始，支持自动装箱，自动拆箱
自动装箱：包装类型-->包装类型
自动拆箱：包装类型-->基本类型
* */
import java.util.ArrayList;

public class Demo02ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String> listA =new ArrayList<>();
//        ArrayList<int> listB =new ArrayList<int>();错误写法，泛型只能是引用类型，不能是基本类型。
        ArrayList<Integer> listB = new ArrayList<>();
        listB.add(230);
        listB.add(322);
        System.out.println(listB);
        int num = listB.get(0);
        System.out.println("第零号元素是："+num);
    }
}
