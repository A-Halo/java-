package JavaSE.OO.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * int read(byte[] bytes);
 * ��ȡ֮ǰ���ڴ���׼��һ��byte���飬ÿ�ζ�ȡ����ֽڴ洢��byte������
 * һ�ζ�ȡ����ֽڣ����ǵ��ֽڶ�ȡ�ˣ�Ч�ʸ�
 */
public class FileInputStreamTest02 {
	public static void main(String[] args) throws Exception {
		//1��������
		FileInputStream fis=new FileInputStream("E:\\test.txt");
		//2����
		/*
		while(true) {
			int temp=fis.read();
			if(temp==-1) break;
			System.out.println(temp);
		}
		*/
		//����ѭ��
		/*
		int temp=0;
		while((temp=fis.read())!= -1) {
			System.out.println(temp);
		}
		*/
		
		/*
		//int read(byte[] bytes);��ȡ
		//׼��һ��byte����
		byte[] bytes=new byte[3];//ÿһ������ȡ3���ֽ�
		int i1=fis.read(bytes);//�÷������ص�int���͵�ֵ������ǣ���ζ�ȡ�˶��ٸ��ֽ�
		//��byte����ת�����ַ���
		System.out.println(new String(bytes));//abc
		
		int i2=fis.read(bytes);
		//System.out.println(new String(bytes));//dbc
		System.out.println(new String(bytes,0,i2));
		int i3=fis.read(bytes);

		System.out.println(i1);//3
		System.out.println(i2);//1
		System.out.println(i3);//-1�Լ��������ļ���ĩβ������-1
		*/
		//��bytes����ѭ����ȡ
		byte[] bytes=new byte[1024];//ÿ�ζ�ȡ1kb
		/*
		while(true) {
			int temp=fis.read(bytes);
			if(temp==-1) break;
			//��byte��������Ч������ת�����ַ���
			System.out.println(new String(bytes,0,temp));
		}
		*/
		//����ѭ��
		/*
		int temp=0;
		while((temp=fis.read(bytes))!=-1) {
			System.out.println(new String(bytes,0,temp));
		}
		*/
		//available��skip����
		System.out.println(fis.available());//4
		System.out.println(fis.read());//97
		//int available();��������ʣ��Ĺ����ֽ���
		System.out.println(fis.available());//3,bcd
		//���������ֽ�
		fis.skip(2);
		System.out.println(fis.read());//100,d
		//3���ر�
		fis.close();
	}
}
