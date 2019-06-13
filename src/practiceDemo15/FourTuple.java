package practiceDemo15;

public class FourTuple<A,B,C,D> extends ThreeTuple<A,B,C> {
    public D four=null;
    public FourTuple(A a, B b,C c) {
        super(a, b,c);
    }

    public FourTuple(A a, B b, C c,D four) {
        super(a, b,c);
        this.four = four;
    }
}
