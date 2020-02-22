package JavaSE.OO.duoxianchen;
/*
 * 在java语言中实现多线程的第一种方式：
 * 	继承java.lang.Thread;
 * 	重写run方法
 * 如何定义线程
 * 如何创建线程 
 * 如何启动线程
 */
public class ThreadTest01 {
	public static void main(String[] args) {
		//创建线程
		Thread t=new Processor();//多态
		
		//启动
		t.start();//告诉jvm再分配一个新的栈给t线程
				  //run不需要程序员手动调用，系统线程启动之后自动调用run
		//t.run();//t.run()是直接调用，会压在main方法上，这样只有一个线程
				//t.start()是再创建一个栈，再去调用main方法，不需要程序员直接调用
		//这段代码在主线程中运行
		for(int i=0;i<10;i++) {
			System.out.println("main-->"+i);
		}
		//有了多线程之后，main方法结束只是主线程栈中没有方法栈帧了
		//但是其他线程或者其他栈中还有栈帧。
		//main方法结束，程序还可能运行
	}
}
//定义一个线程，Processor本事继承线程，所以它也是一个线程，所以可以使用多态
class Processor extends Thread{
	//重写run方法
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("run-->"+i);
		}
	}
}
