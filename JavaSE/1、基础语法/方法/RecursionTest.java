package JavaSE.OO.fangfa;
/*
 * �����ĵݹ����
 * 1��ʲô�ǵݹ��㷨
 * 		���������������
 * 2���ݹ�ܺ��ڴ棬���Բ��þͲ���
 * 3���ݹ����Ҫ�н�������
 * 4���ݹ鼴ʹ���˽�����������ʹ������������ȷ�ģ�Ҳ���ܷ����ڴ����������Ϊ�ݹ�̫����
 */
public class RecursionTest {
	public static void main(String[] args) {
		doSome();
		
		//����1-n�ĺ�
		int n=4;
		int retValue=sum(n);
		System.out.println(retValue);
		
		//����n�Ľ׳�
		int m=5;
		int value=method(m);
		System.out.println(value);
	}
	//���´���Ƭ����Ȼֻ��һ�ݣ����ǿ��Ա��ظ����ã�����ֻҪ����doSome�����ͻ���ջ�ڴ������·���һ���ڴ�ռ�
	public static void doSome() {
		System.out.println("doSome begin");
		doSome();
		System.out.println("doSome over");
	}//�ᷢ��ջ�ڴ��������jvmֹͣ����
	
	//�����
	public static int sum(int n) {
		if(n==1) {
			return 1;
		}else {
		int retValue =n+sum(n-1);
		return retValue;
		}
	}
	//����׳�
	public static int method(int m) {
		if(m==1) {
			return 1;
		}else {
			return m*method(m-1);
		}
	}
}
