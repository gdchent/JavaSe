package practiceDemo7;

/**
 * 其实这个类就相当于代理类
 */
public class PlaceSetting extends Custom {

    private Spoon sp;
    private Fork fork;
    private Knife knife;
    private DinnerPlate dinnerPlate;

    public PlaceSetting(int i){
        super(i+1);

        //逻辑思维分析
        /**
         * 这个PlaceSetting这个类相当于子类
         */
        sp=new Spoon(i+2);
        fork=new Fork(i+3);
        knife=new Knife(i+4);
        dinnerPlate=new DinnerPlate(i+5);
        System.out.println("PlaceSetting_constructor");
    }

    public static void  main(String ...args){
        PlaceSetting placeSetting=new PlaceSetting(9);
    }
}
