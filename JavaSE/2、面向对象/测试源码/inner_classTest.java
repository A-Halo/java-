package JavaSE.OO.lei;
/*
 * �ڲ��ࣺ
 * �ڲ�����Ҫ�������ǿ��Է����ⲿ����˽�е�����
 * 	1����̬�ڲ���
 * 		��̬�ڲ�����Ե�ͬ������̬����
 * 		��̬�ڲ������ֱ�ӷ����ⲿ��ľ�̬���ݣ��޷�ֱ�ӷ��ʳ�ʵ������
 * 	2����Ա�ڲ���
 * 		��Ա�ڲ�����Ե�ͬ������Ա����
 * 		��Ա�ڲ����в����о�̬����
 * 		��Ա�ڲ�����Է����ⲿ����������
 * 	3���ֲ��ڲ���
 * 		�ֲ��ڲ�����Ե�ͬ�����ֲ�����
 * 		�ֲ��ڲ��಻�����÷��ʿ���Ȩ�����η�����
 * 		�ֲ��ڲ��಻�����о�̬����
 * 		�ص㣺���ֲ��ڲ����ڷ��ʾֲ�������ʱ�򣬾ֲ���������ʹ��final����
 * 	4�������ڲ���
 * 		ָ������û������
 * 		�ܹ��ٶ���һ���࣬���ǲ����ظ�����
 */
public class inner_classTest {
	//��̬����
	private static String s1="A";
	//ʵ������
	private String s2="B";
	//��̬����
	private static void m1() {
		System.out.println("static's m1 method execute");
	}
	//ʵ������
	private void m2() {
		System.out.println("m2 method execute");
	}
	
	//��̬�ڲ���
	//�����÷��ʿ���Ȩ�޵����η����Σ�public protected private ȱʡ
	static class InnerClass{
		//���徲̬����
		public static void m3() {
			System.out.println(s1);
			//System.out.println(s2);
			m1();
			//m2();
		}
		//����ʵ������
		public void m4() {
			System.out.println(s1);
			//System.out.println(s2);
			m1();
			//m2();
		}
	}
	//��Ա�ڲ���
	class InnerClass02{
		//���ܶ��徲̬�����;�̬����
		//public static void m3() {}
		//����ʵ������
		public void m4() {
			System.out.println(s1);
			System.out.println(s2);
			m1();
			m2();
		}
	}
	//�ֲ��ڲ���
	//����
	public void m5() {
		//�ֲ�����������Ҫ��final����
		final int i=10;
		//�ֲ��ڲ���
		//�ֲ��ڲ��಻�����÷��ʿ���Ȩ�����η�����
		class InnerClass{
			//�������о�̬����
			//public static void m1() {}
			public void m2() {
				//���ڲ�����ʱ�������Ҫ����������
				System.out.println(i);
			}
		}
		//����m2
		InnerClass inner=new InnerClass();
		inner.m2();
	}
	//�����ڲ���
	//��̬����
	public static void test(CustomerService cs) {
		cs.logout();
	}
	
	//���
	public static void main(String[] args) {
		//��̬�ڲ���
		//����m3
		inner_classTest.InnerClass.m3();
		//����m4
		InnerClass inner=new inner_classTest.InnerClass();
		inner.m4();
		
		//��Ա�ڲ���
		//�����ⲿ�����
		inner_classTest oc=new inner_classTest();
		InnerClass02 inner02 = oc.new InnerClass02(); 
		inner02.m4();
		
		//�ֲ��ڲ���
		inner_classTest o=new inner_classTest();
		o.m5();
		
		//�����ڲ���
		//����test����
		//test(new CustomerServiceImpl());
		//�����ڲ���ķ�ʽ����test����
		//CustomerService() {}���Ǹ������ڲ���
		test(new CustomerService() {
			public void logout() {
				System.out.println("ϵͳ�˳�");
			}
			
		});
	}
}
//�ӿ�
interface CustomerService{
	//�˳�ϵͳ
	void logout();
}
//��дһ����ʵ��CustomerService�ӿ�
/*
class CustomerServiceImpl implements CustomerService{
	public void logout() {
		System.out.println("�˳�ϵͳ");
	}
}
*/