package JavaSE.OO.shuzu;
/*
 * 使用一维数组模拟栈的结构
 * 后进先出
 */
class Stack{
	//使用数组存储数据
	//栈可以存储多个引用类型的元素
	Object[] elements;
	//指向栈顶元素上方的一个帧
	int index;
	//栈默认的初始化容量是5
	//Constructor
	Stack(){
		this(5);
	}
	Stack(int max){
		elements = new Object[max];
	}
	//栈应该对外提供压栈的方法
	public void push(Object element) throws StackOperationException{
		/*
		elements[index]=element;
		index++;
		*/
		if(index==elements.length) {
			//异常
			throw new StackOperationException("栈已满");
		}
		elements[index++]=element;
	}
	//栈应该对外提供弹栈的方法
	public Object pop() throws StackOperationException{//栈顶元素往外弹
		/*
		index--;
		return elements[index];
		*/
		if(index==0) {
			//异常
			throw new StackOperationException("栈已空");
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
		//压栈
		
		try {
			s.push(u1);
			s.push(u2);
			s.push(u3);
			s.push(u4);
			s.push(u5);
			//s.push(u5);//数组下标越界 java.lang.ArrayIndexOutOfBoundsException
		} catch (StackOperationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//弹栈
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
//自定义异常
class StackOperationException extends Exception{
	public StackOperationException() {
		
	}
	public StackOperationException(String msg) {
		super(msg);
	}
}