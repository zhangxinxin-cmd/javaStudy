package demo06Lambda;

import javax.print.DocFlavor;
import java.util.ArrayList;

/*
Lambda表达式：是可推导，可省略
凡是根据上下文推导出来的内容，都可以省略书写
可以省略内容：
1.（参数列表）：括号中参数列表的数据类型，可以省略不写
2.（参数列表）：括号中的参数如果只有一个，那么类型和（）都可以省略
3.（一些代码）：如果{}中的代码只有一行，无论是否返回值，都可以省略（{},return,分号）
 */
public class Demo01ArrayList {
    public static void main(String[] args) {
        //JDK1.7版本之前，创建集合对象必须把前后的泛型都写上
        ArrayList<String> list01=new ArrayList<>();



    }
}
