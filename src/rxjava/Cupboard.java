package rxjava;

public class Cupboard {

    Bowl bowl3=new Bowl(3);
    static Bowl bowl4=new Bowl(4);

    public Cupboard() {
       System.out.println("Cupboard构造函数");
       bowl4.f1(4);
    }

    void f3(int marker){
        System.out.println("marker");
    }
    static Bowl bowl5=new Bowl(5);

}
