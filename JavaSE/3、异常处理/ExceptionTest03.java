package JavaSE.OO.yichang;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 处理异常的第二种方式，捕捉：try...catch...
 * 	语法结构：
 * 		try{
 * 			可能出现异常的代码
 * 		}catch(异常类型1 变量){
 * 			处理异常的代码
 * 		}catch(异常类型2 变量){
 * 			处理异常的代码
 * 		}...
 * 1、catch语句块可以写多个
 * 2、catch可以写多个，但是必须从上到下，从小类型异常到大类型异常进行捕捉
 * 3、try..catch..最多执行一个catch语句块，执行结束后try..catch..就结束了
 */
public class ExceptionTest03 {
	//完整例子
	//编译无法通过，IOException没有处理
	/*
	public static void main(String[] args) throws FileNotFoundException{
		FileInputStream fis=new FileInputStream("c:/ab.txt");
		fis.read();//有IOException异常
	}
	*/
	//通过
	/*
	public static void main(String[] args) throws FileNotFoundException,IOException{
		FileInputStream fis=new FileInputStream("c:/ab.txt");
		fis.read();//有IOException异常
	}
	*/
	//通过
	/*
	public static void main(String[] args) throws IOException{
		FileInputStream fis=new FileInputStream("c:/ab.txt");
		fis.read();//有IOException异常
	}
	*/
	//完整代码
	/*
	public static void main(String[] args){
		try {
			//程序执行到此处发生了FileNotFoundException类型的异常，jvn会自动创建一个FileNotFoundException类型的对象，
			//将该对象的内存地址赋值给catch语句块中的e变量
			FileInputStream fis=new FileInputStream("c:/ab.txt");
			//上面的代码出现异常，try语句块的代码不在继续执行，直接进入catch语句块中执行
			System.out.println("tttt");
			fis.read();//有IOException异常
		}catch(FileNotFoundException e) {//e内存地址指向堆中的那个对象是"FileNotFoundException类型的"事件
			System.out.println("读取的文件不存在");
			//FileNotFoundException将Object中的toString方法重写了
			System.out.println(e);//不是内存地址，而是一个字符串java.io.FileNotFoundException：abc(系统找不到指定的文件)
		}catch(IOException e) {
			System.out.println("其他IO异常");
		}
		System.out.println("hello word");
	}
	*/
	public static void main(String[] args) {		
		//以下代码编译无法通过，因为FileNotFoundException异常没有处理
		/*
		try {
			//FileNotFoundException
			FileInputStream fis=new FileInputStream("c:/ab.txt");
		}catch(ArithmeticException e) {//捕获的异常时算数异常
			
		}
		*/
		//编译通过
		/*
		try {
			//FileNotFoundException
			FileInputStream fis=new FileInputStream("c:/ab.txt");
		}catch(FileNotFoundException e) {
			
		}
		*/
		//以下程序编译无法通过
		//因为还有更多的IOException没有处理
		/*
		try {
			//FileNotFoundException
			FileInputStream fis=new FileInputStream("c:/ab.txt");
			fis.read();
		}catch(FileNotFoundException e) {
			
		}
		*/
		//编译通过
		/*
		try {
			//FileNotFoundException
			FileInputStream fis=new FileInputStream("c:/ab.txt");
			fis.read();
		}catch(FileNotFoundException e) {
		
		}catch(IOException e) {	
		
		}
		*/
		//编译通过
		/*
		try {
			//FileNotFoundException
			FileInputStream fis=new FileInputStream("c:/ab.txt");
			fis.read();
		}catch(IOException e) {	
			
		}
		*/
		//编译无法通过
		//catch可以写多个，但是必须从上到下，从小到大捕捉
		/*
		try {
			//FileNotFoundException
			FileInputStream fis=new FileInputStream("c:/ab.txt");
			fis.read();
		}catch(IOException e) {	
			
		}catch(FileNotFoundException e) {
			
		}
		*/
	}
}
