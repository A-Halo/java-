package JavaSE.OO.jihe;

import java.util.*;

/*collection中的方法：
 * boolean add(Object element);向集合中添加元素
 * int size();获取集合中元素的个数
 * void clear();清空集合
 * boolean isEmpty();判断集合是否为空
 * Object[] toArray();将集合转换成数组
 *   
 * Iterator<E> iterator;获取集合所依赖的迭代器对象
 * boolean contains(Object o);判断集合中是否包含某个元素
 * boolean remove(Object o);删除集合中某个元素
 */
class Customer{
	String name;
	int age;
	
	Customer(String name,int age){
		this.age=age;
		this.name=name;
	}
	//重写Object中的toString方法
	public String toString(){
		return "Customer[name="+name+",age="+age+"]";
	}
}
public class CollectionTest01 {
	public static void main(String[] args) {
		//创建集合
		Collection c=new ArrayList();//多态
		//添加元素
		c.add(1);//自动装箱，会自动转换成Integer引用类型的引用
		Object o=new Object();
		c.add(o);//等同于下面
		c.add(new Object());//保存的是引用，不是对象
		
		Customer cus=new Customer("jack",20);
		c.add(cus);
		
		//获取元素个数
		System.out.println(c.size());//4
		System.out.println(c.isEmpty());//判断是否为空,false
		//将集合转换成Object类型的数组
		Object[] objs=c.toArray();
		for(int i=0;i<objs.length;i++) {
			System.out.println(objs[i]);
		}
		//清空
		c.clear();
		System.out.println(c.size());//0
		System.out.println(c.isEmpty());//判断是否为空,true
		
		
	}
}
