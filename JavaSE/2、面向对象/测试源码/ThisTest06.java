package JavaSE.OO.guanjianzi;

public class ThisTest06 {
	public static void main(String[] args) {
		ThisTest06.doSome();
		doSome();
		
		ThisTest06 t=new ThisTest06();
		t.doSome();
		
		//����static�ؼ��ֵķ�������ʵ�ȿ��Բ��������ķ�ʽ���ʣ�Ҳ���Բ������õķ�ʽ����
		//���Ǽ�ʹ�������õķ�ʽȥ���ʣ�ʵ��ִ�е�ʱ������õĶ����޹�
		t=null;
		t.doSome();//δ���ֿ�ָ���쳣��˵������doSomeû���õ�����
	}
	public static void doSome() {
		System.out.println("doSome");
	}
}
