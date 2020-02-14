package JavaSE.OO.changyonglei;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Random;

/*
 * �������ָ�ʽ����java.text.DecimalFormat
 * ���ָ�ʽ:
 * 	# ��������
 * 	,  ǧ��λ
 * 	.  С����
 * 	0 ������0
 * 
 * java.math.BigDecimal;
 * ���������ݾ�ȷ�ȼ��ߣ��ʺ����������
 * ���������Double���;���̫��
 * 
 * ���������
 */
public class NumberTest01 {
	public static void main(String[] args) {
		//�������ָ�ʽ������
		//���󣺼���ǧ��λ
		DecimalFormat df=new DecimalFormat("###,###");
		//��ʼ��ʽ��
		System.out.println(df.format(1234567));//1,234,567
		//���󣬼��롤ǧ��λ������2λС��
		DecimalFormat df1=new DecimalFormat("###,###.##");
		System.out.println(df1.format(1234567.1234));//1,234,567.12
		//���󣬼���ǧ��λ������4λС����������0
		DecimalFormat df2=new DecimalFormat("###,###.0000");
		System.out.println(df2.format(1234567.1));//1,234,567.1000
		
		//����������
		BigDecimal v1=new BigDecimal(10);
		BigDecimal v2=new BigDecimal(20);
		//���ӷ�����
		//v1+v2�����������������Ͳ������ӷ�����
		//���÷���ִ�мӷ�����
		BigDecimal v3=v1.add(v2);
		System.out.println(v3);
		
		//���������
		//����random����
		Random r=new Random();//���������������
		//����int���͵������
		int i=r.nextInt(101);//����[0~100]֮��������[0~101)
		System.out.println(i);
		//ѭ��������������
		for(int j=0;j<5;j++) {
			System.out.println(r.nextInt(101));
		}
	}
}
