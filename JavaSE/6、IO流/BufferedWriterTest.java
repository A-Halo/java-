package JavaSE.OO.IO;

import java.io.*;
import java.io.FileWriter;
import java.io.IOException;

/*
 * BufferedWriter
 */
public class BufferedWriterTest {
	public static void main(String[] args) throws Exception {
		//���������ַ����������ַ������
		//BufferedWriter bw=new BufferedWriter(new FileWriter("E:\\test04.txt"));
		
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("E:\\test04.txt",true)));
		//��ʼд
		bw.write("���ԣ�");
		
		//д��һ���зָ���
		bw.newLine();
		bw.write("�ָ���֮��");
		
		//ˢ��
		bw.flush();
		//�ر�
		bw.close();
	}
}
