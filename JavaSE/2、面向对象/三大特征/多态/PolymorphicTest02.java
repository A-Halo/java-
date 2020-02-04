package JavaSE.OO.duotai;
/*
 * java��������֮��̬�����á�
 * 	���ͳ�����϶ȣ���߳�����չ��
 * 	���ö�̬���ö�̬������������ָ�������Ͷ���
 * ��������̣�������Ҫ���������
 */
class Snake extends Pet{
	public void eat() {
		System.out.println("������");
	}
}
class Pet{
	//���г��ﶼ����eat
	public void eat() {
		
	}
}
class Cat1 extends Pet{
	public void eat() {
		System.out.println("è����");
	}
}

class Dog extends Pet{
	public void eat() {
		System.out.println("���Թ�ͷ");
	}
}
//���˶�̬master�������չ���ǳ�ǿ����϶ȷǳ��ͣ�
//Master��������ǳ����pet�����������ĳ���
//�ᳫ��������̣���Ҫ���������
//��������̵ĺô�����϶ȵͣ���չ��ǿ
class Master{
	public void feed(Pet pet) {//��new Cat1����pet���ã���new Dog����pet����
		pet.eat();			   //Pet pet��һ�����������ã�ָ��������Cat1��Dog
	}
}
//û���ö�̬������������
/*
class Mater{
	public void feed(Cat1 c) {
		c.eat();
	}
	public void feed(Dog d) {
		d.eat();
	}
}
*/
public class PolymorphicTest02 {
	public static void main(String[] args) {
		//�������˶���
		Master zhangsan=new Master();
		//����è����
		//����ι��è
		zhangsan.feed(new Cat1());
		//����ι����
		zhangsan.feed(new Dog());
		//�����߶���
		Snake snake=new Snake();
		zhangsan.feed(snake);
	}
}
