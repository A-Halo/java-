package JavaSE.OO.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * java.io.Reader;
 * 		java.io.InputStreamReader;转换流(字节输入流-->字符输入流)
 * 			java.io.FileReader;文件字符输入流
 */
public class FileReaderTest {
	public static void main(String[] args) {
		//创建文件字符输入流
		FileReader fr=null;
		try {
			fr=new FileReader("E:\\test02.txt");
			//开始读
			char[] chars=new char[512];//1kb
			int temp=0;
			while((temp=fr.read(chars))!=-1) {
				//将char数组有效部分转换成字符串
				System.out.println(new String(chars,0,temp));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fr!=null) {
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
