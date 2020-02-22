package JavaSE.OO.duoxianchen;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/*
 * 关于定时器应用
 * 	作用：每隔一段固定的时间执行一段代码
 */
public class TimerTest {
	public static void main(String[] args) throws ParseException {
		//创建定时器
		Timer t=new Timer();
		//指定定时任务
		t.schedule(new LogTimerTask(), new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").parse("2020-02-22 16:48:00 000"),10*1000);
	}
}
//指定任务
class LogTimerTask extends TimerTask{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(new Date()));
	}
	
}