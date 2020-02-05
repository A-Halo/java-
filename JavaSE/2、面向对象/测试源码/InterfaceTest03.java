package JavaSE.OO.jiekou;
/*
 * 例子,汽车，引擎，
 */
//定义一个引擎接口
interface Engine{
	void start();
}
//实现具体的引擎
class YAMAH implements Engine{
	public void start() {
		System.out.println("YAMAH启动");
	}
}
class HONGDA implements Engine{
	public void start() {
		System.out.println("HONGDA启动");
	}
}
//汽车类
class Car{
	//参数，面向接口编程
	Engine e;
	
	Car(Engine e){
		this.e=e;
	}
	//汽车测试引擎
	public void TestEngine() {
		e.start();//面向接口调用
	}
}
//测试类
public class InterfaceTest03 {
	public static void main(String[] args) {
		Engine e=new YAMAH();//多态
		Car c=new Car(e);//多态
		c.TestEngine();
		
	}
}
