package practiceDemo14;

public class SimpleProxyDemo {

    public static void consumer(Interface iface){
        iface.doSomething();
        iface.somethingElse("something Else");
    }
}
