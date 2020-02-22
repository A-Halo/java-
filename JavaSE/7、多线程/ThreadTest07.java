package JavaSE.OO.duoxianchen;
/*
 * �̵߳�ͬ��
 * ʹ���߳�ͬ����
 */

public class ThreadTest07 {
	public static void main(String[] args) {
		//�ȴ���һ���������˻�
		Account1 act=new Account1("actno--001",5000.0);
		//�����̶߳�ͬһ���˻�ȡ��
		Test07 p=new Test07(act);
		Thread t1=new Thread(p);
		Thread t2=new Thread(p);
		
		t1.start();
		t2.start();
	}
}
//ȡ���߳�
class Test07 implements Runnable {
	//�˻�
	Account1 act;
	//���췽��
	public Test07(Account1 act) {
		super();
		this.act = act;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		act.withdraw(1000.0);
		System.out.println("ȡ��ɹ�����"+act.getBalance());
	}
	
	
}
//�˻�
class Account1{
	private String actno;
	private double balance;
	//���췽��
	public Account1(String actno, double balance) {
		super();
		this.actno = actno;
		this.balance = balance;
	}
	public Account1() {
		super();
	}
	//get��set����
	public String getActno() {
		return actno;
	}
	public void setActno(String actno) {
		this.actno = actno;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	//�����ṩһ��ȡ��ķ���
	public void withdraw(double money) {//�Ե�ǰ�˻�����ȡ��
		//����Ҫͬ���Ĵ���ŵ�ͬ��������
		/*
		 * ԭ��t1�̺߳�t2�߳�
		 *t1�߳�ִ�е��˴�����synchronized�ؼ��֣��ͻ�ȥ��this�Ķ�����
		 *����ҵ�this�������������ͬ��������ִ�г��򣬵�ͬ�������еĴ���ִ�н���֮��
		 *t1�̹߳黹this�Ķ�����
		 *
		 *��t1�߳�ִ��ͬ������Ĺ����У����t2�߳�Ҳ����ִ�����´��룬Ҳȥ��this�Ķ�����
		 *���Ǹö�������t1�̳߳��У�ֻ������ȴ�this�����Ĺ黹
		 */
		synchronized (this) {
			double before=this.balance;
			double after=before-money;		
			//����
			this.setBalance(after);
		}
		
	}
}