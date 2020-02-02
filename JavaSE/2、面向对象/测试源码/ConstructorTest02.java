package com.node.javese.day09.test004;
/**
 * 成员变量之实例变量，属于对象级别的变量，必须先有对象才有实例变量
 * 实例变量没有手动赋值的时候，系统赋默认值，
 * 	类加载的时候只加载了代码片段，还没来得及创建对象，所以实例变量并没有初始化。
 * 实际上，实例变量的内存空间是在构造方法执行过程中完成开辟的，完成初始化的
 * 系统赋默认值也是在构造方法执行过程中完成的赋值。
 *
 */
class Account {
	
	//账号
	private String acton;//实例变量/对象变量，先有对象才有实例变量
	
	//余额                                     
	private double balance;                    
	                                           
	//无参数构造器/构造方法                    
	public Account(){                          
		                                       
	}                                          
	//有参数构造方法                           
	public Account(String s){                  
		acton = s;                             
	}                                          

	public Account(String acton, double balance) {
		super();
		this.acton = acton;
		this.balance = balance;
	}
	
	public String getActon() {
		return acton;
	}

	public void setActon(String acton) {
		this.acton = acton;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	
}

public class ConstructorTest02 {

	public static void main(String[] args) {

		//创建对象
		Account act1 = new Account();
		
		System.out.println("账户"+act1.getActon());
		System.out.println("余额"+act1.getBalance());
		
		Account act2 = new Account("110");
		
		System.out.println("账户"+act2.getActon());
		System.out.println("余额"+act2.getBalance());
		
	}

}
