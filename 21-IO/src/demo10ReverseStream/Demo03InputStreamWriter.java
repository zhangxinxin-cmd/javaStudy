package demo10ReverseStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    java.io.InputStreamReader extends Reader
    InputStreamReader:���ֽ���ͨ���ַ�������������ʹ��ָ���� charset ��ȡ�ֽڲ��������Ϊ�ַ���(����:�ѿ������ı���ܿ�����)

    �̳��Ը���Ĺ��Գ�Ա����:
        int read() ��ȡ�����ַ������ء�
        int read(char[] cbuf)һ�ζ�ȡ����ַ�,���ַ��������顣
        void close() �رո������ͷ���֮������������Դ��
    ���췽��:
        InputStreamReader(InputStream in) ����һ��ʹ��Ĭ���ַ����� InputStreamReader��
        InputStreamReader(InputStream in, String charsetName) ����ʹ��ָ���ַ����� InputStreamReader��
        ����:
            InputStream in:�ֽ�������,������ȡ�ļ��б�����ֽ�
            String charsetName:ָ���ı��������,�����ִ�Сд,������utf-8/UTF-8,gbk/GBK,...��ָ��Ĭ��ʹ��UTF-8
     ʹ�ò���:
        1.����InputStreamReader����,���췽���д����ֽ���������ָ���ı��������
        2.ʹ��InputStreamReader�����еķ���read��ȡ�ļ�
        3.�ͷ���Դ
     ע������:
        ���췽����ָ���ı��������Ҫ���ļ��ı�����ͬ,����ᷢ������
 */
public class Demo03InputStreamWriter {
    public static void main(String[] args) throws IOException {
//        read_utf_8();
        read_gbk();
    }

    private static void read_gbk() throws IOException {
        FileInputStream fis=new FileInputStream("D:\\idealProjects\\basic-code\\21-IO\\utf_8.txt");
        InputStreamReader isr=new InputStreamReader(fis,"UTF-8");
        int len = 0;
        while ((len=isr.read())!=-1){
            System.out.println((char)len);
        }
        isr.close();
    }

    private static void read_utf_8() throws IOException {
        FileInputStream fis=new FileInputStream("D:\\idealProjects\\basic-code\\21-IO\\utf_8.txt");
        InputStreamReader isr=new InputStreamReader(fis,"utf-8");
        int len = 0;
        while ((len=isr.read())!=-1){
            System.out.println((char)len);
        }
        isr.close();
    }
}
