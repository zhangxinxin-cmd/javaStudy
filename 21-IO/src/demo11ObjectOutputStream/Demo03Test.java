package demo11ObjectOutputStream;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

/*
    ��ϰ�����л�����
        �����������ļ��б����������ʱ��
        ���԰Ѷ������洢��һ��������
        �Լ��Ͻ����л��ͷ����л�
    ����:
        1.����һ���洢Person�����ArrayList����
        2.��ArrayList�����д洢Person����
        3.����һ�����л���ObjectOutputStream����
        4.ʹ��ObjectOutputStream�����еķ���writeObject,�Լ��Ͻ������л�
        5.����һ�������л�ObjectInputStream����
        6.ʹ��ObjectInputStream�����еķ���readObject��ȡ�ļ��б���ļ���
        7.��Object���͵ļ���ת��ΪArrayList����
        8.����ArrayList����
        9.�ͷ���Դ
 */
public class Demo03Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Person> list=new ArrayList<>();
        list.add(new Person("�����Ȱ�",22));
        list.add(new Person("��������",23));
        list.add(new Person("�������",24));
        FileOutputStream fos=new FileOutputStream("D:\\idealProjects\\basic-code\\21-IO\\fos2.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(list);
        FileInputStream fis=new FileInputStream("D:\\idealProjects\\basic-code\\21-IO\\fos2.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Object o = ois.readObject();
        ArrayList<Person> list2= (ArrayList<Person>)o;
        for (Person person : list2) {
            System.out.println(person);
        }
        ois.close();
        oos.close();
    }
}
