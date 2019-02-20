package practiceDemo15;

/**
 * 第二种情况 使用Java里面的多态  也就是设置参数类型为基类
 */
public class Holder2 {

    //比如这里就可以设置为Object类型   所以一般会用 object instance of来判断是不是实际new出来的类型
    Object object;
    public Holder2(Object object){
         this.object=object;
    }
}
