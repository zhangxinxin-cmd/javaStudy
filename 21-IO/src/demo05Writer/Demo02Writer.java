package demo05Writer;

import java.io.FileWriter;
import java.io.IOException;

public class Demo02Writer {
    public static void main(String[] args) throws IOException {
        FileWriter FW=new FileWriter("D:\\idealProjects\\basic-code\\21-IO\\a.txt",true);
        char[] ch=new char[]{'2','a','d'};
        FW.write("你好");
        FW.flush();
        FW.write(ch,0,2);
        FW.flush();
        FW.close();
    }
}
