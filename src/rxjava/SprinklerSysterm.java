package rxjava;

public class SprinklerSysterm extends Object
{
    private String valve1,valvel2,valvel3,valvel4;

    //复用另一个类的代码
    private WaterSource source=new WaterSource();
    private int i;
    private float f;



    //在该类里面重写toString方法
//    @Override
//    public String toString() {
//        System.out.println("SprinklerSysterm的toString方法被调用");
//        return "SprinklerSysterm{" +
//                "valve1='" + valve1 + '\'' +
//                ", valvel2='" + valvel2 + '\'' +
//                ", valvel3='" + valvel3 + '\'' +
//                ", valvel4='" + valvel4 + '\'' +
//                ", source=" + source +
//                ", i=" + i +
//                ", f=" + f +
//                '}';
//    }

    public static void  main(String ...args){

        //
        SprinklerSysterm sprinklerSysterm=new SprinklerSysterm();
        System.out.println(sprinklerSysterm);

    }
}
