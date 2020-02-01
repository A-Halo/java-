package JavaSE.OO.lei;
/*
 * 
 */
//用户类
class User{
	//属性【成员变量之实例变量】
	//用户编号
	//int是一种基本数据类型
	//no是一个实例变量
	int no;
	
	//用户名
	//String是一种引用数据类型，代表字符串
	//name是一个实例变量，name是一个引用
	String name;
	
	//家庭住址
	//Address是一种引用数据类型，代表家庭住址
	//addr是一个实例变量，addr是一个引用
	Address addr;
}
//地址类
class Address{
	//属性【成员变量之实例变量】
	//String是引用数据类型，city属于引用，保存地址指向堆内存对象
	//城市
	String city;
	
	//街道
	String street;
	
	//邮编
	String zipcode;
}

public class OOTest02 {
	public static void main(String[] args) {
		//创建user对象
		User u=new User();
		
		System.out.println(u.no);//0
		System.out.println(u.name);//null
		System.out.println(u.addr);//null
		//修改user对象内部实例变量的值
		u.no=10;
		u.name="jack";//jack是一个java对象，属于String对象
		
		u.addr=new Address();
		
		//Address a=new Address();作用于上一行代码相同，内存图有所改变
		//u.addr=a;
		
		//在main方法中只有一个引用u，一切只能通过u来访问
		System.out.println(u.name+"居住在哪个城市："+u.addr.city);
		u.addr.zipcode="111";
		System.out.println(u.name+"居住在哪个邮编："+u.addr.zipcode);
	}
}
