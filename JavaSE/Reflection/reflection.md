## JavaScript

### 1.1 概念

- Javascript 语言诞生主要是完成页面的数据验证。因此它运行在客户端，需要运行浏览器来解析执行 JavaScript 代码。

- JS是Netscape网景公司的产品，最早取名为LiveScript;为了吸引更多java程序员。更名为JavaScript。

- JS是弱类型，Java是强类型。

  强类型：在开辟变量存储空间时，定义了空间将来存储的数据的数据类型。只能存储固定类型的数据

  弱类型：在开辟变量存储空间时，不定义空间将来的存储数据类型，可以存放任意类型的数据。

- JS特点： 
  1. 交互性（它可以做的就是信息的动态交互）
  2. 安全性（不允许直接访问本地硬盘） 
  3. 跨平台性（只要是可以解释JS的浏览器都可以执行，和平台无关）

- java和JavaScript关系：

<img src="E:\tool\Typora\imge\java和js的关系.jpg" alt="java和js的关系" style="zoom:50%;" />

### 1.2 JavaScript与Html结合方式

- 方式1：只需要在 head 标签中，或者在 body 标签中， 使用 script 标签 来书写 JavaScript 代码

```html
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script type="text/javascript">
        // alert是JavaScript语言提供的一个警告框函数。
        // 它可以接收任意类型的参数，这个参数就是警告框的提示信息
        alert("hello javaScript!");
    </script>
</head>
<body>
</body>
</html>
```

- 方式2 ：使用 script 标签引入 单独的 JavaScript 代码文件

```JavaScript
<script type="text/javascript" src="1.js"></script>
```

### 1.3 JavaScript变量 

#### 数据类型

原始数据类型(基本数据类型)：

- number：数字。 整数/小数/NaN(not a number 一个不是数字的数字类型)
- string：字符串。 字符串 "abc" "a" 'abc'
- boolean: true和false
- null：一个对象为空的占位符
- undefined：未定义。如果一个变量没有给初始化值，则会被默认赋值为undefined

```javascript
//NaN是number类型
var a=NaN;
alert(typeof (a));//number

//不带有值的变量，它的值将是 undefined。类型将是undefined类型
var i;
alert(typeof (i));//undefined

var a = 12;
var b = "abc";
alert( a * b ); // NaN是非数字，非数值。
alert(typeof (b*a));//number
```

引用数据类型：object(对象)

#### 变量

语法：var 变量名 = 初始化值;

typeof运算符：获取变量的类型。

**注：null运算后得到的是`object`**

**注：NaN != NaN**

```javascript
var obj=null;
var obj2=undefined;
var obj3;
document.write(typeof (obj)+"<br>");//object类型
document.write(obj+"<br>");//null
document.write(obj2+"<br>");//undefined
document.write(obj3+"<br>");//undefined
```

>  JS特殊语法：语句以;结尾，如果一行只有一条语句则 ;可以省略 (不建议)
>
> 变量的定义使用var关键字，也可以不使用 
>
> 用： 定义的变量是局部变量
>
> 不用：定义的变量是全局变量(不建议)

### 1.4 运算符

**注意：在JS中，如果运算数不是运算符所要求的类型，那么js引擎会自动的将运算数进行类型转换**

- 其他类型转number： 

    string转number：按照字面值转换。如果字面值不是数字，则转为NaN（不是数字的数字）

    boolean转number：true转为1，false转为0

在JavaScript语言中，所有的变量，都可以做为一个boolean类型的变量去使用。0 、null、 undefined、””(空串) 都认为是 false；

- 其他类型转boolean： 
    number：0或NaN为false，其他为true
    string：除了空字符串("")，其他都是true
    null&undefined:都是false
    对象：所有对象都为true
    
- **比较运算符**

    比较运算符`<`  `>=`  `<=`  `==`  `===`(全等于)

    比较方式 类型相同：直接比较 

    字符串：按照字典顺序比较。按位逐一比较，直到得出大小为止。

    类型不同：先进行类型转换，再比较 

    ===：全等于。在比较之前，先判断类型，如果类型不一样，则直接返回false
    
