package JavaSE.OO.jihe;

import java.util.*;

/*
 * SortedMap��key���ص㣺���򲻿��ظ������Ǵ��ȥ��Ԫ�ؿ��԰��մ�С�Զ�����
 * ������Զ�����:key����Ԫ����Ҫʵ��Comparable�ӿڻ��ߵ���дһ���Ƚ���
 */
public class SortedMapTest {
	public static void main(String[] args) {
		//Map,key�洢Product��value�洢����
		SortedMap product=new TreeMap();
		
		//�����ڲ���
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
		//׼������
		Product1 p1=new Product1("����",1.0);
		Product1 p2=new Product1("ƻ��",4.0);
		Product1 p3=new Product1("����",5.0);
		Product1 p4=new Product1("�㽶",3.0);
		//���
		product.put(p1, 8.0);//�Զ�װ��
		product.put(p2, 3.0);
		product.put(p3, 4.0);
		product.put(p4, 10.0);
		//����
		Set keys=product.keySet();
		Iterator it=keys.iterator();
		while(it.hasNext()) {
			Object k=it.next();
			Object v=product.get(k);
			System.out.println(k+"-->"+v+"kg");
		}
	}
}
//ʵ��Comparable�ӿ�
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
	
	@Override//������Ʒ�۸�����
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
//�����ڲ��෽ʽ(����дһ���Ƚ���)
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