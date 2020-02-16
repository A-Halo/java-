package JavaSE.OO.jihe;

import java.util.*;

/*
 * ����(�����ڸ���)
 * 	1��Ϊʲô���뷺��
 * 		ͳһ�����е���������
 * 		���Լ���ǿ������ת��
 * 	2�������﷨���ʵ��
 * 		����׶��﷨���ڱ���׶�ͳһ�����е�����
 */
public class GenericTest {
	public static void main(String[] args) {
		//����һ�����ϣ��洢ABC
		Set s=new HashSet();
		//��������
		A a=new A();
		B b=new B();
		C c=new C();
		
		s.add(a);
		s.add(b);
		s.add(c);
		
		//�������ϣ�A���͵���m1������B���͵���m2������C���͵���m3����
		Iterator it=s.iterator();
		while(it.hasNext()) {
			Object o=it.next();
			//ֻ����������ǿ������ת��
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
		
		//ʹ�÷���,����һ��List���ϣ�ֻ�ܴ洢�ַ�������
		List<String> strs=new ArrayList<String>();
		//���Ԫ��ֻ�����String����
		//strs.add(1);
		strs.add("jack");
		strs.add("king");
		strs.add("tim");
		//����
		Iterator<String> i = strs.iterator();
		while(i.hasNext()) {
			String st=i.next();
			System.out.println(st);
		}
		//mapʹ�÷���
		Map<String,Integer> maps=new HashMap<String,Integer>();
		//��
		maps.put("����", 10);
		maps.put("ƻ��", 1);
		maps.put("�㽶", 15);
		//����
		Set<String> keys = maps.keySet();
		Iterator<String> it1=keys.iterator();
		while(it1.hasNext()) {
			String k=it1.next();
			Integer v=maps.get(k);
			System.out.println(k+"->"+v);
		}
		//SortedSetʹ�÷���
		SortedSet<Manager1> ss=new TreeSet<Manager1>();
		//���
		Manager1 m1=new Manager1(1000.0);
		Manager1 m2=new Manager1(1500.0);
		Manager1 m3=new Manager1(1300.0);
		ss.add(m1);
		ss.add(m2);
		ss.add(m3);
		//����
		Iterator<Manager1> it2=ss.iterator();
		while(it2.hasNext()) {
			Manager1 m=it2.next();
			System.out.println(m);
		}
		
		//�Զ��巺��
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
		double sal2=o.sal;//����Ҫǿת
		if(sal1>sal2) {
			return 1;
		}else if(sal1<sal2){
			return -1;
		}
		return 0;
	}
}
//�Զ��巺��
class MyClass<T>{
	public void m1(T t) {
		System.out.println(t);
	}
}