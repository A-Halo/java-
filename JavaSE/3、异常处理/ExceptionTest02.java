package JavaSE.OO.yichang;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * ����throws
 */
public class ExceptionTest02 {
	public static void main(String[] args) throws FileNotFoundException {
		m1();
		//ʹ��throws�����쳣���������Ĵ����쳣��������ж����
		//˭���õľ��׸�˭
		//�����m1��������������쳣����Ϊ�ǲ��������ף�����jvm��jvm��������쳣�ͻ��Ƴ�jvm��������벻��ִ��
		System.out.println("hello word");
	}
	public static void m1() throws FileNotFoundException {
		m2();
	}
	public static void m2() throws FileNotFoundException {
		m3();	
	}
	public static void m3() throws FileNotFoundException {
		new FileInputStream("d:/ab.txt");//FileInputStream���췽��������λ����ʹ����throws(������)
	}
}
/*
��ִ�й����з�����FielNotFoundException���͵��쳣����jvm������һ��FielNotFoundException���͵Ķ���
�ö���Я��������Ϣ��jvm���ö���Я������Ϣ��ӡ������̨������ֹ����
Exception in thread "main" java.io.FileNotFoundException: d:\ab.txt (ϵͳ�Ҳ���ָ�����ļ���)
	at java.base/java.io.FileInputStream.open0(Native Method)
	at java.base/java.io.FileInputStream.open(FileInputStream.java:213)
	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:155)
	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:110)
	at JavaSE/JavaSE.OO.yichang.ExceptionTest02.m3(ExceptionTest02.java:24)
	at JavaSE/JavaSE.OO.yichang.ExceptionTest02.m2(ExceptionTest02.java:21)
	at JavaSE/JavaSE.OO.yichang.ExceptionTest02.m1(ExceptionTest02.java:18)
	at JavaSE/JavaSE.OO.yichang.ExceptionTest02.main(ExceptionTest02.java:11)

*/