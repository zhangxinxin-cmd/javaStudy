package demo05Writer;

import java.io.FileWriter;
import java.io.IOException;

public class Demo04Writer {
    public static void main(String[] args) {
        FileWriter fw=null;
        try  {
            fw = new FileWriter("D:\\idealProjects\\basic-code\\21-IO\\c.txt");
            fw.write("你好");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e);
        }finally{
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println(e);
            }
        }
    }
}
