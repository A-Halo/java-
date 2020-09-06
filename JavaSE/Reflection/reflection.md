## Reflection(反射)

### 1.1 概述

Reflection（反射）是被视为动态语言的关键，反射机制允许程序在执行期 借助于Reflection API取得任何类的内部信息，并能直接操作任意对象的内部属性及方法。 

- 框架 = 反射 + 注解 + 设计模式。

### 1.2 反射机制提供的功能

1. 在运行时判断任意一个对象所属的类
2. 在运行时构造任意一个类的对象
3. 在运行时判断任意一个类所具有的成员变量和方法
4. 在运行时获取泛型信息
5. 在运行时调用任意一个对象的成员变量和方法
6. 在运行时处理注解
7. 生成动态代理

### 1.3 反射相关的主要API

- `java.lang.Class`:代表一个类
- `java.lang.reflect.Method`:代表类的方法
- `java.lang.reflect.Field`:代表类的成员变量
- `java.lang.reflect.Constructor`:代表类的构造器

### 1.4 详解Class类

- 先上代码，了解反射的基本实现步骤，通过反射对Person类进行操作


```java
    @Test
    public void test2() throws Exception {
        Class<Person> clazz = Person.class;
        //通过反射创建Person类对象
        Constructor cons = clazz.getConstructor(String.class, int.class);
        Object obj = cons.newInstance("tom", 12);
        Person p=(Person)obj;
        System.out.println(p.toString());//Person{name='tom', age=12}
        //通过反射调用对象指定的属性和指定的方法
        //调用属性
        Field age = clazz.getDeclaredField("age");
        age.set(p,2);
        System.out.println(p);//Person{name='tom', age=2}
        //调用方法
        Method show = clazz.getDeclaredMethod("show");
        show.invoke(p);//show()方法

        //通过反射，可以调用person类的私有属性和方法
        Constructor<Person> constructor = clazz.getDeclaredConstructor(String.class);
        constructor.setAccessible(true);//这一步是调用私有构造器的关键
        Person person = constructor.newInstance("jerry");
        System.out.println(person);//Person{name='jerry', age=0}
        //调用私有属性
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);//这一步是调用私有属性的关键
        name.set(person,"zhangsan");
        System.out.println(person);//Person{name='zhangsan', age=0}
        //调用私有方法
        Method showNation = clazz.getDeclaredMethod("showNation", String.class);
        showNation.setAccessible(true);
        Object nation = showNation.invoke(person,"中国");//showNation()方法
        String nat=(String)nation;
        System.out.println(nat);//中国
    }
```
首先，根据上述代码，首先要获取一个Class类的实例(clazz)，此实例就是Person.class，Person.class就是运行时类

1. 类的加载过程：
   程序经过javac.exe命令以后，会生成一个或多个字节码文件(.class结尾)。
   接着我们使用java.exe命令对某个字节码文件进行解释运行。相当于将某个字节码文件
   加载到内存中。此过程就称为类的加载。加载到内存中的类，我们就称为运行时类，此
   运行时类，就作为Class的一个实例。
2. 换句话说，Class的实例就对应着一个运行时类。
3. 加载到内存中的运行时类，会缓存一定的时间。在此时间之内，我们可以通过不同的方式
   来获取此运行时类。

在Object类中定义了以下的方法，此方法 将被所有子类继承： 

`public final Class getClass()`
以上的方法返回值的类型是一个Class类， 此类是Java反射的源头，实际上所谓反射从程序的运行结果来看也很好理解，即： 可以`通过对象反射求出类的名称`。

- 正常方式 : 引入需要的`包类`名称 ——> 通过`new`实例化 ——> 取得实例化对象
- 反射方式 : 实例化对象 ——> `getClass()` ——> 得到完整的`包类`名称

### 1.5 四种获取Class类实例的方式