- 一元运算符，算数运算符，逻辑运算符，三元运算符，赋值运算符都和java语法差不多

### 1.5 流程控制语句

- if...else...

- switch: 在java中，switch语句可以接受的数据类型： byte int shor char,枚举(1.5) ,String(1.7) 

  switch(变量):

  case 值:

- 在JS中,switch语句可以接受任意的原始数据类型

- while

- do...while

- for

### 1.6 基本对象

#### `Function`：函数(方法)对象

  - 创建：
    var fun = new Function(形式参数列表,方法体); (不建议使用)

    **function 方法名称(形式参数列表){方法体}**

    **var 方法名 = function(形式参数列表){方法体}**

  - 特点：
    方法定义时，形参的类型不用写,返回值类型也不写。
    **方法是一个对象，如果定义名称相同的方法，会覆盖(无重载)**
    在JS中，方法的调用只与方法的名称有关，和参数列表无关
    在方法声明中有一个隐藏的内置对象（数组），arguments,封装所有的实际参数
    
  - 调用：
    方法名称(实际参数列表);
    
  - 在 JavaScript 语言中，如何定义带有返回值的函数？ 

    只需要在函数体内直接使用 return 语句返回值即可！

```JavaScript
    function fun2(a ,b) {
        alert("有参函数fun2()被调用了 a=>" + a + ",b=>"+b);
    }
    
    fun2(12,"abc");
    
    // 定义带有返回值的函数
    var fun3 = function (num1,num2) {
        return num1 + num2;
    }
    alert( fun3(100,200) );
```

  - 隐形参数：是在 function 函数中不需要定义，但却可以直接用来获取所有参数的变量。 隐形参数特别像 java中的可变长参数一样。 public void fun(Object...args); 可变长参数其实是一个数组。那么 js 中的隐形参数也跟 java 的可变长参数一样。操作类似数组。

```JavaScript
    <script type="text/javascript">
            function fun(a) {
                alert( arguments.length );//3 可看参数个数
                alert( arguments[0] );//1
                alert( arguments[1] );//ad
                alert( arguments[2] );//true
                alert("a = " + a);
                for (var i = 0; i < arguments.length; i++){
                    alert( arguments[i] );
                }
                alert("无参函数fun()");
            }
            fun(1,"ad",true);
    
            // 需求：要求 编写 一个函数。用于计算所有参数相加的和并返回
            function sum(num1,num2) {
                var result = 0;
                for (var i = 0; i < arguments.length; i++) {
                    if (typeof(arguments[i]) == "number") {
                        result += arguments[i];
                    }
                }
                return result;
            }
            alert( sum(1,2,3,4,"abc",5,6,7,8,9) );
        </script>
```
#### `Array`:数组对象
  - 创建：
    
    var arr = new Array(元素列表);
   
    var arr = new Array(默认长度);
   
    var arr = [元素列表];
   
  - 方法
    
    join(参数):将数组中的元素按照指定的分隔符拼接为字符串
   
    push()	向数组的末尾添加一个或更多元素，并返回新的长度。
   
  - 属性
    
      length:数组的长度
      
  - 特点：
    
    JS中，数组元素的类型可变的。
   
    JS中，数组长度可变的。
#### `Date`：日期对象
  - 创建：
    
      var date = new Date();
      
  - 方法：
    
    toLocaleString()：返回当前date对象对应的时间本地字符串格式
   
    getTime():获取毫秒值。返回当前如期对象描述的时间到1970年1月1日零点的毫秒值差
#### `Math`：数学对象
  - 创建：Math对象不用创建，直接使用。  Math.方法名();
    
  - 方法：
    
    random():返回 0 ~ 1 之间的随机数。 含0不含1
   
    ceil(x)：对数进行上舍入。
   
    floor(x)：对数进行下舍入。
   
    round(x)：把数四舍五入为最接近的整数。
#### `RegExp`：正则表达式对象
  - 创建
    var reg = new RegExp("正则表达式");
    var reg = /正则表达式/;
    正则表达式：定义字符串的组成规则。
    单个字符:[]
    如： [a] [ab] [a-zA-Z0-9]
    正则对象：
  - 方法	
    test(参数):验证指定的字符串是否符合正则定义的规范	
