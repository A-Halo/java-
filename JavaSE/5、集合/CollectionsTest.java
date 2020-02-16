package JavaSE.OO.jihe;

import java.util.*;

/*
 * 关于集合工具类java.util.Collections;类
 * java.util.Collection;集合接口
 */
public class CollectionsTest {
	public static void main(String[] args) {
		//使用Collections工具完成集合排序
		List l=new ArrayList();
		//添加元素
		l.add(10);
		l.add(5);
		l.add(9);
		l.add(20);
		l.add(30);
		//遍历
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		
		for(Iterator it=l.iterator();it.hasNext();) {
			System.out.println(it.next());
		}
		
		Iterator it=l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//排序
		Collections.sort(l);
		//遍历
		it=l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//给定Set集合,
		Set s=new HashSet();
		s.add(1);//自动装箱，Integer implements Comparable
		s.add(6);
		s.add(5);
		s.add(2);
		//对Set集合排序，sort不能对Set集合排序
		//Collections.sort(s);
		//将Set转换成list
		List lists=new ArrayList(s);
		Collections.sort(lists);
		//遍历
		it=lists.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//创建List集合，List集合中存储Person类型，是否可以排序
		//Collections工具类可以对List集合中的元素进行排序，但是集合中的元素必须是可比较的，实现Comparable接口
//		List ps=new ArrayList();
//		ps.add(new Person());
//		ps.add(new Person());
//		Collections.sort(ps);
		//将ArrayList集合转换成线程安全的
		List myList=new ArrayList();
		Collections.synchronizedList(myList);
	}
}
class Person{
	
}