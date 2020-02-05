package JavaSE.OO.lei;
/*
 * 抽象类：
 * 	1、如何定义抽象类
 * 		class前面加abstract
 * 	2、抽象类无法被实例化
 * 	3、虽然抽象类没有办法实例化，但是抽象类也有构造方法，该构造方法是给子类创建对象用的
 * 	4、抽象类中可以定义抽象方法，
 * 		语法：在方法的修饰符列表中添加abstract关键字，并且抽象方法应该以";"结束，不能带有"{}"
 * 		例如：public abstract void m1();
 * 	5、抽象类中不一定有抽象方法，但抽象方法必须出现在抽象类中
 * 	6、一个非抽象的类继承抽象类，必须重写或者覆盖抽象类中的抽象方法
 * 	7、抽象类不能被final修饰，抽象方法也不能被final修饰，abstract和final关键字不能共存
 */
//定义一个抽象类A
abstract class A{
	public A() {
		System.out.println("A...");
	}
	//抽象方法
	public abstract void m1();
}
class B extends A{
	public void m1() {
		
	}
	public B() {
		System.out.println("B...");
	}
}
public class AbstractTest {
	public static void main(String[] args) {
		//抽象类无法创建对象
		//A a=new A();
		//多态
		A a=new B();
	}
}
