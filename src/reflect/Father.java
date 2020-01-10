package reflect;

/**
 * @author chentao
 * @version 1.0
 * @date 2019/8/31 上午2:12
 * @description:描述信息
 */
public class Father {

    private String name;
    private int age;

    public Father(){
        System.out.println("constructor");
    }

    public Father(String name) {
        this.name = name;
    }

    public Father(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private void sayName(){
        System.out.println("sayName"+name);
    }
}
