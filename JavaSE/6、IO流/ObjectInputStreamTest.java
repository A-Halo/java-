package JavaSE.OO.IO;
/*
 * �����л�
 */
import java.io.*;
public class ObjectInputStreamTest {
	public static void main(String[] args) throws Exception, Exception {
		//���������л���
		ObjectInputStream ois =new ObjectInputStream(new FileInputStream("E:\\test06.txt"));
		//�����л�
		Object o=ois.readObject();
		System.out.println(o);
		//�ر�
		ois.close();
	}
}
