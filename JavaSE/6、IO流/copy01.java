package JavaSE.OO.IO;

import java.io.*;
import java.io.FileNotFoundException;

/*
 * �����ļ��ĸ���ճ��
 * 
 */
public class copy01 {
	public static void main(String[] args) throws Exception {
		//����������
		FileInputStream fis=new FileInputStream("E:\\test02.txt");
		//���������
		FileOutputStream fos=new FileOutputStream("D:\\test02.txt");
		//һ�߶�����д
		byte[] bytes=new byte[1024];//1kb
		int temp=0;
		while((temp=fis.read(bytes))!=-1) {
			//��byte�����е�����ֱ��д��
			fos.write(bytes,0,temp);
		}
		//ˢ��
		fos.flush();
		//�ر�
		fis.close();
		fos.close();
	}
}
