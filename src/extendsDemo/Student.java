package extendsDemo;

public class Student extends Person{

    public Student(){
        System.out.println("student_constructor");
    }

    @Override
    public void setContentView() {
        //super.setContentView();
        System.out.println("student_setContentView");
    }

    public static void test(){
        System.out.println("test");
    }
}
