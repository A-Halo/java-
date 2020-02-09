package JavaSE.OO.shuzu;
/*
 * ʹ��һά����ģ��ջ�Ľṹ
 * ����ȳ�
 */
class Stack{
	//ʹ������洢����
	//ջ���Դ洢����������͵�Ԫ��
	Object[] elements;
	//ָ��ջ��Ԫ���Ϸ���һ��֡
	int index;
	//ջĬ�ϵĳ�ʼ��������5
	//Constructor
	Stack(){
		this(5);
	}
	Stack(int max){
		elements = new Object[max];
	}
	//ջӦ�ö����ṩѹջ�ķ���
	public void push(Object element) throws StackOperationException{
		/*
		elements[index]=element;
		index++;
		*/
		if(index==elements.length) {
			//�쳣
			throw new StackOperationException("ջ����");
		}
		elements[index++]=element;
	}
	//ջӦ�ö����ṩ��ջ�ķ���
	public Object pop() throws StackOperationException{//ջ��Ԫ�����ⵯ
		/*
		index--;
		return elements[index];
		*/
		if(index==0) {
			//�쳣
			throw new StackOperationException("ջ�ѿ�");
		}
		return elements[--index];
	}
}
class User{
	String name;
	int age;
	User(String name,int age){
		this.age=age;
		this.name=name;
	}
	public String toString() {
		return "User[name="+name+",age="+age+"]";
	}
}
public class ArrayTest06 {
	public static void main(String[] args) {
		Stack s=new Stack();
		User u1=new User("jack1",20);
		User u2=new User("jack2",21);
		User u3=new User("jack3",22);
		User u4=new User("jack4",23);
		User u5=new User("jack5",24);
		//ѹջ
		
		try {
			s.push(u1);
			s.push(u2);
			s.push(u3);
			s.push(u4);
			s.push(u5);
			//s.push(u5);//�����±�Խ�� java.lang.ArrayIndexOutOfBoundsException
		} catch (StackOperationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//��ջ
		try {
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
		} catch (StackOperationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
//�Զ����쳣
class StackOperationException extends Exception{
	public StackOperationException() {
		
	}
	public StackOperationException(String msg) {
		super(msg);
	}
}