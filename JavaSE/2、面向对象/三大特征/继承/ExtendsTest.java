package JavaSE.OO.jicheng;
/*
 * 三大特征之继承
 * 1、继承的基本作用：代码复用。但是继承最重要的作用是：有了继承才有了以后方法的覆盖和多态机制
 * 2、语法格式:
 * 		[修饰符列表] class 类名 extends 父类名{
 * 		类体=属性+方法	
 * 		}
 * 3、java语言中的继承只支持单继承，一个类不能同时继承多个类，C++中支持多继承
 * 		父类又称为基类，超类，superclass
 * 		子类又称为派生类，subclass
 * 4、子类继承父类继承哪些数据呢
 * 		私有的不支持继承
 * 		构造方法不支持继承
 * 		其他数据都可以被继承
 * 5、虽然java语言中只支持单继承，但是一个类也可以间接继承其他类，C类继承B类，B类继承A类，则C间接继承A类
 * 6、java语言假设一个类没有显示的继承任何类，该类默认继承javaSE库中提供的java.lang.object类
 */
public class ExtendsTest {
	public static void main(String[] args) {
		C c=new C();
		c.doSome();//从b中继承的doSome方法
	}
}
class A{
	public void doSome() {
		System.out.println("doSome");
	}
}
class B extends A{
	
}
class C extends B{
	
}