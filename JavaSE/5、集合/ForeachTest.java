package JavaSE.OO.jihe;

import java.util.*;

/*
 * 关于增强for循环
 * 	语法
 * 	for(类型 变量:数组名/集合名){
 * 	}
 * 	集合想要使用增强for循环这种语法，集合需要使用泛型
 * 	若不使用泛型，需要用Object类型来定义集合中的元素
 * 
 * 缺点：没有下标
 */
public class ForeachTest {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,6,7,0};
		//遍历
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		//foreach
		for(int e:a) {//int e代表的是集合或者数组中的每一个元素
			System.out.println(e);
		}
		//集合
		Set<String> strs =new HashSet<String>();
		strs.add("张三");
		strs.add("李四");
		strs.add("王五");
		//遍历
		for(String name:strs) {
			System.out.println(name);
		}
		//集合未使用泛型
		List l=new ArrayList();
		l.add(1);
		l.add(2);
		l.add(3);
		//若未使用泛型，应该用Object类型定义
		for(Object e:l) {
			System.out.println(e);
		}
		
		String[] ins= {"唱","跳","rap"};
		StringBuffer sb=new StringBuffer();
		/*
		for(int i=0;i<ins.length;i++) {
			if(i==ins.length-1) {
				sb.append(ins[i]);
			}else {
				sb.append(ins[i]);
				sb.append(",");
			}
		}
		*/
		//以上的循环不适合使用增强for
		for(String s:ins) {
			sb.append(s);
			sb.append(",");
		}
		//再截掉","
		System.out.println(sb.substring(0,sb.length()-1));
		System.out.println(sb);
	}
}
