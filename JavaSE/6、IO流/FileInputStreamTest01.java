package JavaSE.OO.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * java.io.InputStream;
 * 		java.io.FileInputStream;文件字节输入流
 */
public class FileInputStreamTest01 {
	public static void main(String[] args) {
		//1、要读取某文件，先与这个文件创建一个输入流
		//文件路径
		//String filePath="";//相对路径，相对当前而言，在当前路径下找
		String filePath="E:\\test.txt";//绝对路径 test.txt:ab
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(filePath);
			
			//2、开始读
			int i1 = fis.read();//以字节的方式读取
			int i2=fis.read();
			int i3=fis.read();
			System.out.println(i1);//97
			System.out.println(i2);//98
			System.out.println(i3);//-1,如果已经读取到文件的末尾，就会返回-1
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//为了保证流一定会释放，所以在finally语句块中执行
			if(fis!=null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
