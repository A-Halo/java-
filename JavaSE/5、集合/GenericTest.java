package JavaSE.OO.jihe;

import java.util.*;

/*
 * 泛型(编译期概念)
 * 	1、为什么引入泛型
 * 		统一集合中的数据类型
 * 		可以减少强制类型转换
 * 	2、泛型语法如何实现
 * 		编译阶段语法，在编译阶段统一集合中的类型
 */
public class GenericTest {
	public static void main(String[] args) {
		//创建一个集合，存储ABC
		Set s=new HashSet();
		//创建对象
		A a=new A();
		B b=new B();
		C c=new C();
		
		s.add(a);
		s.add(b);
		s.add(c);
		
		//遍历集合，A类型调用m1方法，B类型调用m2方法，C类型调用m3方法
		Iterator it=s.iterator();
		while(it.hasNext()) {
			Object o=it.next();
			//只能做大量的强制类型转换
			if(o instanceof A) {
				A a1=(A)o;
				a1.m1();
			}else if(o instanceof B) {
				B b1=(B)o;
				b1.m2();
			}else if(o instanceof C) {
				C c1=(C)o;
				c1.m3();
			}
		}
		
		//使用泛型,创建一个List集合，只能存储字符串类型
		List<String> strs=new ArrayList<String>();
		//添加元素只能添加String类型
		//strs.add(1);
		strs.add("jack");
		strs.add("king");
		strs.add("tim");
		//遍历
		Iterator<String> i = strs.iterator();
		while(i.hasNext()) {
			String st=i.next();
			System.out.println(st);
		}
		//map使用泛型
		Map<String,Integer> maps=new HashMap<String,Integer>();
		//存
		maps.put("西瓜", 10);
		maps.put("苹果", 1);
		maps.put("香蕉", 15);
		//遍历
		Set<String> keys = maps.keySet();
		Iterator<String> it1=keys.iterator();
		while(it1.hasNext()) {
			String k=it1.next();
			Integer v=maps.get(k);
			System.out.println(k+"->"+v);
		}
		//SortedSet使用泛型
		SortedSet<Manager1> ss=new TreeSet<Manager1>();
		//添加
		Manager1 m1=new Manager1(1000.0);
		Manager1 m2=new Manager1(1500.0);
		Manager1 m3=new Manager1(1300.0);
		ss.add(m1);
		ss.add(m2);
		ss.add(m3);
		//遍历
		Iterator<Manager1> it2=ss.iterator();
		while(it2.hasNext()) {
			Manager1 m=it2.next();
			System.out.println(m);
		}
		
		//自定义泛型
		MyClass<String> mc=new MyClass<String>();
		mc.m1("jack");
	}
}
class A{
	public void m1() {
		System.out.println("A's m1...");
	}
}
class B{
	public void m2() {
		System.out.println("B's m2...");
	}
}
class C{
	public void m3() {
		System.out.println("C's m3...");
	}
}

class Manager1 implements Comparable<Manager1>{
	double sal;

	public Manager1(double sal) {
		super();
		this.sal = sal;
	}
	public String toString() {
		return sal+"";
	}
	@Override
	public int compareTo(Manager1 o) {
		// TODO Auto-generated method stub
		double sal1=this.sal;
		double sal2=o.sal;//不需要强转
		if(sal1>sal2) {
			return 1;
		}else if(sal1<sal2){
			return -1;
		}
		return 0;
	}
}
//自定义泛型
class MyClass<T>{
	public void m1(T t) {
		System.out.println(t);
	}
}