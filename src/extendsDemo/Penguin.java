package extendsDemo;

public class Penguin extends Bird {


    @Override
    public void move() {
        super.move();
        System.out.println("企鹅movef方法");
    }
}
