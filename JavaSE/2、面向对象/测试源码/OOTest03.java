package JavaSE.OO.lei;

class Customer{
	int id;
}
public class OOTest03 {
	public static void main(String[] args) {
		Customer c=new Customer();
		System.out.println(c.id);
		c=null;
		//���³���������ͨ������Ϊ�����﷨
		//����ʱ����ֿ�ָ���쳣
		//�����÷��ʡ�ʵ������ص�����һ������ֿ�ָ���쳣
		// java.lang.NullPointerException
		System.out.println(c.id);
	}
}
//ʵ����ص����ݱ�ʾ��������ݷ��ʵ�ʱ�����Ҫ�ж���Ĳ��룬�������ݾ���ʵ����ص�����
