package JavaSE.OO.guanjianzi;
/*
 * super关键字
 * 	1、super不是引用类型，super中存储的不是内存地址
 * 	2、this是引用，this中存储的是内存地址
 * 	3、super代表的是当前子类对象中的父类型特征
 * 什么时候使用super
 * 	子类和父类中都有某个属性或方法
 * 	在子类中想要访问父类的方法或属性需要使用super
 * 	直接访问会默认加this.表示当前类中的数据，而不是父类中的数据
 * super可以用在什么地方
 * 	super可以用在实例方法中
 * 	super可以用在构造方法中，this用在构造方法中是this()
 * 	super不能用在静态方法中，因为没有对象
 */
class Employee{
	String name="张三";
	
	public void work() {
		System.out.println("员工工作");
	}
}

class Manager extends Employee{
	String name="李四";
	//将work方法重写
	public void work() {
		System.out.println("经理工作");
	}
	public void m1(){
		work();//此时表示this.work输出经理工作
		super.work();//此时输出员工工作
		System.out.println(name);//表示this.name输出李四
		System.out.println(super.name);//输出张三
	}
	/*this和super相同，都不能直接用在静态上下文中
	public static void m2() {
		System.out.println(super.name);
	}
	*/
}
public class SuperTest01 {
	public static void main(String[] args) {
		Manager m=new Manager();
		m.m1();
	}
}
