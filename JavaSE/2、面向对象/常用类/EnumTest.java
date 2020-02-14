package JavaSE.OO.changyonglei;
/*
 * 枚举类型
 * 需求：定义一个方法，该方法作用计算两个int数据的商
 * 如果计算成功，该方法返回1，如果执行失败，该方法返回0
 */
public class EnumTest {
	public static Result divide(int a,int b) {
		try {
			int c=a/b;
			return Result.SUCCESS;//成功
		}catch(Exception e) {
			return Result.FAIL;//失败
		}
	}
	public static void main(String[] args) {
		int a=10;
		int b=0;
		Result retValue=divide(a,b);
		if(retValue==Result.SUCCESS) {
			System.out.println("成功");
		}else if(retValue==Result.FAIL) {
			System.out.println("失败");
		}
	}
}
//定义一个枚举类型
enum Result{
	//成功和失败
	//规范要求：大写
	SUCCESS,FAIL//有限的
}
//四季
enum Season{
	SPRING,SUMMER,AUTUMN,WINTER
}
