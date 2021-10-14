/*
 * @Author: your name
 * @Date: 2020-04-30 00:19:20
 * @LastEditTime: 2021-10-14 13:03:37
 * @LastEditors: your name
 * @Description: In User Settings Edit
 * @FilePath: \basic-code\17-Thread\src\demo01Thread\Demo01MainThread.java
 */
package demo01Thread;

/*
主线程：执行主(main)方法的线程

单线程程序:java程序中只有一个线程
执行从main方法，从上到下依次执行
 */
public class Demo01MainThread {
    public static void main(String[] args) {
        Person p1 = new Person("小强");
        p1.run();
        Person p2 = new Person("旺财");
        p2.run();
    }
}
