package JavaSE.OO.lei;
/*
 * Object类:
 * 	2、equals方法：
 * 		public boolean equals(Object obj){
 * 			return (this==obj);
 * 		}
 * 		o1.equals(o2);o1是this,o2是obj
 * 		==两边如果是引用类型，则比较内存地址，地址相同，返回ture，反之false
 * 		object中的equals方法比较的是两个引用的内存地址
 * 		java对象中的equals方法设计目的是判断两个对象是否一样
 * 		equals方法比较的是内存地址，在现实业务中，应该比较内容
 * 		所以equals方法往往需要重写
 * 关于java语言中如何比较两个字符串是否一致
 * 		不能用双等号，只能调用String类中的equals方法
 * 3、finalize方法
 * 		垃圾回收器（Garbage Collection），也叫GC
 * 		finalize方法每个java对象都有，
 * 		finalize方法不需要程序员去调用，由系统自动调用，
 * 		java对象如果没有更多的引用指向它，则该java对象成为垃圾数据，等待垃圾回收器的回收
 * 		垃圾回收器在回收这个java对象之前会自动调用该对象的finalize方法	
 * 4、hashCode方法
 * 		返回的是该对象的哈希码值
 * 		java对象的内存地址经过哈希算法得出int类型的数值
 */
class Star{
	//身份证号
	int id;
	//姓名
	String name;
	
	public Star(int id,String name) {
		this.id=id;
		this.name=name;
	}
	//需求若身份证号一致，名字一致则相同一个人
	public boolean equals(Object obj) {
		if(this==obj) return true;
		if(obj instanceof Star) {
			Star s=(Star)obj;//强制类型转换
			if(s.id==this.id && s.name.equals(name)) {//比较字符串
				return true;
			}
		}
		return false;
	}
}
public class ObjectTest02 {
	public static void main(String[] args) {
		Object o1=new Object();
		Object o2=new Object();
		
		boolean b1=o1.equals(o2);
		System.out.println(b1);//false
		
		Star s1=new Star(100,"zhangsan");
		Star s2=new Star(100,"zhangsan");
		System.out.println(s1.equals(s2));//false
		
		//比较两个字符串是否相等
		String a1=new String("ABC");
		String a2=new String("ABC");
		System.out.println(a1==a2);//false
		//String以及重写了object中的equals方法，比较的是内容
		System.out.println(a1.contentEquals(a2));//false
		
		ObjectTest02 t=new ObjectTest02();
		System.out.println(t.hashCode());//1389133897
	}
}
