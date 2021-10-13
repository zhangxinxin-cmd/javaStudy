package demo04Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
    - java.utils.Collections是集合工具类，用来对集合进行操作。部分方法如下：
        public static <T> void sort(List<T> list，Comparator<? super T> ):将集合中元素按照指定规则排序。

     Comparator和Comparable的区别
        Comparable:自己(this)和别人(参数)比较,自己需要实现Comparable接口,重写比较的规则compareTo方法
        Comparator:相当于找一个第三方的裁判,比较两个

    Comparator的排序规则:
        o1-o2:升序
 */
public class Demo03Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list01=new ArrayList<>();
        list01.add(12);
        list01.add(21);
        list01.add(43);
        list01.add(13);
        System.out.println(list01);
        Collections.sort(list01, new Comparator<Integer>() {
            //重写比较的规则
            @Override
            public int compare(Integer integer, Integer t1) {
                System.out.println(integer);
                //return t1=Integer//降序
                return integer-t1;//升序
            }
        });
        System.out.println(list01);
        ArrayList<Student> list02=new ArrayList<>();
        Student st1=new Student("a迪丽热巴",22);
        Student st2=new Student("古力娜扎",22);
        Student st3 =new Student("玛尔扎哈",21);
        Collections.addAll(list02,st1,st2,st3);
        System.out.println(list02);
        Collections.sort(list02, new Comparator<Student>() {
            @Override
            public int compare(Student student, Student t1) {
                //按照年龄升序排序
                int result= student.getAge()-t1.getAge();
                //如果两个人的年龄相同，再使用姓名的第一个字比较
                if(result==0){
                    result= student.getName().charAt(0)-t1.getName().charAt(0);
                }
                return result;
            }
        });
        System.out.println(list02);
    }
}
