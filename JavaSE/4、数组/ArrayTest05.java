package JavaSE.OO.shuzu;

import java.util.Scanner;

/*
 * ��дһ���Ƶ����ϵͳ:��ʾ�Ƶ����з����б�Ԥ�����䣬�˷�
 * 
 */
class Room{
	String no;
	String type;//"��׼��","˫�˼�","������"
	boolean isUse;//true��ʾռ�ã�false��ʾ����
	public Room(String no, String type, boolean isUse) {
		super();
		this.no = no;
		this.type = type;
		this.isUse = isUse;
	}
	public Room() {
		super();
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isUse() {
		return isUse;
	}
	public void setUse(boolean isUse) {
		this.isUse = isUse;
	}
	
	public String toString() {
		return "["+no+","+type+","+(isUse?"ռ��":"����")+"]";
	}
}
class Hotel{
	//�涨�Ƶ꣺5�㣬ÿ��10������
	//һ�����׼��101,102,..110,201,202...210�����Ĳ�˫�˼䣬����������501,502,...510
	Room[][] rooms;
	Hotel(){
		this(5,10);
		//��ֵ
		for(int i=0;i<rooms.length;i++) {
			for(int j=0;j<rooms[i].length;j++) {
				if(i==0 || i==1) {
					rooms[i][j]=new Room((i+1)*100+j+1+"","��׼��",false);
				}
				if(i==2 || i==3) {
					rooms[i][j]=new Room((i+1)*100+j+1+"","˫�˼�",false);
				}
				if(i==4) {
					rooms[i][j]=new Room((i+1)*100+j+1+"","������",false);
				}
			}
		}
	}
	Hotel(int rows,int cols){
		rooms=new Room[rows][cols];
		//��ֵ
		//rooms[][]
	}
	//�����ṩһ����ӡ�����б�ķ���
	public void print() {
		for(int i=0;i<rooms.length;i++) {
			for(int j=0;j<rooms[i].length;j++) {
				System.out.println(rooms[i][j]+" ");
			}
			System.out.println();
		}
	}
	//�����ṩԤ������
	public void order(String no) {
		for(int i=0;i<rooms.length;i++) {
			for(int j=0;j<rooms[i].length;j++) {
				if(rooms[i][j].getNo().equals(no)) {
					//���÷����״̬�ĳ�ռ��
					rooms[i][j].setUse(true);
					return;
				}
			}
			System.out.println();
		}
	}
	//�����ṩ�˷�����
}
//���Գ���
public class ArrayTest05 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		//��ʼ���Ƶ�
		Hotel h=new Hotel();
		//��������б�
		h.print();
		while(true) {
			System.out.println("������Ԥ������ı��:");
			
			String no=s.next();
			//Ԥ������
			h.order(no);
			
			//��ӡ�Ƶ��б�
			h.print();
		}

	}
}
