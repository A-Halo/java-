package JavaSE.OO.lei;
/*
 * 
 */
//�û���
class User{
	//���ԡ���Ա����֮ʵ��������
	//�û����
	//int��һ�ֻ�����������
	//no��һ��ʵ������
	int no;
	
	//�û���
	//String��һ�������������ͣ������ַ���
	//name��һ��ʵ��������name��һ������
	String name;
	
	//��ͥסַ
	//Address��һ�������������ͣ������ͥסַ
	//addr��һ��ʵ��������addr��һ������
	Address addr;
}
//��ַ��
class Address{
	//���ԡ���Ա����֮ʵ��������
	//String�������������ͣ�city�������ã������ַָ����ڴ����
	//����
	String city;
	
	//�ֵ�
	String street;
	
	//�ʱ�
	String zipcode;
}

public class OOTest02 {
	public static void main(String[] args) {
		//����user����
		User u=new User();
		
		System.out.println(u.no);//0
		System.out.println(u.name);//null
		System.out.println(u.addr);//null
		//�޸�user�����ڲ�ʵ��������ֵ
		u.no=10;
		u.name="jack";//jack��һ��java��������String����
		
		u.addr=new Address();
		
		//Address a=new Address();��������һ�д�����ͬ���ڴ�ͼ�����ı�
		//u.addr=a;
		
		//��main������ֻ��һ������u��һ��ֻ��ͨ��u������
		System.out.println(u.name+"��ס���ĸ����У�"+u.addr.city);
		u.addr.zipcode="111";
		System.out.println(u.name+"��ס���ĸ��ʱࣺ"+u.addr.zipcode);
	}
}
