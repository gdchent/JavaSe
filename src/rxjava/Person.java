package rxjava;

public class Person {
    public void  eat(Apple apple){
        Apple peeled=apple.getPeeled();
        System.out.println("peeled");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize");
    }
}
