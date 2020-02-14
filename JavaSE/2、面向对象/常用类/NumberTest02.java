package JavaSE.OO.changyonglei;

import java.util.Random;

/*
 * 生成五个不重复的随机数[1-5]
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
	//该方法完成判断temp元素在数组中是否包含
	//包含返回true
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
