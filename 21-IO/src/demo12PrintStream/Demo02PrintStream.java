package demo12PrintStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/*
    ���Ըı��������Ŀ�ĵ�(��ӡ��������)
    ������,Ĭ���ڿ���̨���
    ʹ��System.setOut�����ı��������Ŀ�ĵظ�Ϊ�����д��ݵĴ�ӡ����Ŀ�ĵ�
        static void setOut(PrintStream out)
          ���·��䡰��׼���������
 */
public class Demo02PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("���ڿ���̨���");
        PrintStream ps=new PrintStream("D:\\idealProjects\\basic-code\\21-IO\\Ŀ�ĵ��Ǵ�ӡ��");
        System.setOut(ps);
        System.out.println("���ڴ�ӡ����Ŀ�ĵ����");
    }
}