```JavaScript
<script type="text/javascript">
        // 表示要求字符串中，是否包含字母e
        // var patt = new RegExp("e");
        // var patt = /e/; // 也是正则表达式对象
        // 表示要求字符串中，是否包含字母a或b或c
        // var patt = /[abc]/;
        // 表示要求字符串，是否包含小写字母
        // var patt = /[a-z]/;
        // 表示要求字符串，是否包含任意大写字母
        // var patt = /[A-Z]/;
        // 表示要求字符串，是否包含任意数字
        // var patt = /[0-9]/;
        // 表示要求字符串，是否包含字母，数字，下划线
        // var patt = /\w/;
        // 表示要求 字符串中是否包含至少一个a
        // var patt = /a+/;
        // 表示要求 字符串中是否 *包含* 零个 或 多个a
        // var patt = /a*/;
        // 表示要求 字符串是否包含一个或零个a
        // var patt = /a?/;
        // 表示要求 字符串是否包含连续三个a
        // var patt = /a{3}/;
        // 表示要求 字符串是否包 至少3个连续的a，最多5个连续的a
        // var patt = /a{3,5}/;
        // 表示要求 字符串是否包 至少3个连续的a，
        // var patt = /a{3,}/;
        // 表示要求 字符串必须以a结尾
        // var patt = /a$/;
        // 表示要求 字符串必须以a打头
        // var patt = /^a/;
        // 要求字符串中是否*包含* 至少3个连续的a
        // var patt = /a{3,5}/;
        // 要求字符串，从头到尾都必须完全匹配
        // var patt = /^a{3,5}$/;
        var patt = /^\w{5,12}$/;
        var str = "wzg168[[[";
        alert( patt.test(str) );
    </script>
```

#### `Global`
  - 特点：全局对象，这个Global中封装的方法不需要对象就可以直接调用。  方法名();
  - 方法：
    encodeURI():url编码
    decodeURI():url解码
    encodeURIComponent():url编码,编码的字符更多
    decodeURIComponent():url解码
    parseInt():将字符串转为数字 逐一判断每一个字符是否是数字，直到不是数字为止，将前边数字部分转为number
    isNaN():判断一个值是否是NaN
    NaN六亲不认，连自己都不认。NaN参与的==比较全部为false，包括和自己
    eval():将JavaScript 字符串转成脚本，并把它作为脚本运行

### 1.7 事件

* 概念：某些组件被执行了某些操作后，触发某些代码的执行。	
    * 事件：某些操作。如： 单击，双击，键盘按下了，鼠标移动了
    * 事件源：组件。如： 按钮 文本输入框...
    * 监听器：代码。
    * 注册监听：将事件，事件源，监听器结合在一起。 当事件源上发生了某个事件，则触发执行某个监听器代码。
    
* 事件的注册又分为静态注册和动态注册两种：
  
    - 什么是事件的注册（绑定）？ 其实就是告诉浏览器，当事件响应后要执行哪些操作代码，叫事件注册或事件绑定。
    
    - 静态注册事件：通过 html 标签的事件属性直接赋于事件响应后的代码，这种方式我们叫静态注册。
    
- 动态注册事件：是指先通过 js 代码得到标签的 dom 对象，然后再通过 dom 对象.事件名 =function(){} 这种形式赋于事件
      响应后的代码，叫动态注册。
    - 动态注册基本步骤： 1、获取标签对象 2、标签对象.事件名 =fucntion(){}
  
```JavaScript
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Title</title>
        <script type="text/javascript">
            // onload事件的方法
            function onloadFun() {
                alert('静态注册onload事件，所有代码');
            }
    
            // onload事件动态注册。是固定写法
            window.onload = function () {
                alert("动态注册的onload事件");
            }
        </script>
    </head>
    <!--静态注册onload事件
            onload事件是浏览器解析完页面之后就会自动触发的事件
           <body onload="onloadFun();">
    -->
    <body onload="onloadFun();">
    
    </body>
    </html>
```


* 常见的事件：
1. 点击事件：
    1. onclick：单击事件
    2. ondblclick：双击事件
