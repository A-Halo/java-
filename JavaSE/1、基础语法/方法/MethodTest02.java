package JavaSE.OO.fangfa;
/*
 *1、方法:
 *	方法执行过程中的内存分配
 *	方法的重载机制
 *	方法的递归调用
 *	方法在调用时，参数传递时，实际传递的是变量中保存的值
 */
public class MethodTest02 {
	public static void main(String[] args) {
		int a=10;
		int b=20;	
		int retValue=subInt(a,b);
		System.out.println("retvalue= "+retValue);
	}
	
	public static int subInt(int i,int j) {
		int result = i+j;
		int num=3;
		int retValue=divide(result,num);
		return retValue;
	}
	
	public static int divide(int x,int y) {
		int z=x/y;
		return z;
	}
}
