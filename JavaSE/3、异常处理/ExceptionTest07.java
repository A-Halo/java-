package JavaSE.OO.yichang;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * ��д�ķ������ܱȱ���д�ķ����׳��������쳣
 * 
 */
/*
class A{
	public void m1() {
		
	}
}
class B extends A{
	//������Զ�޷��׳��ȸ��������쳣
	public void m1() throws Exception{//���뱨��
		
	}
}
*/
class A{
	//public void m1() throws FileNotFoundException{
	public void m1() throws IOException{	
	}
}
class B extends A{
	//public void m1() throws IOException{
	public void m1() throws FileNotFoundException{	
	}
}
public class ExceptionTest07 {
	
}
