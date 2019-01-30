package extendsDemo;

public class Person extends Object{

    public Person(){
        System.out.println("person_constructor");
        setContentView();
    }

    public void setContentView(){
         System.out.println("person_setContentView");
    }
}
