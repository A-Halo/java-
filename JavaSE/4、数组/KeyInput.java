package JavaSE.OO.shuzu;

import java.util.Arrays;
import java.util.Scanner;

/*
 * ��ν����û��ļ�������
 * 
 * Arrays��SUN�ṩ��һ��������
 * java.util.Arrays;
 * �ù�������Ҫ��Ե�������Ĳ�����
 * 	���򣬶��ֲ��ҵ�
 */
public class KeyInput {
	public static void main(String[] args) {
		/*
		Scanner s=new Scanner(System.in);
		
		String userInput=s.next();
		System.out.println("�����ˣ�"+userInput);
		*/
		int[] a= {3,1,6,2,5};
		//����
		Arrays.parallelSort(a);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		//������֮�����ݽ��ж��ݲ���
		int index=Arrays.binarySearch(a, 1);
		System.out.println("�±�"+index);//0
	}
}
