package JavaSE.OO.fangfa;
/*
 *1������:
 *	����ִ�й����е��ڴ����
 *	���������ػ���
 *	�����ĵݹ����
 *	�����ڵ���ʱ����������ʱ��ʵ�ʴ��ݵ��Ǳ����б����ֵ
 */
public class MethodTest02 {
	public static void main(String[] args) {
		int a=10;
		int b=20;	
		int retValue=subInt(a,b);
		System.out.println("retvalue= "+retValue);
	}
	
	public static int subInt(int i,int j) {
		int result = i+j;
		int num=3;
		int retValue=divide(result,num);
		return retValue;
	}
	
	public static int divide(int x,int y) {
		int z=x/y;
		return z;
	}
}
