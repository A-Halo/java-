package JavaSE.OO.changyonglei;
/*
 * ������ʽ
 * ������ʽ��һ���ַ�ģ�ͣ�ר�����ַ�����ʽƥ���
 * ������ʽ��ͨ�õ�
 * 
 * ����:������ʽ"^a{2}$"��ʾ����a�ַ�����ͬ��"aa
 * \d ����
 * \D ������
 * \w Ӣ����ĸ
 * \W ��Ӣ����ĸ
 * 
 * java.lang.StringBuffer;
 * java.lang.StringBuilder;
 * 
 * 1��StringBuffer��StringBuilder��ʲô
 * 		��һ���ַ���������
 * 2������ԭ��
 * 	Ԥ�����ڴ�������һ��ռ䣬�������ַ�����
 *	���Ԥ���Ŀռ䲻���ã�������Զ����ݣ������ɸ�����ַ�����
 * 3��StringBuffer��StringBuilder��String��������
 *	String�ǲ��ɱ���ַ����У��洢���ַ�����������
 *	StringBuffer�ײ���һ��char���飬���Ǹ�char�����ǿ��Ա��
 *	���ҿ����Զ�����
 * 4��StringBuffer��StringBuilderĬ�ϳ�ʼ��������16
 * 5������Ż�StringBuffer��StringBuilder
 * 		����ڴ���StringBuffer֮ǰ��Ԥ��StringBuffer�Ĵ洢����
 * 		Ȼ���ٴ���StringBuffer��ʱ�����ָ����ʼ�������ķ�ʽ����StringBuffer
 * 		Ϊ�˼��ٵײ�����Ŀ��������Ч��
 * 6��StringBuilder��String����
 * 		StringBuffer���̰߳�ȫ�ġ�(�����ڶ��̻߳�����ʹ�ò����������)
 * 		StringBuilder�Ƿ��̰߳�ȫ�ģ�(�ڶ��̻߳�����ʹ�ÿ��ܻ��������)
 */
public class StringTest03 {
	public static void main(String[] args) {
		System.out.println("aa".matches("^a{2}$"));
		
		String s1="aasdadasfhjkasf15651afhjakfhak454affafkl";
		//��dd�滻Ϊ"��"
		System.out.println(s1.replaceAll("dd", "��"));
		//��dd�滻Ϊ"��"
		System.out.println(s1.replaceAll("d{2}", "��"));
		//�������滻Ϊ"��"
		System.out.println(s1.replaceAll("\\d", "��"));
		//���������滻Ϊ"��"
		System.out.println(s1.replaceAll("\\D", "��"));
		
		//�����ַ�������������
		StringBuffer sb=new StringBuffer();//16
		//������StringBuffer��׷���ַ���
		String[] ins= {"��","��","rap"};
		//�Ƽ��ַ���Ƶ��ƴ��ʹ��StringBuffer����StringBuilder
		
		for(int i=0;i<ins.length;i++) {
			if(i==ins.length-1) {
				sb.append(ins[i]);//׷��
			}else {
				sb.append(ins[i]);
				sb.append(",");
			}
		}
		System.out.println(sb);//��,��,rap
	}
}
