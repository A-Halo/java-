package JavaSE.OO.duoxianchen;
/*
 * �̵߳�ͬ��
 * δ����
 */

public class ThreadTest06 {
	public static void main(String[] args) {
		//�ȴ���һ���������˻�
		Account act=new Account("actno--001",5000.0);
		//�����̶߳�ͬһ���˻�ȡ��
		Test06 p=new Test06(act);
		Thread t1=new Thread(p);
		Thread t2=new Thread(p);
		
		t1.start();
		t2.start();
	}
}
//ȡ���߳�
class Test06 implements Runnable {
	//�˻�
	Account act;
	//���췽��
	public Test06(Account act) {
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
class Account{
	private String actno;
	private double balance;
	//���췽��
	public Account(String actno, double balance) {
		super();
		this.actno = actno;
		this.balance = balance;
	}
	public Account() {
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
		double before=this.balance;
		double after=before-money;
		
		//����
		this.setBalance(after);
	}
}