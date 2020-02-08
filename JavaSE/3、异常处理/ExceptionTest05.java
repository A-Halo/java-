package JavaSE.OO.yichang;

import java.io.*;

/*
 * ����finally����
 * 	1��finally�������ֱ�Ӻ�try�������á�try...finally...
 * 	2��try..catch...finallyҲ����
 * 	3����finally�����еĴ���һ����ִ��
 * 	4��finally�����һ����ִ�У�����ͨ���ڳ�����Ϊ�˱�֤ĳ��Դһ�����ͷţ�����һ����finally�������ͷ���Դ
 * ����final��finalize��finally
 * 		final��ʾ���ɱ�ģ������������������������ε����޷����̳У�final static �ǳ���
 * 		finalize��GC���������������õĶ���ǰִ�еķ���
 * 		finallyͨ�����try���ִ���쳣����飬Ϊ�˱�֤һ����ִ�е�һ�εĴ���
 */
public class ExceptionTest05 {
	public static void main(String[] args) throws FileNotFoundException {
		/*
		try {
			System.out.println("ABC");
			return;
		}finally {
			System.out.println("test");
		}
		*/
		/*
		try {
			FileInputStream fis=new FileInputStream("Test.java");
			//����ִ��
			System.out.println("TTTT");
		}finally {
			//��ִ��
			System.out.println("AAAA");
		}
		*/
		/*
		try {
			System.exit(0);//�˳�java�����jvm
		}finally {
			//����ִ��
			System.out.println("AAAA");
		}
		*/
		//����m1����
		int i=m1();
		System.out.println(i);//10
		
		//�����÷�
		FileInputStream fis=null;//�����������������Ϊfinally����fis
		try {
			fis=new FileInputStream("ExceptionTest05.java");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			//Ϊ�˱�֤��Դһ�����ͷţ����Է���finally��
			if(fis!=null) {
			try {
				fis.close();//�ͷ���Դ
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		}
	}
	public static int m1() {
		/*
		int i=10;
		try {
			return i;
		}finally {
			i++;
			System.out.println("m1��i="+i);//11
		}
		*/
		//���ϴ���ִ��ԭ��
		int i=10;
		try {
			int temp=i;
			return temp;
		}finally {
			i++;
			System.out.println("m1��i="+i);//11
		}
	}
}
