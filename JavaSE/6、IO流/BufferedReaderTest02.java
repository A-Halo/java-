package JavaSE.OO.IO;
/*
 * �����û���������
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferedReaderTest02 {
	public static void main(String[] args) throws Exception {
		/*
		//Scanner
		Scanner s=new Scanner(System.in);//System.in��һ����׼����������Ĭ�Ͻ��ռ��̵�����
		//����ִ�е��˴�ͣ�������ȴ��û�������
		String str=s.next();//�Կո�Ϊ�ֽ��ߣ��ո�֮��������ò���
		
		System.out.println("�������ˣ�"+str);
		*/
		//ʹ����BufferedReader���������û�������
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		//��������(ÿ�ν���һ��)
		String str=br.readLine();
		System.out.println("�������ˣ�"+str);
		
		//�ر�
		br.close();
	}
}
