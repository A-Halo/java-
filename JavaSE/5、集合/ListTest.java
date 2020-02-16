package JavaSE.OO.jihe;

import java.util.*;

/*
 * List���ϴ洢Ԫ�ص��ص㣺
 * ����(List�����д洢��Ԫ�����±�)�����ȥ�����˳��ȡ�����������˳��
 * ���ظ�
 * 
 * ArrayList���ϵײ������飬���������±�ģ�����ArrayList�кܶ��Լ�������
 * ArrayList����Ĭ�ϳ�ʼ��������10������֮���������ԭ������1.5��
 * Vector����Ĭ�ϳ�ʼ��������10������֮���������ԭ������2��
 * LinkListû�г�ʼ���������ײ㲻������
 * 
 * ����Ż�ArrayList��Vector��
 * 	�����������ݲ�������Ϊ������Ҫ���鿽�������鿽���ܺ��ڴ棬Ч�ʺܵ�
 * 	һ���Ƽ��������ϵ�ʱ��ָ����ʼ������
 */
public class ListTest {
	public static void main(String[] args) {
		//����һ��List����
		List l=new ArrayList();
		//���
		l.add(100);
		l.add(56);
		l.add(23);
		l.add(200);
		l.add(200);
		
		l.add(1,555);//���±�Ϊ1�ĵط����555
		//ȡ�±�ָ����Ԫ��
		System.out.println(l.get(0));//ȡ�±�Ϊ0��Ԫ��
		System.out.println("------------");
		//����(����������)
		Iterator it=l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("------------");
		//����(List�������еı�����ʽ)
		for(int i=0;i<l.size();i++) {
			Object element=l.get(i);
			System.out.println(element);
		}
	}
}
