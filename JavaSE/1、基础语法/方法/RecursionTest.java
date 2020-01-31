package JavaSE.OO.fangfa;
/*
 * 方法的递归调用
 * 1、什么是递归算法
 * 		方法自身调用自身
 * 2、递归很耗内存，可以不用就不用
 * 3、递归必须要有结束条件
 * 4、递归即使有了结束条件，即使结束条件是正确的，也可能发生内存溢出错误，因为递归太深了
 */
public class RecursionTest {
	public static void main(String[] args) {
		doSome();
		
		//计算1-n的和
		int n=4;
		int retValue=sum(n);
		System.out.println(retValue);
		
		//计算n的阶乘
		int m=5;
		int value=method(m);
		System.out.println(value);
	}
	//以下代码片段虽然只有一份，但是可以被重复调用，并且只要调用doSome方法就会在栈内存中重新分配一块内存空间
	public static void doSome() {
		System.out.println("doSome begin");
		doSome();
		System.out.println("doSome over");
	}//会发生栈内存溢出错误，jvm停止工作
	
	//计算和
	public static int sum(int n) {
		if(n==1) {
			return 1;
		}else {
		int retValue =n+sum(n-1);
		return retValue;
		}
	}
	//计算阶乘
	public static int method(int m) {
		if(m==1) {
			return 1;
		}else {
			return m*method(m-1);
		}
	}
}
