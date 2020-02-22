package JavaSE.OO.duoxianchen;
/*
 * 线程三个方法
 * 	获取当前线程对象Thread.currentThread();
 * 	给线程起名 t.setName("t1");
 * 	获取线程名字 t.getName();
 */
public class ThreadTest03 {
	public static void main(String[] args) {
		//如何获取当前线程对象
		Thread t=Thread.currentThread();//t保存的内存地址指向的线程是"主线程对象"
		//获取线程的名字
		System.out.println(t.getName());//main
		
		Test01 p=new Test01();
		Thread t1=new Thread(p);
		//给线程起名
		t1.setName("t1");
		t1.start();
	}
}
class Test01 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread t=Thread.currentThread();//t保存的内存地址指向的线程是"t1线程对象"
		System.out.println(t.getName());//Thread-0
	}
	
}