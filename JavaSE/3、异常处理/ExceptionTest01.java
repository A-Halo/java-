package JavaSE.OO.yichang;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 1���쳣��ʲô
 * 		1���쳣ģ�������ʵ�����в��������¼�
 * 		2��java�в�����ȥģ���쳣
 * 		3�����ǿ��Դ��������
 * 			����NullPointerException e=0x1234;
 * 			e���������ͣ�e�б�����ڴ��ַָ����еĶ���
 * 			�������һ����NullPointerException���ͣ����
 * 			�쳣�ͱ�ʾ��ʵ���ڵ��쳣�¼���NullPointerException��һ���쳣
 * 			������һ���쳣�����������پ���һ���쳣�¼�
 * 2���쳣���Ƶ�����
 * 		�������쳣�¼�֮��Ϊ�����������ϸ����Ϣ������Ա���������Ϣ���Դ������
 * 		ʹ������ӽ�׳
 * 
 * 3���쳣�ķ���
 * 		���е��쳣���ǿ����׳���
 * 		Throwable��
 * 			Error��java�������й�������������˴��󣬴����ǲ��ܴ���ֻ���˳�jvm��
 * 				     ���磺StackOverflowError��ջ�ڴ���������ܴ���ֻ���˳�jvm
 * 			Exception���쳣�ǿ��Դ���ģ����û�д���������˳�jvm
 * 				RuntimeException������ʱ�쳣�����е�RuntimeException�����඼������ʱ�쳣���ڱ�д�׶β���Ҫ�������д����������ʽϵ�
 * 				����ʱ�쳣�����е�Exception��ֱ�����඼��"����ʱ�쳣"���������ʽϸ�
 * 		���еı���ʱ�쳣��Ҫ�����Ա�ڱ�д����׶Σ�����������д������������Ļ��������޷�ͨ��
 * 		�����쳣�����ַ�ʽ����׽:try...catch...�������׳�:�����ڷ���������λ����ʹ��throws�ؼ����׳��쳣
 * 4�������쳣�����ַ�ʽ
 * 		1�������׳� throws
 * 			�ڷ���������λ����ʹ��throws�ؼ��������׳��쳣
 * 		2����׽ try...catch..
 */
public class ExceptionTest01 {
	
	
	public static void main(String[] args) throws FileNotFoundException {//IOException �� Exception ������
		/*
		int a=10;
		int b=0;
		int c=a/b;//ArithmeticException�����쳣
		//����Ĵ���������쳣��û�д�������Ĵ��벻��ִ�У�ֱ���˳�jvm
		System.out.println("hello word");
		*/
		//�����ļ�����������ȡ�ļ�
		//˼����java���������֪�����´��������쳣�������쳣�������ʻ��Ƚϸ�
		//��ΪFileInputStream������췽����������λ����ʹ����throws FileInputStream
		FileInputStream fis=new FileInputStream("d:/ab.txt");//����ʱ�쳣
		/*
		 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
			Unhandled exception type FileNotFoundException
			at JavaSE/JavaSE.OO.yichang.ExceptionTest01.main(ExceptionTest01.java:46)
		 */
	}
}
/*����ͨ����������ʱ�����쳣��
 * ���ʣ�����ִ��ʱ�����������쳣����¼���jvm������һ��ArithmeticException���͵Ķ���
 *������������а�������ϸ���쳣��Ϣ��jvm�������Ϣ���������̨
 * Exception in thread "main" java.lang.ArithmeticException: / by zero
 *at JavaSE/JavaSE.OO.yichang.ExceptionTest01.main(ExceptionTest01.java:19)
*/