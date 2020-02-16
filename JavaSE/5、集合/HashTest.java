package JavaSE.OO.jihe;

import java.util.*;

/*
 * 哈希表：数组和单向链表的结合
 * 哈希表本质是一个数组，只不过这个数组中的每一个元素又是单向链表
 * 
 * set集合：HashSet
 * 1、HashSet底层实际上是一个HashMap，HashMap底层采用了Hash表数据结构
 * 2、hash表又叫散列表，哈希表底层是一个数组，这个数组中每一个元素是一个单向链表
 * 每个单向链表都有一个独一无二的hash值，代表数组下标，在某个单向链表中的每一个节点
 * 的hash值是相等的，hash值实际上是key调用hashCode方法，在通过hash function转换成的值
 * 3、如何向哈希表中添加元素：
 * 		先调用被存储的key的hashCode方法，经过某个算法得出hash值，如果在这个hash表中不存在这个hash
 * 		值，则直接加入元素，如果该hash值已经存在，则继续调用key之间的equals方法，如果equals方法
 * 		返回false，则将该元素添加，如果equals方法返回true，则放弃添加该元素
 * 4、HashSet其实是HashMap中的key部分。HashSet的特点HashMap中的key具有相同的特点
 * 5、HashSet和HashMap初始容量都是16，默认加载因子是0.75
 * 
 * 关于往Set集合中存储的元素，该元素的hashCode和equals方法
 * 	HashMap中有一个put方法，put(key,value) key是无序不可重复的
 * 存储在HashSet集合或者HashMap集合Key部分的元素，需要同时重写hashCode和equals方法
 */
public class HashTest {
	public static void main(String[] args) {
		
		//创建Set集合
		Set s=new HashSet();
		
		//无序不可重复
		s.add(1);
		s.add(1);
		
		s.add(100);
		s.add(85);
		s.add(88);
		
		//遍历
		Iterator it=s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//创建集合
		Set es=new HashSet();
		
		Employee e1=new Employee("1000","jack");
		Employee e2=new Employee("1001","jack");
		Employee e3=new Employee("2000","SCOT");
		Employee e4=new Employee("2001","SUM");
		Employee e5=new Employee("3000","JIM");
		Employee e6=new Employee("3001","COOK");
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		//添加元素
		es.add(e1);
		es.add(e2);
		es.add(e3);
		es.add(e4);
		es.add(e5);
		es.add(e6);
		//查看集合元素个数
		System.out.println(es.size());
	}
}

class Employee{
	//编号范围：1000-9999
	String no;
	//姓名
	String name;
	//构造方法
	public Employee(String no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	//重写equals方法
	//如果员工编号名字相同则是同一个对象
	public boolean equals(Object o) {
		if(this==o) {
			return true;
		}
		if(o instanceof Employee) {
			Employee e=(Employee)o;
			if(e.no.equals(this.no)&&e.name.equals(this.name)) {
				return true;
			}
		}
		return false;
	}
	//重写HashCode方法
	public int hashCode() {
		//以员工编号分组
		return no.hashCode();
	}
}
