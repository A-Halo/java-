package JavaSE.OO.yichang;

import java.io.*;

/*
 * 关于finally语句块
 * 	1、finally语句块可以直接和try语句块联用。try...finally...
 * 	2、try..catch...finally也可以
 * 	3、在finally语句块中的代码一定会执行
 * 	4、finally程序块一定会执行，所以通常在程序中为了保证某资源一定会释放，所以一般在finally语句块中释放资源
 * 区分final，finalize，finally
 * 		final表示不可变的，用来声明变量，方法，修饰的类无法被继承，final static 是常量
 * 		finalize是GC回收器回收零引用的对象前执行的方法
 * 		finally通常配合try语句执行异常代码块，为了保证一定会执行的一段的代码
 */
public class ExceptionTest05 {
	public static void main(String[] args) throws FileNotFoundException {
		/*
		try {
			System.out.println("ABC");
			return;
		}finally {
			System.out.println("test");
		}
		*/
		/*
		try {
			FileInputStream fis=new FileInputStream("Test.java");
			//不会执行
			System.out.println("TTTT");
		}finally {
			//会执行
			System.out.println("AAAA");
		}
		*/
		/*
		try {
			System.exit(0);//退出java虚拟机jvm
		}finally {
			//不会执行
			System.out.println("AAAA");
		}
		*/
		//调用m1方法
		int i=m1();
		System.out.println(i);//10
		
		//具体用法
		FileInputStream fis=null;//必须在外边声明，因为finally中有fis
		try {
			fis=new FileInputStream("ExceptionTest05.java");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			//为了保证资源一定会释放，所以放在finally中
			if(fis!=null) {
			try {
				fis.close();//释放资源
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		}
	}
	public static int m1() {
		/*
		int i=10;
		try {
			return i;
		}finally {
			i++;
			System.out.println("m1的i="+i);//11
		}
		*/
		//以上代码执行原理
		int i=10;
		try {
			int temp=i;
			return temp;
		}finally {
			i++;
			System.out.println("m1的i="+i);//11
		}
	}
}
