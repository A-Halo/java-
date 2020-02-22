package JavaSE.OO.duoxianchen;
/*
 * 线程的同步
 * 使用线程同步锁
 */

public class ThreadTest07 {
	public static void main(String[] args) {
		//先创建一个公共的账户
		Account1 act=new Account1("actno--001",5000.0);
		//创建线程对同一个账户取款
		Test07 p=new Test07(act);
		Thread t1=new Thread(p);
		Thread t2=new Thread(p);
		
		t1.start();
		t2.start();
	}
}
//取款线程
class Test07 implements Runnable {
	//账户
	Account1 act;
	//构造方法
	public Test07(Account1 act) {
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
class Account1{
	private String actno;
	private double balance;
	//构造方法
	public Account1(String actno, double balance) {
		super();
		this.actno = actno;
		this.balance = balance;
	}
	public Account1() {
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
		//把需要同步的代码放到同步语句块中
		/*
		 * 原理：t1线程和t2线程
		 *t1线程执行到此处遇到synchronized关键字，就会去找this的对象锁
		 *如果找到this对象锁，则进入同步语句块中执行程序，当同步语句块中的代码执行结束之后
		 *t1线程归还this的对象锁
		 *
		 *在t1线程执行同步语句块的过程中，如果t2线程也过来执行以下代码，也去找this的对象锁
		 *但是该对象锁被t1线程持有，只能在这等待this对象多的归还
		 */
		synchronized (this) {
			double before=this.balance;
			double after=before-money;		
			//更新
			this.setBalance(after);
		}
		
	}
}