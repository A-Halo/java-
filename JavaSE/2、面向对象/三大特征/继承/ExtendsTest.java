package JavaSE.OO.jicheng;
/*
 * ��������֮�̳�
 * 1���̳еĻ������ã����븴�á����Ǽ̳�����Ҫ�������ǣ����˼̳в������Ժ󷽷��ĸ��ǺͶ�̬����
 * 2���﷨��ʽ:
 * 		[���η��б�] class ���� extends ������{
 * 		����=����+����	
 * 		}
 * 3��java�����еļ̳�ֻ֧�ֵ��̳У�һ���಻��ͬʱ�̳ж���࣬C++��֧�ֶ�̳�
 * 		�����ֳ�Ϊ���࣬���࣬superclass
 * 		�����ֳ�Ϊ�����࣬subclass
 * 4������̳и���̳���Щ������
 * 		˽�еĲ�֧�ּ̳�
 * 		���췽����֧�ּ̳�
 * 		�������ݶ����Ա��̳�
 * 5����Ȼjava������ֻ֧�ֵ��̳У�����һ����Ҳ���Լ�Ӽ̳������࣬C��̳�B�࣬B��̳�A�࣬��C��Ӽ̳�A��
 * 6��java���Լ���һ����û����ʾ�ļ̳��κ��࣬����Ĭ�ϼ̳�javaSE�����ṩ��java.lang.object��
 */
public class ExtendsTest {
	public static void main(String[] args) {
		C c=new C();
		c.doSome();//��b�м̳е�doSome����
	}
}
class A{
	public void doSome() {
		System.out.println("doSome");
	}
}
class B extends A{
	
}
class C extends B{
	
}