```javascript
        <html lang="en">
        <head>
            <meta charset="UTF-8">
            <title>Title</title>
            <script type="text/javascript">
                function onclickFun() {
                    alert("静态注册onclick事件");
                }
        
                // 动态注册onclick事件
				///加载完成事件,要先加载完再执行此代码
                window.onload = function () {
                    // 1 获取标签对象
                    /*
                    * document 是JavaScript语言提供的一个对象（文档）<br/>
                    * get           获取
                    * Element       元素（就是标签）
                    * By            通过。。   由。。经。。。
                    * Id            id属性
                    * getElementById通过id属性获取标签对象
                    **/
                    var btnObj = document.getElementById("btn01");
                    // alert( btnObj );
                    // 2 通过标签对象.事件名 = function(){}
                    btnObj.onclick = function () {
                        alert("动态注册的onclick事件");
                    }
                }
        
            </script>
        </head>
        <body>
            <!--静态注册onClick事件-->
            <button onclick="onclickFun();">按钮1</button>
            <button id="btn01">按钮2</button>
        </body>
        </html>
```
2. 焦点事件
    1. onblur：失去焦点
    2. onfocus:元素获得焦点。

```JavaScript
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Title</title>
        <script type="text/javascript">
            // 静态注册失去焦点事件
            function onblurFun() {
                // console是控制台对象，是由JavaScript语言提供，专门用来向浏览器的控制器打印输出， 用于测试使用
                // log() 是打印的方法
                console.log("静态注册失去焦点事件");
            }
    
            // 动态注册 onblur事件
            window.onload = function () {
                //1 获取标签对象
               var passwordObj = document.getElementById("password");
               // alert(passwordObj);
                //2 通过标签对象.事件名 = function(){};
                passwordObj.onblur = function () {
                    console.log("动态注册失去焦点事件");
                }
            }
    
        </script>
    </head>
    <body>
        用户名:<input type="text" onblur="onblurFun();"><br/>
        密码:<input id="password" type="text" ><br/>
    </body>
```


2. 加载事件：

    1. onload：页面或一幅图像完成加载。

3. 鼠标事件：
    1. onmousedown	鼠标按钮被按下。
    2. onmouseup	鼠标按键被松开。
    3. onmousemove	鼠标被移动。
    4. onmouseover	鼠标移到某元素之上。
    5. onmouseout	鼠标从某元素移开。

5. 键盘事件：

    1. onkeydown	某个键盘按键被按下。	
    2. onkeyup		某个键盘按键被松开。
    3. onkeypress	某个键盘按键被按下并松开。

5. 选择和改变
    1. onchange	域的内容被改变。
    2. onselect	文本被选中。

```JavaScript
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>事件</title>
        <script>
            var btn = document.getElementById("btn");//获取不到,body中没加载到
            //2，加载完成事件
            window.onload=function () {
                //3、鼠标事件：
                document.getElementById("btn").onmouseover=function () {
                    alert("鼠标移动到元素之上");
                };
                document.getElementById("btn").onmousedown=function (event) {
                    //alert("鼠标点击了");
                    alert(event.button);//鼠标左键，弹出0，右键弹出2，滚轮弹1
                };
               //键盘事件
                document.getElementById("btn").onkeydown=function (event) {
                    //alert("键盘点击了");
                    if(event.keyCode==13){//13对应回车键
                        alert("表单提交")
                    }
                };
    
                //选中和改变：
                document.getElementById("city").onchange=function (event) {
                    alert("数据改变");
                };
    
                document.getElementById("from").onsubmit=function () {
                    //校验用户名格式是否正确
                    var flag = true;
                    return flag;//返回值为true或没有，则提交表单，返回false则不提交表单
                }
            };
            function checkfrom() {
                return true;
            }
        </script>
    </head>
    <body>
    <!--<input type="text" id="btn">-->
    <form action="#" id="from" onsubmit="return  checkfrom()">
        <input name="username" id="username">
        <select id="city">
            <option>--请选择--</option>
            <option>--北京--</option>
            <option>--上海--</option>
            <option>--广州--</option>
        </select>
        <input type="submit" value="提交">
    </form>
    </body>
    </html>
```

