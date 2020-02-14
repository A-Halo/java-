package JavaSE.OO.changyonglei;
/*
 * 关于字符串常用的方法
 * 	构造方法;
 *  charAt方法
 */
public class StringTest02 {
	public static void main(String[] args) {
		//构造方法
		String s1="abc";
		
		String s2=new String("abc");
		
		byte[] bytes= {97,98,99,100};
		String s3=new String(bytes);
		System.out.println(s3);//abcd  String已经重写了Object中的toString
		
		String s4=new String(bytes,0,2);
		System.out.println(s4);//ab
		
		char[] c1= {'a','b','c'};
		String s5=new String(c1);
		System.out.println(s5);//abc
		
		String s6=new String(c1,1,2);
		System.out.println(s6);//bc
		
		//1.char charAt(int index);
		char c0="abcdef".charAt(2);
		System.out.println(c0);//c
		
		//2.boolean endsWith(String endStr);判断是否以某一个字符串结尾
		System.out.println("HelloWpord.java".endsWith("java"));//true
		System.out.println("HelloWpord.java".endsWith("java "));//false
		
		//3.boolean equalsIgnoreCase(String anotherString);两个字符串是否相等，并且忽略大小写
		System.out.println("abc".equalsIgnoreCase("ABc"));//True
		
		//4.byte[] getBytes();转换成byte数组
		byte[] bys="abc".getBytes();
		for(int i=0;i<bys.length;i++) {
			System.out.println(bys[i]);//97,98,99
		}
		
		//5.int indexOf(String str);返回第一次出现的索引
		System.out.println("htttp://www.baidu.com/".indexOf(":/"));//5
		
		//6.int lastIndexOf(String str);返回最后一次出现的索引
		System.out.println("htttp://www.baidu.com/".lastIndexOf("com"));//18
		
		//7.int length();返回此字符串的长度
		System.out.println("abc".length());	//数组是length属性，字符串是length方法
		
		//8.String replaceAll(String s1,String s2);替换
		System.out.println("javaoracleC++javavb".replaceAll("java", "mysql"));//这个程序是四个字符串
		
		//9.String[] aplit(String s);以，分隔开
		String myTime = "2008,08,08";
		String[] ymd=myTime.split(",");
		for(int i=0;i<ymd.length;i++) {
			System.out.println(ymd[i]);
		}
		
		//重要10.Static String valueOf(Object obj);
		Object o=new Object();
		//o=null;
		System.out.println(o);
		System.out.println(String.valueOf(o));//对空指针处理了，并不是直接调用toString方法，String.valueOf(Object)这个方法对空值进行处理了
		System.out.println(o.toString());//可能会出现空指针异常
	}
}
