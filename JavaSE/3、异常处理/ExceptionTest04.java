package JavaSE.OO.yichang;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * 异常中的方法
 * 	1、getMessage()
 * 	2、printStackTrace()
 */
public class ExceptionTest04 {
	
	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("D:/asd.txt");
		}catch(FileNotFoundException e) {
			//打印异常堆栈信息
			//一般情况下都会使用该方式去调试程序
			//e.printStackTrace();
			/*
			 * java.io.FileNotFoundException: D:\asd.txt (系统找不到指定的文件。)
				at java.base/java.io.FileInputStream.open0(Native Method)
				at java.base/java.io.FileInputStream.open(FileInputStream.java:213)
				at java.base/java.io.FileInputStream.<init>(FileInputStream.java:155)
				at java.base/java.io.FileInputStream.<init>(FileInputStream.java:110)
				at JavaSE/JavaSE.OO.yichang.ExceptionTest04.main(ExceptionTest04.java:15)
			 */
			String msg=e.getMessage();
			System.out.println(msg);//D:\asd.txt (系统找不到指定的文件。)
		}
		System.out.println("ABC");
	}
}
