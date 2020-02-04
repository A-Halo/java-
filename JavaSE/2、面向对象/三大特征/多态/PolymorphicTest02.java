package JavaSE.OO.duotai;
/*
 * java三大特征之多态【作用】
 * 	降低程序耦合度，提高程序扩展力
 * 	能用多态就用多态，父类型引用指向子类型对象
 * 面向抽象编程，尽量不要面向具体编程
 */
class Snake extends Pet{
	public void eat() {
		System.out.println("蛇吞象");
	}
}
class Pet{
	//所有宠物都可以eat
	public void eat() {
		
	}
}
class Cat1 extends Pet{
	public void eat() {
		System.out.println("猫吃鱼");
	}
}

class Dog extends Pet{
	public void eat() {
		System.out.println("狗吃骨头");
	}
}
//用了多态master这个类扩展力非常强，耦合度非常低，
//Master类面向的是抽象的pet，不面向具体的宠物
//提倡面向抽象编程，不要面向具体编程
//面向抽象编程的好处是耦合度低，扩展力强
class Master{
	public void feed(Pet pet) {//将new Cat1赋给pet引用，或将new Dog赋给pet引用
		pet.eat();			   //Pet pet是一个父类型引用，指向子类型Cat1或Dog
	}
}
//没有用多态，面向具体宠物
/*
class Mater{
	public void feed(Cat1 c) {
		c.eat();
	}
	public void feed(Dog d) {
		d.eat();
	}
}
*/
public class PolymorphicTest02 {
	public static void main(String[] args) {
		//创建主人对象
		Master zhangsan=new Master();
		//创建猫对象
		//主人喂养猫
		zhangsan.feed(new Cat1());
		//主人喂养狗
		zhangsan.feed(new Dog());
		//创建蛇对象
		Snake snake=new Snake();
		zhangsan.feed(snake);
	}
}
