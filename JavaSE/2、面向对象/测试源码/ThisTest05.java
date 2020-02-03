package JavaSE.OO.guanjianzi;
/*
 * 练习
 */

public class ThisTest05 {
	
	//没有static变量
	int i=10;
	//带有static的方法
	public static void doSome() {
		System.out.println("doSome");
	}
	//没有static的方法
	public void doOther() {
		System.out.println("doOther");
	}
	
	public static void method1() {
		//调用doSome
		//完整方式调用
		ThisTest05.doSome();
		//省略方式调用
		doSome();
		
		//调用doOther
		//完整方式调用
		ThisTest05 t=new ThisTest05();
		t.doOther();
		//省略方式调用
		//无
		
		//访问i
		//完整方式访问
		System.out.println(t.i);
		//省略方式访问
		//无
	}
	public void method2() {
		//调用doSome
		//完整方式调用
		ThisTest05.doSome();
		//省略方式调用
		doSome();//这里也可以用this.doSome，
				 //但是这个this引用没有意义，带有static可以用类名调用也可以用引用调用
		
		//调用doOther
		//完整方式调用
		this.doOther();
		//省略方式调用
		doOther();
		
		//访问i
		//完整方式访问
		System.out.println(this.i);
		//省略方式访问
		System.out.println(i);
	}
	public static void main(String[] args) {
		//要求编写程序调用method1
		//使用完整方式调用,类名.调用
		ThisTest05.method1();
		//使用省略方式调用
		method1();
		
		//要求编写程序调用method2
		//使用完整方式调用
		ThisTest05 t=new ThisTest05();
		t.method2();
		//使用省略方式调用
		//无
	}	
}
