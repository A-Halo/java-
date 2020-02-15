package JavaSE.OO.shuzu;

import java.util.Scanner;

/*
 * 编写一个酒店管理系统:显示酒店所有房间列表，预定房间，退房
 * 
 */
class Room{
	String no;
	String type;//"标准间","双人间","豪华间"
	boolean isUse;//true表示占用，false表示空闲
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
		return "["+no+","+type+","+(isUse?"占用":"空闲")+"]";
	}
}
class Hotel{
	//规定酒店：5层，每层10个房间
	//一二层标准间101,102,..110,201,202...210，三四层双人间，第五层豪华间501,502,...510
	Room[][] rooms;
	Hotel(){
		this(5,10);
		//赋值
		for(int i=0;i<rooms.length;i++) {
			for(int j=0;j<rooms[i].length;j++) {
				if(i==0 || i==1) {
					rooms[i][j]=new Room((i+1)*100+j+1+"","标准间",false);
				}
				if(i==2 || i==3) {
					rooms[i][j]=new Room((i+1)*100+j+1+"","双人间",false);
				}
				if(i==4) {
					rooms[i][j]=new Room((i+1)*100+j+1+"","豪华间",false);
				}
			}
		}
	}
	Hotel(int rows,int cols){
		rooms=new Room[rows][cols];
		//赋值
		//rooms[][]
	}
	//对外提供一个打印房间列表的方法
	public void print() {
		for(int i=0;i<rooms.length;i++) {
			for(int j=0;j<rooms[i].length;j++) {
				System.out.println(rooms[i][j]+" ");
			}
			System.out.println();
		}
	}
	//对外提供预定方法
	public void order(String no) {
		for(int i=0;i<rooms.length;i++) {
			for(int j=0;j<rooms[i].length;j++) {
				if(rooms[i][j].getNo().equals(no)) {
					//将该房间的状态改成占用
					rooms[i][j].setUse(true);
					return;
				}
			}
			System.out.println();
		}
	}
	//对外提供退房方法
}
//测试程序
public class ArrayTest05 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		//初始化酒店
		Hotel h=new Hotel();
		//输出房间列表
		h.print();
		while(true) {
			System.out.println("请输入预定房间的编号:");
			
			String no=s.next();
			//预定房间
			h.order(no);
			
			//打印酒店列表
			h.print();
		}

	}
}
