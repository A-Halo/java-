package JavaSE.OO.shuzu;
/*
 * ��дһ���Ƶ����ϵͳ:��ʾ�Ƶ����з����б�Ԥ�����䣬�˷�
 * 
 */
class Room{
	String no;
	String type;//"��׼��","˫�˼�","������"
	boolean isUse;//true��ʾռ�ã�false��ʾ����
}
class Hotel{
	//�涨�Ƶ꣺5�㣬ÿ��10������
	//һ�����׼�䣬���Ĳ�˫�˼䣬����������
	Room[][] rooms;
	Hotel(){
		this(5,10);
	}
	Hotel(int rows,int cols){
		rooms=new Room[rows][cols];
		//��ֵ
		//rooms[][]
	}
	//�����ṩԤ������
	
	//�����ṩ�˷�����
}
//���Գ���
public class ArrayTest05 {
	public static void main(String[] args) {
		
	}
}
