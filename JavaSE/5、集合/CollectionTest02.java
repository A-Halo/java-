package JavaSE.OO.jihe;

import java.util.*;

/*
 * Iterator<E> iterator;��ȡ�����������ĵ���������
 * ͨ���������еķ�����ɼ��ϵĵ���(����)
 * ���ַ�ʽ�����м���ͨ�õı�����ʽ
 */
public class CollectionTest02 {
	public static void main(String[] args) {
		//�������϶���
		Collection c=new LinkedList();
		//���Ԫ��
		c.add(100);//�Զ�װ��
		c.add(3.14);//�Զ�װ��
		c.add(false);//�Զ�װ��
		//����������
		//��ȡ����������
		//����Ҫ���ĵײ㼯�ϵľ������ͣ����м��������ĵ�������ʵ����java.util.Iterator�ӿ�
		Iterator it=c.iterator();//����������ӿڱ��
								 //it��һ�����ã��������ڴ��ַ��ָ���˶��еĵ���������
		//���÷�������ɵ���������
		//whileѭ��
		while(it.hasNext()) {
			Object element=it.next();
			System.out.println(element);
		}
		/*
		 * boolean b=it.hasNext();�ж��Ƿ��и����Ԫ�أ�����з���true
		 * Object o=it.next();�������������ƶ�һλ������ȡ��ָ���Ԫ��
		 * ����it.Next();����֮ǰ�������it.hasNext();
		 */
		//forѭ��
		for(Iterator i=c.iterator();it.hasNext();) {
			Object o=it.next();
			System.out.println(o);
		}
		
	}
}
