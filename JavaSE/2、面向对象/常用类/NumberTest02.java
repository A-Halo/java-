package JavaSE.OO.changyonglei;

import java.util.Random;

/*
 * ����������ظ��������[1-5]
 */
public class NumberTest02 {
	public static void main(String[] args) {
		Random r=new Random();
		
		int[] a=new int[5];
		
		int index=0;
		
		while(index<5) {
			
			int temp=r.nextInt(6);
			
			if(temp!=0 && !contains(a,temp)) {
				a[index++]=temp;
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	//�÷�������ж�tempԪ�����������Ƿ����
	//��������true
	private static boolean contains(int[] a, int temp) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++) {
			if(a[i]==temp) {
				return true;
			}
		}
		return false;
	}
}
