package JavaSE.OO.shuzu;
/*
 * ����main�����е�String[] args
 * 1��String[] args��ר���������������в�����
 */
public class ArrayTest03 {
	public static void main(String[] args) {
		System.out.println("String���͵�������Ԫ�صĸ���"+args.length);
		
		//����
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
		}
		//��������ʱ�ṩ�û��������룬�м��ÿո����
		//eclipse��Run as����ʱѡ��Run Configurations����ѡ��Arguments�е�Program Arguments���������������
		if(args.length !=2) {
			System.out.println("��ʽ����");
		}
		
		String username=args[0];
		String password=args[1];
		//java�бȽ��ַ����Ƿ���ȣ�����ʹ��equals����
		//String������SUN�ṩ���Ѿ���equals��д�ˣ��Ƚϵ�������
		if("admin".equals(username)&&"123".equals(password)) {//���ַ�ʽ���Ա����ָ���쳣
			System.out.println("��¼�ɹ�");
		}else {
			System.out.println("��¼ʧ��");
		}
	}
}
