package JavaSE.OO.changyonglei;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Random;

/*
 * 关于数字格式化：java.text.DecimalFormat
 * 数字格式:
 * 	# 任意数字
 * 	,  千分位
 * 	.  小数点
 * 	0 不够补0
 * 
 * java.math.BigDecimal;
 * 该类型数据精确度极高，适合做财务软件
 * 财务软件中Double类型精度太低
 * 
 * 生成随机数
 */
public class NumberTest01 {
	public static void main(String[] args) {
		//创建数字格式化对象
		//需求：加入千分位
		DecimalFormat df=new DecimalFormat("###,###");
		//开始格式化
		System.out.println(df.format(1234567));//1,234,567
		//需求，加入·千分位，保留2位小数
		DecimalFormat df1=new DecimalFormat("###,###.##");
		System.out.println(df1.format(1234567.1234));//1,234,567.12
		//需求，加入千分位，保留4位小数，不够补0
		DecimalFormat df2=new DecimalFormat("###,###.0000");
		System.out.println(df2.format(1234567.1));//1,234,567.1000
		
		//创建大数据
		BigDecimal v1=new BigDecimal(10);
		BigDecimal v2=new BigDecimal(20);
		//做加法运算
		//v1+v2；错误，两个引用类型不能做加法运算
		//调用方法执行加法运算
		BigDecimal v3=v1.add(v2);
		System.out.println(v3);
		
		//生成随机数
		//创建random对象
		Random r=new Random();//创建随机数生成数
		//生成int类型的随机数
		int i=r.nextInt(101);//生成[0~100]之间的随机数[0~101)
		System.out.println(i);
		//循环生成五个随机数
		for(int j=0;j<5;j++) {
			System.out.println(r.nextInt(101));
		}
	}
}
