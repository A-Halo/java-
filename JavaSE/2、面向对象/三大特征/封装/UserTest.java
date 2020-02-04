package com.node.javese.day09.test003;
/**
 * 封装步骤
 * 1.属性私有化,用private关键字
 * 2.提供简单操作入口
 * 
 * 访问属性两种方式
 * 1.读取 get 
 * 2.修改 set
 * 
 * get方法命名规范(读取有返回值)
 * public int getAge(){
 * 		return age;
 * }
 * 
 * set方法命名规范(修改无返回值)
 * public void getAge(int a){
 * 		age = a;
 * }
 *
 *setter and getter方法无static关键字
 *有static关键字调用：类名.方法名(实参)
 *无static关键字调用：引用.方法名(实参)
 */
class User {
	
	private int age;
	
	public void setAge(int a) {
		if(a<0||a>150) {
			System.out.println("不合法");
			return;
		}
		age = a;
	}

	public int getAge() {
		return age;
	}
}

public class UserTest {

	public static void main(String[] args) {

		User user = new User();
		//System.out.println(user.age);
		//修改
		user.setAge(-100);
		//读取
		System.out.println(user.getAge());
	}

}
