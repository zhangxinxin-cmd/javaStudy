package demo12PrintStream;
/*
    java.io.PrintStream:��ӡ��
        PrintStream Ϊ�������������˹��ܣ�ʹ�����ܹ�����ش�ӡ��������ֵ��ʾ��ʽ��
    PrintStream�ص�:
        1.ֻ�������ݵ����,���������ݵĶ�ȡ
        2.�������������ͬ��PrintStream ��Զ�����׳� IOException
        3.�����еķ���,print,println
            void print(�������͵�ֵ)
            void println(�������͵�ֵ������)
    ���췽��:
        PrintStream(File file):�����Ŀ�ĵ���һ���ļ�
        PrintStream(OutputStream out):�����Ŀ�ĵ���һ���ֽ������
        PrintStream(String fileName) :�����Ŀ�ĵ���һ���ļ�·��
    PrintStream extends OutputStream
    �̳��Ը���ĳ�Ա����:
        - public void close() ���رմ���������ͷ��������������κ�ϵͳ��Դ��
        - public void flush() ��ˢ�´��������ǿ���κλ��������ֽڱ�д����
        - public void write(byte[] b)���� b.length�ֽڴ�ָ�����ֽ�����д����������
        - public void write(byte[] b, int off, int len) ����ָ�����ֽ�����д�� len�ֽڣ���ƫ���� off��ʼ��������������
        - public abstract void write(int b) ����ָ�����ֽ��������
    ע��:
        ���ʹ�ü̳��Ը����write����д����,��ô�鿴���ݵ�ʱ����ѯ����� 97->a
        ���ʹ���Լ����еķ���print/println����д����,д������ԭ����� 97->97
 */

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Demo01PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("hello world");
        PrintStream ps=new PrintStream("D:\\idealProjects\\basic-code\\21-IO\\ps.txt");
        ps.write(97);
        ps.print(97);
        ps.print("hello world");
        ps.println(" true");
        ps.println(true);
        ps.close();
    }
}
