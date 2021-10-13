package demo05Writer;

import java.io.FileWriter;
import java.io.IOException;

public class Demo03Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("D:\\idealProjects\\basic-code\\21-IO\\a.txt");
        for (int i = 0; i < 10; i++) {
            fw.write("你好"+(i+1)+"\r\n");
        }
        fw.flush();
        fw.close();
    }
}
