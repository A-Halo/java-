package JavaSE.OO.duoxianchen;
/*
 * 类锁，类只有一个，所以锁是类级别，只有一个
 */
public class ThreadTest09 {
	public static void main(String[] args) throws InterruptedException {
		Thread t1=new Thread(new Test09());
		Thread t2=new Thread(new Test09());
		t1.setName("t1");
		t2.setName("t2");
		
		t1.start();
		//延迟，保证t1先执行
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
	//synchronized添加到静态方法上，线程执行此方法的时候会找类锁
	public synchronized static void m1() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("m1....");
	}
	//不会等m1结束，因为该方法没有被synchronized修饰
	/*
	public static void m2() {
		System.out.println("m2....");
	}
	*/
	//m2方法等m1结束之后才能执行，该方法有synchronized
	//线程执行该代码需要类锁，而类锁只有一个
	public synchronized static void m2() {
		System.out.println("m2....");
	}
}