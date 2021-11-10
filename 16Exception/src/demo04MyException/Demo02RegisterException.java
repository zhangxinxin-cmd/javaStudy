package demo04MyException;

import java.util.Scanner;

/*
    要求：我们模拟注册操作，如果用户名已存在，则抛出异常并提示：亲，该用户名已经被注册。

    分析:
        1.使用数组保存已经注册过的用户名(数据库)
        2.使用Scanner获取用户输入的注册的用户名(前端,页面)
        3.定义一个方法,对用户输入的中注册的用户名进行判断
            遍历存储已经注册过用户名的数组,获取每一个用户名
            使用获取到的用户名和用户输入的用户名比较
                true:
                    用户名已经存在,抛出RegisterException异常,告知用户"亲，该用户名已经被注册";
                false:
                    继续遍历比较
            如果循环结束了,还没有找到重复的用户名,提示用户"恭喜您,注册成功!";
 */
public class Demo02RegisterException {
    //使用数组保存已经注册过的用户名（数据库）
    private static String[] userNames = {"张三", "李四", "王五"};

    public Demo02RegisterException() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要注册的用户名");
        String userName = sc.next();
        checkUserName(userName);
    }

    public static void checkUserName(String userName) {
        //遍历从存储已经注册过的用户名的数组，获取每一个用户名
        for (String name : userNames) {
            if (name.equals(userName)) {
                //true：用户名已经存在，抛出RegisterException异常，告知用户“亲，该用户名已经被注册”
                throw new RegisterException("亲，该用户名已经被注册");
            }
        }
        //如果循环结束了，还没有找到重复的用户名，提示用户“恭喜您，注册成功”
        System.out.println("恭喜您，注册成功！");
    }
}
