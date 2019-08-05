package comparabletest;

public class A implements Comparable<A>{

    private int rank;
    public A(int rank){
        this.rank=rank;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public int compareTo(A o) {
        return Integer.compare(o.rank,o.rank);
    }
}
