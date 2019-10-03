#md文档使用2个空格就是换行  
# java编程思想阅读笔记
## 第二章 Java中一切都是对象
### 使用应用操作对象
首先 java 定义变量可以不初始化  
String str;//  
//发送消息就会出错  
System.out.println(str) //直接报错  
//安全做法就是定义变量立即给初始值  
应用场景：把遥控器跟电视机
### 必须由你创建对象
String s=new String("abc")

1.寄存器  存在CPU里面的  速度最快 数量有限 程序员不能直接控制  
2 堆栈  位于ram(内存中) 它有一个堆栈的指针 往上移动释放内存 往下移动开辟空间 例子:局部变量跟对象的引用
3 堆  通用内存池，也是位于RAM区用于存放所有的Java对象 
4 常量存储 常量值通常直接存放在程序代码内部  
5 非RAM存储 2个基本的例子是流对象和持久化对象  他们是存储于程序之外

###特例:基本类型
new的对象存放在堆里
基本的数据类型都是放在栈中  
比如：int a=5 它就是直接在栈中开辟了一个存储空间赋值为5  

### Java中永远不需要销毁对象
作用域：由{ }决定  
在{ }区域外 我们无法拿到它的引用 但是它的对象依然在堆里面占据着内存空间  

### 参数列表
讲的一个函数 的参数
void test(String str){ }

### 名字可见性 
讲的是导包区分命名空间  
### static关键字  
一般来说 执行new来创建对象时，数据存储空间才被分配，其方法才供外界调用  

### Java编程思想第三章 Java操作符  
算术运算符：+ -  * / %  运算规则：先乘除后加减  
Java中的别名现场：  
就是2个引用指向同一个对象地址  
Tank t1=new Tank();  
Tank t2=new Tank();  
t1=t2; //这个时候2个变量也就是引用指向同一个堆内存地址 相当于2个对象绑定在一起了 原来的t1指向的空闲的对象会被垃圾回收机制回收  
以上就是别名现象，这种方式一般不可取 不建议这么干  
尽量让2个对象彼此独立开来，而不是将t1跟t2绑定到相同的对象  
  
### Java编程思想第七章 复用类  
在Java中代码的复用的几种方法：  
1.组合：所谓组合就是在一个类中定义另一个类类型的变量  
2 继承 :extends关键字 
3 代理:  
写了一个SpaceShip类，然后再写一个SpaceShipConrols的子类，然后再写一个代理类  
在代理类里面写一个方法
SpaceShipDeletgaion{  
  private String name;  
  private SpaceShipControls controls=new SpaceShipControlls();   
  private SpaceShipDeletaion(String name){  
     this.name=name;  
   }  
}

### Java中的注解
注解就是用来对程序进行解释的，是给计算机看的.

##### 自定义注解：

```java
//自己定义一个注解
public @interface AnnoTest{
    
}
```
可以将这个注解先进行编译成class文件,然后反编译javap xxx.class文件
发现其实所有的注解度是接口继承Annotation接口


