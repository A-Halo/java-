package JavaSE.OO.guanjianzi;
/*
 * ����java��final�ؼ��֣�
 * 	1��final��һ���ؼ��֣���ʾ���յģ����ɱ��
 * 	2��final���ε����޷����̳�
 * 	3��final���εķ����޷�������
 * 	4��final���εı���һ������ֵ֮�󣬲������¸�ֵ
 * 	5��final���ε�ʵ�������������ֶ���ֵ�����ܲ���ϵͳĬ��ֵ
 * 	6��final���ε����ã�һ��ָ��һ������֮��������ָ���Ķ�����
 * final���ε�ʵ�������ǲ��ɱ�ģ����ֱ���һ���static����ʹ�ã�����Ϊ"����"
 */
class Chinese{
	//������public static final ���� ������=ֵ;
	//java�淶��Ҫ�����г������ִ�д��ÿ������֮�����»�������
	//static final String country="�й�";
	public static final String GUO_JI="�й�";
}
class User1{
	int id;
	public User1(int a) {
		this.id=id;
	}
}
public class FinalTest {
	//ʵ��������Ĭ��ֵ��final���εı���һ����ֵ�������¸�ֵ
//	final int age;�����ֶ���ֵ�����ܲ���ϵͳĬ��ֵ
	//��һ��
	final int age1=100;//�ڹ��췽��ִ��ʱ�Ż�ִ�и�ֵ����
	//�ڶ���
	final int num;
	public FinalTest(){
		this.num=200;
	}
	
	public static void main(String[] args) {
		final int a;
		a=100;
		//a=1;�������¸�ֵ
		User1 u=new User1(10);//�൱��User u=0x1234
		u=new User1(30);//�൱��u=0x3456�����ʱu����ָ��new User(10)����
					   //User(10)�ᱻ��������
		final User1 user=new User1(100);//��user����ĵ�ַ����ı�
		//user = new user1(50);final���ε�����һ��ָ��ĳ������֮��
		//����ָ���������󣬱�ָ��Ķ����޷�����������������
		user.id=50;//final���ε�����ָ��ĳ��������������ڲ����ڴ��ǿ����޸ĵ�
	}
}
