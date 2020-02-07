package JavaSE.OO.lei;
/*
 * 内部类：
 * 内部类重要的作用是可以访问外部类中私有的数据
 * 	1、静态内部类
 * 		静态内部类可以等同看做静态变量
 * 		静态内部类可以直接访问外部类的静态数据，无法直接访问成实例数据
 * 	2、成员内部类
 * 		成员内部类可以等同看做成员变量
 * 		成员内部类中不能有静态声明
 * 		成员内部类可以访问外部的所有数据
 * 	3、局部内部类
 * 		局部内部类可以等同看做局部变量
 * 		局部内部类不允许用访问控制权限修饰符修饰
 * 		局部内部类不允许有静态声明
 * 		重点：：局部内部类在访问局部变量的时候，局部变量必须使用final修饰
 * 	4、匿名内部类
 * 		指的是类没有名字
 * 		能够少定义一个类，但是不能重复利用
 */
public class inner_classTest {
	//静态变量
	private static String s1="A";
	//实例变量
	private String s2="B";
	//静态方法
	private static void m1() {
		System.out.println("static's m1 method execute");
	}
	//实例方法
	private void m2() {
		System.out.println("m2 method execute");
	}
	
	//静态内部类
	//可以用访问控制权限的修饰符修饰，public protected private 缺省
	static class InnerClass{
		//定义静态方法
		public static void m3() {
			System.out.println(s1);
			//System.out.println(s2);
			m1();
			//m2();
		}
		//定义实例方法
		public void m4() {
			System.out.println(s1);
			//System.out.println(s2);
			m1();
			//m2();
		}
	}
	//成员内部类
	class InnerClass02{
		//不能定义静态方法和静态变量
		//public static void m3() {}
		//定义实例方法
		public void m4() {
			System.out.println(s1);
			System.out.println(s2);
			m1();
			m2();
		}
	}
	//局部内部类
	//方法
	public void m5() {
		//局部变量，必须要用final修饰
		final int i=10;
		//局部内部类
		//局部内部类不允许用访问控制权限修饰符修饰
		class InnerClass{
			//不允许有静态声明
			//public static void m1() {}
			public void m2() {
				//从内部类访问变量必须要有最终声明
				System.out.println(i);
			}
		}
		//调用m2
		InnerClass inner=new InnerClass();
		inner.m2();
	}
	//匿名内部类
	//静态方法
	public static void test(CustomerService cs) {
		cs.logout();
	}
	
	//入口
	public static void main(String[] args) {
		//静态内部类
		//调用m3
		inner_classTest.InnerClass.m3();
		//调用m4
		InnerClass inner=new inner_classTest.InnerClass();
		inner.m4();
		
		//成员内部类
		//创建外部类对象
		inner_classTest oc=new inner_classTest();
		InnerClass02 inner02 = oc.new InnerClass02(); 
		inner02.m4();
		
		//局部内部类
		inner_classTest o=new inner_classTest();
		o.m5();
		
		//匿名内部类
		//调用test方法
		//test(new CustomerServiceImpl());
		//匿名内部类的方式调用test方法
		//CustomerService() {}就是个匿名内部类
		test(new CustomerService() {
			public void logout() {
				System.out.println("系统退出");
			}
			
		});
	}
}
//接口
interface CustomerService{
	//退出系统
	void logout();
}
//编写一个类实现CustomerService接口
/*
class CustomerServiceImpl implements CustomerService{
	public void logout() {
		System.out.println("退出系统");
	}
}
*/