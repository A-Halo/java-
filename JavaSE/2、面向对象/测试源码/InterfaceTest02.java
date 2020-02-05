package JavaSE.OO.jiekou;
/*
 * 接口的作用
 * 	1、可以使项目分层，所有层都面向接口开发，开发效率提高
 * 	2、接口使代码和代码之间的耦合度降低
 * 	3、接口和抽象类都能完成某个功能，优先选择接口
 * 		因为接口可以多实现，多继承
 * 		并且一个类实现接口之外还可以继承其他类（保留了类的继承）
 */
//客户业务接口
interface CustomerService{
	//定义退出系统的方法
	void logout();
	
}
//编写接口的实现类，面向接口去实现
class CustomerServiceImpl implements CustomerService{
	//实现接口中的实现方法
	public void logout() {
		System.out.println("成功退出系统");
	}
}
public class InterfaceTest02 {
	public static void main(String[] args) {
		//要执行CustomerServiceImpl中的logout方法
		CustomerServiceImpl m=new CustomerServiceImpl();
		m.logout();
		//面向接口去调用,多态
		CustomerService cs=new CustomerServiceImpl();
		cs.logout();//编译期是接口中的logout方法，运行期是类中的实现方法
	}
}