6. 表单事件：
    1. onsubmit	确认按钮被点击。
    2. onreset	重置按钮被点击。
    
```JavaScript
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Title</title>
        <script type="text/javascript" >
            // 静态注册表单提交事务
            function onsubmitFun(){
                // 要验证所有表单项是否合法，如果，有一个不合法就阻止表单提交
                alert("静态注册表单提交事件----发现不合法");
    
                return flase;
            }
    
            window.onload = function () {
                //1 获取标签对象
                var formObj = document.getElementById("form01");
                //2 通过标签对象.事件名 = function(){}
                formObj.onsubmit = function () {
                    // 要验证所有表单项是否合法，如果，有一个不合法就阻止表单提交
                    alert("动态注册表单提交事件----发现不合法");
    
                    return false;
                }
            }
    
        </script>
    </head>
    <body>
        <!--return false 可以阻止 表单提交 -->
        <form action="http://localhost:8080" method="get" onsubmit="return onsubmitFun();">
            <input type="submit" value="静态注册"/>
        </form>
        <form action="http://localhost:8080" id="form01">
            <input type="submit" value="动态注册"/>
        </form>
    
    </body>
    </html>
```

​    

### 1.8 DOM

#### 概述

DOM 全称是 Document Object Model 文档对象模型，就是把文档中的标签，属性，文本，转换成为对象来管理。可以使用这些对象，对标记语言文档进行CRUD的动态操作

图解：

<img src="E:\tool\Typora\imge\image-20200906195323580.png" alt="image-20200906195323580"  />

DOM - 针对任何结构化文档的标准模型 

- Document：文档对象
- Element：元素对象
- Attribute：属性对象
- Text：文本对象
- Comment:注释对象
- Node：节点对象，其他5个的父对象

**Document 对象的理解**： 

- 第一点：Document 它管理了所有的 HTML 文档内容。 
- 第二点：document 它是一种树结构的文档。有层级关系。 
- 第三点：它让我们把所有的标签 都 对象化 
- 第四点：我们可以通过 document 访问所有的标签对象。

**html文档如何对象化**

```java
<body> 
	<div id="div01">div01</div> 
</body> 

class Dom{ 
    private String id; //id 属性 
    private String tagName;//表示标签名 
    private Dom parentNode;//父亲 
    private List<Dom> children;// 孩子结点 
    private String innerHTML;// 起始标签和结束标签中间的内容 
}

```

> 首先，div标签整个为dom对象，有id属性，有div标签，有 <body> 父节点，也有可能有多个子节点所以定义为List，节点类型都为dom类型，所以父节点定义为Dom 子节点也定义为Dom，<div>中有内容，定义innerHTML

#### document对象

1. 创建(获取)：在html dom模型中可以使用window对象来获取

    window.document

2. 方法：
    1. 获取Element对象：

        getElementById()： 根据id属性值获取元素对象。id属性值一般唯一

        getElementsByTagName()：根据元素名称获取元素对象们。返回值是一个数组

        getElementsByClassName():根据Class属性值获取元素对象们。返回值是一个数组

        getElementsByName(): 根据name属性值获取元素对象们。返回值是一个数组

    > 注：document 对象的三个查询方法，如果有 id 属性，优先使用 getElementById 方法来进行查询 如果没有 id 属性，则优先使用 getElementsByName 方法来进行查询 如果 id 属性和 name 属性都没有最后再按标签名查 getElementsByTagName以上三个方法，一定要在页面加载完成之后执行，才能查询到标签对象(元素对象)。
    
    2. 创建其他DOM对象：
        createAttribute(name)创建拥有指定名称的属性节点，并返回新的 Attr 对象。
        createComment()	创建注释节点。
        createElement()	创建元素节点。
        createTextNode()创建文本节点。
    
3. 属性：很多(略)

