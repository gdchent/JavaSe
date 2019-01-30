package practiceDemo1;

public class TestClass {
    public static void main(String ...args){
         Practice01 practice01=new Practice01();
         practice01.input();

         StaticTest staticTest1=new StaticTest();
        StaticTest staticTest2=new StaticTest();

       System.out.println("strTest:"+StaticTest.stringList.hashCode());
       System.out.println("has:"+staticTest1.toString()+",has"+staticTest1.hashCode());
        System.out.println("has:"+staticTest2.toString()+",has"+staticTest2.hashCode());
    }
}
