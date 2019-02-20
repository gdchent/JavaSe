package practiceDemo15;

public class TwoTuple<A,B> {
    public  A first;
    public  B second;
    public TwoTuple(A a,B b){
        this.first=a;
        this.second=b;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "first:"+first+",second:"+second ;
    }
    public static void main(String ...args){
        TwoTuple twoTuple=new TwoTuple(new Object(),new Object());
       System.out.println(twoTuple);
    }
}
