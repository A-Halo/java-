## Annotation(注解)

### 1.1 概述

注解是jdk 5.0 新增的功能，Annotation 其实就是代码里的特殊标记, 这些标记可以在编译, 类加载, 运行时被读取, 并执行相应的处理。

通过使用 Annotation,程序员可以在不改变原逻辑的情况下, 在源文件中嵌入一些补充信息。

在JavaSE中，注解的使用目的比较简单，例如标记过时的功能，忽略警告等。

在JavaEE/Android中注解占据了更重要的角色，例如用来配置应用程序的任何切面，代替JavaEE旧版中所遗留的繁冗代码和XML配置等。

`框架 = 注解 + 反射机制 + 设计模式`

### 1.2 声明注解

注解是一种代码级别的说明.它与*`类`*,*`接口`*,*`枚举`*在同一个层次,它可以声明在*`包`*,*`类`*,*`字段`*,*`方法`*,*`局部变量`*,*`方法参数`*等的前面,用来对这些元素进行说明,注释.

### 1.3 注解的分类

- 基本注解
- 元注解
- 自定义注解

### 1.4 基本注解

`java.lang`包下注解分别是 : `@Override`,`@Deprecated`,`@SuppressWarnings`,`@FunctionalInterface`,`@SafeVarargs`,

- `@Override`: 限定重写父类方法, 该注解只能用于方法

  ```java
  class Student extends Person implements Info{
      @Override
      public void work(){
          System.out.println("学生工作");
      }
      @Override
      public void show() {
  
      }
  }
  ```

- `@Deprecated`: 用于表示所修饰的元素(类, 方法等)`已过时`。表示此方法或类不再建议使用，调用时也会出现删除线，通常是因为所修饰的结构危险或存在更好的选择，如`ViewPager`中的`setOnPageChangeListener`方法，已过时

  ```java
  @Deprecated
  public void setOnPageChangeListener(OnPageChangeListener listener) {
      mOnPageChangeListener = listener;
  }
  ```

- `@SuppressWarnings`: 抑制编译器警告

  ```java
  public class AnnotationTest {
      public static void main(String[] args) {
          @SuppressWarnings({"unused","rawtypes"})
          ArrayList arrayList=new ArrayList();
     }
  }
  ```
  
- `@FunctionalInterface`： 示例

```java
//`Java8`为函数式接口引入了一个新注解`@FunctionalInterface`,其主要用于编译错误检查,
//加上该注释后当你写的接口不符合函数式定义时,编译器就会报错 !
//注意: 是否添加`@FunctionalInterface`对于接口是不是函数式接口没有影响,
//该注释只是提醒`编译器`去检查该接口是否仅仅包含一个抽象方法.
@FunctionalInterface
interface functionalInterface {

	// 注意: 函数式接口中只能有一个抽象方法 !
	void myLambda(String message);

	// 函数式接口里是可以包含默认方法,因为默认方法不是抽象方法,其有一个默认实现,
    //所以是符合函数式接口的定义的.
	default void defaultMethod() {
		// method body..
	}

	// 函数式接口里是可以包含静态方法,因为静态方法不能是抽象方法,是一个已经实现了的方法,
    //所以是符合函数式接口的定义的.
	static void staticMethod() {
		// method body..
	}

	// 函数式接口里是可以包含Object里的public方法,这些方法对于函数式接口来说,
	// 不被当成是抽象方法(虽然它们是抽象方法).因为任何一个函数式接口的实现,默认都继承了Object类,
    //其包含了来自java.lang.Object里对这些抽象方法的实现!
	@Override
	boolean equals(Object object);

}

//使用`@FunctionalInterface`注解的函数式接口继而可以使用`Lambda`表示式来表示该接口的一个实现.
//(Java8 之前一般是使用匿名类实现的).
//functionalInterface  f = message->System.out.println();
```
- `@SafeVarargs`： 声明具有模糊类型（比如：泛型）的可变参数的构造函数或方法时，Java编译器会报unchecked警告。鉴于这些情况，如果程序员断定声明的构造函数和方法的主体不会对其varargs参数执行潜在的不安全的操作，可使用@SafeVarargs进行标记，这样的话，Java编译器就不会报unchecked警告。

  只能用于标记构造函数和方法，由于保留策略声明为RUNTIME，所以此注解可以在运行时生效。

