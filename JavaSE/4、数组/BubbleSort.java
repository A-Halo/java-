package JavaSE.OO.shuzu;
/*
 * 冒泡排序
 * 	int类型的数组：3 1 6 2 5
 * 	冒泡排序
 * 选择排序
 * 	找出最小值，然后这个最小值和最前边的数据交换位置。
 * 二分法查找
 * 	二分法查找是建立在已经排序的基础上
 * 	1 3 5 9 11 13 56 从小到大，并且没有重复的元素
 * 	以上是一个已经排好序的int类型的数组：要求快速查找出13这个元素的下标
 */
public class BubbleSort {
	public static void main(String[] args) {
		int[] a= {3,1,6,2,5};
		//冒泡排序
		//开始排序
		for(int i=a.length-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(a[j]>a[j+1]) {
					//交换位置
					int temp;
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		//遍历
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		//选择排序
		for(int i=0;i<a.length-1;i++) {
			//假设第一个数据就是最小值
			//记录最小值下标
			int min=i;
			
			for(int j=i+1;j<a.length;j++) {
				if(a[min]> a[j]) {
					//给min重新赋值
					min = j;
				}
			}
			//考虑交换位置
			if(min!=i) {
				int temp;
				temp=a[i];
				a[i]=a[min];
				a[min]=temp;
			}
		}
		//遍历
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		//二分法查找
		//1,3,4,5,7,8,9,10,23,15,29 从小到大，并且没有重复的元素,查找10元素的下标
		int[] a1= {1,3,4,5,7,8,9,10,23,15,29};
		int destElement = 10;
		int index=binarySearch(a1,destElement);//如果找到返回下标，找不到返回-1
		System.out.println((destElement==-1)?destElement+"这个元素不存在":destElement+"在数组中的下标是："+index);
	}
	//折半查找算法
	private static int binarySearch(int[] a1, int destElement) {
		int begin=0;
		int end=a1.length-1;
			
		while(begin<=end) {
			int mid=(begin+end)/2;
			if(a1[mid]==destElement) {
				return mid;
			}else if(a1[mid]>destElement) {
				end=mid-1;
			}else if(a1[mid]<destElement) {
				begin = mid+1;
			}
		}
		return -1;
	}
}
/*选择排序
 * 3 1 6 2 5
 * 第一次循环
 * 1 3 6 2 5
 * 
 * 3 6 2 5
 * 第二次循环
 * 2 6 3 5 
 * 
 * 6 3 5 
 * 第三次循环
 * 3 6 5 
 * 
 * 6 5 
 * 第四次循环
 * 5 6
 * 
 */
