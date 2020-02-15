package JavaSE.OO.jihe;

import java.util.*;

/*
 * boolean contains(Object o);判断集合中是否包含某个元素
 * boolean remove(Object o);删除集合中某个元素
 * 
 * 存储在集合中的元素应该去重写equals方法
 * remove和contains方法都需要集合中的元素重写equals方法，
 * 因为Object中的equals方法比较内存地址，在现实逻辑当中不能比较内存地址，该比较内容
 * 
 * 深入remove方法：
 * 	1、迭代器的remove方法
 * 	2、集合自身带的remove方法
 */
public class CollectionTest03 {
	public static void main(String[] args) {
		//创建集合
		Collection c=new ArrayList();
		//Integer类型变量
		Integer i1=10;
		//添加元素
		c.add(i1);
		//判断集合中是否包含i1
		System.out.println(c.contains(i1));//true
		//contains方法底层调用的是equals方法，
		Integer i2=10;//Integer重写了equals方法，比较的是内容，i1和i2相同，
		System.out.println(c.contains(i2));//true
		c.remove(i2);//equals被重写，i2就是i1
		System.out.println(c.size());//0
		
		Manager m1=new Manager(100,"jack");
		c.add(m1);
		System.out.println(c.contains(m1));//true
		Manager m2=new Manager(100,"jack");//Manager没有重写equals方法，m1和m2内存地址不一样，所以返回false
		System.out.println(c.contains(m2));//false//重写equals方法之后，比较内容，会返回true
		c.remove(m2);//equals未被重写，返回1，equals被重写，返回0
		System.out.println(c.size());//0
		
		//深入remove方法：
		// 	1、迭代器的remove方法
		// 	2、集合自身带的remove方法
		Collection c1=new ArrayList();
		c1.add(1);
		c1.add(2);
		c1.add(3);
		//遍历
		Iterator it=c1.iterator();
		while(it.hasNext()) {
			
			//推荐使用迭代器自身带的remove方法删除元素
			it.next();
			//删除
			it.remove();//通过迭代器删除
			
//			//使用集合自身所带的remove方法
//			Object element=it.next();
//			//删除
//			c1.remove(element);
			//java.util.ConcurrentModificationException
			
		}
		System.out.println(c1.size());
	}
}
class Manager{
	int no;
	String name;
	Manager(int no,String name){
		this.name=name;
		this.no=no;
	}
	//重写equals方法
	//需求规定：如果编号姓名相同，表示同一个
	public boolean equals(Object o) {
		if(this==o)
			return true;
		if(o instanceof Manager) {
			Manager m=(Manager)o;
			if(m.no==this.no && m.name.equals(this.name)) {
				return true;
			}
		}
		return false;
	}
}