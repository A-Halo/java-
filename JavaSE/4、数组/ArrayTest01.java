package JavaSE.OO.shuzu;
/*
 * 数组：
 * 	1、数组是一种引用类型
 * 	2、数组是一种简单的数据结构，线型的结构
 * 	3、数组是一个容器，可以用来存储其他元素
 * 	4、数组是可以存储任意数据类型的元素
 * 	5、数组分为：一维数组，二维数组，三维数组，多维数组..
 * 	6、数组中存储的元素是统一的
 * 	7、数组长度是不可改变的，数组一旦创建长度是不可变的，固定的
 * 数组优点：查找效率高，
 * 缺点：随意的增删元素效率比较低
 * 
 * 数组中存储元素类型是统一的，每一个元素在内存中所占空间大小是相同的，
 * 知道数组的首元素的内存地址，要查找的元素只要知道下标就可以快速的计算出偏移量
 * 通过首元素内存地址加上偏移量，快速计算出要查找元素的内存地址，
 * 通过内存地址快速定位该元素，所以数组查找元素的效率较高
 * 
 * 随机的对数组增删元素，当增加元素的时候，为了保证数组元素在空间存储中是有序的，
 * 所以被添加元素位置后面的所有元素都要向后移动，删除元素也是，后面所有元素要向前移动
 * 所以数组的增删元素的效率很低
 * 
 * 初始化一维数组有两种方式：
 * 	1、静态初始化
 * 	2、动态初始化
 * 动态初始化一维数组，会先在堆内存中分配这个数组，并且附上默认值
 * 	byte，short，int，long 0
 * 	float，double 0.0
 * 	char \u0000
 * 	引用 null
 * 
 * 什么时候使用动态初始化，什么时候使用静态初始化
 * 1、无论使用动态初始化还是静态初始化，最终的内存分布都是一样的
 * 2、如果在创建数组的时候就知道数组存储什么数据，采用静态初始化
 * 	    如果在创建数组的时候，无法预测到数组中存储什么数据，只是先开辟空间，则使用动态初始化方式
 */

public class ArrayTest01 {
	public static void main(String[] args) {
		//声明一个一维数组，用来存储int类型
		int[] a1= {100,200,150,300};//这种方式称为静态初始化一维数组
		//int a2[]= {3,4,5};C++中，在java中也可以
		//boolean类型的数组
		boolean[] b1= {true,false,true};
		//String类型的数组
		String[] s1= {"ABC","B","c"};
		//Object类型的数组
		Object o1=new Object();
		Object o2=new Object();
		Object o3=new Object();
		Object[] obj= {o1,o2,o3};
		//取得第一个元素
		System.out.println(a1[0]);
		//取得最后一个元素
		System.out.println(a1[a1.length-1]);
		//取得个数
		System.out.println("数组中元素的个数"+a1.length);
		//遍历一维数组
		for(int i=0;i<a1.length;i++) {
			System.out.println(a1[i]);
		}
		//将第二个元素修改为20
		a1[1]=20;
		
		//动态初始化数组
		//动态声明一个int类型的数组，最多可以存储四个元素
		int[] a2=new int[4];
		//遍历
		for(int i=0;i<a2.length;i++) {
			System.out.println(a2[i]);
		}
		//赋值
		a2[0]=21;
		a2[1]=22;
		a2[2]=23;
		a2[3]=24;
		//引用类型的数组
		Object[] objs=new Object[3];
		for(int index=0;index<objs.length;index++) {
			Object o=objs[index];
			//o.toString();注意空指针异常，因为引用类型的数组默认值是null
			System.out.println(o);//null，null，null
		}
	}
}
