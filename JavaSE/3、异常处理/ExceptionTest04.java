package JavaSE.OO.yichang;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * �쳣�еķ���
 * 	1��getMessage()
 * 	2��printStackTrace()
 */
public class ExceptionTest04 {
	
	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("D:/asd.txt");
		}catch(FileNotFoundException e) {
			//��ӡ�쳣��ջ��Ϣ
			//һ������¶���ʹ�ø÷�ʽȥ���Գ���
			//e.printStackTrace();
			/*
			 * java.io.FileNotFoundException: D:\asd.txt (ϵͳ�Ҳ���ָ�����ļ���)
				at java.base/java.io.FileInputStream.open0(Native Method)
				at java.base/java.io.FileInputStream.open(FileInputStream.java:213)
				at java.base/java.io.FileInputStream.<init>(FileInputStream.java:155)
				at java.base/java.io.FileInputStream.<init>(FileInputStream.java:110)
				at JavaSE/JavaSE.OO.yichang.ExceptionTest04.main(ExceptionTest04.java:15)
			 */
			String msg=e.getMessage();
			System.out.println(msg);//D:\asd.txt (ϵͳ�Ҳ���ָ�����ļ���)
		}
		System.out.println("ABC");
	}
}
