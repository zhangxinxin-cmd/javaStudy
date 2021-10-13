package demo06Prop;

import java.io.*;
import java.security.KeyStore;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

/*
java.util.Properties集合extends Hashtable<k,v> implements Map<k,v>
Properties类表示了一个持久的属性集。Properties可保存在流中或从流中加载
Properties集合是一个唯一和IO流相结合的集合
可以使用Properties集合中的方法store，把集合中的临时数据，持久写入到硬盘中存储
可以使用Properties集合中的方法Load，把硬盘中保存的文件（键值对）读取到集合中使用

属性列表中每个键及其对应都是一个字符串。
Properties集合是一个双列集合，key和value默认都是字符串
 */
public class Demo01Properties {
    public static void main(String[] args) throws IOException {
        //show1();
        //show2();
        //show3();
        //show4();
    }
    /*public static void show4() throws IOException{
        FileInputStream fis=new FileInputStream("D:\\idealProjects\\basic-code\\21-IO\\pro.txt");
        Properties pr=new Properties();
        pr.load(fis);
        for (String key : pr.stringPropertyNames()) {
            System.out.println(key+"--->"+pr.getProperty(key));
        }
    }*///由于编码不同，因此字节输入流读取中文会产生乱码
    /*
            可以使用Properties集合中的方法load,把硬盘中保存的文件(键值对),读取到集合中使用
            void load(InputStream inStream)
            void load(Reader reader)
            参数:
                InputStream inStream:字节输入流,不能读取含有中文的键值对
                Reader reader:字符输入流,能读取含有中文的键值对
            使用步骤:
                1.创建Properties集合对象
                2.使用Properties集合对象中的方法load读取保存键值对的文件
                3.遍历Properties集合
            注意:
                1.存储键值对的文件中,键与值默认的连接符号可以使用=,空格(其他符号)
                2.存储键值对的文件中,可以使用#进行注释,被注释的键值对不会再被读取
                3.存储键值对的文件中,键与值默认都是字符串,不用再加引号
         */
    private static void show3() throws IOException {
        Properties prop=new Properties();
        prop.load(new FileReader("D:\\idealProjects\\basic-code\\21-IO\\pro.txt"));
        Set<String> set = prop.stringPropertyNames();
        for (String key : set) {
            System.out.println(key+"--->"+prop.getProperty(key));
        }
    }

    /*
        可以使用Properties集合中的方法store,把集合中的临时数据,持久化写入到硬盘中存储
        void store(OutputStream out, String comments)
        void store(Writer writer, String comments)
        参数:
            OutputStream out:字节输出流,不能写入中文
            Writer writer:字符输出流,可以写中文
            String comments:注释,用来解释说明保存的文件是做什么用的
                    不能使用中文,会产生乱码,默认是Unicode编码
                    一般使用""空字符串
        使用步骤:
            1.创建Properties集合对象,添加数据
            2.创建字节输出流/字符输出流对象,构造方法中绑定要输出的目的地
            3.使用Properties集合中的方法store,把集合中的临时数据,持久化写入到硬盘中存储
            4.释放资源
     */
    private static void show2() throws IOException {
        Properties p=new Properties();
        p.put("赵丽","167");
        p.setProperty("赵丽颖","168");
        p.setProperty("迪丽热巴","165");
        p.setProperty("古力娜扎","160");
        FileWriter fw=new FileWriter("D:\\idealProjects\\basic-code\\21-IO\\pro.txt",true);
       p.store(fw,"save data");
        fw.close();
       //p.store(new FileOutputStream("D:\\idealProjects\\basic-code\\21-IO\\pro2.txt"),"");//乱码，字符流不能写中文，字节流可以

    }

    /*
        使用Properties集合存储数据,遍历取出Properties集合中的数据
        Properties集合是一个双列集合,key和value默认都是字符串
        Properties集合有一些操作字符串的特有方法
            Object setProperty(String key, String value) 调用 Hashtable 的方法 put。
            String getProperty(String key) 通过key找到value值,此方法相当于Map集合中的get(key)方法
            Set<String> stringPropertyNames() 返回此属性列表中的键集，其中该键及其对应值是字符串,此方法相当于Map集合中的keySet方法
     */
    private static void show1() {
        Properties p=new Properties();
        p.setProperty("赵丽颖","168");
        p.setProperty("迪丽热巴","165");
        p.setProperty("古力娜扎","160");
        //使用stringPropertyName把Properties集合中的键取出，存储到一个set集合中
        Set<String> set = p.stringPropertyNames();
        //遍历set集合，取出p中每一个键
        for (String s : set) {
            System.out.println(s+"--->"+p.getProperty(s));
        }
    }
}
