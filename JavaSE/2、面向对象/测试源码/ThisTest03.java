package JavaSE.OO.guanjianzi;
/*
 * "this."用来区分局部变量和实例变量的时候不能省
 * 构造方法和get，set方法的作用
 */
class User{
	
	private int id;
	private String name;
	
	//构造函数
		public User(int id, String name) {
			this.id = id;
			this.name = name;
		}
		
	//get和set方法	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		//this.id中的id是实例变量
		this.id=id;//id是局部变量
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
}
public class ThisTest03 {
	public static void main(String[] args) {
		//构造方法和get，set方法区分
		User u=new User(100,"zhangsan");//使用构造函数创建对象
		
		System.out.println(u.getId());
		System.out.println(u.getName());
		
		//想修改名字，则用set方法修改，不用再创建一遍
		u.setName("lisi");
	}
}
