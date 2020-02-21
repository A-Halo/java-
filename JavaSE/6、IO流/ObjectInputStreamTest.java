package JavaSE.OO.IO;
/*
 * 反序列化
 */
import java.io.*;
public class ObjectInputStreamTest {
	public static void main(String[] args) throws Exception, Exception {
		//创建反序列化流
		ObjectInputStream ois =new ObjectInputStream(new FileInputStream("E:\\test06.txt"));
		//反序列化
		Object o=ois.readObject();
		System.out.println(o);
		//关闭
		ois.close();
	}
}
