package JavaSE.OO.fangfa;
/**
 * @author ��ӭ��
 *Forѭ������
 *��дForѭ���ҳ�1-100�����е�����
 *
 *֪ʶ�㣺
 *	forѭ����ʹ��
 *	forѭ��Ƕ��
 *	���
 *	break
 *	ͳ��
 */
public class ForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 int i=14;
		 boolean isSuShu=true;//Ĭ�Ͻ�i����һ������������ڿ����бȽϳ��á�
		 for(int j=2;j<i;j++) {
			 if(i%j==0) {
				 //������
				 isSuShu=true;
				 //�Ѿ�֪��i�Ƿ�����������ѭ����Ч�ʽϸ�
				 break;
			 }
		 }
		 System.out.println(isSuShu ? i+"������" : i+"��������");
		*/
		
		//�����桾����ͳ�ƻ��ơ�
		int count = 0;
		for(int i=2;i<=100;i++) {
			//����Ĵ���ֻ�ж�i�Ƿ�Ϊ����
			boolean isSuShu=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					isSuShu=false;
					break;
				}
			}
			if(isSuShu) {
				System.out.println(i+" ");
				count++;
				if(count==8) {
					System.out.println();
					//����
					count = 0;
				}
			}
		}
	}

}
