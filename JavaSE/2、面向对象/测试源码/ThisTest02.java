package JavaSE.OO.guanjianzi;
/*
 * �ڴ���static�ķ����в���"ֱ��"����ʵ��������ʵ������
 * ��Ϊʵ��������ʵ����������Ҫ����Ĵ���
 * ��static��������û��this�ģ�Ҳ����˵��ǰ���󲻴���
 * 
 */
public class ThisTest02 {
	
	//ʵ��������ֻ��ͨ�����÷�ʽ����
	int num=10;
	
	//����static�ؼ��ֵķ���
	public static void main(String[] args) {
		
		//û�е�ǰ����this
		//���ʵ�ǰ�����num����
		//System.out.println(num);�������
		
		//�����num
		ThisTest02 t=new ThisTest02();
		System.out.println(t.num);
		
		//����doSome����������static
		ThisTest02.doSome();
		doSome();
		
		//����doOther������������static��ʵ������,����.����
		ThisTest02 tt=new ThisTest02();
		tt.doOther();
		
		//����run������
		tt.run();//���ʱ��run�����е�doOther��ʾtt���õ�
	}
	
	public static void doSome() {
		System.out.println("doSome");
	}
	//ʵ������
	public void doOther() {
		System.out.println("doOther");
	}
	//ʵ������
	public void run() {
		
		System.out.println("run");
		
		//run��ʵ������������run����һ���ж������
		//һ�����ȴ�����һ��������ܵ���run����
		//����doOther��doOtherʵ��������
		doOther();//��ʾ���õ�ǰ�����doOther����
	}
}
