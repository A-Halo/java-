package JavaSE.OO.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * java.io.InputStream;
 * 		java.io.FileInputStream;�ļ��ֽ�������
 */
public class FileInputStreamTest01 {
	public static void main(String[] args) {
		//1��Ҫ��ȡĳ�ļ�����������ļ�����һ��������
		//�ļ�·��
		//String filePath="";//���·������Ե�ǰ���ԣ��ڵ�ǰ·������
		String filePath="E:\\test.txt";//����·�� test.txt:ab
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(filePath);
			
			//2����ʼ��
			int i1 = fis.read();//���ֽڵķ�ʽ��ȡ
			int i2=fis.read();
			int i3=fis.read();
			System.out.println(i1);//97
			System.out.println(i2);//98
			System.out.println(i3);//-1,����Ѿ���ȡ���ļ���ĩβ���ͻ᷵��-1
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//Ϊ�˱�֤��һ�����ͷţ�������finally������ִ��
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
