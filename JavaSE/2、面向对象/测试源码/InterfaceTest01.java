package JavaSE.OO.jiekou;
/*�����﷨
 * �ӿ�Ҳ��һ�������������ͣ����Ե�ͬ�ڿ�����
 * 	1������ӿ��﷨��
 * 		[���η�] interface �ӿ���{
 * 		}
 * 	2���ӿ���ֻ�ܳ��ֳ����ͳ��󷽷�
 * 	3���ӿ���ʵ��һ������ĳ����࣬�����ڽӿ�����ȫ�����
 * 	4���ӿ���û�й��췽�����ӿ�Ҳ�޷���ʵ����
 * 	5���ӿںͽӿ�֮����Զ�̳�
 * 	6��һ�������ʵ�ֶ���ӿڡ���ʵ�ֿ��Ե�ͬ�����̳С�
 * 	7��һ���ǳ������ʵ�ֽӿڣ���Ҫ���ӿ��е����з�����д���߽и���
 * 	
 */
interface A{
	//����(������public static final����)
	public static final String SUCCESS="success";
	public static double PI=3.1415926;
	int i=3;//public static final�ǿ���ʡ�Եģ�i���ǳ���������ʵ������
	//���󷽷�
	public abstract void m1();
	void m2();//m2�ǿ���ʡ�Ե�
}
interface B{
	void m3();
}
interface C{
	void m4();
}
//��̳�
interface D extends A,B,C{
	void m5();
}
//ʵ�ֶ�ӿڣ�����ʵ�ֽӿ������еĳ��󷽷�
//implements��ʵ�ֵ���˼����extends�̳�������ͬ
class MyClass implements A,B,C{
	public void m1() {}
	public void m2() {}
	public void m3() {}
	public void m4() {}
}
class M implements D{
	public void m1() {}
	public void m2() {}
	public void m3() {}
	public void m4() {}
	public void m5() {}
}
public class InterfaceTest01 {
	
}
