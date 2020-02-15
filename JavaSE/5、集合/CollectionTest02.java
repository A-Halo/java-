package JavaSE.OO.jihe;

import java.util.*;

/*
 * Iterator<E> iterator;获取集合所依赖的迭代器对象
 * 通过迭代器中的方法完成集合的迭代(遍历)
 * 这种方式是所有集合通用的遍历方式
 */
public class CollectionTest02 {
	public static void main(String[] args) {
		//创建集合对象
		Collection c=new LinkedList();
		//添加元素
		c.add(100);//自动装箱
		c.add(3.14);//自动装箱
		c.add(false);//自动装箱
		//迭代，遍历
		//获取迭代器对象
		//不需要关心底层集合的具体类型，所有集合依赖的迭代器都实现了java.util.Iterator接口
		Iterator it=c.iterator();//迭代器面向接口编程
								 //it是一个引用，保存了内存地址，指向了堆中的迭代器对象
		//调用方法，完成迭代，遍历
		//while循环
		while(it.hasNext()) {
			Object element=it.next();
			System.out.println(element);
		}
		/*
		 * boolean b=it.hasNext();判断是否有更多的元素，如果有返回true
		 * Object o=it.next();将迭代器向下移动一位，并且取出指向的元素
		 * 调用it.Next();方法之前必须调用it.hasNext();
		 */
		//for循环
		for(Iterator i=c.iterator();it.hasNext();) {
			Object o=it.next();
			System.out.println(o);
		}
		
	}
}
