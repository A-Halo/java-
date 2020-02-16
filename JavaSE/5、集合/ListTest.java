package JavaSE.OO.jihe;

import java.util.*;

/*
 * List集合存储元素的特点：
 * 有序(List集合中存储的元素有下标)，存进去是这个顺序，取出来还是这个顺序
 * 可重复
 * 
 * ArrayList集合底层是数组，数组是有下标的，所以ArrayList有很多自己的特性
 * ArrayList集合默认初始化容量是10，扩大之后的容量是原容量的1.5倍
 * Vector集合默认初始化容量是10，扩大之后的容量是原容量的2倍
 * LinkList没有初始化容量，底层不是数组
 * 
 * 如何优化ArrayList和Vector？
 * 	尽量减少扩容操作，因为扩容需要数组拷贝，数组拷贝很耗内存，效率很低
 * 	一般推荐创建集合的时候，指定初始化容量
 */
public class ListTest {
	public static void main(String[] args) {
		//创建一个List集合
		List l=new ArrayList();
		//添加
		l.add(100);
		l.add(56);
		l.add(23);
		l.add(200);
		l.add(200);
		
		l.add(1,555);//在下标为1的地方添加555
		//取下标指定的元素
		System.out.println(l.get(0));//取下标为0的元素
		System.out.println("------------");
		//遍历(迭代器遍历)
		Iterator it=l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("------------");
		//遍历(List集合特有的遍历方式)
		for(int i=0;i<l.size();i++) {
			Object element=l.get(i);
			System.out.println(element);
		}
	}
}
