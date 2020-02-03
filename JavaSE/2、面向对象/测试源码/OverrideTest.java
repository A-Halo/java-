package JavaSE.OO.jicheng;
/*
 * 方法重载：overload
 * 	1、方法重载什么时候使用
 * 		在同一个类中，方法完成的功能是相似的，建议方法名相同
 * 	2、方法重载的条件
 * 		在同一个类中，方法名相同，参数列表不同
 * 	3、方法重载和什么无关
 * 		和方法的返回值类型，修饰符列表无关
 * 方法覆盖：override
 * 	1、方法覆盖又被称为方法重写
 * 	2、什么时候使用方法重写
 * 		父类中的方法无法满足当前子类的需求，子类可以将父类中继承的方法重写
 * 	3、什么条件满足之后会发生
 * 		方法重写发生在具有继承关系的子父类之间
 * 		返回值类型相同，方法名相同，形参列表相同
 * 		方法重写尽量复制粘贴
 * 		访问权限不能更低可以更高（public protected default private）由高到低
 * 		抛出异常可以更高，不能更少
 * 注意：私有方法不能继承，所以不能覆盖
 * 		构造方法不能继承，所以不能覆盖
 * 		静态方法不存在覆盖
 * 		覆盖只针对方法，不谈属性
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
}
class Bird extends Animal{
	public void move() {
		System.out.println("鸟在移动");
	}
}
public class OverrideTest {
	public static void main(String[] args) {
		//创建动物对象
		Animal a=new Animal();
		a.move();
		
		//创建猫对象
		Cat c=new Cat();
		c.move();
		
		//创建鸟对象
		Bird b=new Bird();
		b.move();
		
	}
}
