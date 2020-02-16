package JavaSE.OO.jihe;

import java.util.*;

/*
 * SortedSet集合存储元素为什么可以自动排序？
 * 因为被存储的元素实现了Comparable接口，
 * SUN编写的TreeSet集合在添加元素的时候，
 * 会调用compareTo方法，完成比较
 * 
 * 另一种方式java.util.comparator
 * 单独编写一个比较器
 */
public class SortedSetTest02 {
	public static void main(String[] args) {
		SortedSet users=new TreeSet();
		
		User u1=new User(15);
		User u2=new User(16);
		User u3=new User(25);
		User u4=new User(13);
		User u5=new User(11);
		
		//添加元素
		users.add(u1);
		users.add(u2);
		users.add(u3);
		users.add(u4);
		users.add(u5);
		
		//遍历
		Iterator it=users.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//创建TreeSet集合的时候提供一个比较器，
		SortedSet products=new TreeSet(new ProductComparator());
		//匿名内部类
		SortedSet products1=new TreeSet(new Comparator(){


			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				//需求：按照商品价格排序
				double price1=((Product)o1).price;
				double price2=((Product)o2).price;
				if(price1==price2) {
					return 0;
				}else if(price1>price2) {
					return 1;
				}else
					return -1;
			}
			
		});
		Product p1=new Product(3.4);
		Product p2=new Product(2.4);
		Product p3=new Product(3.8);
		Product p4=new Product(3.2);
		Product p5=new Product(5.4);
		
		//添加元素
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		//遍历
		Iterator it1=products.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
	}
}
class User implements Comparable{
	int age;
	
	User(int age){
		this.age=age;
	}
	
	public String toString() {
		return "User[age="+age+"]";
	}

	@Override//实现Comparable接口中的compareto方法
	//该方法程序员负责实现，sun提供的程序已经调用了该方法
	//按照user的age排序
	public int compareTo(Object o) {//u1.compareTo(u2);
		// TODO Auto-generated method stub
		//编写一个比较规则
		int age1=this.age;
		int age2=((User)o).age;
		return age1-age2;
	}
}
//单独编写比较器
class Product{
	double price;
	Product(double price){
		this.price=price;
	}
	public String toString() {
		return price+" ";
	}
}
class ProductComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		//需求：按照商品价格排序
		double price1=((Product)o1).price;
		double price2=((Product)o2).price;
		if(price1==price2) {
			return 0;
		}else if(price1>price2) {
			return 1;
		}else
			return -1;
	}
	
}