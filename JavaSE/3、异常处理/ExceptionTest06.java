package JavaSE.OO.yichang;
/*
 * 自定义异常：
 * 	1、编译时异常，直接继承Exception
 * 	2、运行时异常，直接继承RuntimeException
 * 完整应用
 */
//自定义 IllegalNameException无效名字异常
class IllegalNameException extends Exception{//编译时异常
//class IllegalNameException extends RuntimeException{//运行时异常	
	//定义异常一般提供两个构造方法
	public IllegalNameException(){
		
	}
	public IllegalNameException(String msg){
		super(msg);
	}
}
//顾客相关业务
class CustomerService{
	//对外提供一个注册的方法
	public void register(String name) throws IllegalNameException{
		//完成注册
		if(name.length()<6) {
			//异常
			//创建异常对象
			//IllegalNameException e=new IllegalNameException("用户名长度不能少于6位");
			//手动抛出异常
			//throw e;
			//手动抛出异常，自己处理没有意义，所以往上抛，用throws
			throw new IllegalNameException("用户名长度不能少于6位");
		}
		//如果代码能执行到此处，则用户名合法
		System.out.println("注册成功");
	}
}
//测试程序
public class ExceptionTest06 {
	public static void main(String[] args) {
		//假如用户提供的用户名如下
		String username="jack";
		//注册
		CustomerService cs=new CustomerService();
		
		try {
			cs.register(username);//有异常，解决异常
		} catch (IllegalNameException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
