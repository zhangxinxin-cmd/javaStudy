package demo05Writer;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo01Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("D:\\idealProjects\\basic-code\\21-IO\\a.txt");
        fw.write(97);
        fw.flush();
        fw.write(98);
        fw.close();
//        fw.write(99);//IOException: Stream closed
    }
}
