package JavaSE.OO.jihe;

import java.util.*;

/*
 * ������ǿforѭ��
 * 	�﷨
 * 	for(���� ����:������/������){
 * 	}
 * 	������Ҫʹ����ǿforѭ�������﷨��������Ҫʹ�÷���
 * 	����ʹ�÷��ͣ���Ҫ��Object���������弯���е�Ԫ��
 * 
 * ȱ�㣺û���±�
 */
public class ForeachTest {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,6,7,0};
		//����
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		//foreach
		for(int e:a) {//int e������Ǽ��ϻ��������е�ÿһ��Ԫ��
			System.out.println(e);
		}
		//����
		Set<String> strs =new HashSet<String>();
		strs.add("����");
		strs.add("����");
		strs.add("����");
		//����
		for(String name:strs) {
			System.out.println(name);
		}
		//����δʹ�÷���
		List l=new ArrayList();
		l.add(1);
		l.add(2);
		l.add(3);
		//��δʹ�÷��ͣ�Ӧ����Object���Ͷ���
		for(Object e:l) {
			System.out.println(e);
		}
		
		String[] ins= {"��","��","rap"};
		StringBuffer sb=new StringBuffer();
		/*
		for(int i=0;i<ins.length;i++) {
			if(i==ins.length-1) {
				sb.append(ins[i]);
			}else {
				sb.append(ins[i]);
				sb.append(",");
			}
		}
		*/
		//���ϵ�ѭ�����ʺ�ʹ����ǿfor
		for(String s:ins) {
			sb.append(s);
			sb.append(",");
		}
		//�ٽص�","
		System.out.println(sb.substring(0,sb.length()-1));
		System.out.println(sb);
	}
}
