package JavaSE.OO.fangfa;
/**
 * @author 王迎春
 *使用方法机制可以让代码复用
 *方法就是一段代码片段，并且这段代码片段可以完成某个特定功能，并且可以重复使用
 *
 *方法/method
 *方法调用/invoke
 *方法在C语言中叫做函数/function
 *
 *方法定义在类体中，在一个类中可以定义一个主方法多个方法，方法编写位置没有先后顺序
 *方法体【方法】中不能定义方法，方法体中代码有先后顺序
 *
 *关于java语言中的方法:
 *	1、方法怎么定义，语法结构:
 *		[修饰符列表] 返回值类型 方法名(形式参数列表){
 *			方法体;
 *		}
 *	2、语法结构解释说明:
 *		2.1、修饰符列表
 *			不是必须的
 *			目前统一写:public static
 *			修饰符列表有static关键字的话，怎么调用方法：类名.方法名(实际参数列表)
 *		2.2、返回值类型
 *			什么是返回值？
 *				一个方法可以完成某个特定功能，这个功能结束后大多要返回最终的执行结果，这个结果就是返回值
 *			返回值类型？
 *				返回值有类型，这个类型就是返回值类型
 *
 *			返回值类型可以是java中任意数据类型包括基本数据类型和引用数据类型
 *
 *			若不返回任何数据的话，返回值类型位置必须编写：void关键字
 *
 *			返回值类型不是void，表示这个方法执行结束后必须返回一个具体的数值，若没有返回，则会报错
 *			所以必须加上"return 数值;"，并且要求数值类型必须和返回值类型一致
 *			返回值是void的时候，在方法体当中不能编写"return 值;"语句，可以编写"return;"语句
 *
 *			一个方法有返回值的时候，调用这个方法，方法返回一个值，对于调用者来说，返回值可以选择接收，也可以选择不接收，大部分选择接收
 *
 *			深入return语句
 *				只要带有return关键字的语句执行，return语句所在的方法结束
 *				在“同一个作用域”中，return语句下面不能编写任何代码，因为这些代码永远都执行不到，编译报错
 *
 *		2.3、方法名
 *				见名知意，首字母小写后面每个单词首字母大写
 *		2.4、形式参数列表(形参)
 *				形参是局部变量
 *				形参个数可以是0到n个
 *				形参中起决定性作用的是形参的数据类型，形参的名字就是局部变量的名字
 *				方法在调用时，实际给这个方法传递的真实数据被称为：实际参数
 *				形参列表和实参列表必须满足数量相同，类型对应相同(类型不同可以自动类型转换，也可以强制类型转换)
 *		2.5、方法体：方法体中代码有顺序，自上而下
 *	3、方法怎么调用？
 *		方法只定义不去调用是不会执行的，只用在调用的时候才会执行
 *		语法规则：方法修饰符列表中有static
 *				类名.方法名(实参列表);表示调用某个类的某个方法，传递这样的参数
 *				当在当前类中，"类名."可以省略，表示找本类中的方法
 *
 *		方法的调用不一定在main方法当中，可以在其他方法当中
 */
//public表示公开的
//class表示定义类
public class MethodTest01 {
	//类体
	//类体中不能直接编写java语句，除声明变量外
	//方法出现在类体中
	
	public static void main(String[] args) {//形式参数列表，String[]是一种应用数据类型，args是局部变量变量名
		// TODO Auto-generated method stub
		//计算两个int类型数据的和
		MethodTest01.sumInt(11, 20);
		sumInt(10,20);//实参列表，表示从当前类中找此方法
		//调用其他类【不是本类中】中的方法，不能省略类名
		A.doOther();
//		doOther();
		m();//当前类中的m方法
		A.m();//A类中的m方法
		
		divide(4,3);//没有接收返回的数据
		
		//这里接收一下方法执行结束后返回的数据
		//采用变量接收，变量数据类型需要和返回值的数据类型相同，或者可以自动类型转换和强制类型转换。
		int a=divide(4,3);
		
	}
	//该方法计算两个int类型数据的和，并将结果输出
	public static void sumInt(int a,int b) {//形参列表
		int c=a+b;
		System.out.println(a+"+"+b+"="+c);
		//调用dosome方法
		MethodTest01.dosome();
	}
	
	public static void dosome() {
		System.out.println("dosome");
	}
	public static void m() {
		System.out.println("MethodTest01's m method invoke");
	}
	
	public static int divide(int a,int b) {
		int c=a/b;
		return c;//返回值
	}
	/*
	 * 缺少返回语句，编译报错，编译阶段只检查语法，不带入数值判断，
	 * 编译阶段无法保证return语句执行
	public static int m1() {
		int a=10;
		if(a>3) {
			return 1;
		}
	}
	*/
	public static int m1() {
		int a=10;
		if(a>3) {
			return 1;
			//这里不能编写代码，无法访问语句
			//System.out.println("hello");
		}
		System.out.println("hello");
		return 0;
	}
	
	public static void m2() {
		return;//return终止方法的执行
	}
	
	public static void m3() {
		for(int i=0;i<10;i++) {
			if(i==5) {
//				return;不是终止for循环，而是终止m3()方法，return结束当前方法
//				break;终止for循环
			}
			System.out.println("i->"+i);
		}
		System.out.println("helloword");
	}
}
class A{
	public static void doOther() {
		System.out.println("A's doOther method invoke");
	}
	public static void m() {
		System.out.println("A's m method invoke");
	}
}