package rxjava;

//测试java惰性初始化
public class Soap {
    private String s;  //声明 并未初始化 编译器会默认给个null
    Soap(){
        System.out.println("Soap()");
        s="Constructed";
    }
    public String toString(){
         return s;
    }

}
