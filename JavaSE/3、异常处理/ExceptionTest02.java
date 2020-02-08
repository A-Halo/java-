package JavaSE.OO.yichang;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * 深入throws
 */
public class ExceptionTest02 {
	public static void main(String[] args) throws FileNotFoundException {
		m1();
		//使用throws处理异常不是真正的处理异常，而是推卸责任
		//谁调用的就抛给谁
		//上面的m1方法如果出现了异常，因为是采用了上抛，给了jvm，jvm遇到这个异常就会推出jvm，下面代码不会执行
		System.out.println("hello word");
	}
	public static void m1() throws FileNotFoundException {
		m2();
	}
	public static void m2() throws FileNotFoundException {
		m3();	
	}
	public static void m3() throws FileNotFoundException {
		new FileInputStream("d:/ab.txt");//FileInputStream构造方法声明的位置上使用了throws(向上抛)
	}
}
/*
在执行过程中发生了FielNotFoundException类型的异常，则jvm创建了一个FielNotFoundException类型的对象
该对象携带以下信息，jvm将该对象携带的信息打印到控制台，并终止程序
Exception in thread "main" java.io.FileNotFoundException: d:\ab.txt (系统找不到指定的文件。)
	at java.base/java.io.FileInputStream.open0(Native Method)
	at java.base/java.io.FileInputStream.open(FileInputStream.java:213)
	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:155)
	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:110)
	at JavaSE/JavaSE.OO.yichang.ExceptionTest02.m3(ExceptionTest02.java:24)
	at JavaSE/JavaSE.OO.yichang.ExceptionTest02.m2(ExceptionTest02.java:21)
	at JavaSE/JavaSE.OO.yichang.ExceptionTest02.m1(ExceptionTest02.java:18)
	at JavaSE/JavaSE.OO.yichang.ExceptionTest02.main(ExceptionTest02.java:11)

*/