package practiceDemo14;

import java.lang.reflect.Proxy;

public class SimplyDynamicProxy {

    public static void consumer(Interface iface){
        iface.doSomething();
        iface.somethingElse("bonon");
    }
    public static void main(String ...args){
                RealObject realObject=new RealObject();
                consumer(realObject);
//                Interface proxy= Proxy.newProxyInstance(Interface.class.getClassLoader(),new Class[]{Interface.class},new DynamicProxyHandler(realObject));
        Interface proxy= (Interface) Proxy.newProxyInstance(Interface.class.getClassLoader(),new Class[]{Interface.class},new DynamicProxyHandler(realObject));
        consumer(proxy);

    }

}
