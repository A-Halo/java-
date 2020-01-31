package JavaSE.OO.fangfa;
/*
 * ���������ػ���Overload
 * 	��������ʱ����������ͬ���������Ͳ�ͬ
 * 	�������Ͳ�ͬ�����÷�����ͬ����ʱ���������������ˣ��������ǲ�������������
 * 1��ʲôʱ��ʹ�÷�������
 * 		��������ʱ���������÷�������ͬ
 * 2��ʲô��������֮�󹹳ɷ�������
 * 		��ͬһ����֮�з�������ͬ��
 * 		�����б�ͬ��������ͬ��˳��ͬ���������Ͳ�ͬ
 * 3���������غ�ʲô�й�ϵ����ʲôû��ϵ
 * 		�������غͷ������Ͳ����б��йأ��ͷ���ֵ���ͣ����η��б��޹أ�
 */
public class OverloadTest {
	public static void main(String[] args) {
		int result1=sum(1,2);
		System.out.println(result1);
		double result2=sum(1.0,2.0);
		System.out.println(result2);
		long result3=sum(1L,2L);
		System.out.println(result3);
	}
	public static int sum(int a,int b) {
		int z=a+b;
		return z;
	}
	public static double sum(double a,double b) {
		double z=a+b;
		return z;
	}
	public static long sum(long a,long b) {
		long z=a+b;
		return z;
	}
	//������ͬ
	public static void m1() {}
	public static void m1(int a) {}
	//˳��ͬ
	public static void m2(int a,double b) {}
	public static void m2(double b,int a) {}
	//�������Ͳ�ͬ
	public static void m3(int a) {}
	public static void m3(double a) {}
}
