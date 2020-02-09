package JavaSE.OO.shuzu;
/*
 * 深入一维数组
 */
class Animal{
	
}
class Dog extends Animal{
	public void eat() {
		System.out.println("Dog eat");
	}
}
class Cat extends Animal{
	public void move() {
		System.out.println("Cat move");
	}
}
public class ArrayTest02 {
	//方法调用的时候，也可以这样传递一个数组
	public static void m1(int[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		//第一种方法传递数组
		int[] m= {1,2,3,4,5,6};
		m1(m);
		//第二种方式
		m1(new int[] {1,2,3,4,5,6});
		
		//创建一个数组，这个数组既可以存储Dog，也能存储Cat
		Animal[] as=new Animal[4];
		//给数组每个元素赋值
		Dog d1=new Dog();
		Dog d2=new Dog();
		Cat c1=new Cat();
		Cat c2=new Cat();
		as[0]=d1;
		as[1]=d2;
		as[2]=c1;
		as[3]=c2;
		//遍历数组，取出每个对象，如果是Dog执行eat方法，如果是Cat执行move方法
		for(int i=0;i<as.length;i++) {
			Animal a=as[i];
			System.out.println(a);
			//强制类型转换，向下转型
			if(a instanceof Cat) {
				Cat c=(Cat)a;
				c.move();
			}else if(a instanceof Dog){
				Dog d=(Dog)a;
				d.eat();
			}
		}
	}
}
