package JavaSE.OO.IO;

import java.io.*;
import java.io.FileWriter;
import java.io.IOException;

/*
 * BufferedWriter
 */
public class BufferedWriterTest {
	public static void main(String[] args) throws Exception {
		//创建带有字符缓冲区的字符输出流
		//BufferedWriter bw=new BufferedWriter(new FileWriter("E:\\test04.txt"));
		
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("E:\\test04.txt",true)));
		//开始写
		bw.write("测试！");
		
		//写入一个行分隔符
		bw.newLine();
		bw.write("分隔符之后");
		
		//刷新
		bw.flush();
		//关闭
		bw.close();
	}
}
