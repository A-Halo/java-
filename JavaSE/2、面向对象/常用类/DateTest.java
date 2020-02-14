package JavaSE.OO.changyonglei;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * 获取自1970年1月1日 00分00秒000毫秒到当前的毫秒数
 * 1000毫秒 = 1秒
 * 
 * Date d=new Date();获取系统当前时间
 * Date d=new Date(long millis);
 * 
 * 日历
 */
public class DateTest {
	
	public static void main(String[] args) throws ParseException {
		long now = System.currentTimeMillis();
		System.out.println(now);
		
		//获取系统当前时间
		Date nowTime=new Date();
		//java.util.Date;以及重写了Object中的toString方法
		System.out.println(nowTime);//Fri Feb 14 15:12:52 CST 2020
		
		//引入"格式化"日期
		//java.util.Date;->String
		/*格式：y 年
				M 月
				d 日
				H 小时
				m 分
				s 秒
				S 毫秒
		*/
		//创建日期格式化对象
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss SSS");
		//开始格式化(Date->String)
		String strTime=sdf.format(nowTime);
		System.out.println(strTime);//2020年02月14日 15:23:21 756
		
		//获取特定的日期
		String time = "2020年2月2日 20:20:20 200";
		//将String日期转换成Date(String->Date)
		//创建日期格式化对象
		SimpleDateFormat sd=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss SSS");//格式不能随意必须和上方字符串格式相同
		//将字符串转换成日期类型
		Date t=sd.parse(time);//报异常
		System.out.println(t);
		
		Date t1=new Date(1000);
		//Date转换成String
		SimpleDateFormat s=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss SSS");
		System.out.println(s.format(t1));
		//获取系统当前时间的前十分钟时间
		Date t2=new Date(System.currentTimeMillis()-1000*60*10);
		System.out.println(s.format(t2));
		
		//日历
		//获取系统当前日历
		Calendar c=Calendar.getInstance();
		//查看当前日历的星期几
		int i=c.get(Calendar.DAY_OF_WEEK);
		System.out.println(i);//国外周日为第一天
		
		//获取2008 8 8 是星期几
		//获取2008年8月8日的日历
		String st="2008,08,08";
		Date d=new SimpleDateFormat("yyyy,MM,dd").parse(st);//有异常
		
		//该日历就是2008 8 8的日历
		c.setTime(d);
		//获取星期几
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
	}
	
}
