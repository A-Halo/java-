package JavaSE.OO.jiekou;
/*
 * ����,���������棬
 */
//����һ������ӿ�
interface Engine{
	void start();
}
//ʵ�־��������
class YAMAH implements Engine{
	public void start() {
		System.out.println("YAMAH����");
	}
}
class HONGDA implements Engine{
	public void start() {
		System.out.println("HONGDA����");
	}
}
//������
class Car{
	//����������ӿڱ��
	Engine e;
	
	Car(Engine e){
		this.e=e;
	}
	//������������
	public void TestEngine() {
		e.start();//����ӿڵ���
	}
}
//������
public class InterfaceTest03 {
	public static void main(String[] args) {
		Engine e=new YAMAH();//��̬
		Car c=new Car(e);//��̬
		c.TestEngine();
		
	}
}
