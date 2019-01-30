package rxjava;


//水源类
public class WaterSource {

    private String s;
    WaterSource(){
        System.out.println("构造器的初始化");
        s="concructed";
    }

    //重写toString 方法
    @Override
    public String toString() {
        System.out.println("水源类的toStringf方法被调用了");
        return s;
    }
}
