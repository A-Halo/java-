package JavaSE.OO.guanjianzi;

public class ThisTest06 {
	public static void main(String[] args) {
		ThisTest06.doSome();
		doSome();
		
		ThisTest06 t=new ThisTest06();
		t.doSome();
		
		//带有static关键字的方法，其实既可以采用类名的方式访问，也可以采用引用的方式访问
		//但是即使采用引用的方式去访问，实际执行的时候和引用的对象无关
		t=null;
		t.doSome();//未出现空指针异常，说明调用doSome没有用到对象
	}
	public static void doSome() {
		System.out.println("doSome");
	}
}
