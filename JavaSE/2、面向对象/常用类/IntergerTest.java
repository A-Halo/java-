package JavaSE.OO.changyonglei;
/*
 * java中八种基本数据类型对应的包装类：
 * 基本数据类型	包装类型
 * 	byte		java.lang.Byte;
 *  short		java.lang.Short;
 *  int			java.lang.Integer;
 *  long		java.lang.Long;
 *  
 *  float		java.lang.Float;
 *  double		java.lang.Double;
 *  
 *  boolean		java.lang.Boolean;
 *  char		java.lang.Character
 *  为什么提供包装类？
 *  为了方便
 *  自动装箱(anto_boxing)和自动拆箱(auto_unboxing)
 *  自动装箱和自动拆箱是程序编译阶段的一个概念，和程序运行无关
 *  自动装箱和自动拆箱主要是为了方便程序员的编码
 */
public class IntergerTest {
	//需求：规定m1方法可以接受java中任何一种数据类型
	//m1方法如果想接受Byte类型数据，可以将byte类型包装成java.lang.Byte;再传递参数
	public static void m1(Object o) {
		System.out.println(o);
	}
	public static int m2(Integer i1,Integer i2) {
		return i1-i2;//自动拆箱
	}
	
	public static void main(String[] args) {
		//基本数据类型
		Byte b=10;
		//引用类型
		Byte b1=new Byte(b);//过时
		m1(b1);//Byte已经将Object中的toString方法重写
		m1(10);
		
		//获取int类型最大值和最小值
		System.out.println("int最小值"+Integer.MIN_VALUE+"int最大值"+Integer.MAX_VALUE);
		
		//创建Integer对象
		Integer i1=new Integer(10);//过时
		
		//过时
		//int->Integer(装箱)
		//Integer i2=new Integer();
		
		//Integer->int(拆箱)
		//int i3=i2.intValue();
		
		Integer i3=10;//自动装箱
		int i4=i3;//自动拆箱
		System.out.println(i3);//"10"
		System.out.println(i4+1);//11
		
		System.out.println(m2(10,5)+1);//自动装箱
		
		//比较两个Integer类型的数据，不能用"=="
		//Integer已经重写了Object中的equals方法
		//如果数据在(-128~127)之间，java中引入了一个整形常量池
		//整形常量池只存储(-128~127)之间的数据，其他值重新创建对象
		Integer i5=127;//不会在堆中创建对象，直接在常量池中拿
		Integer i6=127;
		System.out.println(i5==i6);//true
		
		String s1="ab";
		String s2="ab";
		System.out.println(s1==s2);//true
	
	}
}
