package JavaSE.OO.guanjianzi;
/*
 * super�ؼ���
 * 	1��super�����������ͣ�super�д洢�Ĳ����ڴ��ַ
 * 	2��this�����ã�this�д洢�����ڴ��ַ
 * 	3��super������ǵ�ǰ��������еĸ���������
 * ʲôʱ��ʹ��super
 * 	����͸����ж���ĳ�����Ի򷽷�
 * 	����������Ҫ���ʸ���ķ�����������Ҫʹ��super
 * 	ֱ�ӷ��ʻ�Ĭ�ϼ�this.��ʾ��ǰ���е����ݣ������Ǹ����е�����
 * super��������ʲô�ط�
 * 	super��������ʵ��������
 * 	super�������ڹ��췽���У�this���ڹ��췽������this()
 * 	super�������ھ�̬�����У���Ϊû�ж���
 */
class Employee{
	String name="����";
	
	public void work() {
		System.out.println("Ա������");
	}
}

class Manager extends Employee{
	String name="����";
	//��work������д
	public void work() {
		System.out.println("������");
	}
	public void m1(){
		work();//��ʱ��ʾthis.work���������
		super.work();//��ʱ���Ա������
		System.out.println(name);//��ʾthis.name�������
		System.out.println(super.name);//�������
	}
	/*this��super��ͬ��������ֱ�����ھ�̬��������
	public static void m2() {
		System.out.println(super.name);
	}
	*/
}
public class SuperTest01 {
	public static void main(String[] args) {
		Manager m=new Manager();
		m.m1();
	}
}
