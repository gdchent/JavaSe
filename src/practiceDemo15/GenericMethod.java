package practiceDemo15;

/**
 * 泛型方法：就是在方法中使用泛型
 */
public class GenericMethod {

    public <T> void f(T t){
        System.out.println(t.getClass().getName());
    }
    public static void main(String ...args){
        GenericMethod genericMethod=new GenericMethod();
        genericMethod.f("abc");
    }
}
