package JavaSE.OO.duoxianchen;
/*
 * �̵߳����ȼ�
 * 	���ȼ��ߵĻ�ȡcpuʱ��Ƭ��Զ�һЩ
 * 	���ȼ���1-10
 * 	��� 1 ��� 10 Ĭ�� 5
 */
public class ThreadTest04 {
	public static void main(String[] args) {
		Thread t1=new Test02();
		t1.setName("t1");
		
		Thread t2=new Test02();
		t1.setName("t2");
		
		//��ȡ���ȼ�
		System.out.println(t1.getPriority());//5
		System.out.println(t2.getPriority());//5
		//�������ȼ�
		t1.setPriority(1);
		t2.setPriority(10);
		//����
		t1.start();
		t2.start();
	}
}
class Test02 extends Thread{
	public void run() {
		for(int i=0;i<50;i++) {
			System.out.println(Thread.currentThread().getName()+"-->"+i);
		}
	}
}