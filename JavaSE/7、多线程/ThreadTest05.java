package JavaSE.OO.duoxianchen;
/*
 * 	Thread.sleep(����);
 * 	sleep������һ����̬����
 * 	�÷������ã�������ǰ�̣߳��ڳ�cpu�ø������߳�
 * 
 * 	Thread.yield();
 * 	�÷�����һ����̬����
 * 	�÷������ã���ͬһ�����ȼ����߳���λ��������λʱ�䲻�̶������
 * 	��sleep������ͬ������ʱ�䲻�̶�
 * 
 * 	t.join();
 * 	��Ա������
 */
public class ThreadTest05 {
	public static void main(String[] args) throws InterruptedException {
		Thread t1=new Test05();
		t1.setName("t1");
		t1.start();
		//�ϲ��߳�
		t1.join();//t1�����̺߳ϲ�
		//�������߳�
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+"-->"+i);
			Thread.sleep(500);//�����׳��쳣
		}
		
		//���˯�ߣ�ͨ���쳣��ϣ������쳣�������
		t1.interrupt();//��ʱ�ᵼ��t1����InterruptedException�쳣
		
		//������ֹ
		Test05 t=new Test05();
		t.run=false;
	}
}
class Test05 extends Thread{
	boolean run=true;
	public void run() {	
		if(run) {
			for(int i=0;i<10;i++) {
				System.out.println(Thread.currentThread().getName()+"-->"+i);
				//��д�ķ������ܱȱ���д�ķ����׳����㷺���쳣��run����û���׳��쳣
				//������д֮���run����Ҳ�����׳��쳣������ֻ����try..catch..����쳣
				try {
					Thread.sleep(1000);//�õ�ǰ�߳�����1000ms=1s
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}else
			return;
		
	}
}