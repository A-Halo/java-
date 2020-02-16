package JavaSE.OO.jihe;
/*
 *java.util.Set;
 *	java.util.SortedSet;���費���ظ������Ǵ��ȥ��Ԫ�ؿ��԰���Ԫ�ش�С˳���Զ�����
 *		java.util.TreeSet; 
 */

import java.text.*;
import java.util.*;
//�ӵĶ���sun�ṩ��
public class SortedSetTest01 {
	
	public static void main(String[] args) throws ParseException {
		//��������
		SortedSet ss=new TreeSet();
		//���Ԫ��
		ss.add(10);//�Զ�װ��
		ss.add(20);
		ss.add(15);
		ss.add(30);
		ss.add(28);
		ss.add(9);
		//����
		Iterator it=ss.iterator();
		while(it.hasNext()) {
			Object element=it.next();
			System.out.println(element);
		}
		//String
		SortedSet strs=new TreeSet();
		strs.add("JACK");
		strs.add("SUN");
		strs.add("COOK");
		strs.add("LUCY");
		//����
		Iterator i=strs.iterator();
		while(i.hasNext()) {
			Object element=i.next();
			System.out.println(element);
		}
		//����
		String st1="2008-08-08";
		String st2="2009-08-08";
		String st3="2008-09-08";
		String st4="2008-08-09";
		String st5="2012-08-08";
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date t1=sdf.parse(st1);
		Date t2=sdf.parse(st2);
		Date t3=sdf.parse(st3);
		Date t4=sdf.parse(st4);
		Date t5=sdf.parse(st5);
		
		//���
		SortedSet times=new TreeSet();
		times.add(t1);
		times.add(t2);
		times.add(t3);
		times.add(t4);
		times.add(t5);
		
		//����
		it=times.iterator();
		while(it.hasNext()) {
			Object element=it.next();
			if(element instanceof Date) {
				Date d=(Date)element;
				System.out.println(sdf.format(d));
			}
			
		}
	}
}
