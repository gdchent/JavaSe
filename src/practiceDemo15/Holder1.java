package practiceDemo15;

//第一种情况 使用明确的指定类型类做参数
public class Holder1 {

    public Automobile automobile;

    //比如我现在要通过构造器 拿到这个automobile的实例
    //第二种情况就是 这里使用的是泛型
    public Holder1(Automobile automobile){
        this.automobile=automobile;
    }

}
