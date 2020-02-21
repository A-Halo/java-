package JavaSE.OO.IO;

import java.io.*;

/*
 * 字节
 * BufferedInputStream;
 * BufferedOutputStream;
 * 字符
 * BufferedReader;带有缓冲区的字符输入流
 * BufferedWriter;带有缓冲区的字符输出流
 * 
 * InputStream 转换流
 */

public class BufferedReaderTest01 {
	public static void main(String[] args) throws Exception {
		//创建一个带有字符缓冲区的字符输入流
		/*
		FileReader fr=new FileReader("E:\\test03.txt");//创建一个文件字符输入流
		BufferedReader br=new BufferedReader(fr);//将文件字符输入流包装成带有缓冲区的字符输入流
		*/
		//根据流出现的位置，流又分为，包装流或处理流，和，节点流
		//FileReader fr是一个节点流
		//BufferedReader br是一个包装流，或者处理流
		//BufferedReader br=new BufferedReader(new FileReader("E:\\test03.txt"));
		//开始读
		/*
		String temp=null;
		while((temp=br.readLine())!=null) {//br.readLine()方法读取一行，但是行尾不带换行符
			System.out.println(temp);//输出一行
		}
		*/
		//关闭
		//注意：关闭的时候只需要关闭最外层的包装流。(这里有一个装饰者模式)
		//br.close();
		
		//创建带有缓冲区的字符输入流
		FileInputStream fis=new FileInputStream("E:\\\\test03.txt");//文件字节输入流
		//转换流(将字节流转换成字符流)
		InputStreamReader isr=new InputStreamReader(fis);
		BufferedReader br=new BufferedReader(isr);
		//开始读
		String temp=null;
		while((temp=br.readLine())!=null) {//br.readLine()方法读取一行，但是行尾不带换行符
			System.out.println(temp);//输出一行
		}
		//关闭最外层的流即可(装饰者模式)
		br.close();
	}
}
