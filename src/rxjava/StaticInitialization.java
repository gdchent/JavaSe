package rxjava;

public class StaticInitialization {
//    public static void main(String... args) {
//        System.out.println("程序开始");
//        new Cupboard();
//        System.out.println("============");
//        new Cupboard();
//        table.f2(1);
//
//    }
    MyChent myChent = new MyChent();
    static Table table = new Table();
    static Cupboard cupboard = new Cupboard(); //

    public void test(){
        System.out.println("myChent"+myChent);
    }
}
