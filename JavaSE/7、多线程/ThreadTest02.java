package JavaSE.OO.duoxianchen;
/*
 * java中实现线程的第二种方式
 * 	写一个类实现java.lang.Runnable;接口
 * 	实现run方法
 */
public class ThreadTest02 {
	public static void main(String[] args) {
		//创建线程
		
		Thread t=new Thread(new Process());
		//启动
		t.start();
	}
}
//Process不是一个线程，只是实现了这个功能的类，所以不能用多态
class Process implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			System.out.println("run-->"+i);
		}
	}
	
}