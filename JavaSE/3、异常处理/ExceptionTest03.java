package JavaSE.OO.yichang;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * �����쳣�ĵڶ��ַ�ʽ����׽��try...catch...
 * 	�﷨�ṹ��
 * 		try{
 * 			���ܳ����쳣�Ĵ���
 * 		}catch(�쳣����1 ����){
 * 			�����쳣�Ĵ���
 * 		}catch(�쳣����2 ����){
 * 			�����쳣�Ĵ���
 * 		}...
 * 1��catch�������д���
 * 2��catch����д��������Ǳ�����ϵ��£���С�����쳣���������쳣���в�׽
 * 3��try..catch..���ִ��һ��catch���飬ִ�н�����try..catch..�ͽ�����
 */
public class ExceptionTest03 {
	//��������
	//�����޷�ͨ����IOExceptionû�д���
	/*
	public static void main(String[] args) throws FileNotFoundException{
		FileInputStream fis=new FileInputStream("c:/ab.txt");
		fis.read();//��IOException�쳣
	}
	*/
	//ͨ��
	/*
	public static void main(String[] args) throws FileNotFoundException,IOException{
		FileInputStream fis=new FileInputStream("c:/ab.txt");
		fis.read();//��IOException�쳣
	}
	*/
	//ͨ��
	/*
	public static void main(String[] args) throws IOException{
		FileInputStream fis=new FileInputStream("c:/ab.txt");
		fis.read();//��IOException�쳣
	}
	*/
	//��������
	/*
	public static void main(String[] args){
		try {
			//����ִ�е��˴�������FileNotFoundException���͵��쳣��jvn���Զ�����һ��FileNotFoundException���͵Ķ���
			//���ö�����ڴ��ַ��ֵ��catch�����е�e����
			FileInputStream fis=new FileInputStream("c:/ab.txt");
			//����Ĵ�������쳣��try����Ĵ��벻�ڼ���ִ�У�ֱ�ӽ���catch������ִ��
			System.out.println("tttt");
			fis.read();//��IOException�쳣
		}catch(FileNotFoundException e) {//e�ڴ��ַָ����е��Ǹ�������"FileNotFoundException���͵�"�¼�
			System.out.println("��ȡ���ļ�������");
			//FileNotFoundException��Object�е�toString������д��
			System.out.println(e);//�����ڴ��ַ������һ���ַ���java.io.FileNotFoundException��abc(ϵͳ�Ҳ���ָ�����ļ�)
		}catch(IOException e) {
			System.out.println("����IO�쳣");
		}
		System.out.println("hello word");
	}
	*/
	public static void main(String[] args) {		
		//���´�������޷�ͨ������ΪFileNotFoundException�쳣û�д���
		/*
		try {
			//FileNotFoundException
			FileInputStream fis=new FileInputStream("c:/ab.txt");
		}catch(ArithmeticException e) {//������쳣ʱ�����쳣
			
		}
		*/
		//����ͨ��
		/*
		try {
			//FileNotFoundException
			FileInputStream fis=new FileInputStream("c:/ab.txt");
		}catch(FileNotFoundException e) {
			
		}
		*/
		//���³�������޷�ͨ��
		//��Ϊ���и����IOExceptionû�д���
		/*
		try {
			//FileNotFoundException
			FileInputStream fis=new FileInputStream("c:/ab.txt");
			fis.read();
		}catch(FileNotFoundException e) {
			
		}
		*/
		//����ͨ��
		/*
		try {
			//FileNotFoundException
			FileInputStream fis=new FileInputStream("c:/ab.txt");
			fis.read();
		}catch(FileNotFoundException e) {
		
		}catch(IOException e) {	
		
		}
		*/
		//����ͨ��
		/*
		try {
			//FileNotFoundException
			FileInputStream fis=new FileInputStream("c:/ab.txt");
			fis.read();
		}catch(IOException e) {	
			
		}
		*/
		//�����޷�ͨ��
		//catch����д��������Ǳ�����ϵ��£���С����׽
		/*
		try {
			//FileNotFoundException
			FileInputStream fis=new FileInputStream("c:/ab.txt");
			fis.read();
		}catch(IOException e) {	
			
		}catch(FileNotFoundException e) {
			
		}
		*/
	}
}
