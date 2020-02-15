package JavaSE.OO.jihe;

import java.util.*;

/*
 * boolean contains(Object o);�жϼ������Ƿ����ĳ��Ԫ��
 * boolean remove(Object o);ɾ��������ĳ��Ԫ��
 * 
 * �洢�ڼ����е�Ԫ��Ӧ��ȥ��дequals����
 * remove��contains��������Ҫ�����е�Ԫ����дequals������
 * ��ΪObject�е�equals�����Ƚ��ڴ��ַ������ʵ�߼����в��ܱȽ��ڴ��ַ���ñȽ�����
 * 
 * ����remove������
 * 	1����������remove����
 * 	2�������������remove����
 */
public class CollectionTest03 {
	public static void main(String[] args) {
		//��������
		Collection c=new ArrayList();
		//Integer���ͱ���
		Integer i1=10;
		//���Ԫ��
		c.add(i1);
		//�жϼ������Ƿ����i1
		System.out.println(c.contains(i1));//true
		//contains�����ײ���õ���equals������
		Integer i2=10;//Integer��д��equals�������Ƚϵ������ݣ�i1��i2��ͬ��
		System.out.println(c.contains(i2));//true
		c.remove(i2);//equals����д��i2����i1
		System.out.println(c.size());//0
		
		Manager m1=new Manager(100,"jack");
		c.add(m1);
		System.out.println(c.contains(m1));//true
		Manager m2=new Manager(100,"jack");//Managerû����дequals������m1��m2�ڴ��ַ��һ�������Է���false
		System.out.println(c.contains(m2));//false//��дequals����֮�󣬱Ƚ����ݣ��᷵��true
		c.remove(m2);//equalsδ����д������1��equals����д������0
		System.out.println(c.size());//0
		
		//����remove������
		// 	1����������remove����
		// 	2�������������remove����
		Collection c1=new ArrayList();
		c1.add(1);
		c1.add(2);
		c1.add(3);
		//����
		Iterator it=c1.iterator();
		while(it.hasNext()) {
			
			//�Ƽ�ʹ�õ������������remove����ɾ��Ԫ��
			it.next();
			//ɾ��
			it.remove();//ͨ��������ɾ��
			
//			//ʹ�ü�������������remove����
//			Object element=it.next();
//			//ɾ��
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
	//��дequals����
	//����涨��������������ͬ����ʾͬһ��
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