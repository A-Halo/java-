package JavaSE.OO.jihe;

import java.util.*;

/*
 * SortedSet���ϴ洢Ԫ��Ϊʲô�����Զ�����
 * ��Ϊ���洢��Ԫ��ʵ����Comparable�ӿڣ�
 * SUN��д��TreeSet���������Ԫ�ص�ʱ��
 * �����compareTo��������ɱȽ�
 * 
 * ��һ�ַ�ʽjava.util.comparator
 * ������дһ���Ƚ���
 */
public class SortedSetTest02 {
	public static void main(String[] args) {
		SortedSet users=new TreeSet();
		
		User u1=new User(15);
		User u2=new User(16);
		User u3=new User(25);
		User u4=new User(13);
		User u5=new User(11);
		
		//���Ԫ��
		users.add(u1);
		users.add(u2);
		users.add(u3);
		users.add(u4);
		users.add(u5);
		
		//����
		Iterator it=users.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//����TreeSet���ϵ�ʱ���ṩһ���Ƚ�����
		SortedSet products=new TreeSet(new ProductComparator());
		//�����ڲ���
		SortedSet products1=new TreeSet(new Comparator(){


			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				//���󣺰�����Ʒ�۸�����
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
		
		//���Ԫ��
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		//����
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

	@Override//ʵ��Comparable�ӿ��е�compareto����
	//�÷�������Ա����ʵ�֣�sun�ṩ�ĳ����Ѿ������˸÷���
	//����user��age����
	public int compareTo(Object o) {//u1.compareTo(u2);
		// TODO Auto-generated method stub
		//��дһ���ȽϹ���
		int age1=this.age;
		int age2=((User)o).age;
		return age1-age2;
	}
}
//������д�Ƚ���
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
		//���󣺰�����Ʒ�۸�����
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