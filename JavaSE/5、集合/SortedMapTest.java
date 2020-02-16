package JavaSE.OO.jihe;

import java.util.*;

/*
 * SortedMap中key的特点：无序不可重复，但是存进去的元素可以按照大小自动排列
 * 如果想自动排序:key部分元素需要实现Comparable接口或者单独写一个比较器
 */
public class SortedMapTest {
	public static void main(String[] args) {
		//Map,key存储Product，value存储重量
		SortedMap product=new TreeMap();
		
		//匿名内部类
		/*
		SortedMap products=new TreeMap(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				double price1=((Product1)o1).price;
				double price2=((Product1)o2).price;
				if(price1<price2) {
					return -1;
				}else if(price1>price2) {
					return 1;
				}else
					return 0;
				return 0;
			}
		});
		*/
		//准备对象
		Product1 p1=new Product1("西瓜",1.0);
		Product1 p2=new Product1("苹果",4.0);
		Product1 p3=new Product1("桃子",5.0);
		Product1 p4=new Product1("香蕉",3.0);
		//添加
		product.put(p1, 8.0);//自动装箱
		product.put(p2, 3.0);
		product.put(p3, 4.0);
		product.put(p4, 10.0);
		//遍历
		Set keys=product.keySet();
		Iterator it=keys.iterator();
		while(it.hasNext()) {
			Object k=it.next();
			Object v=product.get(k);
			System.out.println(k+"-->"+v+"kg");
		}
	}
}
//实现Comparable接口
class Product1 implements Comparable{
	String name;
	double price;
	public Product1(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String toString() {
		return "Product[name="+name+",price="+price+"]";
	}
	
	@Override//按照商品价格排序
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		double price1=this.price;
		double price2=((Product1)o).price;
		if(price1<price2) {
			return -1;
		}else if(price1>price2) {
			return 1;
		}else
			return 0;
	}
}
//匿名内部类方式(单独写一个比较器)
/*
class Product1{
	String name;
	double price;
	public Product1(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String toString() {
		return "Product[name="+name+",price="+price+"]";
	}
	
}
*/