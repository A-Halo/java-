package JavaSE.OO.guanjianzi;
/*
 * "this."�������־ֲ�������ʵ��������ʱ����ʡ
 * ���췽����get��set����������
 */
class User{
	
	private int id;
	private String name;
	
	//���캯��
		public User(int id, String name) {
			this.id = id;
			this.name = name;
		}
		
	//get��set����	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		//this.id�е�id��ʵ������
		this.id=id;//id�Ǿֲ�����
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
}
public class ThisTest03 {
	public static void main(String[] args) {
		//���췽����get��set��������
		User u=new User(100,"zhangsan");//ʹ�ù��캯����������
		
		System.out.println(u.getId());
		System.out.println(u.getName());
		
		//���޸����֣�����set�����޸ģ������ٴ���һ��
		u.setName("lisi");
	}
}
