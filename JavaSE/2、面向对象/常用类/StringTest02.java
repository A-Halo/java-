package JavaSE.OO.changyonglei;
/*
 * �����ַ������õķ���
 * 	���췽��;
 *  charAt����
 */
public class StringTest02 {
	public static void main(String[] args) {
		//���췽��
		String s1="abc";
		
		String s2=new String("abc");
		
		byte[] bytes= {97,98,99,100};
		String s3=new String(bytes);
		System.out.println(s3);//abcd  String�Ѿ���д��Object�е�toString
		
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
		
		//2.boolean endsWith(String endStr);�ж��Ƿ���ĳһ���ַ�����β
		System.out.println("HelloWpord.java".endsWith("java"));//true
		System.out.println("HelloWpord.java".endsWith("java "));//false
		
		//3.boolean equalsIgnoreCase(String anotherString);�����ַ����Ƿ���ȣ����Һ��Դ�Сд
		System.out.println("abc".equalsIgnoreCase("ABc"));//True
		
		//4.byte[] getBytes();ת����byte����
		byte[] bys="abc".getBytes();
		for(int i=0;i<bys.length;i++) {
			System.out.println(bys[i]);//97,98,99
		}
		
		//5.int indexOf(String str);���ص�һ�γ��ֵ�����
		System.out.println("htttp://www.baidu.com/".indexOf(":/"));//5
		
		//6.int lastIndexOf(String str);�������һ�γ��ֵ�����
		System.out.println("htttp://www.baidu.com/".lastIndexOf("com"));//18
		
		//7.int length();���ش��ַ����ĳ���
		System.out.println("abc".length());	//������length���ԣ��ַ�����length����
		
		//8.String replaceAll(String s1,String s2);�滻
		System.out.println("javaoracleC++javavb".replaceAll("java", "mysql"));//����������ĸ��ַ���
		
		//9.String[] aplit(String s);�ԣ��ָ���
		String myTime = "2008,08,08";
		String[] ymd=myTime.split(",");
		for(int i=0;i<ymd.length;i++) {
			System.out.println(ymd[i]);
		}
		
		//��Ҫ10.Static String valueOf(Object obj);
		Object o=new Object();
		//o=null;
		System.out.println(o);
		System.out.println(String.valueOf(o));//�Կ�ָ�봦���ˣ�������ֱ�ӵ���toString������String.valueOf(Object)��������Կ�ֵ���д�����
		System.out.println(o.toString());//���ܻ���ֿ�ָ���쳣
	}
}