```java
    @Test
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
        //方式四：使用类的加载器ClassLoader，通过classLoader获取Class类实例
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

### 1.6 哪些类型有Class对象

- class： 外部类，成员(成员内部类，静态内部类)，局部内部类，匿名内部类 
- interface：接口 
- []：数组 
- enum：枚举 
- annotation：注解@interface 
- primitive type：基本数据类型 
- void

### 1.7 类加载器ClassLoader

类加载器的作用:把`类(class)`装载进内存.如下示例

```
Java源文件(*.java) ——Java编译器——> 字节码文件(*.class) ——类加载器+字节码效验器+解释器——> 操作系统平台
```

**类加载的过程**：

当程序主动使用某个类时,如果该类还未被`加载`到内存中,则系统会通知如下三个步骤来对该类进行初始化.

1. 类的加载 : 将类的`Class`文件读入到内存,并为之创建一个`java.lang.Class`对象,此过程由类加载器完成.
2. 类的链接 : 将类的`二进制`数据合并到`JRE`中.
3. 类的初始化 : `JVM`负责对类进行初始化.

`JVM`规范定义了两种类型的类加载器:`启动类加载器(bootstrap)`和`用户自定义加载器(user-defined class loader)`，JVM在运行时会产生`三个类加载器`

1. 引导类加载器:`JVM`自带的类加载器,负责Java平台核心库,用来加载核心类库,该加载器无法直接获取.
2. 扩展类加载器:负责`jar包`或将指定目录下的`jar包`装入工作库.
3. 系统类加载器:负责`java-classpath`或`java.class.path`所指的目录下的类与`jar`包装入工作.(最常用)

```java
    @Test
    public void test1() {
        //对于自定义类，使用系统类加载器加载
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();//由系统类加载器加载
        System.out.println(classLoader);//AppClassLoader
        //调用系统类加载器的getParent()方法可以获取扩展类加载器
        ClassLoader classLoader1 = classLoader.getParent();//获取扩展类加载器
        System.out.println(classLoader1);//PlatformClassLoader
        //调用扩展类加载器的getParent()方法无法获取引导类加载器
        ClassLoader classLoader2 = classLoader1.getParent();
        System.out.println(classLoader2);//null引导类加载器获取不到，主要加载java核心类库，无法加载自定义类

        ClassLoader classLoader3 = String.class.getClassLoader();
        System.out.println(classLoader3);//null,引导类加载器无法拿到
    }
```

**应用：使用ClassLoader加载配置文件**

```java
    @Test
    public void test2() throws Exception {
        Properties properties=new Properties();
        //此时文件默认在当前的module下
        //读取配置文件1
        /*FileInputStream fis=new FileInputStream("jdbc.properties");
        properties.load(fis);*/
        //读取配置文件2，使用classloader
        //文件默认识别在当前module下的src下
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("jdbc1.properties");
        properties.load(is);

        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        System.out.println(user+":"+password);
    }
```

###  1.8 newInstance()创建运行时类的对象

`newInstance()`:调用此方法，创建对应的运行时类的对象。内部调用了运行时类的空参的构造器。

要想此方法正常的创建运行时类的对象，要求：

1. 运行时类必须提供空参的构造器
2. 空参的构造器的访问权限得够。通常，设置为public。

在javabean中要求提供一个public的空参构造器。原因：

1. 便于通过反射，创建运行时类的对象
2. 便于子类继承此运行时类时，默认调用super()时，保证父类此构造器

```java
    @Test
    public void test1() throws Exception {
        Class<Person> clazz = Person.class;
        /*
        newInstance():调用此方法，创建对应的运行时类的对象
         */
        Person person = clazz.newInstance();//java9之后已过时
        System.out.println(person);
        //
        Person person1 = clazz.getDeclaredConstructor().newInstance();//推荐

    }
```

### 1.9 获取运行时类的指定结构

  1. 获取成员变量们

     - `Field[] getFields()` ：获取所有public修饰的成员变量(属性)
     - `Field getField(String name)`:获取指定名称的 public修饰的成员变量(属性)
     - `Field[] getDeclaredFields()`:  获取所有的成员变量(属性)，不考虑修饰符
     - `Field getDeclaredField(String name)`  :获取指定名称的当前运行时类的属性，不考虑权限
  2. 获取构造方法们

     - `Constructor<?>[] getConstructors()`  :获取当前运行时Public修饰的构造方法们
     - `Constructor<T> getConstructor(类<?>... parameterTypes)`  :获取指定参数的构造方法
     - `Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)`  
     - `Constructor<?>[] getDeclaredConstructors()`  :获取当前运行时构造方法们,不考虑修饰符
  3. 获取成员方法们(同理加Declared是不考虑修饰符)：

     - `Method[] getMethods()`  
     - `Method getMethod(String name, 类<?>... parameterTypes)`  
     - `Method[] getDeclaredMethods()`  
     - `Method getDeclaredMethod(String name, 类<?>... parameterTypes)`  
  4. 获取全类名:`String getName()`  
  5. 成员变量操作：

     - 设置值:`void set(Object obj, Object value)`  
     - 获取值:`get(Object obj)` 
  6. 忽略访问权限修饰符的安全检查
	- setAccessible(true):暴力反射
  7. 创建对象：T newInstance(Object... initargs)  
如果使用空参数构造方法创建对象，操作可以简化：Class对象的newInstance方法
  8. Method：方法对象
执行方法：`Object invoke(Object obj, Object... args)` 
获取方法名称：`String getName`:获取方法名

### 2.0 反射的应用

#### 代理模式

- 原理：使用一个代理将对象包装起来, 然后用该代理对象取代原始对象。任何对原始对象的调用都要通过代理。代理对象决定是否以及何时将方法调用转到原始对象上。 

#### 动态代理介绍

1. 概念 动态代理是指客户通过代理类来调用其它对象的方法,并且是在程序运行时根据需要动态创建目标类的代理对象.

2. 使用场合 调试及远程方法调用等.

3. 动态代理相关API

   - Proxy ：专门完成代理的操作类，是所有动态代理类的父类。通过此类为一个或多个接口动态地生成实现类。

   - 提供用于创建动态代理类和动态代理对象的静态方法 `static Class<?> getProxyClass(ClassLoader loader, Class<?>... interfaces)`  

   - 创建 一个动态代理类所对应的Class对象 `static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)`  直接创建一个动态代理对象(loader:类加载器，interfaces：被代理类实现的全部接口，h：得到InvocationHandler接 口的实现类实例)

   - `InvocationHandler`：创建一个实现接口InvocationHandler的类，它必须实现invoke方 法，以完成代理的具体操作。

    ```java
     public Object invoke(Object theProxy, Method method, Object[] params) throws Throwable{ 
         try{ Object retval = method.invoke(targetObj, params); // Print out the result 
             System.out.println(retval); 
         	return retval; 
         }catch (Exception exc){} 
     }//theProxy:代理类对象，method：调用的方法，params：调用方法所传入的参数
    ```
   

#### 静态代理示例

为了与动态代理相比较,静态代理程序示例如下.不难发现: 如果添加不同接口则需要不同的代理类来完成其代理!很繁琐!

代理类和目标对象的类都是在编译期间确定下来，不利于程序的扩展。
每一个代理类只能为一个接口服务，这样一来程序开发中必然产生过多的代理。

```java
/*
静态代理举例
 */
