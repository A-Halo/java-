package JavaSE.OO.shuzu;
/*
 * 关于main方法中的String[] args
 * 1、String[] args是专门用来接收命令行参数的
 */
public class ArrayTest03 {
	public static void main(String[] args) {
		System.out.println("String类型的数组总元素的个数"+args.length);
		
		//遍历
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
		}
		//需求，运行时提供用户名和密码，中间用空格隔开
		//eclipse中Run as运行时选择Run Configurations，再选择Arguments中的Program Arguments，在其中输入参数
		if(args.length !=2) {
			System.out.println("格式错误");
		}
		
		String username=args[0];
		String password=args[1];
		//java中比较字符串是否相等，必须使用equals方法
		//String类型是SUN提供，已经将equals重写了，比较的是内容
		if("admin".equals(username)&&"123".equals(password)) {//这种方式可以避免空指针异常
			System.out.println("登录成功");
		}else {
			System.out.println("登录失败");
		}
	}
}
