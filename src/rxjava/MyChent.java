package rxjava;
class MyChent {

    public MyChent(){
        System.out.println("MyChent");
    }


    public void clear(){
        System.out.println("gc");
        System.gc();
    }

    @Override
    public String toString() {
        return "MyChent{}";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize函数调用");
        super.finalize();
    }
}
