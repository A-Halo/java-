package JavaSE.OO.changyonglei;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * ��ȡ��1970��1��1�� 00��00��000���뵽��ǰ�ĺ�����
 * 1000���� = 1��
 * 
 * Date d=new Date();��ȡϵͳ��ǰʱ��
 * Date d=new Date(long millis);
 * 
 * ����
 */
public class DateTest {
	
	public static void main(String[] args) throws ParseException {
		long now = System.currentTimeMillis();
		System.out.println(now);
		
		//��ȡϵͳ��ǰʱ��
		Date nowTime=new Date();
		//java.util.Date;�Լ���д��Object�е�toString����
		System.out.println(nowTime);//Fri Feb 14 15:12:52 CST 2020
		
		//����"��ʽ��"����
		//java.util.Date;->String
		/*��ʽ��y ��
				M ��
				d ��
				H Сʱ
				m ��
				s ��
				S ����
		*/
		//�������ڸ�ʽ������
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss SSS");
		//��ʼ��ʽ��(Date->String)
		String strTime=sdf.format(nowTime);
		System.out.println(strTime);//2020��02��14�� 15:23:21 756
		
		//��ȡ�ض�������
		String time = "2020��2��2�� 20:20:20 200";
		//��String����ת����Date(String->Date)
		//�������ڸ�ʽ������
		SimpleDateFormat sd=new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss SSS");//��ʽ�������������Ϸ��ַ�����ʽ��ͬ
		//���ַ���ת������������
		Date t=sd.parse(time);//���쳣
		System.out.println(t);
		
		Date t1=new Date(1000);
		//Dateת����String
		SimpleDateFormat s=new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss SSS");
		System.out.println(s.format(t1));
		//��ȡϵͳ��ǰʱ���ǰʮ����ʱ��
		Date t2=new Date(System.currentTimeMillis()-1000*60*10);
		System.out.println(s.format(t2));
		
		//����
		//��ȡϵͳ��ǰ����
		Calendar c=Calendar.getInstance();
		//�鿴��ǰ���������ڼ�
		int i=c.get(Calendar.DAY_OF_WEEK);
		System.out.println(i);//��������Ϊ��һ��
		
		//��ȡ2008 8 8 �����ڼ�
		//��ȡ2008��8��8�յ�����
		String st="2008,08,08";
		Date d=new SimpleDateFormat("yyyy,MM,dd").parse(st);//���쳣
		
		//����������2008 8 8������
		c.setTime(d);
		//��ȡ���ڼ�
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
	}
	
}
