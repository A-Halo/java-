package JavaSE.OO.jihe;

import java.util.*;

/*
 * ���ڼ��Ϲ�����java.util.Collections;��
 * java.util.Collection;���Ͻӿ�
 */
public class CollectionsTest {
	public static void main(String[] args) {
		//ʹ��Collections������ɼ�������
		List l=new ArrayList();
		//���Ԫ��
		l.add(10);
		l.add(5);
		l.add(9);
		l.add(20);
		l.add(30);
		//����
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		
		for(Iterator it=l.iterator();it.hasNext();) {
			System.out.println(it.next());
		}
		
		Iterator it=l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//����
		Collections.sort(l);
		//����
		it=l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//����Set����,
		Set s=new HashSet();
		s.add(1);//�Զ�װ�䣬Integer implements Comparable
		s.add(6);
		s.add(5);
		s.add(2);
		//��Set��������sort���ܶ�Set��������
		//Collections.sort(s);
		//��Setת����list
		List lists=new ArrayList(s);
		Collections.sort(lists);
		//����
		it=lists.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//����List���ϣ�List�����д洢Person���ͣ��Ƿ��������
		//Collections��������Զ�List�����е�Ԫ�ؽ������򣬵��Ǽ����е�Ԫ�ر����ǿɱȽϵģ�ʵ��Comparable�ӿ�
//		List ps=new ArrayList();
//		ps.add(new Person());
//		ps.add(new Person());
//		Collections.sort(ps);
		//��ArrayList����ת�����̰߳�ȫ��
		List myList=new ArrayList();
		Collections.synchronizedList(myList);
	}
}
class Person{
	
}