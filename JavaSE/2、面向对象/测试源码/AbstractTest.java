package JavaSE.OO.lei;
/*
 * �����ࣺ
 * 	1����ζ��������
 * 		classǰ���abstract
 * 	2���������޷���ʵ����
 * 	3����Ȼ������û�а취ʵ���������ǳ�����Ҳ�й��췽�����ù��췽���Ǹ����ഴ�������õ�
 * 	4���������п��Զ�����󷽷���
 * 		�﷨���ڷ��������η��б������abstract�ؼ��֣����ҳ��󷽷�Ӧ����";"���������ܴ���"{}"
 * 		���磺public abstract void m1();
 * 	5���������в�һ���г��󷽷��������󷽷���������ڳ�������
 * 	6��һ���ǳ������̳г����࣬������д���߸��ǳ������еĳ��󷽷�
 * 	7�������಻�ܱ�final���Σ����󷽷�Ҳ���ܱ�final���Σ�abstract��final�ؼ��ֲ��ܹ���
 */
//����һ��������A
abstract class A{
	public A() {
		System.out.println("A...");
	}
	//���󷽷�
	public abstract void m1();
}
class B extends A{
	public void m1() {
		
	}
	public B() {
		System.out.println("B...");
	}
}
public class AbstractTest {
	public static void main(String[] args) {
		//�������޷���������
		//A a=new A();
		//��̬
		A a=new B();
	}
}
