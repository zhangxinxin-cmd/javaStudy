package demo08;

import java.util.ArrayList;

/*数组的长度不可以改变。
但是ArrayList的长度可以改变
对于ArrayList来说，有一个尖括号<E>代表泛型。
泛型：也就是装在集合当中的所有元素，全都是统一的某种类型。
注意事项：
对于ArrayList集合来说，直接打印的不是地址值，而是内容。
* */
public class Demo01ArrayList {
    public static void main(String[] args) {
//        创建了一个ArrayList集合，集合的名称是list，里面装的都是String字符串类型的数据
//        备注：从JDK1.7开始，右侧的尖括号内部可以不写内容。
        ArrayList<String> list = new ArrayList<>();
        //System.out.println(list);//[]

        //向集合中添加一些数据，需要用到add方法
        list.add("赵丽颖");
        list.add("迪丽热巴");
        list.add("古力娜扎");
        System.out.println(list);
    }
}