```JavaScript
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>文档对象</title>
</head>
<body>
<div id="div1">div1</div>
<div id="div2">div2</div>
<div id="div3">div3</div>
<div class="cls1">div4</div>
<div class="cls1">div5</div>
<input type="text" name="username">
<script>
    //getElementsByTagName()
    var divs = document.getElementsByTagName("div");
    alert(divs.length);//数组长度为5

    //getElementsByClassName()
    var clss = document.getElementsByClassName("cls1");
    alert(clss.length);//数组长度为2

    //getElementsByName()
    var use = document.getElementsByName("username");
    alert(use.length);//数组长度为1

    //createElement()
    var tab = document.createElement("table");
    alert(tab);//HTML的table对象
</script>
</body>
</html>
```

#### Element：元素对象

1. 获取/创建：通过document来获取和创建
2. 方法：
    removeAttribute()：删除属性
    setAttribute()：设置属性

```
<body>
    <input type= "button" value= "设置属性" id= "btn" >
    <input type= "button"  value="删除属性" id="bt">
    
    <script>
        //获取a标签
        var ele = document.getElementsByTagName("a")[0];
        //给a标签加一个属性
        var btn = document.getElementById("btn");
        btn.onclick=function () {
            ele.setAttribute("href","https://www.baidu.com");
        }
        var bt = document.getElementById("bt");
        bt.onclick=function () {
            ele.removeAttribute("href");
        }
    </script>
</body>
```

#### Node：节点对象
1. 特点：所有dom对象都可以被认为是一个节点

2. 方法：

    CRUD dom树：

   - appendChild()：向节点的子节点列表的结尾添加新的子节点。

   - removeChild()：删除（并返回）当前节点的指定子节点。

   -  replaceChild()：用新节点替换一个子节点。

3. 属性：
   
      childNodes 属性，获取当前节点的所有子节点 
      
      firstChild 属性，获取当前节点的第一个子节点 
      
      lastChild 属性，获取当前节点的最后一个子节点 
      
      parentNode 属性，获取当前节点的父节点 
      
      nextSibling 属性，获取当前节点的下一个节点 
      
      previousSibling 属性，获取当前节点的上一个节点 
      
      className 用于获取或设置标签的 class 属性值 
      
      innerHTML 属性，表示获取/设置起始标签和结束标签中的内容 
      
      innerText 属性，表示获取/设置起始标签和结束标签中的文本

