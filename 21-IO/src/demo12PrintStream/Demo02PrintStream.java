package demo12PrintStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/*
    可以改变输出语句的目的地(打印流的流向)
    输出语句,默认在控制台输出
    使用System.setOut方法改变输出语句的目的地改为参数中传递的打印流的目的地
        static void setOut(PrintStream out)
          重新分配“标准”输出流。
 */
public class Demo02PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("我在控制台输出");
        PrintStream ps=new PrintStream("D:\\idealProjects\\basic-code\\21-IO\\目的地是打印流");
        System.setOut(ps);
        System.out.println("我在打印流的目的地输出");
    }
}
