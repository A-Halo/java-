package JavaSE.OO.yichang;
/*
 * �Զ����쳣��
 * 	1������ʱ�쳣��ֱ�Ӽ̳�Exception
 * 	2������ʱ�쳣��ֱ�Ӽ̳�RuntimeException
 * ����Ӧ��
 */
//�Զ��� IllegalNameException��Ч�����쳣
class IllegalNameException extends Exception{//����ʱ�쳣
//class IllegalNameException extends RuntimeException{//����ʱ�쳣	
	//�����쳣һ���ṩ�������췽��
	public IllegalNameException(){
		
	}
	public IllegalNameException(String msg){
		super(msg);
	}
}
//�˿����ҵ��
class CustomerService{
	//�����ṩһ��ע��ķ���
	public void register(String name) throws IllegalNameException{
		//���ע��
		if(name.length()<6) {
			//�쳣
			//�����쳣����
			//IllegalNameException e=new IllegalNameException("�û������Ȳ�������6λ");
			//�ֶ��׳��쳣
			//throw e;
			//�ֶ��׳��쳣���Լ�����û�����壬���������ף���throws
			throw new IllegalNameException("�û������Ȳ�������6λ");
		}
		//���������ִ�е��˴������û����Ϸ�
		System.out.println("ע��ɹ�");
	}
}
//���Գ���
public class ExceptionTest06 {
	public static void main(String[] args) {
		//�����û��ṩ���û�������
		String username="jack";
		//ע��
		CustomerService cs=new CustomerService();
		
		try {
			cs.register(username);//���쳣������쳣
		} catch (IllegalNameException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