```JavaScript
<html>
<head>
<meta charset="UTF-8">
<title>dom查询</title>
<link rel="stylesheet" type="text/css" href="style/css.css" />
<script type="text/javascript">
	window.onload = function(){
		//1.查找#bj节点
		document.getElementById("btn01").onclick = function () {
			var bjObj = document.getElementById("bj");
			alert(bjObj.innerHTML);
		}
		//2.查找所有li节点
		var btn02Ele = document.getElementById("btn02");
		btn02Ele.onclick = function(){
			var lis = document.getElementsByTagName("li");
			alert(lis.length)
		};
		//3.查找name=gender的所有节点
		var btn03Ele = document.getElementById("btn03");
		btn03Ele.onclick = function(){
			var genders = document.getElementsByName("gender");
			alert(genders.length)
		};
		//4.查找#city下所有li节点
		var btn04Ele = document.getElementById("btn04");
		btn04Ele.onclick = function(){
			//1 获取id为city的节点
			//2 通过city节点.getElementsByTagName按标签名查子节点
			var lis = document.getElementById("city").getElementsByTagName("li");
			alert(lis.length)
		};
		//5.返回#city的所有子节点
		var btn05Ele = document.getElementById("btn05");
		btn05Ele.onclick = function(){
			//1 获取id为city的节点
			//2 通过city获取所有子节点
			alert(document.getElementById("city").childNodes.length);
		};
		//6.返回#phone的第一个子节点
		var btn06Ele = document.getElementById("btn06");
		btn06Ele.onclick = function(){
			// 查询id为phone的节点
			alert( document.getElementById("phone").firstChild.innerHTML );
		};
		//7.返回#bj的父节点
		var btn07Ele = document.getElementById("btn07");
		btn07Ele.onclick = function(){
			//1 查询id为bj的节点
			var bjObj = document.getElementById("bj");
			//2 bj节点获取父节点
			alert( bjObj.parentNode.innerHTML );
		};
		//8.返回#android的前一个兄弟节点
		var btn08Ele = document.getElementById("btn08");
		btn08Ele.onclick = function(){
			// 获取id为android的节点
			// 通过android节点获取前面兄弟节点
			alert( document.getElementById("android").previousSibling.innerHTML );
		};
		//9.读取#username的value属性值
		var btn09Ele = document.getElementById("btn09");
		btn09Ele.onclick = function(){
			alert(document.getElementById("username").value);
		};
		//10.设置#username的value属性值
		var btn10Ele = document.getElementById("btn10");
		btn10Ele.onclick = function(){
			document.getElementById("username").value = "国哥你真牛逼";
		};
		//11.返回#bj的文本值
		var btn11Ele = document.getElementById("btn11");
		btn11Ele.onclick = function(){
			alert(document.getElementById("city").innerHTML);
			// alert(document.getElementById("city").innerText);
		};
	};
</script>
</head>
<body>
<div id="total">
	<div class="inner">
		<p>
			你喜欢哪个城市?
		</p>
		<ul id="city">
			<li id="bj">北京</li>
			<li>上海</li>
			<li>东京</li>
			<li>首尔</li>
		</ul>
		<br>
		<p>
			你喜欢哪款单机游戏?
		</p>
		<ul id="game">
			<li id="rl">红警</li>
			<li>实况</li>
			<li>极品飞车</li>
			<li>魔兽</li>
		</ul>
		<br />
		<p>
			你手机的操作系统是?
		</p>
		<ul id="phone"><li>IOS</li><li id="android">Android</li><li>Windows Phone</li></ul>
	</div>

	<div class="inner">
		gender:
		<input type="radio" name="gender" value="male"/>
		Male
		<input type="radio" name="gender" value="female"/>
		Female
		<br>
		<br>
		name:
		<input type="text" name="name" id="username" value="abcde"/>
	</div>
</div>
<div id="btnList">
	<div><button id="btn01">查找#bj节点</button></div>
	<div><button id="btn02">查找所有li节点</button></div>
	<div><button id="btn03">查找name=gender的所有节点</button></div>
	<div><button id="btn04">查找#city 下所有li节点</button></div>
	<div><button id="btn05">返回#city 的所有子节点</button></div>
	<div><button id="btn06">返回#phone 的第一个子节点</button></div>
	<div><button id="btn07">返回#bj 的父节点</button></div>
	<div><button id="btn08">返回#android 的前一个兄弟节点</button></div>
	<div><button id="btn09">返回#username 的value属性值</button></div>
	<div><button id="btn10">设置#username 的value属性值</button></div>
	<div><button id="btn11">返回#bj 的文本值</button></div>
</div>
</body>
</html>
```

### 1.9 BOM

#### 概念：
- Browser Object Model 浏览器对象模型
- 将浏览器的各个组成部分封装成对象。

#### 组成：
- Window：窗口对象
- Navigator：浏览器对象
- Screen：显示器屏幕对象
- History：历史记录对象
- Location：地址栏对象

#### Window：窗口对象
1. 方法

