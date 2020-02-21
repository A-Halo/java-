package JavaSE.OO.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * int read(byte[] bytes);
 * 读取之前在内存中准备一个byte数组，每次读取多个字节存储在byte数组中
 * 一次读取多个字节，不是单字节读取了，效率高
 */
public class FileInputStreamTest02 {
	public static void main(String[] args) throws Exception {
		//1、创建流
		FileInputStream fis=new FileInputStream("E:\\test.txt");
		//2、读
		/*
		while(true) {
			int temp=fis.read();
			if(temp==-1) break;
			System.out.println(temp);
		}
		*/
		//升级循环
		/*
		int temp=0;
		while((temp=fis.read())!= -1) {
			System.out.println(temp);
		}
		*/
		
		/*
		//int read(byte[] bytes);读取
		//准备一个byte数组
		byte[] bytes=new byte[3];//每一次最多读取3个字节
		int i1=fis.read(bytes);//该方法返回的int类型的值代表的是，这次读取了多少个字节
		//将byte数组转换成字符串
		System.out.println(new String(bytes));//abc
		
		int i2=fis.read(bytes);
		//System.out.println(new String(bytes));//dbc
		System.out.println(new String(bytes,0,i2));
		int i3=fis.read(bytes);

		System.out.println(i1);//3
		System.out.println(i2);//1
		System.out.println(i3);//-1以及到达了文件的末尾，返回-1
		*/
		//用bytes数组循环读取
		byte[] bytes=new byte[1024];//每次读取1kb
		/*
		while(true) {
			int temp=fis.read(bytes);
			if(temp==-1) break;
			//将byte数组中有效的数据转换成字符串
			System.out.println(new String(bytes,0,temp));
		}
		*/
		//升级循环
		/*
		int temp=0;
		while((temp=fis.read(bytes))!=-1) {
			System.out.println(new String(bytes,0,temp));
		}
		*/
		//available和skip方法
		System.out.println(fis.available());//4
		System.out.println(fis.read());//97
		//int available();返回流中剩余的估计字节数
		System.out.println(fis.available());//3,bcd
		//跳过两个字节
		fis.skip(2);
		System.out.println(fis.read());//100,d
		//3、关闭
		fis.close();
	}
}
