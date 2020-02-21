package JavaSE.OO.IO;

import java.io.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * java.io.ObjectOutputStream;���л�java����Ӳ��(Serial)
 * java.io.ObjectInputStream;��Ӳ���е����ݷ����л���jvm�ڴ�(DeSerial)
 */
public class ObjectOutputStreamTest {
	public static void main(String[] args) throws Exception, Exception {
		//����java����
		User u1=new User("��������");
		//���������(���л���)
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("E:\\test06.txt"));
		//д
		oos.writeObject(u1);
		//ˢ��
		oos.flush();
		//�ر�
		oos.close();
	}
}
/*
 * ��ʶ�ӿڵ����ã��𵽱�ʶ������
 * jvm��������ö���ʵ����ĳ����ʶ�ӿڣ�������������,����������һ������
 * static final long serialVersionUID=���л��汾��
 * �����ֶ�д�����л��汾��
 */
class User implements Serializable{//�ýӿ��ǿ����л��ģ��ýӿ�û���κη�������һ����ʶ�ӿ�
	//�����������Բμ����л�����Ҫʹ��transient�ؼ�������
	//transient String name;
	String name;
	User(String name){
		this.name=name;
	}
	
	public String toString() {
		return "User[name]="+name+"]";
	}
}