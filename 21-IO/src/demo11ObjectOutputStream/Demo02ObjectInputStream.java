package demo11ObjectOutputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
/*
    java.io.ObjectInputStream extends InputStream
    ObjectInputStream:����ķ����л���
    ����:���ļ��б���Ķ���,�����ķ�ʽ��ȡ����ʹ��

    ���췽��:
        ObjectInputStream(InputStream in) ������ָ�� InputStream ��ȡ�� ObjectInputStream��
        ����:
            InputStream in:�ֽ�������
    ���еĳ�Ա����:
        Object readObject() �� ObjectInputStream ��ȡ����

    ʹ�ò���:
        1.����ObjectInputStream����,���췽���д����ֽ�������
        2.ʹ��ObjectInputStream�����еķ���readObject��ȡ���������ļ�
        3.�ͷ���Դ
        4.ʹ�ö�ȡ�����Ķ���(��ӡ)

     readObject���������׳���ClassNotFoundException(class�ļ��Ҳ����쳣)
     �������ڶ����class�ļ�ʱ�׳����쳣
     �����л���ǰ��:
        1.�����ʵ��Serializable
        2.����������Ӧ��class�ļ�
 */
public class Demo02ObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:\\idealProjects\\basic-code\\21-IO\\person.txt"));
        Object o = ois.readObject();
        ois.close();
        System.out.println(o);
        Person p=(Person)o;
        System.out.println(p.getName());
    }
}
