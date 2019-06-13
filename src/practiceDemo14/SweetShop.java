package practiceDemo14;

/**
 *  我们可以 javac xxx.java   其实就是将xxx.java文件生成字节码文件
 *  或者手动使用 A  a=new A() ;  // 其实就是生成一个对象   首先 加载静态区域 然后是构造器
 */
public class SweetShop {
    public static void main(String ...args){
        System.out.println("string:"+args);
        new Candy();
        System.out.println("After creating Candy");
        try {
            Class.forName("practiceDemo14.Gum");
        }catch (ClassNotFoundException e){
            System.out.println("Could not find Gum==="+e.getMessage());
        }
        new Cookie();
        System.out.println("after creating Cookie");

        //实现
        Class aClass=SweetShop.class;
        aClass.getInterfaces();
        aClass.isInterface();
    }
}
