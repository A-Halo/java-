package JavaSE.OO.shuzu;
/*
 * ��������Ŀ���
 *���³�����jdk�ṩ�ķ�����ֱ�ӵ���
 *System.arraycopy(Դ���飬Դ����Ŀ�ʼ�±꣬Ŀ�����飬Ŀ������Ŀ�ʼ�±꣬�����ĳ���);
 *
 *��ά�����ص㣺
 *	1����ά������һ�������һά���飬
 *	2�������һά���飬���������һά������ÿһ��Ԫ�ض���һά����
 *	
 */
public class ArrayTest04 {
	//�������õ�ʱ��Ҳ������������һ������
	public static void m1(int[][] a) {
		for(int i=0;i<a.length;i++) {
			//��һά����a[i]���б���
			for(int j=0;j<a[i].length;j++) {
				System.out.println(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		//����m1
		m1(new int[][] {{1},{1,2},{1,2,3}});
		
		
		int[] src= {2,3,4,5,6,7,8};
		int[] dest= {10,11,12,13,14,15,16};
		//��src�е�456������dest�����13��ʼ
		System.arraycopy(src, 2, dest, 3, 3);
		//����
		for(int i=0;i<dest.length;i++) {
			System.out.println(dest[i]);
		}
		
		//��̬��ʼ����ά����
		int[][] a= {{1,2},{3,4},{5,6},{7,8,9}};
		//������������ж��ٸ�һά����
		System.out.println(a.length+"��һά����");
		//��ȡ��һ��һά������ô��
		int[] a0=a[0];
		int a00=a0[0];
		//��ȡ��һ��һά�����еĵ�һ��Ԫ��
		System.out.println(a00);
		System.out.println(a[0][0]);
		//��ȡ���һ��Ԫ��
		System.out.println(a[3][2]);
		System.out.println(a[a.length-1][a[a.length-1].length-1]);
		//������ά����
		//����ѭ������
		for(int i=0;i<a.length;i++) {
			//��һά����a[i]���б���
			for(int j=0;j<a[i].length;j++) {
				System.out.println(a[i][j]+" ");
			}
			System.out.println();
		}
		
		//���ڶ�ά����Ķ�̬��ʼ��
		//����һά���飬ÿ��һά�������ĸ�Ԫ��
		int[][] a1=new int[3][4];
		//����
		for(int i=0;i<a1.length;i++) {
			//��һά����a[i]���б���
			for(int j=0;j<a1[i].length;j++) {
				System.out.println(a1[i][j]+" ");
			}
			System.out.println();
		}
		//��ֵ
		a[1][2]=100;
		
		
	}
}
