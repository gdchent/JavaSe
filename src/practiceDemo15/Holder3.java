package practiceDemo15;

/**
 * 第三种情况使用 用泛型
 * 泛型在使用的时候 在创建对象的时候必须要明确指定是什么类型 可以是基本类型或者是自定义类型
 */
public class Holder3<T> {

    private T t;
    public Holder3(T t){
         this.t=t;
    }
}
