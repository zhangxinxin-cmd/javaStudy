package demo08;

import java.util.ArrayList;
import java.util.LinkedList;

/*ArrayList当中的常用方法：
public boolean add(E i):向集合当中添加元素，参数的类型和泛型一致
public E get(int index):从集合当中获取元素，参数是索引编号，返回值是对应位置的元素
public E remove(int index):从集合中删除元素，参数是索引编号，返回值是被删除的元素
public int size():获取集合的尺寸长度，返回值是集合中包含的元素个数
* */
public class Demo02ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        boolean success =list.add("张靓颖");
        System.out.println("添加的动作是否成功："+success);//true
        list.add("赵又廷");
        list.add("李小璐");
        list.add("吴京");
        list.add("雷军");
        System.out.println(list);
        String name = list.get(4);
        System.out.println("第四号索引位置是："+name);
        String name2= list.remove(2);
        System.out.println("被删除的人是："+name2);
        System.out.println(list);
        System.out.println("集合的长度是："+list.size());
    }
}
