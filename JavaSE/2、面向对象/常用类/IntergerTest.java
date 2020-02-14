package JavaSE.OO.changyonglei;
/*
 * java�а��ֻ����������Ͷ�Ӧ�İ�װ�ࣺ
 * ������������	��װ����
 * 	byte		java.lang.Byte;
 *  short		java.lang.Short;
 *  int			java.lang.Integer;
 *  long		java.lang.Long;
 *  
 *  float		java.lang.Float;
 *  double		java.lang.Double;
 *  
 *  boolean		java.lang.Boolean;
 *  char		java.lang.Character
 *  Ϊʲô�ṩ��װ�ࣿ
 *  Ϊ�˷���
 *  �Զ�װ��(anto_boxing)���Զ�����(auto_unboxing)
 *  �Զ�װ����Զ������ǳ������׶ε�һ������ͳ��������޹�
 *  �Զ�װ����Զ�������Ҫ��Ϊ�˷������Ա�ı���
 */
public class IntergerTest {
	//���󣺹涨m1�������Խ���java���κ�һ����������
	//m1������������Byte�������ݣ����Խ�byte���Ͱ�װ��java.lang.Byte;�ٴ��ݲ���
	public static void m1(Object o) {
		System.out.println(o);
	}
	public static int m2(Integer i1,Integer i2) {
		return i1-i2;//�Զ�����
	}
	
	public static void main(String[] args) {
		//������������
		Byte b=10;
		//��������
		Byte b1=new Byte(b);//��ʱ
		m1(b1);//Byte�Ѿ���Object�е�toString������д
		m1(10);
		
		//��ȡint�������ֵ����Сֵ
		System.out.println("int��Сֵ"+Integer.MIN_VALUE+"int���ֵ"+Integer.MAX_VALUE);
		
		//����Integer����
		Integer i1=new Integer(10);//��ʱ
		
		//��ʱ
		//int->Integer(װ��)
		//Integer i2=new Integer();
		
		//Integer->int(����)
		//int i3=i2.intValue();
		
		Integer i3=10;//�Զ�װ��
		int i4=i3;//�Զ�����
		System.out.println(i3);//"10"
		System.out.println(i4+1);//11
		
		System.out.println(m2(10,5)+1);//�Զ�װ��
		
		//�Ƚ�����Integer���͵����ݣ�������"=="
		//Integer�Ѿ���д��Object�е�equals����
		//���������(-128~127)֮�䣬java��������һ�����γ�����
		//���γ�����ֻ�洢(-128~127)֮������ݣ�����ֵ���´�������
		Integer i5=127;//�����ڶ��д�������ֱ���ڳ���������
		Integer i6=127;
		System.out.println(i5==i6);//true
		
		String s1="ab";
		String s2="ab";
		System.out.println(s1==s2);//true
	
	}
}
