package com.node.javese.day09.test003;
class Customer {
	//ÊôÐÔ
		private int id;
		private String name;
		private int age;
		private String addr;
	//setter and getter ·½·¨
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getAddr() {
			return addr;
		}
		public void setAddr(String addr) {
			this.addr = addr;
		}
	}

public class CustomerTest {

	public static void main(String[] args) {
		Customer c = new Customer();
		c.setId(10);
		c.setAge(20);
		c.setName("zhangdan");
		c.setAddr("beijin");
		System.out.println(c.getAddr());
		System.out.println(c.getAge());
		System.out.println(c.getId());
		System.out.println(c.getName());
	}
}
