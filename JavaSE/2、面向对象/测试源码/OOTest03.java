package JavaSE.OO.lei;

class Customer{
	int id;
}
public class OOTest03 {
	public static void main(String[] args) {
		Customer c=new Customer();
		System.out.println(c.id);
		c=null;
		//以下程序编译可以通过，因为符合语法
		//运行时会出现空指针异常
		//空引用访问“实例”相关的数据一定会出现空指针异常
		// java.lang.NullPointerException
		System.out.println(c.id);
	}
}
//实例相关的数据表示：这个数据访问的时候必须要有对象的参与，这种数据就是实例相关的数据
