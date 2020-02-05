package JavaSE.OO.guanjianzi;
/*
 * super用在构造方法中
 * 构造方法不能被继承，但不影响调用
 * 	语法：super(实参);
 * 	作用：通过子类的构造方法区调用父类的构造方法
 * 一个构造方法第一行如果没有this();也没有显示的区调用super(),系统会默认调用super();
 * super()的调用只能放在构造方法的第一行
 * super()和this()不能共存
 * super()调用了父类中的构造方法，但是并不会创建父类对象，只给当前子类对象赋值
 * 
 * 在java语言中只要创建java对象，则object中的无参数的构造方法一定会执行
 * 
 * 构造方法执行不一定创建对象
 * 
 * 单例模式缺点:构造方法私有化，单例模式的类型无法被继承，没有子类
 */
//账户
class Account{
	private String actno;
	private double balance;//余额
	//构造方法
	public Account(){
		System.out.println("Account的无参数构造方法执行");
	}
	public Account(String actno,double balance) {
		this.actno=actno;
		this.balance=balance;
	}
	//set和get方法
	public void setActno(String actno) {
		this.actno=actno;
	}
	public String getActno() {
		return actno;
	}
	public void setBalance(Double balance) {
		this.balance=balance;
	}
	public double getbalance() {
		return balance;
	}
}
//信用卡
class DebitAccount extends Account{
	//独特属性信誉度
	private double debit;
	public DebitAccount(String actno,double balance,double debit) {
		//通过子类的构造方法区调用父类的构造方法，作用是给当前子类型对象中的父类型对象赋值
		super(actno,balance);//不会创建对象，只赋值
	}
	//构造方法，无参数
	public DebitAccount() {
		//super();//系统默认加了super
		super("账号",111.0);
		//System.out.println("DebitAccount的无参构造方法执行");
	}
	//set和get方法
	public double getDebit() {
		return debit;
	}

	public void setDebit(double debit) {
		this.debit = debit;
	}
	
}
public class SuperTest02 {
	public static void main(String[] args) {
		DebitAccount da=new DebitAccount();//系统默认加super,加super则执行的是Account的构造方法
		
	}
}
