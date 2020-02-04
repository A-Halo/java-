package JavaSE.OO.duotai;
/*
 * ��������֮��̬[�����﷨]
 * 	1�����ڶ�̬�ļ�������
 * 		����ת��(upcasting):������ת�ɸ����͡��Զ�����ת����
 * 		����ת��(downcasting):������ת�������͡�ǿ������ת������ǿ������ת����
 * 		����������ת�ͻ�������ת�ͣ���������֮�������м̳й�ϵ
 */
class Animal{
	public void move() {
		System.out.println("�������ƶ�");
	}
}
class Cat extends Animal{
	public void move() {
		System.out.println("è���ƶ�");
	}
	public void catchMouse() {
		System.out.println("èץ����");
	}
}
class Bird extends Animal{
	public void move() {
		System.out.println("�����ƶ�");
	}
	public void fly() {
		System.out.println("���ڷ�");
	}
}
public class PolymorphicTest01 {
	public static void main(String[] args) {
		//δ�ö�̬
		Animal a1=new Animal();
		a1.move();
		
		Cat c1=new Cat();
		c1.move();
		c1.catchMouse();
		
		Bird b1=new Bird();
		b1.move();
		//ʹ�ö�̬
		Animal a2=new Cat();//����ת��
		//Bird b=new Cat();���뱨����ΪCat��Birdû�м̳й�ϵ
		/*
		 * java�����Ϊ��������н׶Σ��ȱ���������
		 * ����׶α��������a2������õ���������ΪAnimal����Animal
		 * ����move()���������Ա���ͨ����������̳�Ϊ��̬�󶨣�����׶ΰ�
		 * ��̬��֮��������У��ڳ������н׶Σ����ڴ�����ʵ��������Cat����
		 * ��ô���������н׶�һ�������Cat�����move()��������ʱ�����˳����
		 * ��̬�󶨣����н׶ΰ� 
		 * ����Cat����û����дmove()���������н׶�һ�����õ���Cat�����move()����
		 * ��Ϊ�ײ���ʵ�Ķ������Cat����
		 * ����������ָ�������Ͷ������ֻ��ƴ��ڱ���󶨺����н׶����ֲ�ͬ״̬�����ֻ��ƿ��Գ�Ϊһ�ֶ�̬�﷨����
		 */
		a2.move();
		//a2.catchMouse();a2������Animal���ͣ�Animal����û�ҵ�catchMouse()���������Ա���ʧ�ܣ�
		//���������϶���ִ��catchMouse()�������������a2ǿ������ת��ΪCat���ͣ�����ת��
		//��ǿ������ת��������������֮��ҲҪ�л��̳й�ϵ
		//ʲôʱ����Ҫ����ת���أ������õķ�������ʵ������������������еģ��ڸ������в����ڣ������������ת��
		Cat c2=(Cat)a2;
		c2.catchMouse();
		
		/*
		 * ���³������û�����⣬a3��Animal���ͣ�ת����Cat���Ϳ��ԣ��������л�����쳣����Ϊ
		 * ���ڴ�����ʵ���ڵĶ���ʱBird���ͣ�Bird�����޷�ת��Cat���ͣ��޼̳й�ϵ�������쳣����
		 * ����ת���쳣�������쳣����������ת��/ǿ������ת��ʱ�ᷢ��
		 */
		Animal a3=new Bird();
		Cat c3=(Cat)a3;//java.lang.ClassCastException
		/*
		 * ����ת��ֻҪ����ͨ�������о�û����
		 * ����ת�ͱ���ͨ�������п��ܴ���
		 * ��α�������ת�ͳ���ClassCastException�쳣��
		 * 	ʹ��instanceof��������Ա���������ϵ��쳣
		 * instanceof�������ô�ã�
		 * 	�﷨��ʽ��
		 * 		(���� instanceof ����������)
		 * 	���������ִ�н�������ǲ������ͣ������true/false
		 * 	(a instanceof Animal)
		 * 		true��ʾ��a����ָ��Ķ�����һ��Animal����
		 * 		false��ʾ��a����ָ��Ķ�����һ��Animal����
		 * 
		 * java�淶Ҫ���ڽ���ǿ������ת��ʱ���������instanceof����������жϣ���������쳣
		 */
		if(a3 instanceof Cat) {
			Cat c=(Cat)a3;
			c.catchMouse();
		}else if(a3 instanceof Bird) {
			Bird b2=(Bird)a3;
			b2.fly();
		}
		
	}
}
