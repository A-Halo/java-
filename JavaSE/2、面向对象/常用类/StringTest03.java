package JavaSE.OO.changyonglei;
/*
 * 正则表达式
 * 正则表达式是一种字符模型，专门做字符串格式匹配的
 * 正则表达式是通用的
 * 
 * 例如:正则表达式"^a{2}$"表示两个a字符，等同于"aa
 * \d 数字
 * \D 非数字
 * \w 英文字母
 * \W 非英文字母
 * 
 * java.lang.StringBuffer;
 * java.lang.StringBuilder;
 * 
 * 1、StringBuffer和StringBuilder是什么
 * 		是一个字符串缓冲区
 * 2、工作原理
 * 	预先在内存中申请一块空间，以容纳字符序列
 *	如果预留的空间不够用，则进行自动扩容，以容纳更多的字符序列
 * 3、StringBuffer，StringBuilder和String最大的区别
 *	String是不可变的字符序列，存储在字符串常量池中
 *	StringBuffer底层是一个char数组，但是该char数组是可以变的
 *	并且可以自动扩容
 * 4、StringBuffer，StringBuilder默认初始化容量是16
 * 5、如何优化StringBuffer，StringBuilder
 * 		最好在创建StringBuffer之前，预测StringBuffer的存储数量
 * 		然后再创建StringBuffer的时候采用指定初始化容量的方式创建StringBuffer
 * 		为了减少底层数组的拷贝，提高效率
 * 6、StringBuilder和String区别
 * 		StringBuffer是线程安全的。(可以在多线程环境下使用不会出现问题)
 * 		StringBuilder是非线程安全的，(在多线程环境下使用可能会出现问题)
 */
public class StringTest03 {
	public static void main(String[] args) {
		System.out.println("aa".matches("^a{2}$"));
		
		String s1="aasdadasfhjkasf15651afhjakfhak454affafkl";
		//将dd替换为"中"
		System.out.println(s1.replaceAll("dd", "中"));
		//将dd替换为"中"
		System.out.println(s1.replaceAll("d{2}", "中"));
		//将数字替换为"中"
		System.out.println(s1.replaceAll("\\d", "中"));
		//将非数字替换为"中"
		System.out.println(s1.replaceAll("\\D", "中"));
		
		//创建字符串缓冲区对象
		StringBuffer sb=new StringBuffer();//16
		//可以向StringBuffer中追加字符串
		String[] ins= {"唱","跳","rap"};
		//推荐字符串频繁拼接使用StringBuffer或者StringBuilder
		
		for(int i=0;i<ins.length;i++) {
			if(i==ins.length-1) {
				sb.append(ins[i]);//追加
			}else {
				sb.append(ins[i]);
				sb.append(",");
			}
		}
		System.out.println(sb);//唱,跳,rap
	}
}
