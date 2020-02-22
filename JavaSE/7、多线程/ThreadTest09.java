package JavaSE.OO.duoxianchen;
/*
 * ��������ֻ��һ�������������༶��ֻ��һ��
 */
public class ThreadTest09 {
	public static void main(String[] args) throws InterruptedException {
		Thread t1=new Thread(new Test09());
		Thread t2=new Thread(new Test09());
		t1.setName("t1");
		t2.setName("t2");
		
		t1.start();
		//�ӳ٣���֤t1��ִ��
		Thread.sleep(1000);
		t2.start();
	}
}
class Test09 implements Runnable{
	public void run() {
		
		if("t1".equals(Thread.currentThread().getName())) {
			Myclass.m1();
		}
		if("t2".equals(Thread.currentThread().getName())) {
			Myclass.m2();
		}
	}
}
class Myclass{
	//synchronized��ӵ���̬�����ϣ��߳�ִ�д˷�����ʱ���������
	public synchronized static void m1() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("m1....");
	}
	//�����m1��������Ϊ�÷���û�б�synchronized����
	/*
	public static void m2() {
		System.out.println("m2....");
	}
	*/
	//m2������m1����֮�����ִ�У��÷�����synchronized
	//�߳�ִ�иô�����Ҫ������������ֻ��һ��
	public synchronized static void m2() {
		System.out.println("m2....");
	}
}