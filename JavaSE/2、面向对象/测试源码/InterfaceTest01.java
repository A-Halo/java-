package JavaSE.OO.jiekou;
/*基础语法
 * 接口也是一种引用数据类型，可以等同于看做类
 * 	1、定义接口语法：
 * 		[修饰符] interface 接口名{
 * 		}
 * 	2、接口中只能出现常量和抽象方法
 * 	3、接口其实是一个特殊的抽象类，特殊在接口是完全抽象的
 * 	4、接口中没有构造方法，接口也无法被实例化
 * 	5、接口和接口之间可以多继承
 * 	6、一个类可以实现多个接口。【实现可以等同看做继承】
 * 	7、一个非抽象的类实现接口，需要将接口中的所有方法重写或者叫覆盖
 * 	
 */
interface A{
	//常量(必须用public static final修饰)
	public static final String SUCCESS="success";
	public static double PI=3.1415926;
	int i=3;//public static final是可以省略的，i还是常量，不是实例变量
	//抽象方法
	public abstract void m1();
	void m2();//m2是可以省略的
}
interface B{
	void m3();
}
interface C{
	void m4();
}
//多继承
interface D extends A,B,C{
	void m5();
}
//实现多接口，必须实现接口中所有的抽象方法
//implements是实现的意思，和extends继承意义相同
class MyClass implements A,B,C{
	public void m1() {}
	public void m2() {}
	public void m3() {}
	public void m4() {}
}
class M implements D{
	public void m1() {}
	public void m2() {}
	public void m3() {}
	public void m4() {}
	public void m5() {}
}
public class InterfaceTest01 {
	
}
