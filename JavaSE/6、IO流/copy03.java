package JavaSE.OO.IO;

import java.io.*;

/*
 * ʹ��BufferedReader��BufferedWriter��ɸ���
 */
public class copy03 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new FileReader("E:\\test04.txt"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\test04.txt"));
		
		String temp=null;
		while((temp=br.readLine())!=null) {
			bw.write(temp);
		}
		bw.flush();
		br.close();
		bw.close();
	}
}
