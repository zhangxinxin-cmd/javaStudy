package demo11ObjectOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
    java.io.ObjectOutputStream extends OutputStream
    ObjectOutputStream:��������л���
    ����:�Ѷ��������ķ�ʽд�뵽�ļ��б���

    ���췽��:
        ObjectOutputStream(OutputStream out) ����д��ָ�� OutputStream �� ObjectOutputStream��
        ����:
            OutputStream out:�ֽ������
    ���еĳ�Ա����:
        void writeObject(Object obj) ��ָ���Ķ���д�� ObjectOutputStream��

    ʹ�ò���:
        1.����ObjectOutputStream����,���췽���д����ֽ������
        2.ʹ��ObjectOutputStream�����еķ���writeObject,�Ѷ���д�뵽�ļ���
        3.�ͷ���Դ
 */
public class Demo01ObjectOutputStream {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:\\idealProjects\\basic-code\\21-IO\\person.txt"));
        oos.writeObject(new Person("�����Ȱ�",22));
        oos.close();
    }
}