interface ClotFactory{
    void produceCloth();
}
//代理类
class ProxyClothFactory implements ClotFactory{

    private ClotFactory factory;//拿被代理类对象进行实例化
    public ProxyClothFactory(ClotFactory factory){
        this.factory=factory;
    }
    @Override
    public void produceCloth() {
        System.out.println("代理工厂准备工作");
        factory.produceCloth();
    }
}
//被代理类
class Factory implements ClotFactory{

    @Override
    public void produceCloth() {
        System.out.println("生产衣服");
    }
}
public class StaticProxyTest {
    public static void main(String[] args) {
        ProxyClothFactory proxyClothFactory = new ProxyClothFactory(new Factory());
        proxyClothFactory.produceCloth();
    }
}
```

#### 动态代理示例

**反射的动态性**

```java
/*
动态代理举例
 */
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface Human{
    String getBelief();
    void eat(String food);
}

//被代理类
class SupperMan implements Human{

    @Override
    public String getBelief() {
        return "I Belief I can Fly";
    }

    @Override
    public void eat(String food) {
        System.out.println("我喜欢吃："+food);
    }
}

/*
动态创建代理类
问题：如何根据内存中的被代理类，动态的创建一个代理类及其对象

当通过代理类的对象调用方法时，如何动态的区调用被代理类中的同名方法
 */
//代理类生产工厂，用这个类来生成代理类
class ProxyFactory{
    //调用此方法返回一个代理类对象，解决问题一
    public static Object getProxyInstance(Object obj){//obj:被代理类的对象
        MyInvocationHandler handler=new MyInvocationHandler();
        handler.bind(obj);
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),handler);
        //java.lang.reflect.Proxy：该类用于动态生成代理类，
        // 只需传入目标接口的类加载器、目标接口以及InvocationHandler便可为目标接口生成代理类及代理对象。

        //newProxyInstance(ClassLoader loader, Class[] interfaces, InvocationHandler h):
        // 该方法用于为指定类装载器、一组接口及调用处理器生成动态代理类实例
    }
}
class MyInvocationHandler implements InvocationHandler{

    private Object obj;//需要被代理类对象进行赋值
    public void bind(Object obj){
        this.obj=obj;
    }
    //当我们通过代理类的对象调用方法A时就睡自动的调用如下方法：invok()
    //将被代理类要执行的方法A的功能声明在invoke中
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //method:即为代理类对象调用的方法，此方法也就作为了被代理类对象要调用的方法
        //obj:被代理类对象
        Object returnValue = method.invoke(obj, args);
        //上述方法的返回值就作为当前类中的invok方法的返回值
        return returnValue;
    }
}
public class ProxyTest {
    public static void main(String[] args) {
        //proxyInstance:代理类对象
        Human proxyInstance = (Human) ProxyFactory.getProxyInstance(new SupperMan());
        //当通过代理类调用方法时，会自动的调用被代理类方法
        String belief = proxyInstance.getBelief();
        System.out.println(belief);
        proxyInstance.eat("汉堡");

        System.out.println("*********");

        Factory factory = new Factory();
        ClotFactory proxyInstance1 = (ClotFactory) ProxyFactory.getProxyInstance(factory);
        proxyInstance1.produceCloth();
    }
}

```

