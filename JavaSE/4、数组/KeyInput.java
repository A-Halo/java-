package JavaSE.OO.shuzu;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 如何接收用户的键盘输入
 * 
 * Arrays是SUN提供的一个工具类
 * java.util.Arrays;
 * 该工具类主要针对的是数组的操作。
 * 	排序，二分查找等
 */
public class KeyInput {
	public static void main(String[] args) {
		/*
		Scanner s=new Scanner(System.in);
		
		String userInput=s.next();
		System.out.println("输入了："+userInput);
		*/
		int[] a= {3,1,6,2,5};
		//排序
		Arrays.parallelSort(a);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		//对排序之后数据进行二份查找
		int index=Arrays.binarySearch(a, 1);
		System.out.println("下标"+index);//0
	}
}
