package demo07BufferedStream;

import java.io.*;
import java.util.*;

public class Demo06Test2 {
    public static void main(String[] args) throws IOException {
        LinkedHashMap<String,String> map=new LinkedHashMap<>();
        FileReader fr=new FileReader("D:\\文档\\Java基础\\08.会员版(2.0)-就业课(2.0)-File类与IO流\\21.【缓冲流、转换流、序列化流、打印流】-笔记\\code\\10_IO\\in.txt");
        BufferedReader br=new BufferedReader(fr);
        FileWriter fw=new FileWriter("D:\\idealProjects\\basic-code\\21-IO\\in.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        String line=null;
        int len=0;
        while ((line=br.readLine())!=null){
            String[] arr = line.split("\\.");
            map.put(arr[0],arr[1]);
            //System.out.println(arr[0]);
            len++;
        }
        int[] keys=new int[len];
        int i=0;
        Set<String> set = map.keySet();
        for (String key : set) {
            keys[i]=Integer.parseInt(key);
            i++;
        }
        Arrays.sort(keys);
        i=0;
        for (String key : set) {
            key=Integer.toString(keys[i]);
            i++;
            bw.write(key+"."+map.get(key));
            bw.newLine();
        }
        bw.flush();
        bw.close();
        fw.close();
    }
}
