package JavaSE.OO.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * java.io.Reader;
 * 		java.io.InputStreamReader;ת����(�ֽ�������-->�ַ�������)
 * 			java.io.FileReader;�ļ��ַ�������
 */
public class FileReaderTest {
	public static void main(String[] args) {
		//�����ļ��ַ�������
		FileReader fr=null;
		try {
			fr=new FileReader("E:\\test02.txt");
			//��ʼ��
			char[] chars=new char[512];//1kb
			int temp=0;
			while((temp=fr.read(chars))!=-1) {
				//��char������Ч����ת�����ַ���
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
