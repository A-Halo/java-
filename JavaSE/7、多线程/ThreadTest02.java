package JavaSE.OO.duoxianchen;
/*
 * java��ʵ���̵߳ĵڶ��ַ�ʽ
 * 	дһ����ʵ��java.lang.Runnable;�ӿ�
 * 	ʵ��run����
 */
public class ThreadTest02 {
	public static void main(String[] args) {
		//�����߳�
		
		Thread t=new Thread(new Process());
		//����
		t.start();
	}
}
//Process����һ���̣߳�ֻ��ʵ����������ܵ��࣬���Բ����ö�̬
class Process implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			System.out.println("run-->"+i);
		}
	}
	
}