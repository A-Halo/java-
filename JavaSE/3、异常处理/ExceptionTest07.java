package JavaSE.OO.yichang;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 重写的方法不能比被重写的方法抛出更宽泛的异常
 * 
 */
/*
class A{
	public void m1() {
		
	}
}
class B extends A{
	//子类永远无法抛出比父类更多的异常
	public void m1() throws Exception{//编译报错
		
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
