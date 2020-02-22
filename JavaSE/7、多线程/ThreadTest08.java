package JavaSE.OO.duoxianchen;
/*
 * �̵߳�ͬ��
 * synchronized�ؼ�����ӵ���Ա������
 */

public class ThreadTest08 {
	public static void main(String[] args) {
		//�ȴ���һ���������˻�
		Account2 act=new Account2("actno--001",5000.0);
		//�����̶߳�ͬһ���˻�ȡ��
		Test08 p=new Test08(act);
		Thread t1=new Thread(p);
		Thread t2=new Thread(p);
		
		t1.start();
		t2.start();
	}
}
//ȡ���߳�
class Test08 implements Runnable {
	//�˻�
	Account2 act;
	//���췽��
	public Test08(Account2 act) {
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
class Account2{
	private String actno;
	private double balance;
	//���췽��
	public Account2(String actno, double balance) {
		super();
		this.actno = actno;
		this.balance = balance;
	}
	public Account2() {
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
	//synchronized�ؼ�����ӵ���Ա�����ϣ��߳����ߵ�Ҳ��this�Ķ�����
	public synchronized void withdraw(double money) {//�Ե�ǰ�˻�����ȡ��
		double before=this.balance;
		double after=before-money;
		
		//����
		this.setBalance(after);
	}
}