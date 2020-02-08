package JavaSE.OO.yichang;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 1、异常是什么
 * 		1、异常模拟的是现实世界中不正常的事件
 * 		2、java中采用类去模拟异常
 * 		3、类是可以创建对象的
 * 			例：NullPointerException e=0x1234;
 * 			e是引用类型，e中保存的内存地址指向堆中的对象
 * 			这个对象一定是NullPointerException类型，这个
 * 			异常就表示真实存在的异常事件。NullPointerException是一类异常
 * 			抢劫是一类异常，张三被抢劫就是一个异常事件
 * 2、异常机制的作用
 * 		程序发生异常事件之后，为我们输出了详细的信息，程序员根据这个信息可以处理程序，
 * 		使程序更加健壮
 * 
 * 3、异常的分类
 * 		所有的异常都是可以抛出的
 * 		Throwable：
 * 			Error：java程序运行过程中如果出现了错误，错误是不能处理，只能退出jvm，
 * 				     例如：StackOverflowError：栈内存溢出，不能处理，只能退出jvm
 * 			Exception：异常是可以处理的，如果没有处理，则程序退出jvm
 * 				RuntimeException：运行时异常，所有的RuntimeException的子类都是运行时异常，在编写阶段不需要对它进行处理，发生几率较低
 * 				编译时异常：所有的Exception的直接子类都是"编译时异常"，发生几率较高
 * 		所有的编译时异常，要求程序员在编写程序阶段，必须对它进行处理，如果不处理的话，编译无法通过
 * 		处理异常有两种方式，捕捉:try...catch...和声明抛出:就是在方法声明的位置上使用throws关键字抛出异常
 * 4、处理异常的两种方式
 * 		1、声明抛出 throws
 * 			在方法声明的位置上使用throws关键字向上抛出异常
 * 		2、捕捉 try...catch..
 */
public class ExceptionTest01 {
	
	
	public static void main(String[] args) throws FileNotFoundException {//IOException 或 Exception 都可以
		/*
		int a=10;
		int b=0;
		int c=a/b;//ArithmeticException算数异常
		//上面的代码出现了异常，没有处理，下面的代码不会执行，直接退出jvm
		System.out.println("hello word");
		*/
		//创建文件输入流，读取文件
		//思考：java编译器如何知道以下代码会出现异常，并且异常发生几率还比较高
		//因为FileInputStream这个构造方法在声明的位置上使用了throws FileInputStream
		FileInputStream fis=new FileInputStream("d:/ab.txt");//编译时异常
		/*
		 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
			Unhandled exception type FileNotFoundException
			at JavaSE/JavaSE.OO.yichang.ExceptionTest01.main(ExceptionTest01.java:46)
		 */
	}
}
/*编译通过，但运行时出现异常，
 * 本质：程序执行时出现了算术异常这个事件，jvm创建了一个ArithmeticException类型的对象
 *并且这个对象中包含了详细的异常信息，jvm将这个信息输出到控制台
 * Exception in thread "main" java.lang.ArithmeticException: / by zero
 *at JavaSE/JavaSE.OO.yichang.ExceptionTest01.main(ExceptionTest01.java:19)
*/