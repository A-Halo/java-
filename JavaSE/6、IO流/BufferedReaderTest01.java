package JavaSE.OO.IO;

import java.io.*;

/*
 * �ֽ�
 * BufferedInputStream;
 * BufferedOutputStream;
 * �ַ�
 * BufferedReader;���л��������ַ�������
 * BufferedWriter;���л��������ַ������
 * 
 * InputStream ת����
 */

public class BufferedReaderTest01 {
	public static void main(String[] args) throws Exception {
		//����һ�������ַ����������ַ�������
		/*
		FileReader fr=new FileReader("E:\\test03.txt");//����һ���ļ��ַ�������
		BufferedReader br=new BufferedReader(fr);//���ļ��ַ���������װ�ɴ��л��������ַ�������
		*/
		//���������ֵ�λ�ã����ַ�Ϊ����װ�����������ͣ��ڵ���
		//FileReader fr��һ���ڵ���
		//BufferedReader br��һ����װ�������ߴ�����
		//BufferedReader br=new BufferedReader(new FileReader("E:\\test03.txt"));
		//��ʼ��
		/*
		String temp=null;
		while((temp=br.readLine())!=null) {//br.readLine()������ȡһ�У�������β�������з�
			System.out.println(temp);//���һ��
		}
		*/
		//�ر�
		//ע�⣺�رյ�ʱ��ֻ��Ҫ�ر������İ�װ����(������һ��װ����ģʽ)
		//br.close();
		
		//�������л��������ַ�������
		FileInputStream fis=new FileInputStream("E:\\\\test03.txt");//�ļ��ֽ�������
		//ת����(���ֽ���ת�����ַ���)
		InputStreamReader isr=new InputStreamReader(fis);
		BufferedReader br=new BufferedReader(isr);
		//��ʼ��
		String temp=null;
		while((temp=br.readLine())!=null) {//br.readLine()������ȡһ�У�������β�������з�
			System.out.println(temp);//���һ��
		}
		//�ر�������������(װ����ģʽ)
		br.close();
	}
}
