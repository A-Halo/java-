package JavaSE.OO.guanjianzi;
/*
 * ���ӣ�δ������ʱĬ����ʾ1970��1��1��
 * 	this������������
 * 		����ʹ����ʵ�������У�����ǰ�����﷨��ʽ��this.
 * 		����ʹ���ڹ��췽���У�ͨ����ǰ�Ĺ��췽�����������Ĺ��췽��,�﷨��ʽ��this(ʵ��)
 */
class Data{
	int year;
	int mouth;
	int day;
	//���캯��
	public Data() {
		//System.out.println();
//		this.day=1;
//		this.mouth=1;
//		this.year=1970;
		//���ϴ������ͨ��������һ�����췽�������
		//��ǰ���ǲ��ܴ����µĶ��󣬵����´��봴����һ���µĶ���
		//new Data(1970,1,1);
		
		//��Ҫ�������µķ�ʽ����ɹ��췽���ĵ��ã����ַ�ʽ���ᴴ���µ�java����
		this(1970,1,1);//������ֻ�ܳ����ڹ��캯����һ��
	}
	public Data(int year,int mouth,int day) {
		this.day=day;
		this.year=year;
		this.mouth=mouth;
	}
	//get��set����
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMouth() {
		return mouth;
	}
	public void setMouth(int mouth) {
		this.mouth = mouth;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public void print() {
		System.out.println(this.year+"��"+this.mouth+"��"+this.day+"��");
	}
}
public class ThisTest04 {
	public static void main(String[] args) {
		Data d=new Data();
		d.print();
		Data dd=new Data(2020,1,1);
		dd.print();
	}
}
