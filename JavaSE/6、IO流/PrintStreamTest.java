package JavaSE.OO.IO;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * java.io.PrintStream;��׼�������Ĭ�ϴ�ӡ������̨�����ֽڷ�ʽ
 * java.io.PrintWriter;���ַ���ʽ
 */
public class PrintStreamTest {
	public static void main(String[] args) throws Exception {
		//Ĭ�����������̨
		System.out.println("helloWorld!");
		
		PrintStream ps=System.out;
		ps.println("java");
		//���Ըı��������
		System.setOut(new PrintStream(new FileOutputStream("E:\\log.txt")));//log��־�ļ�
		//�ٴ����
		//System.out.println("hhhh");
		//ͨ��ʹ������ķ�ʽ��¼��־
		//��¼m1��ʼִ�е�ʱ�䣬�ͽ�����ʱ��
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		System.out.println("m1��ʼִ��"+sdf.format(new Date()));
		m1();
		System.out.println("m1����ִ��"+sdf.format(new Date()));
	}
	
	public static void m1() {
		System.out.println("m1 method execute!");
	}
}
