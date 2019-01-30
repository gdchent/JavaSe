package rxjava;

public class PassingThis {
     int intValue=getIntValue();
    public static void main(String ...args){
        new Person().eat(new Apple());
        PassingThis passingThis=new PassingThis();
        System.out.println(String.valueOf(passingThis.intValue));
        System.out.println("====");
        System.out.println("====fssfs");
        System.out.println("====fsfsfsf");
    }

   private int getIntValue(){
        System.out.println("成员变量调用成员函数");
        return 0;
   }


}
