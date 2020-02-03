package JavaSE.OO.guanjianzi;
/*
 * 例子，未传参数时默认显示1970年1月1号
 * 	this可以用在哪里
 * 		可以使用在实例方法中，代表当前对象，语法格式：this.
 * 		可以使用在构造方法中，通过当前的构造方法调用其他的构造方法,语法格式：this(实参)
 */
class Data{
	int year;
	int mouth;
	int day;
	//构造函数
	public Data() {
		//System.out.println();
//		this.day=1;
//		this.mouth=1;
//		this.year=1970;
		//以上代码可以通过调用另一个构造方法来完成
		//但前提是不能创建新的对象，但以下代码创建了一个新的对象
		//new Data(1970,1,1);
		
		//需要采用以下的方式来完成构造方法的调用，这种方式不会创建新的java对象
		this(1970,1,1);//这个语句只能出现在构造函数第一行
	}
	public Data(int year,int mouth,int day) {
		this.day=day;
		this.year=year;
		this.mouth=mouth;
	}
	//get，set方法
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMouth() {
		return mouth;
	}
	public void setMouth(int mouth) {
		this.mouth = mouth;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public void print() {
		System.out.println(this.year+"年"+this.mouth+"月"+this.day+"号");
	}
}
public class ThisTest04 {
	public static void main(String[] args) {
		Data d=new Data();
		d.print();
		Data dd=new Data(2020,1,1);
		dd.print();
	}
}
