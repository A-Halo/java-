package JavaSE.OO.jiekou;
/*
 * �ӿڵ�����
 * 	1������ʹ��Ŀ�ֲ㣬���в㶼����ӿڿ���������Ч�����
 * 	2���ӿ�ʹ����ʹ���֮�����϶Ƚ���
 * 	3���ӿںͳ����඼�����ĳ�����ܣ�����ѡ��ӿ�
 * 		��Ϊ�ӿڿ��Զ�ʵ�֣���̳�
 * 		����һ����ʵ�ֽӿ�֮�⻹���Լ̳������ࣨ��������ļ̳У�
 */
//�ͻ�ҵ��ӿ�
interface CustomerService{
	//�����˳�ϵͳ�ķ���
	void logout();
	
}
//��д�ӿڵ�ʵ���࣬����ӿ�ȥʵ��
class CustomerServiceImpl implements CustomerService{
	//ʵ�ֽӿ��е�ʵ�ַ���
	public void logout() {
		System.out.println("�ɹ��˳�ϵͳ");
	}
}
public class InterfaceTest02 {
	public static void main(String[] args) {
		//Ҫִ��CustomerServiceImpl�е�logout����
		CustomerServiceImpl m=new CustomerServiceImpl();
		m.logout();
		//����ӿ�ȥ����,��̬
		CustomerService cs=new CustomerServiceImpl();
		cs.logout();//�������ǽӿ��е�logout�����������������е�ʵ�ַ���
	}
}
