## Enum(枚举)

### 1.1 概述

- 枚举类的理解：类的对象只有有限个，确定的。我们称此类为枚举类

  例如：星期：Monday(星期一)、......、Sunday(星期天) 

  性别：Man(男)、Woman(女) 

  季节：Spring(春节)......Winter(冬天) 

- 当需要定义一组常量时，强烈建议使用枚举类

- 如果枚举类中只一个对象，则可以作为单例模式的实现方式。

### 1.2 自定义枚举类

- 枚举类的属性 :枚举类对象的属性不应允许被改动, 所以应该使用 `private final` 修饰 
- 枚举类的使用: private final 修饰的属性应该在构造器中为其赋值 
- 若枚举类显式的定义了带参数的构造器, 则在列出枚举值时也必须对应的传入参数
- 私有化类的构造器，保证不能在类的外部创建其对象 
- 在类的内部创建枚举类的实例。声明为：public static final 

```java
//自定义枚举类
class Season{
    //声明Season对象的属性:private final修饰
    private final String seasonName;
    private final String seasonDesc;

    //私化类的构造器,并给对象属性赋值
    private Season(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }
    //提供当前枚举类的多个对象：public static final的
    public static final Season SPRING=new Season("春天","四季如春");
    public static final Season SUMMER=new Season("夏天","夏日炎炎");
    public static final Season AUTUMN=new Season("秋天","秋高气爽");
    public static final Season WINTER=new Season("冬天","冰天雪地");

    //其他诉求1：获取枚举类对象的属性
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}
//使用
public class SeasonTest {
    public static void main(String[] args) {
        Season str=Season.SPRING;
        System.out.println(str);//Season{seasonName='春天', seasonDesc='四季如春'}
        String seasonDesc = str.getSeasonDesc();
        System.out.println(seasonDesc);//四季如春
    }
}
```

### 1.3 enum定义枚举类

- jdk 5.0 新增使用enum定义枚举类。步骤：

```java
enum Season1{
    //提供当前枚举类的对象，多个对象之间用","隔开，末尾对象";"结束,最开始就要这样做
    SPRING("春天"),
    SUMMER("夏天"),
    AUTUMN("秋天"),
    WINTER("冬天");

    private final String seasonName;

    private Season1(String seasonName) {
        this.seasonName = seasonName;
    }
    public String getSeasonName() {
        return seasonName;
    }
}

//使用
public class SeasonTest {
    public static void main(String[] args) {
        Season1 autumn = Season1.AUTUMN;
        System.out.println(autumn);//重写过toString AUTUMN
        System.out.println(autumn.getSeasonName());

        //枚举类的方法
        //toString():返回枚举类对象的名称
        System.out.println(autumn.toString());//AUTUMN

        //values():返回所的枚举类对象构成的数组
        Season1[] values = Season1.values();
        for(int i = 0;i < values.length;i++){
            System.out.println(values[i]);
        }//SPRING SUMMER AUTUMN WINTER

        //valueOf(String objName):返回枚举类中对象名是objName的对象
        Season1 winter = Season1.valueOf("WINTER");
        //如果没objName的枚举类对象，则抛异常：IllegalArgumentException
//        Season1 winter = Season1.valueOf("WINTER1");
        System.out.println(winter);//WINTER
    }
}
```

### 1.4 枚举类对象分别实现接口

```java
public class SeasonTest1 {
    public static void main(String[] args) {
        Season2.AUTUMN.show();
    }
}

interface Info{
    void show();
}

//使用enum关键字枚举类
enum Season2 implements Info{
    //1.提供当前枚举类的对象，多个对象之间用","隔开，末尾对象";"结束
    SPRING("春天","春暖花开"){
        @Override
        public void show() {
            System.out.println("春天在哪里？");
        }
    },
    SUMMER("夏天","夏日炎炎"){
        @Override
        public void show() {
            System.out.println("宁夏");
        }
    },
    AUTUMN("秋天","秋高气爽"){
        @Override
        public void show() {
            System.out.println("秋天不回来");
        }
    },
    WINTER("冬天","冰天雪地"){
        @Override
        public void show() {
            System.out.println("大约在冬季");
        }
    };

    private final String seasonName;
    private final String seasonDesc;

    private Season2(String seasonName,String seasonDesc){
        this.seasonName=seasonName;
        this.seasonDesc=seasonDesc;
    }
}


```

