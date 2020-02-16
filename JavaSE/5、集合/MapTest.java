package JavaSE.OO.jihe;

import java.util.*;

/*
 * 关于map集合中常用的方法
 * void clear();清空map
 * boolean containKey(Object key);判断map中是否包含这样的key
 * boolean containValue(Object value);判断map中是否包含这样的value
 * Object get(Object Key);通过key获取value
 * boolean isEmpty();判断该集合是否为空
 * 
 * Object put(Object key,Object value);向集合中添加键值对
 * Object remove(Object key);通过key将键值对删除
 * int size();获取map中键值对的个数
 * 
 * Set keySet();获取Map中所有的key
 * Collection values();获取map集合中所有的value
 * 
 * Set entrySet();返回此映射中包含的映射关系的Set视图
 * 存储在map集合key部分的元素需要同时重写hashCode和equals方法
 * 
 * HashMap默认初始化容量是16，默认加载因子是0.75
 * HashTable默认初始化容量是11，默认加载因子是0.75
 * java.util.properties;也是由key和value组成，但是key和value都是字符串类型
 */
public class MapTest {
	public static void main(String[] args) {
		
		//1、创建map集合
		Map person=new HashMap();//HashMap默认初始化容量是16，默认加载因子是0.75
		//2、存储键值对
		person.put("10000", "jack");
		person.put("10011", "jack");
		person.put("10002", "SUN");
		person.put("10003", "COOK");
		person.put("10004", "KING");
		//3、判断键值对的个数
		//map中的key是无序不可重复的
		System.out.println(person.size());
		//4、判断集合中是否包含这样的key
		System.out.println(person.containsKey("10000"));//true
		//5、判断集合中是否包含这样的value
		//注意：如果map中key重复了，value采用的是覆盖。
		System.out.println(person.containsValue("jack"));//true
		
		//6、通过key获取value
		String k="10011";
		Object v=person.get(k);
		System.out.println(v);
		//7、通过key删除键值对
		person.remove("10002");
		System.out.println(person.size());
		//8、获取所有的value
		Collection values=person.values();
		Iterator it1=values.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		//9、获取所有的key
		//遍历map集合
		Set keys=person.keySet();
		Iterator it2=keys.iterator();
		while(it2.hasNext()) {
			Object id=it2.next();
			Object name=person.get(id);
			System.out.println(id+"->"+name);
		}
		//10、entrySet
		//将map转换成Set集合
		Set e=person.entrySet();
		Iterator it3=e.iterator();
		while(it3.hasNext()) {
			System.out.println(it3.next());
		}
		
		//Properties
		//1、创建属性类对象
		Properties p=new Properties();
		//2、存
		p.setProperty("drive", "jdbc");
		p.setProperty("username", "scott");
		p.setProperty("password", "tiger");
		p.setProperty("url", "jdbc");
		//key不能重复，如果重复则value覆盖
		//3、取，通过key获取value
		String v1=p.getProperty("drive");
		String v2=p.getProperty("username");
		String v3=p.getProperty("password");
		String v4=p.getProperty("url");
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
	}
}
