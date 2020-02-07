package JavaSE.OO.lei;
/*
 * Object�ࣺ
 * 	1��toString����:����java������ַ�����ʾ��ʽ��
 * 					�����ڿ���̨��java�������ַ�������ʽ��ʾ����
 * 		����ʵ�����У�object�����toString�����Ѿ��������ˡ�
 * 		��ΪtoString����ʵ�ֽ��������
 * 		object�е�toString��������Ҫ����д��
 * 		toString���ص�ֵ������@java������ڴ��ַ������ϣ�㷨�ó���int����ֵ��ת����ʮ������
 * 		��������ͬ����java�����ڶ��е��ڴ��ַ
 */
class Person{
	String name;
	int age;
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	//��дtoString����,������ʾ��ʽΪ:Person[name="zhangsan",age=50]
	public String toString() {
		return "Person[name="+name+",age="+age+"]";
	}
}
public class ObjectTest01 {
	public static void main(String[] args) {
		//����һ��Object���͵Ķ���
		Object o1=new Object();
		//����toString����
		String oStr=o1.toString();
		System.out.println(oStr);//java.lang.Object@52cc8049
		
		//����һ��Person���͵Ķ���
		Person p1=new Person("zhangsan",20);
		//����toString����
		String pStr=p1.toString();
		System.out.println(pStr);//δ��д��JavaSE.OO.lei.Person@27973e9b
								 //��д��Person[name=zhangsan,age=20]
		Person p2=new Person("lisi",20);
		//prnt�������������������һ���������ͣ���Ĭ�ϵ����������͵�toString����
		System.out.println(p2);//Person[name=lisi,age=20]
	}
}
