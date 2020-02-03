package JavaSE.OO.jicheng;
/*
 * �������أ�overload
 * 	1����������ʲôʱ��ʹ��
 * 		��ͬһ�����У�������ɵĹ��������Ƶģ����鷽������ͬ
 * 	2���������ص�����
 * 		��ͬһ�����У���������ͬ�������б�ͬ
 * 	3���������غ�ʲô�޹�
 * 		�ͷ����ķ���ֵ���ͣ����η��б��޹�
 * �������ǣ�override
 * 	1�����������ֱ���Ϊ������д
 * 	2��ʲôʱ��ʹ�÷�����д
 * 		�����еķ����޷����㵱ǰ���������������Խ������м̳еķ�����д
 * 	3��ʲô��������֮��ᷢ��
 * 		������д�����ھ��м̳й�ϵ���Ӹ���֮��
 * 		����ֵ������ͬ����������ͬ���β��б���ͬ
 * 		������д��������ճ��
 * 		����Ȩ�޲��ܸ��Ϳ��Ը��ߣ�public protected default private���ɸߵ���
 * 		�׳��쳣���Ը��ߣ����ܸ���
 * ע�⣺˽�з������ܼ̳У����Բ��ܸ���
 * 		���췽�����ܼ̳У����Բ��ܸ���
 * 		��̬���������ڸ���
 * 		����ֻ��Է�������̸����
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
}
class Bird extends Animal{
	public void move() {
		System.out.println("�����ƶ�");
	}
}
public class OverrideTest {
	public static void main(String[] args) {
		//�����������
		Animal a=new Animal();
		a.move();
		
		//����è����
		Cat c=new Cat();
		c.move();
		
		//���������
		Bird b=new Bird();
		b.move();
		
	}
}
