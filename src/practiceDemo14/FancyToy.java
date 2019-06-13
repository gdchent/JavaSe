package practiceDemo14;

/**
 * 子类
 */
public class FancyToy extends Toy implements HasBatteries,Waterproof,Shoots {

    static {
        System.out.println("static----init");
    }
    FancyToy(){
        super(1);
        System.out.println("我是FancyToy构造器");

    }
}