```JavaScript
<script>
        /*
                与弹出框有关的方法：
                    alert();显示带有一段消息和一个确认按钮的警告框
                    confirm();显示带有一段消息以及确认按钮和取消按钮的对话框。
                        如果点击确定按钮，方法返回true
                        如果点击取消按钮，方法返回false
                    prompt();显示可提示用户输入的对话框。
                        返回值，获取用户输入的值
                 与打开关闭有关的方法
                    open();打开一个新的窗口
                        返回值是一个window
                    close();关闭浏览器窗口
                        谁调用我，我关谁
                  与定时器有关的方法
                    setTimeout()	在指定的毫秒数后调用函数或计算表达式。
                        参数：
                            js代码或者方法对象
                            毫秒值
                         返回值：返回唯一标识，用于取消定时器
                    clearTimeout()	取消由 setTimeout() 方法设置的 timeout。

                    setInterval()	按照指定的周期（以毫秒计）来调用函数或计算表达式。
                    clearInterval()	取消由 setInterval() 设置的 timeout。
         */
        //方法
        alert("Hello");
        window.alert("world");

        var bool = confirm("你确定退出吗？");
        if (bool){
            //退出操作
        }else{
            //提示
        }
        document.write(bool);

        prompt();
        prompt("请输入用户名");
        var result=prompt("请输入用户名");
        document.write(result);

        //打开一个新窗口
        // open();

        //一次性的定时器
        setTimeout("alert('boom....')",3000);//3秒之后执行alert

        function fun() {
            alert('boom....');
        }
        setTimeout("fun()",3000);
        var id=setTimeout(fun,3000);
        //取消定时器
        clearTimeout(id);

        //循环定时器
        var t=setInterval(fun,3000);//每隔三秒执行一次
        //取消定时器
        clearInterval(t);

        //获取当前页面的历史记录
        var h1 = window.history;
        var h2=history;
        document.write(h1);

        //获取Dom对象
        window.document.write(h2);
    </script>
    <input type="button" value="打开窗口" id="open_btn">
    <input type="button" value="关闭窗口" id="close_btn">
    <script>
        //打开新窗口
        var btn = document.getElementById("open_btn");
        var newwindow;
        btn.onclick=function () {
            newwindow=open("https://www.baidu.com");
        };
        //关闭新窗口
        var bt = document.getElementById("close_btn");
        bt.onclick=function () {
            // close();
            newwindow.close();
        };
    </script>
```

3. 属性：

   获取其他BOM对象：
   	history
   	location
   	Navigator
   	Screen:
   
   获取DOM对象
   	document
4. 特点
* Window对象不需要创建可以直接使用 window使用。 window.方法名();
* window引用可以省略。  方法名();


#### Location：地址栏对象
**代码演示**

```JavaScript
<head>
    <meta charset="UTF-8">
    <title>地址栏对象</title>
    <script>
        /*
        地址栏对象：
            创建：
                window.location
                location
            方法：
                reload()	重新加载当前文档。
            属性：
                href	设置或返回完整的 URL。
         */
    </script>
</head>
<body>
<input type="button" id="btn" value="刷新">
<input type="button" id="btn1" value="百度">

<script>
    //reload方法，点击按钮，刷新当前页面
    var bt = document.getElementById("btn");
    bt.onclick=function () {
        location.reload();
    };

    //获取href
    var hr=location.href;
    alert(hr);

    //点击按钮，访问百度
    var bt1 = document.getElementById("btn1");
    bt1.onclick=function () {
        location.href="https://www.baidu.com";
    };
</script>
```


#### History：历史记录对象
1. 创建(获取)：window.history       history
2. 方法：
* back()	加载 history 列表中的前一个 URL。

* forward()	加载 history 列表中的下一个 URL。

* go(参数)	加载 history 列表中的某个具体页面。

  参数：

  * 正数：前进几个历史记录
  * 负数：后退几个历史记录
3. 属性：
* length	返回当前窗口历史列表中的 URL 数量。

```JavaScript
<body>
<input type="button" id="btn" value="历史记录">
<a href="08_Bom_History对象2.html">08历史记录页面2</a>
<input type="button" id="forward" value="前进">
<script>
    var btn = document.getElementById("btn");
    btn.onclick=function () {
        //获取当前历史记录个数
        var length = history.length;
        alert(length);
    };

    //前进
    var fd=document.getElementById("forward");
    fd.onclick=function () {
        // history.forward();
        history.go(1);
    }
</script>
</body>
```

**轮播图案例**

```JavaScript
<body>
<img src="img/banner_1.jpg" id="pic1">
<input type="button" id="back" value="后退">
<script>
    /*
    在页面上使用img标签展示图片
    定义一个方法，修改图片src属性
    定义一个定时器，每隔两秒调用一次
     */
    var num=1;
    function fun() {
        num++;
        if (num>3){
            num=1;
        }
        var pic = document.getElementById("pic1");
        pic.src="img/banner_"+num+".jpg";

    }

    setInterval(fun,2000);

    //后退操作
    var bk=document.getElementById("back");
    bk.onclick=function () {
        // history.back();
        history.go(-1);
    }
</script>
```


