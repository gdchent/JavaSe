package practiceDemo14;

import java.net.URLClassLoader;

/**
 * 1 . 编写Java代码 ->编译 ->检测错误->class对象->然后Jvm虚拟机加载到内存
 * 2 .
 */
public class ToyTest {

    static void printInfo(Class cc) {
        //通过输出可以看出 clazz.getName方法获取的是包名+类名

        System.out.println("Class name:" + cc.getName() + " is  interface? [ " + cc.isInterface() + " ] ");
        System.out.println("Simple name:" + cc.getSimpleName());
        System.out.println("Canonical name :" + cc.getCanonicalName());
    }

    //main函数
    public static void main(String... args) {
        Class c = null;
        try {
            //第一步通过 class的forName方法通过类包名+类名来获取class对象
            c = Class.forName("practiceDemo14.FancyToy");//注意参数是包名+类名
            c=Class.forName("practiceDemo14.FancyToy",false,ClassLoader.getSystemClassLoader());
        } catch (ClassNotFoundException e) {
            //如果找不到这个类 就抛出异常
            System.out.println("can not find FancyToy这个类"+e.getMessage());
        }
        try {
           Object object= c.newInstance();

           System.out.println("object:"+object);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println("======================");
        //输出 对象
        printInfo(c);
        System.out.println("======================");
        for (Class face : c.getInterfaces()) {
            printInfo(face);
        }

        ClassLoader cl=ToyTest.class.getClassLoader();
        System.out.println("cl:"+cl);
        ClassLoader classLoader=FancyToy.class.getClassLoader();

        System.out.println("cl2:"+classLoader+",parent:"+classLoader.getParent());

       // System.out.println("cl2:"+classLoader+",parent:"+classLoader.getParent().getParent());
        /**
         *  每个类 都有个一个类名.class文件   加载类名.class文件是由AppClassLoader文件完成的
         *  类加载器的源码文件地址：http://www.grepcode.com/file/repository.grepcode.com/java/root/jdk/openjdk/8u40-b25/sun/misc/Launcher.java
         */

        String classLoaderString=System.getProperty("sun.boot.class.path");
        System.out.println("====================="+classLoaderString);
       // ClassLoader
    }
}
