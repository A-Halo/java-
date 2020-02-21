package JavaSE.OO.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * java.io.OutputStream;
 * 		java.io.FileOutputStream;文件字节输出流
 * 
 * 	将计算机内存中的数据写入硬盘文件中
 */
public class FileOutputStreamTest {
	public static void main(String[] args) {
		FileOutputStream fos=null;
		try {
			//创建文件字节输出流
			//fos=new FileOutputStream("E:\\test02.txt");谨慎使用，会将原文件内容覆盖
			//以追加的方式写入
			fos=new FileOutputStream("E:\\test02.txt",true);
			//开始写
			String msg="HelloWord!";
			//将String转换成byte数组
			byte[] bytes=msg.getBytes();
			
			//将byte数组中所有的数据写入
			//fos.write(bytes);
			//将byte数组一部分写入
			fos.write(bytes,0,3);
			
			//推荐最后的时候为了保证数据完全写入硬盘，所以要刷新
			fos.flush();//强制写入
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fos!=null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
