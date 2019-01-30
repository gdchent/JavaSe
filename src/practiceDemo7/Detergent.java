package practiceDemo7;

public class Detergent extends Cleaser {


    public static void  main(String ... args){
        Detergent detergent=new Detergent();
        detergent.scrub();
        System.out.println(detergent.toString());
        Cleaser.main(args);
    }
    @Override
    public void scrub() {
        append("Detergent_scrub===="+getClass().getName()+"====");
        super.scrub();
    }
}

//父类class不是public的

class Cleaser extends Object{

    public static void  main(String ...args){

        System.out.println("父类main方法开始执行");
        Cleaser x=new Cleaser();
        x.dilute();
        x.apply();
        x.scrub();
        System.out.println(x);
        System.out.println("父类main方法执行完毕");
    }
    private String string="Cleaser";

    void append(String a){
        string+=a;

    }
    public void dilute(){
        append("dilute()");
    }
    public void apply(){
        append("apply()");
    }
    public void scrub(){
        append("scrub");

    }

    @Override
    public String toString() {
        //System.out.println("string:"+string);
        return string;
    }
}


