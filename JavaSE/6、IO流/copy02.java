package JavaSE.OO.IO;

import java.io.FileNotFoundException;
import java.io.*;

/*
 * �ļ����ƣ�ֻ�ܸ��ƴ��ı��ļ�
 */
public class copy02 {
	public static void main(String[] args) throws Exception {
		FileReader fr=new FileReader("E:\\test03.txt");
		FileWriter fw=new FileWriter("D:\\test03.txt");
		
		char[] chars=new char[512];
		int temp = 0;
		while((temp=fr.read(chars))!=-1) {
			//д
			fw.write(chars,0,temp);
		}
		
		fw.flush();
		fr.close();
		fw.close();
	}
}
