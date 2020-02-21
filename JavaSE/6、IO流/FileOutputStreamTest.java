package JavaSE.OO.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * java.io.OutputStream;
 * 		java.io.FileOutputStream;�ļ��ֽ������
 * 
 * 	��������ڴ��е�����д��Ӳ���ļ���
 */
public class FileOutputStreamTest {
	public static void main(String[] args) {
		FileOutputStream fos=null;
		try {
			//�����ļ��ֽ������
			//fos=new FileOutputStream("E:\\test02.txt");����ʹ�ã��Ὣԭ�ļ����ݸ���
			//��׷�ӵķ�ʽд��
			fos=new FileOutputStream("E:\\test02.txt",true);
			//��ʼд
			String msg="HelloWord!";
			//��Stringת����byte����
			byte[] bytes=msg.getBytes();
			
			//��byte���������е�����д��
			//fos.write(bytes);
			//��byte����һ����д��
			fos.write(bytes,0,3);
			
			//�Ƽ�����ʱ��Ϊ�˱�֤������ȫд��Ӳ�̣�����Ҫˢ��
			fos.flush();//ǿ��д��
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
