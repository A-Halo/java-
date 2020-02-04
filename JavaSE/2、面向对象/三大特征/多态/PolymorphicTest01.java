package JavaSE.OO.duotai;
/*
 * 三大特征之多态[基础语法]
 * 	1、关于多态的几个概念
 * 		向上转型(upcasting):子类型转成父类型【自动类型转换】
 * 		向下转型(downcasting):父类型转成子类型【强制类型转换】加强制类型转换符
 * 		无论是向上转型还是向下转型，两种类型之间必须具有继承关系
 */
class Animal{
	public void move() {
		System.out.println("动物在移动");
	}
}
class Cat extends Animal{
	public void move() {
		System.out.println("猫在移动");
	}
	public void catchMouse() {
		System.out.println("猫抓老鼠");
	}
}
class Bird extends Animal{
	public void move() {
		System.out.println("鸟在移动");
	}
	public void fly() {
		System.out.println("鸟在飞");
	}
}
public class PolymorphicTest01 {
	public static void main(String[] args) {
		//未用多态
		Animal a1=new Animal();
		a1.move();
		
		Cat c1=new Cat();
		c1.move();
		c1.catchMouse();
		
		Bird b1=new Bird();
		b1.move();
		//使用多态
		Animal a2=new Cat();//向上转型
		//Bird b=new Cat();编译报错，因为Cat和Bird没有继承关系
		/*
		 * java程序分为编译和运行阶段，先编译再运行
		 * 编译阶段编译器检查a2这个引用的数据类型为Animal，在Animal
		 * 中有move()方法，所以编译通过，这个过程称为静态绑定，编译阶段绑定
		 * 静态绑定之后才有运行，在程序运行阶段，堆内存中真实创建的是Cat对象
		 * 那么程序在运行阶段一定会调用Cat对象的move()方法，此时发生了程序的
		 * 动态绑定，运行阶段绑定 
		 * 无论Cat类有没有重写move()方法，运行阶段一定调用的是Cat对象的move()方法
		 * 因为底层真实的对象就是Cat对象
		 * 父类型引用指向子类型对象这种机制存在编译绑定和运行阶段两种不同状态，这种机制可以称为一种多态语法机制
		 */
		a2.move();
		//a2.catchMouse();a2类型是Animal类型，Animal类中没找到catchMouse()方法，所以编译失败，
		//若想让以上对象执行catchMouse()方法，则可以让a2强制类型转换为Cat类型，向下转型
		//加强制类型转换符，两种类型之间也要有击继承关系
		//什么时候需要向下转型呢？当调用的方法或访问的数据是子类型中特有的，在父类型中不存在，必须进行向下转型
		Cat c2=(Cat)a2;
		c2.catchMouse();
		
		/*
		 * 以下程序编译没有问题，a3是Animal类型，转换成Cat类型可以，但是运行会出现异常，因为
		 * 堆内存中真实存在的对象时Bird类型，Bird对象无法转成Cat类型，无继承关系，出现异常叫做
		 * 类型转换异常，这种异常总是在向下转型/强制类型转换时会发生
		 */
		Animal a3=new Bird();
		Cat c3=(Cat)a3;//java.lang.ClassCastException
		/*
		 * 向上转型只要编译通过，运行就没问题
		 * 向下转型编译通过，运行可能错误
		 * 如何避免向下转型出现ClassCastException异常？
		 * 	使用instanceof运算符可以避免出现以上的异常
		 * instanceof运算符怎么用？
		 * 	语法格式：
		 * 		(引用 instanceof 数据类型名)
		 * 	以上运算符执行结果类型是布尔类型，结果是true/false
		 * 	(a instanceof Animal)
		 * 		true表示：a引用指向的对象是一个Animal类型
		 * 		false表示：a引用指向的对象不是一个Animal类型
		 * 
		 * java规范要求，在进行强制类型转换时，建议采用instanceof运算符进行判断，避免出现异常
		 */
		if(a3 instanceof Cat) {
			Cat c=(Cat)a3;
			c.catchMouse();
		}else if(a3 instanceof Bird) {
			Bird b2=(Bird)a3;
			b2.fly();
		}
		
	}
}
