package JavaSE.OO.guanjianzi;
/*
 * ��ϰ
 */

public class ThisTest05 {
	
	//û��static����
	int i=10;
	//����static�ķ���
	public static void doSome() {
		System.out.println("doSome");
	}
	//û��static�ķ���
	public void doOther() {
		System.out.println("doOther");
	}
	
	public static void method1() {
		//����doSome
		//������ʽ����
		ThisTest05.doSome();
		//ʡ�Է�ʽ����
		doSome();
		
		//����doOther
		//������ʽ����
		ThisTest05 t=new ThisTest05();
		t.doOther();
		//ʡ�Է�ʽ����
		//��
		
		//����i
		//������ʽ����
		System.out.println(t.i);
		//ʡ�Է�ʽ����
		//��
	}
	public void method2() {
		//����doSome
		//������ʽ����
		ThisTest05.doSome();
		//ʡ�Է�ʽ����
		doSome();//����Ҳ������this.doSome��
				 //�������this����û�����壬����static��������������Ҳ���������õ���
		
		//����doOther
		//������ʽ����
		this.doOther();
		//ʡ�Է�ʽ����
		doOther();
		
		//����i
		//������ʽ����
		System.out.println(this.i);
		//ʡ�Է�ʽ����
		System.out.println(i);
	}
	public static void main(String[] args) {
		//Ҫ���д�������method1
		//ʹ��������ʽ����,����.����
		ThisTest05.method1();
		//ʹ��ʡ�Է�ʽ����
		method1();
		
		//Ҫ���д�������method2
		//ʹ��������ʽ����
		ThisTest05 t=new ThisTest05();
		t.method2();
		//ʹ��ʡ�Է�ʽ����
		//��
	}	
}
