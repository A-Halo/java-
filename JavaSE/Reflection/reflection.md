# 反射

## 概述：
> Reflection（反射）是被视为动态语言的关键，反射机制允许程序在执行期借助于Reflection API取得任何类的内部信息，并能直接操作任意对象的内部属性及方法。 


## 获取Class对象的方式：
	1. Class.forName("全类名")：将字节码文件加载进内存，返回Class对象
		* 多用于配置文件，将类名定义在配置文件中。读取文件，加载类
	2. 类名.class：通过类名的属性class获取
		* 多用于参数的传递
	3. 对象.getClass():getClass()方法在Object类中定义着。
		* 多用于对象的获取字节码的方式
	4.使用类的加载器ClassLoader
		* 结论：
			同一个字节码文件(*.class)在一次程序运行过程中，只会被加载一次，不论通过哪一种方式获取的Class对象都是同一个。

	```
	public void test3(){
        //方式一：调用运行时类的属性：.class
        Class<Person> clazz1 = Person.class;
        System.out.println(clazz1);//class com.review.reflection.Person,person类本身
        //方式二：通过运行时类的对象,调用getClass()方法
        Person p1=new Person();
        Class<? extends Person> clazz2 = p1.getClass();
        System.out.println(clazz2);//class com.review.reflection.Person,person类本身
        //方式三：调用Class的静态方法.forName(String classPath)
        try {
            Class<?> clazz3 = Class.forName("com.review.reflection.Person");
            System.out.println(clazz3);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(clazz1==clazz2);//true
        //上面三种方式获取的都是同一个运行时类，同一个内存地址
        //方式四：使用类的加载器ClassLoader
        try {
            ClassLoader classLoader = Person.class.getClassLoader();
            Class<?> clazz4 = classLoader.loadClass("com.review.reflection.Person");
            System.out.println(clazz4);//com.review.reflection.Person
            System.out.println(clazz1==clazz4);//true
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //四种方式获取的运行时类都是一样的，地址相同
    	}
	```
* Class对象功能：
	* 获取功能：
		1. 获取成员变量们
			* Field[] getFields() ：获取所有public修饰的成员变量
			* Field getField(String name)   获取指定名称的 public修饰的成员变量

			* Field[] getDeclaredFields()  获取所有的成员变量，不考虑修饰符
			* Field getDeclaredField(String name)  
		2. 获取构造方法们
			* Constructor<?>[] getConstructors()  
			* Constructor<T> getConstructor(类<?>... parameterTypes)  

			* Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)  
			* Constructor<?>[] getDeclaredConstructors()  
		3. 获取成员方法们：
			* Method[] getMethods()  
			* Method getMethod(String name, 类<?>... parameterTypes)  

			* Method[] getDeclaredMethods()  
			* Method getDeclaredMethod(String name, 类<?>... parameterTypes)  

		4. 获取全类名	
			* String getName()  

	
* Field：成员变量
	* 操作：
		1. 设置值
			* void set(Object obj, Object value)  
		2. 获取值
			* get(Object obj) 

		3. 忽略访问权限修饰符的安全检查
			* setAccessible(true):暴力反射



* Constructor:构造方法
	* 创建对象：
		* T newInstance(Object... initargs)  

		* 如果使用空参数构造方法创建对象，操作可以简化：Class对象的newInstance方法


* Method：方法对象
	* 执行方法：
		* Object invoke(Object obj, Object... args)  

	* 获取方法名称：
		* String getName:获取方法名