```java
public class SafeVarargsAnnotation<S>{

    private S[] args;

    //构造函数可以使用@SafeVarargs标记
    @SafeVarargs
    public SafeVarargsAnnotation(S... args){
        this.args = args;
    }

    //此处不能使用@SafeVarargs，因为此方法未声明为static或final方法，如果要抑制unchecked警告，可以使用@SuppressWarnings注解
    @SuppressWarnings("unchecked")
    //@SafeVarargs
    public void loopPrintArgs(S... args){
        for (S arg : args) {
            System.out.println(arg);
        }
    }

    //final方法可以使用@SafeVarargs标记
    @SafeVarargs
    public final void printSelfArgs(S... args){
        for (S arg : this.args) {
            System.out.println(arg);
        }
    }

    public static void main(String[] args) {
        SafeVarargsAnnotation.loopPrintInfo("A", "B", "C");
    }

    //static方法可以使用@SafeVarargs标记
    @SafeVarargs
    public static <T> void loopPrintInfo(T ... infos){
        for (T info : infos) {
            System.out.println(info);
        }
    }

}
```

如果以上把@SafeVarargs标记注释掉，在编译时就会报unchecked警告


### 1.5 元注解

`java.lang.annotation`包下的注解分别是 : `@Retention`,`@Documnetd`,`@Target`,`@Inherited`

以上四个注解被称为`元注解`,其作用是负责注解其它的注解,用来提供对其它`annotation`类型做说明.

```java
@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE, MODULE})
@Retention(RetentionPolicy.SOURCE)
public @interface SuppressWarnings {
    String[] value();
}
```

注意: `JDK8`在`java.lang.annotation`中添加了`Repeatable`和`Native`注解.其中`Repeatable`支持重复注解,`Native`用于注解本机代码可以访问的域变量

- `Retention`：指定所修饰的 Annotation 的生命周期：SOURCE\CLASS\RUNTIME，只有声明为RUNTIME生命周期的注解，才能通过反射获取。

  1. **RetentionPolicy.SOURCE**：注解只在源码阶段保留，编译器开始编译时它将被丢弃忽视
  2. **RetentionPolicy.CLASS**：注解会保留到编译期，但运行时不会把它加载到JVM中（默认的保留策略，注解会在class字节码文件中存在，但运行时无法获得）
  3. **RetentionPolicy.RUNTIME**：注解可以保留到程序运行时，它会被加载到JVM中，所以程序运行过程中可以获取到它们

- `Target`:用于指定被修饰的 Annotation 能用于修饰哪些程序元素

  1. **ElementType.PACKAGE**：可作用在包上
  2. **ElementType.TYPE**：可作用在类、接口、枚举上
  3. **ElementType.ANNOTATION_TYPE**：可以作用在注解上
  4. **ElementType.FIELD**：可作用在属性上
  5. **ElementType.CONSTRUCTOR**：可作用在构造方法上
  6. **ElementType.METHOD**：可作用在方法上
  7. **ElementType.PARAMETER**：可作用在方法参数上
  8. **ElementType.LOCAL_VARIABLE**：可作用在局部变量上，例如方法中定义的变量
  9. `ElementType.TYPE_PARAMETER`:可作用在类参数的声明上   如：泛型声明。Since jdk1.8以后添加的
  10. `ElementType.TYPE_USE`:可作用在使用的类型  Since jdk1.8以后添加的

- `Documented`:表示所修饰的注解在被javadoc解析时，保留下来。（不常用）

- `Inherited`:被它修饰的 Annotation 将具继承性，一个父类被该类注解修饰，那么它的子类如果没有任何注解修饰，就会继承父类的这个注解。（不常用）

  ```java
  @Inherited
  @Target(ElementType.TYPE)
  @Retention(RetentionPolicy.RUNTIME)
  public @interface Person {
  }
   
  @Person
  public class Teacher {
  }
   
  public class TeacherA extends Teacher{
  }
  ```

  注解Person被@Inherited修饰，Teacher被Person修饰，TeacherA继承Teacher（TeacherA上又无其他注解），那么TeacherA就会拥有Person这个注解。
  

#### 重复注解

- `Repeatable`：支持重复注解

  ```java
  @Target(ElementType.TYPE)  
  @Retention(RetentionPolicy.RUNTIME)
  public @interface Persons {
     Person[] value();
  }
  
  @Repeatable(Persons.class)
  public @interface Person{
      String role() default "";
  }
  
  @Person(role="Teacher")
  @Person(role="Student")
  @Person(role="Doctor")
  public class Man {
      String name="";
  }
  ```

  

