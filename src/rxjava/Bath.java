package rxjava;

public class Bath {
    private String s1="Happy";
    private String s2="Happy";
    private String s3,s4;

    //声明令一个对象的引用
    private Soap castille;
    private int i;
    private float toy;
    public Bath(){
         //在自己的类中进行初始化
        castille=new Soap();//直接在构造器中初始化了
    }


    //当需要调用的时候

    @Override
    public String toString() {
        if(s3==null){
            //这个时候创建
            s3="懒惰性初始化OK了";
        }
        return s3;
    }

    public static void main(String ...args){

            Bath bath=new Bath();
            System.out.println(bath);

    }
}
