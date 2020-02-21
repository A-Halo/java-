package JavaSE.OO.IO;
/*
 * 接收用户键盘输入
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferedReaderTest02 {
	public static void main(String[] args) throws Exception {
		/*
		//Scanner
		Scanner s=new Scanner(System.in);//System.in是一个标准的输入流，默认接收键盘的输入
		//程序执行到此处停下来，等待用户的输入
		String str=s.next();//以空格为分界线，空格之后的数据拿不到
		
		System.out.println("你输入了："+str);
		*/
		//使用了BufferedReader用来接收用户的输入
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		//接收输入(每次接收一行)
		String str=br.readLine();
		System.out.println("你输入了："+str);
		
		//关闭
		br.close();
	}
}
