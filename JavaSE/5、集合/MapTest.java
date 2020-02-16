package JavaSE.OO.jihe;

import java.util.*;

/*
 * ����map�����г��õķ���
 * void clear();���map
 * boolean containKey(Object key);�ж�map���Ƿ����������key
 * boolean containValue(Object value);�ж�map���Ƿ����������value
 * Object get(Object Key);ͨ��key��ȡvalue
 * boolean isEmpty();�жϸü����Ƿ�Ϊ��
 * 
 * Object put(Object key,Object value);�򼯺�����Ӽ�ֵ��
 * Object remove(Object key);ͨ��key����ֵ��ɾ��
 * int size();��ȡmap�м�ֵ�Եĸ���
 * 
 * Set keySet();��ȡMap�����е�key
 * Collection values();��ȡmap���������е�value
 * 
 * Set entrySet();���ش�ӳ���а�����ӳ���ϵ��Set��ͼ
 * �洢��map����key���ֵ�Ԫ����Ҫͬʱ��дhashCode��equals����
 * 
 * HashMapĬ�ϳ�ʼ��������16��Ĭ�ϼ���������0.75
 * HashTableĬ�ϳ�ʼ��������11��Ĭ�ϼ���������0.75
 * java.util.properties;Ҳ����key��value��ɣ�����key��value�����ַ�������
 */
public class MapTest {
	public static void main(String[] args) {
		
		//1������map����
		Map person=new HashMap();//HashMapĬ�ϳ�ʼ��������16��Ĭ�ϼ���������0.75
		//2���洢��ֵ��
		person.put("10000", "jack");
		person.put("10011", "jack");
		person.put("10002", "SUN");
		person.put("10003", "COOK");
		person.put("10004", "KING");
		//3���жϼ�ֵ�Եĸ���
		//map�е�key�����򲻿��ظ���
		System.out.println(person.size());
		//4���жϼ������Ƿ����������key
		System.out.println(person.containsKey("10000"));//true
		//5���жϼ������Ƿ����������value
		//ע�⣺���map��key�ظ��ˣ�value���õ��Ǹ��ǡ�
		System.out.println(person.containsValue("jack"));//true
		
		//6��ͨ��key��ȡvalue
		String k="10011";
		Object v=person.get(k);
		System.out.println(v);
		//7��ͨ��keyɾ����ֵ��
		person.remove("10002");
		System.out.println(person.size());
		//8����ȡ���е�value
		Collection values=person.values();
		Iterator it1=values.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		//9����ȡ���е�key
		//����map����
		Set keys=person.keySet();
		Iterator it2=keys.iterator();
		while(it2.hasNext()) {
			Object id=it2.next();
			Object name=person.get(id);
			System.out.println(id+"->"+name);
		}
		//10��entrySet
		//��mapת����Set����
		Set e=person.entrySet();
		Iterator it3=e.iterator();
		while(it3.hasNext()) {
			System.out.println(it3.next());
		}
		
		//Properties
		//1���������������
		Properties p=new Properties();
		//2����
		p.setProperty("drive", "jdbc");
		p.setProperty("username", "scott");
		p.setProperty("password", "tiger");
		p.setProperty("url", "jdbc");
		//key�����ظ�������ظ���value����
		//3��ȡ��ͨ��key��ȡvalue
		String v1=p.getProperty("drive");
		String v2=p.getProperty("username");
		String v3=p.getProperty("password");
		String v4=p.getProperty("url");
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
	}
}
