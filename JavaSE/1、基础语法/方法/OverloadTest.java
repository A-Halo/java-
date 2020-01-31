package JavaSE.OO.fangfa;
/*
 * 方法的重载机制Overload
 * 	功能相似时，方法名相同，参数类型不同
 * 	参数类型不同，调用方法不同，此时不再依靠方法名了，依靠的是参数的数据类型
 * 1、什么时候使用方法重载
 * 		功能相似时，尽可能让方法名相同
 * 2、什么条件满足之后构成方法重载
 * 		在同一个类之中方法名相同，
 * 		参数列表不同：数量不同，顺序不同，数据类型不同
 * 3、方法重载和什么有关系，和什么没关系
 * 		方法重载和方法名和参数列表有关，和返回值类型，修饰符列表无关，
 */
public class OverloadTest {
	public static void main(String[] args) {
		int result1=sum(1,2);
		System.out.println(result1);
		double result2=sum(1.0,2.0);
		System.out.println(result2);
		long result3=sum(1L,2L);
		System.out.println(result3);
	}
	public static int sum(int a,int b) {
		int z=a+b;
		return z;
	}
	public static double sum(double a,double b) {
		double z=a+b;
		return z;
	}
	public static long sum(long a,long b) {
		long z=a+b;
		return z;
	}
	//数量不同
	public static void m1() {}
	public static void m1(int a) {}
	//顺序不同
	public static void m2(int a,double b) {}
	public static void m2(double b,int a) {}
	//数据类型不同
	public static void m3(int a) {}
	public static void m3(double a) {}
}
