package JavaSE.OO.duoxianchen;
/*
 * ��java������ʵ�ֶ��̵߳ĵ�һ�ַ�ʽ��
 * 	�̳�java.lang.Thread;
 * 	��дrun����
 * ��ζ����߳�
 * ��δ����߳� 
 * ��������߳�
 */
public class ThreadTest01 {
	public static void main(String[] args) {
		//�����߳�
		Thread t=new Processor();//��̬
		
		//����
		t.start();//����jvm�ٷ���һ���µ�ջ��t�߳�
				  //run����Ҫ����Ա�ֶ����ã�ϵͳ�߳�����֮���Զ�����run
		//t.run();//t.run()��ֱ�ӵ��ã���ѹ��main�����ϣ�����ֻ��һ���߳�
				//t.start()���ٴ���һ��ջ����ȥ����main����������Ҫ����Աֱ�ӵ���
		//��δ��������߳�������
		for(int i=0;i<10;i++) {
			System.out.println("main-->"+i);
		}
		//���˶��߳�֮��main��������ֻ�����߳�ջ��û�з���ջ֡��
		//���������̻߳�������ջ�л���ջ֡��
		//main�������������򻹿�������
	}
}
//����һ���̣߳�Processor���¼̳��̣߳�������Ҳ��һ���̣߳����Կ���ʹ�ö�̬
class Processor extends Thread{
	//��дrun����
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("run-->"+i);
		}
	}
}
