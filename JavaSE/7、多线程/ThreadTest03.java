package JavaSE.OO.duoxianchen;
/*
 * �߳���������
 * 	��ȡ��ǰ�̶߳���Thread.currentThread();
 * 	���߳����� t.setName("t1");
 * 	��ȡ�߳����� t.getName();
 */
public class ThreadTest03 {
	public static void main(String[] args) {
		//��λ�ȡ��ǰ�̶߳���
		Thread t=Thread.currentThread();//t������ڴ��ַָ����߳���"���̶߳���"
		//��ȡ�̵߳�����
		System.out.println(t.getName());//main
		
		Test01 p=new Test01();
		Thread t1=new Thread(p);
		//���߳�����
		t1.setName("t1");
		t1.start();
	}
}
class Test01 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread t=Thread.currentThread();//t������ڴ��ַָ����߳���"t1�̶߳���"
		System.out.println(t.getName());//Thread-0
	}
	
}