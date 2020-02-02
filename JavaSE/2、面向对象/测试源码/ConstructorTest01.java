package com.node.javese.day09.test004;
/**
 * 关于java中的构造方法：
 * 	1.构造方法又被称为构造函数/构造器/Constructor
 * 	2.构造方法语法结构：
 * 	[修饰符列表] 构造方法名/类名（形式参数列表）{
 * 		构造方法体；
 * 	}
 *
 *	普通方法语法结构
 *	修饰符列表 返回值类型 方法名（形式参数列表）{
 *		方法体；
 *	}
 *	3.对比：
 *	构造方法无返回值类型，也不能写void，只要有void就是普通方法
 *	构造方法方法名必须和类名保持一致
 *
 *	4.构造方法的作用
 *		1.创建对象
 *		2.创建对象的同时，初始化实例变量的内存空间，给实例变量赋默认值
 *
 *	5.构造方法调用，名字后面带括号的一定是方法名
 *	new 构造方法名(实参)
 *	6.普通方法调用：
 *	有static：类名.方法名(实参)
 *	无static：引用.方法名(实参)
 *	7.访问实例变量的语法格式：
		读取数据：引用.变量名
		修改数据：引用.变量名=值
 *	构造方法调用之后有返回值，但是return语句不需要写，构造方法结束后java程序自动返回返回值，并且返回值类型是构造方法所在类的类型
 *	为什么构造方法语法中无返回值，因为返回的就是本身类的类型，不需要写返回值
 *	构造方法支持方法重载
 *	系统会自动默认提供当前类的构造方法
 *	当我们提供了构造方法，则系统不再提供默认的构造方法
 *	开发中建议手动为当前类提供无参数的构造方法
 */
class User {

	//无参数的构造方法
	public User() {
		System.out.println("无参数的构造方法");
	}
	//有参数的构造方法
	public User(int i) {
		System.out.println("int类型构造方法");
	}
}
public class ConstructorTest01 {

	public static void main(String[] args) {

		//创建User对象，通过调用User类的构造方法来完成对象的创建
		//以下程序创建了两个对象，只要构造函数调用就创建对象，并且会在堆内存中开辟内存空间。
		User u1=new User();//采用new运算符去调用构造方法，User不是类名，是构造方法名
		                   //返回值类型是User，返回值是个地址，跟int i=sumint(10,20);返回值类型是int一样
		User u2=new User(10);//调用有参数的构造函数
		//调用带有static的方法：类名.
		ConstructorTest01.doSome();
		//调用没有static的方法：引用.
		//doOther方法在ConstructorTest01类当中，所以需要创建ConstructorTest01对象
		//创建ConstructorTest01对象，调用无参数构造方法。
		ConstructorTest01 t = new ConstructorTest01();//一个类中没有任何构造方法的话，系统默认提供一个无参数构造器
		t.doOther();
	}
	
	public static void doSome() {
		System.out.println("dosome");
	}

	public void doOther() {
		System.out.println("doOther");
	}
}
