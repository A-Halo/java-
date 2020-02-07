package JavaSE.OO.lei;
/*
 * Object��:
 * 	2��equals������
 * 		public boolean equals(Object obj){
 * 			return (this==obj);
 * 		}
 * 		o1.equals(o2);o1��this,o2��obj
 * 		==����������������ͣ���Ƚ��ڴ��ַ����ַ��ͬ������ture����֮false
 * 		object�е�equals�����Ƚϵ����������õ��ڴ��ַ
 * 		java�����е�equals�������Ŀ�����ж����������Ƿ�һ��
 * 		equals�����Ƚϵ����ڴ��ַ������ʵҵ���У�Ӧ�ñȽ�����
 * 		����equals����������Ҫ��д
 * ����java��������αȽ������ַ����Ƿ�һ��
 * 		������˫�Ⱥţ�ֻ�ܵ���String���е�equals����
 * 3��finalize����
 * 		������������Garbage Collection����Ҳ��GC
 * 		finalize����ÿ��java�����У�
 * 		finalize��������Ҫ����Աȥ���ã���ϵͳ�Զ����ã�
 * 		java�������û�и��������ָ���������java�����Ϊ�������ݣ��ȴ������������Ļ���
 * 		�����������ڻ������java����֮ǰ���Զ����øö����finalize����	
 * 4��hashCode����
 * 		���ص��Ǹö���Ĺ�ϣ��ֵ
 * 		java������ڴ��ַ������ϣ�㷨�ó�int���͵���ֵ
 */
class Star{
	//���֤��
	int id;
	//����
	String name;
	
	public Star(int id,String name) {
		this.id=id;
		this.name=name;
	}
	//���������֤��һ�£�����һ������ͬһ����
	public boolean equals(Object obj) {
		if(this==obj) return true;
		if(obj instanceof Star) {
			Star s=(Star)obj;//ǿ������ת��
			if(s.id==this.id && s.name.equals(name)) {//�Ƚ��ַ���
				return true;
			}
		}
		return false;
	}
}
public class ObjectTest02 {
	public static void main(String[] args) {
		Object o1=new Object();
		Object o2=new Object();
		
		boolean b1=o1.equals(o2);
		System.out.println(b1);//false
		
		Star s1=new Star(100,"zhangsan");
		Star s2=new Star(100,"zhangsan");
		System.out.println(s1.equals(s2));//false
		
		//�Ƚ������ַ����Ƿ����
		String a1=new String("ABC");
		String a2=new String("ABC");
		System.out.println(a1==a2);//false
		//String�Լ���д��object�е�equals�������Ƚϵ�������
		System.out.println(a1.contentEquals(a2));//false
		
		ObjectTest02 t=new ObjectTest02();
		System.out.println(t.hashCode());//1389133897
	}
}
