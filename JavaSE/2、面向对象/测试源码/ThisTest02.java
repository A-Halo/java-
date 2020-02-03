package JavaSE.OO.guanjianzi;
/*
 * 在带有static的方法中不能"直接"访问实例变量和实例方法
 * 因为实例变量和实例方法都需要对象的存在
 * 而static方法中是没有this的，也就是说当前对象不存在
 * 
 */
public class ThisTest02 {
	
	//实例变量，只能通过引用方式调用
	int num=10;
	
	//带有static关键字的方法
	public static void main(String[] args) {
		
		//没有当前对象this
		//访问当前对象的num属性
		//System.out.println(num);编译错误
		
		//想访问num
		ThisTest02 t=new ThisTest02();
		System.out.println(t.num);
		
		//调用doSome方法，带有static
		ThisTest02.doSome();
		doSome();
		
		//调用doOther方法，不带有static，实例方法,引用.调用
		ThisTest02 tt=new ThisTest02();
		tt.doOther();
		
		//调用run方法，
		tt.run();//则此时的run方法中的doOther表示tt引用的
	}
	
	public static void doSome() {
		System.out.println("doSome");
	}
	//实例方法
	public void doOther() {
		System.out.println("doOther");
	}
	//实例方法
	public void run() {
		
		System.out.println("run");
		
		//run是实例方法，调用run方法一定有对象存在
		//一定是先创建了一个对象才能调用run方法
		//调用doOther，doOther实例方法，
		doOther();//表示调用当前对象的doOther方法
	}
}
