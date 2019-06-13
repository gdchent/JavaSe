package practiceDemo15;

/**
 * 泛型方法：就是在方法中使用泛型
 */
public class GenericMethod {
    public String c;
    public <T> void f(T t){
        System.out.println(t.getClass().getName());
    }

    //参数可以 带 泛型 也可以不带   2个可以混合使用
    public <A,B> void f2(A a,B b,String c){
        this.c=c;
    }
    public static void main(String ...args){
        GenericMethod genericMethod=new GenericMethod();
        genericMethod.f("abc");
    }

}
