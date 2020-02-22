package JavaSE.OO.duoxianchen;
/*
 * 	Thread.sleep(毫秒);
 * 	sleep方法是一个静态方法
 * 	该方法作用：阻塞当前线程，腾出cpu让给其他线程
 * 
 * 	Thread.yield();
 * 	该方法是一个静态方法
 * 	该方法作用：给同一个优先级的线程让位，但是让位时间不固定，随机
 * 	和sleep方法相同，就是时间不固定
 * 
 * 	t.join();
 * 	成员方法，
 */
public class ThreadTest05 {
	public static void main(String[] args) throws InterruptedException {
		Thread t1=new Test05();
		t1.setName("t1");
		t1.start();
		//合并线程
		t1.join();//t1和主线程合并
		//阻塞主线程
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+"-->"+i);
			Thread.sleep(500);//可以抛出异常
		}
		
		//打断睡眠，通过异常打断，依靠异常处理机制
		t1.interrupt();//此时会导致t1发生InterruptedException异常
		
		//正常终止
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
				//重写的方法不能比被重写的方法抛出更广泛的异常，run方法没有抛出异常
				//所以重写之后的run方法也不能抛出异常，所以只能用try..catch..解决异常
				try {
					Thread.sleep(1000);//让当前线程阻塞1000ms=1s
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}else
			return;
		
	}
}