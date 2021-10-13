package demo01;

import java.util.ArrayList;

/*
* 题目：
* 定义4个学生对象，添加到集合当中，并遍历集合
* 思路：
* 定义student学生类，四个部分
* 创建一个集合
* 将四个学生添加到集合中：add
* 遍历集合size get*/
public class Demo02ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();//加不加<>效果一样（至少目前觉得。）
    Student one=new Student("洪七公",33);
    Student two = new Student("欧阳锋",45);
    Student three= new Student("迪丽热巴",26);
    Student four = new Student("古力娜扎",25);

    list.add(one);
    list.add(two);
    list.add(three);
    list.add(four);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("姓名："+list.get(i).getName()+"，年龄："+list.get(i).getAge());
        }
    }
}
