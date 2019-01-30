package rxjava;

public class Table {
    static Bowl bowl=new Bowl(1);

    //无参数构造函数
    public Table(){
        System.out.println("打印table构造器");
        bowl2.f1(1);
    }

    //初始化一个静态的实例2  走进来这个类就会调用
    static Bowl bowl2=new Bowl(2);

    public void f2(int market) {
        System.out.println("打印table构造器"+market);
    }
}
