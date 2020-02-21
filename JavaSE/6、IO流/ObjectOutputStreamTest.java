package JavaSE.OO.IO;

import java.io.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * java.io.ObjectOutputStream;序列化java对象到硬盘(Serial)
 * java.io.ObjectInputStream;将硬盘中的数据反序列化到jvm内存(DeSerial)
 */
public class ObjectOutputStreamTest {
	public static void main(String[] args) throws Exception, Exception {
		//创建java对象
		User u1=new User("冯洛伊曼");
		//创建输出流(序列化流)
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("E:\\test06.txt"));
		//写
		oos.writeObject(u1);
		//刷新
		oos.flush();
		//关闭
		oos.close();
	}
}
/*
 * 标识接口的作用：起到标识的作用
 * jvm如果看到该对象实现了某个标识接口，会对他特殊待遇,会给该类添加一个属性
 * static final long serialVersionUID=序列化版本号
 * 可以手动写定序列化版本号
 */
class User implements Serializable{//该接口是可序列化的，该接口没有任何方法，是一个标识接口
	//如果不想该属性参加序列化，需要使用transient关键字修饰
	//transient String name;
	String name;
	User(String name){
		this.name=name;
	}
	
	public String toString() {
		return "User[name]="+name+"]";
	}
}