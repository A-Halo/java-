package JavaSE.OO.guanjianzi;
/*
 * ����java�е�this�ؼ��֣�
 * 	1��this��һ���ؼ��֣�����Ϊ�����
 * 	2��this��һ�����ã�this��һ��������this�����б������ڴ��ַָ��������this�洢��jvm���ڴ�java�����ڲ�
 * 	3������100��������һ�ٸ�this��ÿ��this���ǲ�ͬ��
 * 	4,��this���Գ����ڡ�ʵ�����������У�thisָ��ǰ����ִ�е���������Ķ���(this����ǰ����)
 * 	5��this����������ǿ���ʡ�Ե�
 * 	6��this����ʹ���ڴ���static�ؼ��ֵķ�����
 */

class Customer{
	//���������ڴ�Ķ����ڲ��洢�����Է��ʸ�����ʱ�������ȴ�������ͨ�����õķ�ʽ���ʡ�
	String name;//ʵ��������������á�����.���ķ�ʽ����
	
	//���췽��
	public Customer() {
		
	}
	//������static�ؼ��ֵķ�����Ϊʵ��������ʵ���������ʷ�ʽΪ"����."
	//������static�ؼ��ֵı�����Ϊʵ��������ʵ���������ʷ�ʽΪ"����."
	//��һ����Ϊ/����ִ�й�������Ҫ����Ĳ��룬���������һ������Ϊ��ʵ��������������static�ؼ���
	//���·�������Ϊʵ����������Ϊÿ���˿��ڹ���ʱ�����ս����ͬ
	public void shopping() {
		//����name��һ��ʵ���������������name���ʵ�ʱ��һ�����ʵ��ǵ�ǰ�����name
		//���Զ��������"this."�ǿ���ʡ�Ե�
		System.out.println(name+"�ڹ���");
		//����д��������.������
		System.out.println(this.name+"�ڹ���");//˭����shopping��this����˭
	}
	
	//����static�ķ���
	public static void doSome(){
		//���ִ�й�����û��"��ǰ����"����Ϊ����static�ķ�����ͨ�������ķ�ʽ���ʵģ����Բ�����this
		//System.out.println(name);name��ʵ��������ֻ��ͨ�����÷�ʽ����
		//����static�����в���ʹ��this�����ò���Ҫ����ֱ����������
		
		//��������name��Ҫ��������
		Customer c=new Customer();
		System.out.println(c.name);//������ʵ�name��c����ָ���name�����ǵ�ǰ�����name
	}
	
}
public class ThisTest01 {
	public static void main(String[] args) {
		//����Customer����
		Customer c1=new Customer();
		c1.name="����";
		//c1���˭����shopping��this����˭
		c1.shopping();
		
		//����Customer����
		Customer c2=new Customer();
		c2.name="����";
		//c2���˭����shopping��this����˭
		c2.shopping();
		
		//����doSome����(���η��б�����static)
		//����"����."�ķ����Ƿ��ʣ���Ȼ���������ִ�е�ʱ����Ҫ����Ĳμ�
		Customer.doSome();
	}
}
