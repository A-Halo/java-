package JavaSE.OO.IO;
/*
 * java.io.DataOutputStream;�����ֽ������
 * 	���Խ��ڴ��е�"int i=10;"д�뵽Ӳ���ļ���,
 * 	д��ȥ�Ĳ����ַ������Ƕ��������ݣ������͡�
 */
import java.io.*;
public class DataOutputStreamTest {
	public static void main(String[] args) throws Exception {
		//���������ֽ������
		DataOutputStream dos=new DataOutputStream(new FileOutputStream("E:\\test05.txt"));
		//׼������
		byte b=10;
		short s=11;
		int i=12;
		long l=1000l;
		float f=3.2f;
		double d=2.3;
		boolean flag=false;
		char c='a';
		
		//д
		dos.writeByte(b);
		dos.writeShort(s);
		dos.writeInt(i);
		dos.writeLong(l);
		dos.writeFloat(f);
		dos.writeDouble(d);
		dos.writeBoolean(flag);
		dos.writeChar(c);
		
		//ˢ��
		dos.flush();
		//�ر�
		dos.close();
	}
}
