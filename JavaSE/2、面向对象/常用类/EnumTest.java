package JavaSE.OO.changyonglei;
/*
 * ö������
 * ���󣺶���һ���������÷������ü�������int���ݵ���
 * �������ɹ����÷�������1�����ִ��ʧ�ܣ��÷�������0
 */
public class EnumTest {
	public static Result divide(int a,int b) {
		try {
			int c=a/b;
			return Result.SUCCESS;//�ɹ�
		}catch(Exception e) {
			return Result.FAIL;//ʧ��
		}
	}
	public static void main(String[] args) {
		int a=10;
		int b=0;
		Result retValue=divide(a,b);
		if(retValue==Result.SUCCESS) {
			System.out.println("�ɹ�");
		}else if(retValue==Result.FAIL) {
			System.out.println("ʧ��");
		}
	}
}
//����һ��ö������
enum Result{
	//�ɹ���ʧ��
	//�淶Ҫ�󣺴�д
	SUCCESS,FAIL//���޵�
}
//�ļ�
enum Season{
	SPRING,SUMMER,AUTUMN,WINTER
}
