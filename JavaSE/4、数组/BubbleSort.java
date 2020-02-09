package JavaSE.OO.shuzu;
/*
 * ð������
 * 	int���͵����飺3 1 6 2 5
 * 	ð������
 * ѡ������
 * 	�ҳ���Сֵ��Ȼ�������Сֵ����ǰ�ߵ����ݽ���λ�á�
 * ���ַ�����
 * 	���ַ������ǽ������Ѿ�����Ļ�����
 * 	1 3 5 9 11 13 56 ��С���󣬲���û���ظ���Ԫ��
 * 	������һ���Ѿ��ź����int���͵����飺Ҫ����ٲ��ҳ�13���Ԫ�ص��±�
 */
public class BubbleSort {
	public static void main(String[] args) {
		int[] a= {3,1,6,2,5};
		//ð������
		//��ʼ����
		for(int i=a.length-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(a[j]>a[j+1]) {
					//����λ��
					int temp;
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		//����
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		//ѡ������
		for(int i=0;i<a.length-1;i++) {
			//�����һ�����ݾ�����Сֵ
			//��¼��Сֵ�±�
			int min=i;
			
			for(int j=i+1;j<a.length;j++) {
				if(a[min]> a[j]) {
					//��min���¸�ֵ
					min = j;
				}
			}
			//���ǽ���λ��
			if(min!=i) {
				int temp;
				temp=a[i];
				a[i]=a[min];
				a[min]=temp;
			}
		}
		//����
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		//���ַ�����
		//1,3,4,5,7,8,9,10,23,15,29 ��С���󣬲���û���ظ���Ԫ��,����10Ԫ�ص��±�
		int[] a1= {1,3,4,5,7,8,9,10,23,15,29};
		int destElement = 10;
		int index=binarySearch(a1,destElement);//����ҵ������±꣬�Ҳ�������-1
		System.out.println((destElement==-1)?destElement+"���Ԫ�ز�����":destElement+"�������е��±��ǣ�"+index);
	}
	//�۰�����㷨
	private static int binarySearch(int[] a1, int destElement) {
		int begin=0;
		int end=a1.length-1;
			
		while(begin<=end) {
			int mid=(begin+end)/2;
			if(a1[mid]==destElement) {
				return mid;
			}else if(a1[mid]>destElement) {
				end=mid-1;
			}else if(a1[mid]<destElement) {
				begin = mid+1;
			}
		}
		return -1;
	}
}
/*ѡ������
 * 3 1 6 2 5
 * ��һ��ѭ��
 * 1 3 6 2 5
 * 
 * 3 6 2 5
 * �ڶ���ѭ��
 * 2 6 3 5 
 * 
 * 6 3 5 
 * ������ѭ��
 * 3 6 5 
 * 
 * 6 5 
 * ���Ĵ�ѭ��
 * 5 6
 * 
 */
