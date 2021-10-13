package demo07BufferedStream;

import java.io.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class Demo05Test {
    public static void main(String[] args) throws IOException {
        HashMap<String,String> map=new HashMap<>();
        FileReader fr=new FileReader("D:\\文档\\Java基础\\08.会员版(2.0)-就业课(2.0)-File类与IO流\\21.【缓冲流、转换流、序列化流、打印流】-笔记\\code\\10_IO\\in.txt");
        BufferedReader br=new BufferedReader(fr);
        FileWriter fw=new FileWriter("D:\\idealProjects\\basic-code\\21-IO\\in.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        String line=null;
        while ((line=br.readLine())!=null){
            String[] arr = line.split("\\.");
            //key序号会自动排序
            map.put(arr[0],arr[1]);
        }
        Set<String> set = map.keySet();
        for (String key : set) {
            bw.write(key+"."+map.get(key));
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
