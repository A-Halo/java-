package JavaSE.OO.IO;

import java.io.*;

/*
 * 
 */
public class DataInputStreamTest {
	public static void main(String[] args) throws Exception {
		//创建输入流
		DataInputStream dis=new DataInputStream(new FileInputStream("E:\\test05.txt"));
		
		//读,注意：要使用该流读取数据，必须提前知道该文件中的数据存储格式，顺序，读的顺序必须和写入的顺序一致
		byte b=dis.readByte();
		short s=dis.readShort();
		int i=dis.readInt();
		long l=dis.readLong();
		float f=dis.readFloat();
		double d=dis.readDouble();
		boolean flag=dis.readBoolean();
		char c=dis.readChar();
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(flag);
		System.out.println(c);
		
		
		//关闭
		dis.close();
	}
}
