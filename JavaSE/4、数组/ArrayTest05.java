package JavaSE.OO.shuzu;
/*
 * 编写一个酒店管理系统:显示酒店所有房间列表，预定房间，退房
 * 
 */
class Room{
	String no;
	String type;//"标准间","双人间","豪华间"
	boolean isUse;//true表示占用，false表示空闲
}
class Hotel{
	//规定酒店：5层，每层10个房间
	//一二层标准间，三四层双人间，第五层豪华间
	Room[][] rooms;
	Hotel(){
		this(5,10);
	}
	Hotel(int rows,int cols){
		rooms=new Room[rows][cols];
		//赋值
		//rooms[][]
	}
	//对外提供预定方法
	
	//对外提供退房方法
}
//测试程序
public class ArrayTest05 {
	public static void main(String[] args) {
		
	}
}
