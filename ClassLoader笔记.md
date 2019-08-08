##### ClassLoader的学习笔记

ClassLoader的具体作用就是将class字节码文件加载到jvm虚拟机中去
 但是jvm在启动的时候并不会一次性加载完成 而是需要根据需要去动态加载.

 第一步 编写Java代码 
 第二步 通过首先通过编译器 javac xx.java 编译成.class文件
 第三步 ClassLoader加载字节码文件到jvm虚拟机    Class.forName("xxx.com.A")

##### java环境变量
  JAVA_HOME
  PATH
  CLASSPATH

##### Java的类加载器 主要有3个：
 Bootstrap ClassLoader   //根加载器  是由C语言编写 的   在Launcher这个类的成员变量 通过private static String bootClassPath = System.getProperty("sun.boot.class.path"); 获取到的
 Extention ClassLoader   //负责加载JVM扩展类， 如js xml
 AppClass Loader       //这个是面向用户的加载器  我们自己编写的代码跟使用的第三方的jar包是由它来加载的

##### Android里面的类加载器 

 android热修复   https://blog.csdn.net/yangxi_pekin/article/details/54929864
  UrlClassLoader 
  PathClassLoader  它只能加载已经安装的apk  而dex文件是存在与apk里面的  可以通过打个包 然后用androidstudio打开可以看到
  DexClassLoader   这个构造器 有4个参数  
​    参数1 dexPath指目标所在的apk或者jar文件的路径  
​    参数2 指的的是用户本地的已经安卓
​    参数3  libs目录
​    参数4  classload,是指该装载器的父装载器,一般为当前执行类的装载器

源码地址：http://androidxref.com/4.0.4/xref/libcore/dalvik/src/main/java/dalvik/system/BaseDexClassLoader.java

   ##### 原理分析：
​     第一步 用户编写Java代码  
​     第二步 编译 （javac xx.java）
​     第三步  当我们创建new 对象的时候 或者Class.forName('包名+类名') 它的原理
​      其实是这么做的 首先  创建了一个ClassLoader 对象 （类加载器）
​     这个时候翻开ClassLoader.java源码 默认构造器 不过这个构造方法是私有的 我们是通过静态方法来获取AppClassLoader实例的， 发现有一个getSystemLoader的方法是获取ClassLoader 
​     然后我们翻开这个源码 我们发现有一个initSystemLoader的方法 代码如下：

```javascript
 private static synchronized void initSystemClassLoader() {
        if (!sclSet) {  //如果sclSet==false
            if (scl != null)
                throw new IllegalStateException("recursive invocation");
            sun.misc.Launcher l = sun.misc.Launcher.getLauncher(); //首先获取Laucher 这个就是获取外部类Launcher实例，通过这个实例来获取AppClassLoader内部类的实例  
            if (l != null) {
                Throwable oops = null;
                scl = l.getClassLoader();// 原来是在这里获取ClassLoader实例的
                try {
                    scl = AccessController.doPrivileged(
                        new SystemClassLoaderAction(scl));
                } catch (PrivilegedActionException pae) {
                    oops = pae.getCause();
                    if (oops instanceof InvocationTargetException) {
                        oops = oops.getCause();
                    }
                }
                if (oops != null) {
                    if (oops instanceof Error) {
                        throw (Error) oops;
                    } else {
                        // wrap the exception
                        throw new Error(oops);
                    }
                }
            }
            sclSet = true;
        }
    }
   
```

   ###### 然后重点进入Launcher.java这个文件 看看它的默认构造器   （主要是做了委托这件事）

```javascript
 public Launcher() {
        Launcher.ExtClassLoader var1;
        try {
            var1 = Launcher.ExtClassLoader.getExtClassLoader();
        } catch (IOException var10) {
            throw new InternalError("Could not create extension class loader", var10);
        }

        try {
            this.loader = Launcher.AppClassLoader.getAppClassLoader(var1);
        } catch (IOException var9) {
            throw new InternalError("Could not create application class loader", var9);
        }

        Thread.currentThread().setContextClassLoader(this.loader);
        String var2 = System.getProperty("java.security.manager");
        if (var2 != null) {
            SecurityManager var3 = null;
            if (!"".equals(var2) && !"default".equals(var2)) {
                try {
                    var3 = (SecurityManager)this.loader.loadClass(var2).newInstance();
                } catch (IllegalAccessException var5) {
                } catch (InstantiationException var6) {
                } catch (ClassNotFoundException var7) {
                } catch (ClassCastException var8) {
                }
            } else {
                var3 = new SecurityManager();
            }

            if (var3 == null) {
                throw new InternalError("Could not create SecurityManager: " + var2);
            }

            System.setSecurityManager(var3);
        }
```

为什么需要双亲委托机制
简单来说，
这是为了保证 JDK 核心类库都是由 bootstrap 加载器加载。

那为什么需要保证 JDK 核心类库由 bootstrap 加载器加载呢？
其实这主要是为了保证 JDK 核心类库都是由同一个加载器加载？
那为什么要保证 JDK 核心类库都需要由同一个加载器加载呢？
这是为了保证核心类库的类在 JVM 中只有一个对应实体。也就是为了保证类型关系的正确性。


作者：一半晴天
链接：https://www.jianshu.com/p/f7b851c64828
来源：简书
简书著作权归作者所有，任何形式的转载都请联系作者获得授权并注明出处。