### 1.6  自定义注解

#### 注解的属性

注解的属性也叫做成员变量，注解只有成员变量，没有方法。注解的成员变量在注解的定义中以“无形参的方法”形式来声明，其方法名定义了该成员变量的名字，其返回值定义了该成员变量的类型。

```java
@Repeatable(Persons.class)
public  @interface Person{
    String role() default "";
}
```

注解Person里面的role属性，role是一个成员变量，只不过书写形式为 String role() default ""； 即所谓的“无形参的方法”形式书写，给role设置了默认值为空字符串 default ""。

#### 标记注解

因为*`标记注解没有成员`*,所以应用标记注解时,后面不需要有圆括号.如果提供空的圆括号,也不会报错,但不是必需的.类似地,对于所有成员都使用*`默认值(default)`*的注解也可以没有圆括号.

```java
@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker_annotation {
}
```



#### 步骤

- 注解声明为：@interface

 * 内部定义成员，通常使用value表示
 * 可以指定成员的默认值，使用default定义
 * 如果自定义注解没成员，表明是一个标识作用。

- 自定义注解是以元注解为基础注解自己定义的注解。

自定义运行是注解分为两步：声明注解、解析注解。

#### 声明注解

```java
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)//指定保留策略
public @interface Animal {
    int value() default 5;
}
```

上面是自己定义了一个注解Animal，Animal含有一个int类型的属性，该属性的名称为value，默认值为5。该注解主要用来注解成员变量，作用于运行期。

#### 解析注解

```java
public class TestMain {
 
    @Animal(value = 12)
    public int age;
    public static void main(String[] args) {
        TestMain testMain=new TestMain();
        Class clazz=testMain.getClass();
        try {
            Field fieldAge=clazz.getField("age");
            Animal animal=fieldAge.getAnnotation(Animal.class);
            System.out.println(animal.value()+"===岁===");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
```

上面通过类的反射机制解析注解，先拿到TestMain类里面的age成员变量，再通过成员变量调用getAnnotation方法拿到该成员变量的注解。

#### 反射获取注解信息

- 定义注解

```java
@Retention(RetentionPolicy.RUNTIME)//指定保留策略
@Target({ ElementType.METHOD, ElementType.TYPE })
public @interface MyAnnotation {

	int id() default 1;

	String name() default "default value";
}
```

- 反射获取自定义注解信息

```java
public class getAnnotationInfo {
	@MyAnnotation(name = "Hello annotation !")
	public void fun(double d, String s) {
	}

	public static void main(String[] args) {
		getAnnotationInfo getInfo = new getAnnotationInfo();

		// 获取Class对象
		Class<?> class1 = getInfo.getClass();
		try {
			// 通过调用Class泛型类提供的`getMethod`方法获取与方法相关的信息
			Method method = class1.getMethod("fun", double.class, String.class);
			// 通过调用`getAnnotation`获取与对象相关联的特定注解
			MyAnnotation annotatioin = method.getAnnotation(MyAnnotation.class);
			System.out.println("id : " + annotatioin.id() + "\nname : " + annotatioin.name());
            //id : 1 
            //name : Hello annotation 
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
	}
}
```

- 反射获取所有注解

```java
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation2 {

	String description();
}
@MyAnnotation()
@MyAnnotation2(description = "Test class")
public class getAllAnnotationInfo {

	@MyAnnotation(id = 1, name = "Hello annotation !")
	@MyAnnotation2(description = "Test method")
	public void fun() {

	}

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		getAllAnnotationInfo allAnnotationInfo = new getAllAnnotationInfo();

		// 通过`getAnnoations`获取该类所有注解信息
		Annotation annotation[] = allAnnotationInfo.getClass().getAnnotations();

		System.out.println("`getAllAnnotationInfo`类的所有注解 : ");
		for (Annotation info : annotation) {
			System.out.println(info);
		}

		System.out.println();
		// 通过调用Class泛型类提供的`getMethod`方法获取与方法相关的信息
		Method method = allAnnotationInfo.getClass().getMethod("fun");
		// 通过调用`getAnnotation`获取与对象相关联的特定注解
		annotation = method.getAnnotations();

		System.out.println("方法`fun()`的所有注解 : ");
		for (Annotation info : annotation) {
			System.out.println(info);
		}
	}

}
```

