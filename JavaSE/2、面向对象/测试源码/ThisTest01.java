package JavaSE.OO.guanjianzi;
/*
 * 关于java中的this关键字：
 * 	1、this是一个关键字，翻译为：这个
 * 	2、this是一个引用，this是一个变量，this变量中保存了内存地址指向了自身，this存储在jvm堆内存java对象内部
 * 	3、创建100个对象，有一百个this，每个this都是不同的
 * 	4,、this可以出现在“实例方法”当中，this指向当前正在执行的这个动作的对象。(this代表当前对象)
 * 	5、this多数情况下是可以省略的
 * 	6、this不能使用在带有static关键字的方法中
 */

class Customer{
	//姓名【堆内存的对象内部存储，所以访问该数据时，必须先创建对象，通过引用的方式访问】
	String name;//实例变量：必须采用“引用.”的方式访问
	
	//构造方法
	public Customer() {
		
	}
	//不带有static关键字的方法称为实例方法，实例方法访问方式为"引用."
	//不带有static关键字的变量称为实例变量，实例变量访问方式为"引用."
	//当一个行为/动作执行过程中需要对象的参与，则这个方法一定定义为“实例方法”，不带static关键字
	//以下方法定义为实例方法，因为每个顾客在购物时，最终结果不同
	public void shopping() {
		//由于name是一个实例变量，所以这个name访问的时候一定访问的是当前对象的name
		//所以多数情况下"this."是可以省略的
		System.out.println(name+"在购物");
		//完整写法：引用.变量名
		System.out.println(this.name+"在购物");//谁调用shopping，this就是谁
	}
	
	//带有static的方法
	public static void doSome(){
		//这个执行过程中没有"当前对象"，因为带有static的方法是通过类名的方式访问的，所以不存在this
		//System.out.println(name);name是实例变量，只能通过引用方式访问
		//所以static方法中不能使用this，调用不需要对象，直接类名调用
		
		//如果想调用name则要创建对象
		Customer c=new Customer();
		System.out.println(c.name);//这里访问的name是c引用指向的name，不是当前对象的name
	}
	
}
public class ThisTest01 {
	public static void main(String[] args) {
		//创建Customer对象
		Customer c1=new Customer();
		c1.name="张三";
		//c1购物，谁调用shopping，this就是谁
		c1.shopping();
		
		//创建Customer对象
		Customer c2=new Customer();
		c2.name="李四";
		//c2购物，谁调用shopping，this就是谁
		c2.shopping();
		
		//调用doSome方法(修饰符列表上有static)
		//采用"类名."的发那是访问，显然这个方法在执行的时候不需要对象的参加
		Customer.doSome();
	}
}
