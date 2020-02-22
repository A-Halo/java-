package JavaSE.OO.duoxianchen;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/*
 * ���ڶ�ʱ��Ӧ��
 * 	���ã�ÿ��һ�ι̶���ʱ��ִ��һ�δ���
 */
public class TimerTest {
	public static void main(String[] args) throws ParseException {
		//������ʱ��
		Timer t=new Timer();
		//ָ����ʱ����
		t.schedule(new LogTimerTask(), new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").parse("2020-02-22 16:48:00 000"),10*1000);
	}
}
//ָ������
class LogTimerTask extends TimerTask{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(new Date()));
	}
	
}