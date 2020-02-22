package JavaSE.OO.duoxianchen;
/*
 * 线程的同步
 * 未用锁
 */

public class ThreadTest06 {
	public static void main(String[] args) {
		//先创建一个公共的账户
		Account act=new Account("actno--001",5000.0);
		//创建线程对同一个账户取款
		Test06 p=new Test06(act);
		Thread t1=new Thread(p);
		Thread t2=new Thread(p);
		
		t1.start();
		t2.start();
	}
}
//取款线程
class Test06 implements Runnable {
	//账户
	Account act;
	//构造方法
	public Test06(Account act) {
		super();
		this.act = act;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		act.withdraw(1000.0);
		System.out.println("取款成功，余额："+act.getBalance());
	}
	
	
}
//账户
class Account{
	private String actno;
	private double balance;
	//构造方法
	public Account(String actno, double balance) {
		super();
		this.actno = actno;
		this.balance = balance;
	}
	public Account() {
		super();
	}
	//get，set方法
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
	//对外提供一个取款的方法
	public void withdraw(double money) {//对当前账户进行取款
		double before=this.balance;
		double after=before-money;
		
		//更新
		this.setBalance(after);
	}
}