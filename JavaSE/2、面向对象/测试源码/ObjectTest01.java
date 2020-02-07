package JavaSE.OO.lei;
/*
 * Object类：
 * 	1、toString方法:返回java对象的字符串表示形式，
 * 					就是在控制台将java对象用字符串的形式表示出来
 * 		在现实开发中，object里面的toString方法已经不够用了。
 * 		因为toString方法实现结果不满意
 * 		object中的toString方法就是要被重写的
 * 		toString返回的值：类名@java对象的内存地址经过哈希算法得出的int类型值再转换成十六进制
 * 		输出结果等同卡座java对象在堆中的内存地址
 */
class Person{
	String name;
	int age;
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	//重写toString方法,例如显示格式为:Person[name="zhangsan",age=50]
	public String toString() {
		return "Person[name="+name+",age="+age+"]";
	}
}
public class ObjectTest01 {
	public static void main(String[] args) {
		//创建一个Object类型的对象
		Object o1=new Object();
		//调用toString方法
		String oStr=o1.toString();
		System.out.println(oStr);//java.lang.Object@52cc8049
		
		//创建一个Person类型的对象
		Person p1=new Person("zhangsan",20);
		//调用toString方法
		String pStr=p1.toString();
		System.out.println(pStr);//未重写：JavaSE.OO.lei.Person@27973e9b
								 //重写：Person[name=zhangsan,age=20]
		Person p2=new Person("lisi",20);
		//prnt方法后面括号中如果是一个引用类型，会默认调用引用类型的toString方法
		System.out.println(p2);//Person[name=lisi,age=20]
	}
}
