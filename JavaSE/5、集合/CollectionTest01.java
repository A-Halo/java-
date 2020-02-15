package JavaSE.OO.jihe;

import java.util.*;

/*collection�еķ�����
 * boolean add(Object element);�򼯺������Ԫ��
 * int size();��ȡ������Ԫ�صĸ���
 * void clear();��ռ���
 * boolean isEmpty();�жϼ����Ƿ�Ϊ��
 * Object[] toArray();������ת��������
 *   
 * Iterator<E> iterator;��ȡ�����������ĵ���������
 * boolean contains(Object o);�жϼ������Ƿ����ĳ��Ԫ��
 * boolean remove(Object o);ɾ��������ĳ��Ԫ��
 */
class Customer{
	String name;
	int age;
	
	Customer(String name,int age){
		this.age=age;
		this.name=name;
	}
	//��дObject�е�toString����
	public String toString(){
		return "Customer[name="+name+",age="+age+"]";
	}
}
public class CollectionTest01 {
	public static void main(String[] args) {
		//��������
		Collection c=new ArrayList();//��̬
		//���Ԫ��
		c.add(1);//�Զ�װ�䣬���Զ�ת����Integer�������͵�����
		Object o=new Object();
		c.add(o);//��ͬ������
		c.add(new Object());//����������ã����Ƕ���
		
		Customer cus=new Customer("jack",20);
		c.add(cus);
		
		//��ȡԪ�ظ���
		System.out.println(c.size());//4
		System.out.println(c.isEmpty());//�ж��Ƿ�Ϊ��,false
		//������ת����Object���͵�����
		Object[] objs=c.toArray();
		for(int i=0;i<objs.length;i++) {
			System.out.println(objs[i]);
		}
		//���
		c.clear();
		System.out.println(c.size());//0
		System.out.println(c.isEmpty());//�ж��Ƿ�Ϊ��,true
		
		
	}
}
