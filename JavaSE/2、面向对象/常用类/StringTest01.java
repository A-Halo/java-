package JavaSE.OO.changyonglei;
/*
 * java.lang.String;是字符串类型
 * 	1、字符串一旦创建不可再改变。"abc"字符串对象一旦创建，不可再改变成"abcd"
 * 	2、提升字符串的访问效率，在程序中使用了缓存技术。所以在java中所有使用双引号括起来
 *     的字符串都会在"字符串常量池"中创建一份。字符串常量池在方法区中被存储
 *  3、在程序执行过程中，如果程序用到某个字符串，例如"abc",那么程序会在字符串常量池中去搜索
 *     该字符串，如果没有找到则在字符串常量池中新建一个"abc"字符串，如果找到就直接拿过来用。
 *     字符串常量池是一个缓存区，为了提高访问字符串的效率
 */
public class StringTest01 {
	public static void main(String[] args) {
		//创建一个"abc"字符串对象，该对象的内存地址，让s1变量保存。
		//s1是一个引用，s1指向"abc"对象
		String s1="abc";
		
		//可以让s1重新指向吗？s1是局部变量，s1前边没有final，所以s1可以重新指向
		//但是"def"字符串本身不可变
		//s1指向"abc"对象，然后又指向"def"对象，"abc""def"对象本身没有变
		s1="def";
		
		String s2="hello";//在字符串常量池中创建
		String s3="hello";//在字符串常量池中引用
		System.out.println(s2==s2);//true,在字符串常量池中的地址相同
		
		//比较两个字符串是否相等，不能用"=="
		String s4=new String("abc");
		String s5=new String("abc");
		System.out.println(s4==s5);//false
		//比较两个字符串是否相等，必须使用String类提供的equals方法
		System.out.println(s4.equals(s5));//true
		
		//以下程序执行结束之后，会在字符串常量池中创建3个字符串对象
		String s6="aaa";
		String s7="bbb";
		String s8=s6+s7;
//		分析以下程序创建对象的区别
//		 s9只会在字符串常量池中创建一个"abc"字符串对象
//		 s10会在字符串常量池中创建一个"hello"字符串对象，并且会在堆中再创建一个字符串对象
//		 第二种方式比较浪费内存，常用第二种
//		 使用String的时候应该注意的问题：尽量不要做字符串频繁拼接的操作
//		 因为字符串一旦创建就不可改变，只要频繁拼接，就会在字符串常量池中创建大量的字符串对象，给垃圾回收带来问题
		String s9="abc";//存在方法区中的字符串常量池
		String s10=new String("hello");//在堆内存中创建String对象，也会在字符串常量池中创建"hello"对象
		
		//判断以下程序创建了几个对象
		//堆中两个，方法区中字符串常量池中一个，一共三个
		String s11=new String("abcd");
		String s12=new String("abcd");

	}
}
