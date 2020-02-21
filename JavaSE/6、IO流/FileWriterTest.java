package JavaSE.OO.IO;

import java.io.FileWriter;
import java.io.IOException;

/*
 * java.io.writer;
 * 		java.io.OutputStreamWriter;转换流(字节输出流-->字符输出流)
 * 			java.io.FileWriter;文件字符输出流
 */
public class FileWriterTest {
	public static void main(String[] args) throws Exception {
		//创建文件字符输出流
		//FileWriter fw=new FileWriter("E:\\test03.txt");//覆盖
		FileWriter fw=new FileWriter("E:\\test03.txt",true);//追加
		//开始写
		fw.write("字符流");
		//将char数组的一部分写入
		char[] chars= {'字','!','符','!','流','!'};
		fw.write(chars,0,3);
		//刷新
		fw.flush();
		//关闭
		fw.close();
	}
}
