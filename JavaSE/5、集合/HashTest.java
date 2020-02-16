package JavaSE.OO.jihe;

import java.util.*;

/*
 * ��ϣ������͵�������Ľ��
 * ��ϣ������һ�����飬ֻ������������е�ÿһ��Ԫ�����ǵ�������
 * 
 * set���ϣ�HashSet
 * 1��HashSet�ײ�ʵ������һ��HashMap��HashMap�ײ������Hash�����ݽṹ
 * 2��hash���ֽ�ɢ�б���ϣ��ײ���һ�����飬���������ÿһ��Ԫ����һ����������
 * ÿ������������һ����һ�޶���hashֵ�����������±꣬��ĳ�����������е�ÿһ���ڵ�
 * ��hashֵ����ȵģ�hashֵʵ������key����hashCode��������ͨ��hash functionת���ɵ�ֵ
 * 3��������ϣ�������Ԫ�أ�
 * 		�ȵ��ñ��洢��key��hashCode����������ĳ���㷨�ó�hashֵ����������hash���в��������hash
 * 		ֵ����ֱ�Ӽ���Ԫ�أ������hashֵ�Ѿ����ڣ����������key֮���equals���������equals����
 * 		����false���򽫸�Ԫ����ӣ����equals��������true���������Ӹ�Ԫ��
 * 4��HashSet��ʵ��HashMap�е�key���֡�HashSet���ص�HashMap�е�key������ͬ���ص�
 * 5��HashSet��HashMap��ʼ��������16��Ĭ�ϼ���������0.75
 * 
 * ������Set�����д洢��Ԫ�أ���Ԫ�ص�hashCode��equals����
 * 	HashMap����һ��put������put(key,value) key�����򲻿��ظ���
 * �洢��HashSet���ϻ���HashMap����Key���ֵ�Ԫ�أ���Ҫͬʱ��дhashCode��equals����
 */
public class HashTest {
	public static void main(String[] args) {
		
		//����Set����
		Set s=new HashSet();
		
		//���򲻿��ظ�
		s.add(1);
		s.add(1);
		
		s.add(100);
		s.add(85);
		s.add(88);
		
		//����
		Iterator it=s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//��������
		Set es=new HashSet();
		
		Employee e1=new Employee("1000","jack");
		Employee e2=new Employee("1001","jack");
		Employee e3=new Employee("2000","SCOT");
		Employee e4=new Employee("2001","SUM");
		Employee e5=new Employee("3000","JIM");
		Employee e6=new Employee("3001","COOK");
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		//���Ԫ��
		es.add(e1);
		es.add(e2);
		es.add(e3);
		es.add(e4);
		es.add(e5);
		es.add(e6);
		//�鿴����Ԫ�ظ���
		System.out.println(es.size());
	}
}

class Employee{
	//��ŷ�Χ��1000-9999
	String no;
	//����
	String name;
	//���췽��
	public Employee(String no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	//��дequals����
	//���Ա�����������ͬ����ͬһ������
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
	//��дHashCode����
	public int hashCode() {
		//��Ա����ŷ���
		return no.hashCode();
	}
}
