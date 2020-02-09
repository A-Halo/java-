package JavaSE.OO.shuzu;
/*
 * 关于数组的拷贝
 *以下程序是jdk提供的方法，直接调用
 *System.arraycopy(源数组，源数组的开始下标，目标数组，目标数组的开始下标，拷贝的长度);
 *
 *二维数组特点：
 *	1、二维数组是一个特殊的一维数组，
 *	2、特殊的一维数组，特殊在这个一维数组中每一个元素都是一维数组
 *	
 */
public class ArrayTest04 {
	//方法调用的时候，也可以这样传递一个数组
	public static void m1(int[][] a) {
		for(int i=0;i<a.length;i++) {
			//对一维数组a[i]进行遍历
			for(int j=0;j<a[i].length;j++) {
				System.out.println(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		//调用m1
		m1(new int[][] {{1},{1,2},{1,2,3}});
		
		
		int[] src= {2,3,4,5,6,7,8};
		int[] dest= {10,11,12,13,14,15,16};
		//把src中的456拷贝到dest数组从13开始
		System.arraycopy(src, 2, dest, 3, 3);
		//遍历
		for(int i=0;i<dest.length;i++) {
			System.out.println(dest[i]);
		}
		
		//静态初始化二维数组
		int[][] a= {{1,2},{3,4},{5,6},{7,8,9}};
		//以上这个数组有多少个一维数组
		System.out.println(a.length+"个一维数组");
		//获取第一个一维数组怎么得
		int[] a0=a[0];
		int a00=a0[0];
		//获取第一个一维数组中的第一个元素
		System.out.println(a00);
		System.out.println(a[0][0]);
		//获取最后一个元素
		System.out.println(a[3][2]);
		System.out.println(a[a.length-1][a[a.length-1].length-1]);
		//遍历二维数组
		//纵向循环在外
		for(int i=0;i<a.length;i++) {
			//对一维数组a[i]进行遍历
			for(int j=0;j<a[i].length;j++) {
				System.out.println(a[i][j]+" ");
			}
			System.out.println();
		}
		
		//关于二维数组的动态初始化
		//三个一维数组，每个一维数组有四个元素
		int[][] a1=new int[3][4];
		//遍历
		for(int i=0;i<a1.length;i++) {
			//对一维数组a[i]进行遍历
			for(int j=0;j<a1[i].length;j++) {
				System.out.println(a1[i][j]+" ");
			}
			System.out.println();
		}
		//赋值
		a[1][2]=100;
		
		
	}
}
