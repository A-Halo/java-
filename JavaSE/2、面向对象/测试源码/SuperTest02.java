package JavaSE.OO.guanjianzi;
/*
 * super���ڹ��췽����
 * ���췽�����ܱ��̳У�����Ӱ�����
 * 	�﷨��super(ʵ��);
 * 	���ã�ͨ������Ĺ��췽�������ø���Ĺ��췽��
 * һ�����췽����һ�����û��this();Ҳû����ʾ��������super(),ϵͳ��Ĭ�ϵ���super();
 * super()�ĵ���ֻ�ܷ��ڹ��췽���ĵ�һ��
 * super()��this()���ܹ���
 * super()�����˸����еĹ��췽�������ǲ����ᴴ���������ֻ����ǰ�������ֵ
 * 
 * ��java������ֻҪ����java������object�е��޲����Ĺ��췽��һ����ִ��
 * 
 * ���췽��ִ�в�һ����������
 * 
 * ����ģʽȱ��:���췽��˽�л�������ģʽ�������޷����̳У�û������
 */
//�˻�
class Account{
	private String actno;
	private double balance;//���
	//���췽��
	public Account(){
		System.out.println("Account���޲������췽��ִ��");
	}
	public Account(String actno,double balance) {
		this.actno=actno;
		this.balance=balance;
	}
	//set��get����
	public void setActno(String actno) {
		this.actno=actno;
	}
	public String getActno() {
		return actno;
	}
	public void setBalance(Double balance) {
		this.balance=balance;
	}
	public double getbalance() {
		return balance;
	}
}
//���ÿ�
class DebitAccount extends Account{
	//��������������
	private double debit;
	public DebitAccount(String actno,double balance,double debit) {
		//ͨ������Ĺ��췽�������ø���Ĺ��췽���������Ǹ���ǰ�����Ͷ����еĸ����Ͷ���ֵ
		super(actno,balance);//���ᴴ������ֻ��ֵ
	}
	//���췽�����޲���
	public DebitAccount() {
		//super();//ϵͳĬ�ϼ���super
		super("�˺�",111.0);
		//System.out.println("DebitAccount���޲ι��췽��ִ��");
	}
	//set��get����
	public double getDebit() {
		return debit;
	}

	public void setDebit(double debit) {
		this.debit = debit;
	}
	
}
public class SuperTest02 {
	public static void main(String[] args) {
		DebitAccount da=new DebitAccount();//ϵͳĬ�ϼ�super,��super��ִ�е���Account�Ĺ��췽��
		
	}
}
