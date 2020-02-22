package JavaSE.OO.duoxianchen;
/*
 * 线程的优先级
 * 	优先级高的获取cpu时间片相对多一些
 * 	优先级：1-10
 * 	最低 1 最高 10 默认 5
 */
public class ThreadTest04 {
	public static void main(String[] args) {
		Thread t1=new Test02();
		t1.setName("t1");
		
		Thread t2=new Test02();
		t1.setName("t2");
		
		//获取优先级
		System.out.println(t1.getPriority());//5
		System.out.println(t2.getPriority());//5
		//设置优先级
		t1.setPriority(1);
		t2.setPriority(10);
		//启动
		t1.start();
		t2.start();
	}
}
class Test02 extends Thread{
	public void run() {
		for(int i=0;i<50;i++) {
			System.out.println(Thread.currentThread().getName()+"-->"+i);
		}
	}
}