package com.node.javese.day09.test003;
/**
 * ��װ����
 * 1.����˽�л�,��private�ؼ���
 * 2.�ṩ�򵥲������
 * 
 * �����������ַ�ʽ
 * 1.��ȡ get 
 * 2.�޸� set
 * 
 * get���������淶(��ȡ�з���ֵ)
 * public int getAge(){
 * 		return age;
 * }
 * 
 * set���������淶(�޸��޷���ֵ)
 * public void getAge(int a){
 * 		age = a;
 * }
 *
 *setter and getter������static�ؼ���
 *��static�ؼ��ֵ��ã�����.������(ʵ��)
 *��static�ؼ��ֵ��ã�����.������(ʵ��)
 */
class User {
	
	private int age;
	
	public void setAge(int a) {
		if(a<0||a>150) {
			System.out.println("���Ϸ�");
			return;
		}
		age = a;
	}

	public int getAge() {
		return age;
	}
}

public class UserTest {

	public static void main(String[] args) {

		User user = new User();
		//System.out.println(user.age);
		//�޸�
		user.setAge(-100);
		//��ȡ
		System.out.println(user.getAge());
	}

}
