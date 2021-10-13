package demo01OutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
/*
    一次写多个字节的方法:
        - public void write(byte[] b)：将 b.length字节从指定的字节数组写入此输出流。
        - public void write(byte[] b, int off, int len) ：从指定的字节数组写入 len字节，从偏移量 off开始输出到此输出流。
 */
public class Demo02OutputStream {
    public static void main(String[] args) throws IOException {
        //创建FileOutputStream对象，构造方法中绑定要写入数据的目的地
        FileOutputStream fos=new FileOutputStream(new File("D:\\idealProjects\\basic-code\\21-IO\\b.txt"));
        fos.write(49);
        fos.write(48);
        fos.write(48);

        /*
            public void write(byte[] b)：将 b.length字节从指定的字节数组写入此输出流。
            一次写多个字节:
                如果写的第一个字节是正数(0-127),那么显示的时候会查询ASCII表
                如果写的第一个字节是负数,那第一个字节会和第二个字节,两个字节组成一个中文显示,查询系统默认码表(GBK)
         */
        byte[] bytes={65,66,67,68,69};//ABCDE
//        byte[] bytes={-65,-66,-67,-68,69};
        fos.write(bytes);
        fos.write(bytes,0,2);
        byte[] bytes1 = "大家好".getBytes();
        byte[] bytes2={-27, -92, -89, -27, -82, -74, -27, -91, -67};
        System.out.println(Arrays.toString(bytes1));
        fos.write(bytes1);
        fos.write(bytes2);
    }
}
