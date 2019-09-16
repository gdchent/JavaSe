package annotation;

@Pro(getClasName = "annotation.Demo1", methodName = "show")
public class ReflectTest {

    public static void main(String... args) {

        Class<ReflectTest> reflectTestClass = ReflectTest.class;
        //获取注解对象
        Pro pro = reflectTestClass.getAnnotation(Pro.class);
        String name=pro.getClasName();
        String mName=pro.methodName();
        System.out.println("name"+name);

    }
}
