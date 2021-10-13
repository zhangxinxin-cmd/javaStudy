package test;

import demo01Junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Calculator_Test {
    /*
    * 初始化方法
    * 用于资源申请，所有测试方法在执行之前都会执行该方法
    * */
    @Before
    public void init(){
        System.out.println("init...");
    }
    /*
    释放资源方法：
    在所有测试方法执行完后，都会自动执行该方法
     */
    @After
    public void close(){
        System.out.println("close...");
    }
    /*
    测试add方法
     */
    @Test
    public void testAdd(){
        System.out.println("testAdd...");
        //创建计算器对象
        Calculator c=new Calculator();
        int add = c.add(3, 2);
//        System.out.println(add);
        //3.断言 我断言这个结果是5
        Assert.assertEquals(5,add);
    }
    /*
    测试sub方法
     */
    @Test
    public void testSub(){
        System.out.println("testSub...");
        Calculator c=new Calculator();
        int sub = c.sub(3, 2);
        Assert.assertEquals(1,sub);
    }
}
