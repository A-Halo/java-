package com.node.javese.day09.test004;
/**
 * ��Ա����֮ʵ�����������ڶ��󼶱�ı������������ж������ʵ������
 * ʵ������û���ֶ���ֵ��ʱ��ϵͳ��Ĭ��ֵ��
 * 	����ص�ʱ��ֻ�����˴���Ƭ�Σ���û���ü�������������ʵ��������û�г�ʼ����
 * ʵ���ϣ�ʵ���������ڴ�ռ����ڹ��췽��ִ�й�������ɿ��ٵģ���ɳ�ʼ����
 * ϵͳ��Ĭ��ֵҲ���ڹ��췽��ִ�й�������ɵĸ�ֵ��
 *
 */
class Account {
	
	//�˺�
	private String acton;//ʵ������/������������ж������ʵ������
	
	//���                                     
	private double balance;                    
	                                           
	//�޲���������/���췽��                    
	public Account(){                          
		                                       
	}                                          
	//�в������췽��                           
	public Account(String s){                  
		acton = s;                             
	}                                          

	public Account(String acton, double balance) {
		super();
		this.acton = acton;
		this.balance = balance;
	}
	
	public String getActon() {
		return acton;
	}

	public void setActon(String acton) {
		this.acton = acton;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	
}

public class ConstructorTest02 {

	public static void main(String[] args) {

		//��������
		Account act1 = new Account();
		
		System.out.println("�˻�"+act1.getActon());
		System.out.println("���"+act1.getBalance());
		
		Account act2 = new Account("110");
		
		System.out.println("�˻�"+act2.getActon());
		System.out.println("���"+act2.getBalance());
		
	}

}
