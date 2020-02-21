package JavaSE.OO.IO;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * java.io.PrintStream;标准输出流，默认打印到控制台，以字节方式
 * java.io.PrintWriter;以字符方式
 */
public class PrintStreamTest {
	public static void main(String[] args) throws Exception {
		//默认输出到控制台
		System.out.println("helloWorld!");
		
		PrintStream ps=System.out;
		ps.println("java");
		//可以改变输出方向
		System.setOut(new PrintStream(new FileOutputStream("E:\\log.txt")));//log日志文件
		//再次输出
		//System.out.println("hhhh");
		//通常使用上面的方式记录日志
		//记录m1开始执行的时间，和结束的时间
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		System.out.println("m1开始执行"+sdf.format(new Date()));
		m1();
		System.out.println("m1结束执行"+sdf.format(new Date()));
	}
	
	public static void m1() {
		System.out.println("m1 method execute!");
	}
}
