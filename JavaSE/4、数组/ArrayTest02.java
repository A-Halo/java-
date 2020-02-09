package JavaSE.OO.shuzu;
/*
 * ����һά����
 */
class Animal{
	
}
class Dog extends Animal{
	public void eat() {
		System.out.println("Dog eat");
	}
}
class Cat extends Animal{
	public void move() {
		System.out.println("Cat move");
	}
}
public class ArrayTest02 {
	//�������õ�ʱ��Ҳ������������һ������
	public static void m1(int[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		//��һ�ַ�����������
		int[] m= {1,2,3,4,5,6};
		m1(m);
		//�ڶ��ַ�ʽ
		m1(new int[] {1,2,3,4,5,6});
		
		//����һ�����飬�������ȿ��Դ洢Dog��Ҳ�ܴ洢Cat
		Animal[] as=new Animal[4];
		//������ÿ��Ԫ�ظ�ֵ
		Dog d1=new Dog();
		Dog d2=new Dog();
		Cat c1=new Cat();
		Cat c2=new Cat();
		as[0]=d1;
		as[1]=d2;
		as[2]=c1;
		as[3]=c2;
		//�������飬ȡ��ÿ�����������Dogִ��eat�����������Catִ��move����
		for(int i=0;i<as.length;i++) {
			Animal a=as[i];
			System.out.println(a);
			//ǿ������ת��������ת��
			if(a instanceof Cat) {
				Cat c=(Cat)a;
				c.move();
			}else if(a instanceof Dog){
				Dog d=(Dog)a;
				d.eat();
			}
		}
	}
}
