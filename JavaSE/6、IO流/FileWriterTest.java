package JavaSE.OO.IO;

import java.io.FileWriter;
import java.io.IOException;

/*
 * java.io.writer;
 * 		java.io.OutputStreamWriter;ת����(�ֽ������-->�ַ������)
 * 			java.io.FileWriter;�ļ��ַ������
 */
public class FileWriterTest {
	public static void main(String[] args) throws Exception {
		//�����ļ��ַ������
		//FileWriter fw=new FileWriter("E:\\test03.txt");//����
		FileWriter fw=new FileWriter("E:\\test03.txt",true);//׷��
		//��ʼд
		fw.write("�ַ���");
		//��char�����һ����д��
		char[] chars= {'��','!','��','!','��','!'};
		fw.write(chars,0,3);
		//ˢ��
		fw.flush();
		//�ر�
		fw.close();
	}
}
