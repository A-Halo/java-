package JavaSE.OO.guanjianzi;
/*
 * 关于java中final关键字：
 * 	1、final是一个关键字，表示最终的，不可变的
 * 	2、final修饰的类无法被继承
 * 	3、final修饰的方法无法被覆盖
 * 	4、final修饰的变量一旦被赋值之后，不可重新赋值
 * 	5、final修饰的实例变量：必须手动赋值，不能采用系统默认值
 * 	6、final修饰的引用：一旦指向一个对象之后，它不能指向别的对象了
 * final修饰的实例变量是不可变的，这种变量一般和static联合使用，被称为"常量"
 */
class Chinese{
	//常量：public static final 类型 常量名=值;
	//java规范中要求所有常量名字大写，每个单词之间用下划线连接
	//static final String country="中国";
	public static final String GUO_JI="中国";
}
class User1{
	int id;
	public User1(int a) {
		this.id=id;
	}
}
public class FinalTest {
	//实例变量有默认值，final修饰的变量一旦赋值不能重新赋值
//	final int age;必须手动赋值，不能采用系统默认值
	//第一种
	final int age1=100;//在构造方法执行时才会执行赋值运算
	//第二种
	final int num;
	public FinalTest(){
		this.num=200;
	}
	
	public static void main(String[] args) {
		final int a;
		a=100;
		//a=1;不能重新赋值
		User1 u=new User1(10);//相当于User u=0x1234
		u=new User1(30);//相当于u=0x3456，则此时u不再指向new User(10)对象，
					   //User(10)会被垃圾回收
		final User1 user=new User1(100);//则user保存的地址不会改变
		//user = new user1(50);final修饰的引用一旦指向某个对象之后，
		//不能指向其他对象，被指向的对象无法被垃圾回收器回收
		user.id=50;//final修饰的引用指向某个对象，这个对象内部的内存是可以修改的
	}
}
