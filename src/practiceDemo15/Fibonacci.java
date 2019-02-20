package practiceDemo15;

/**
 * 使用泛型接口 实现斐波那契数列
 * 斐波那契数列 ：1  1  2  3   5  8   13  21 ...
 */
public class Fibonacci implements Generator<Integer> {

    private int count =0 ;

    @Override
    public Integer next() {
        return fib(++count);
    }

    private int fib(int n){
        if(n==1||n==2){
            return 1 ;
        }
        return fib(n-2)+fib(n-1) ;
    }

    public static void main(String ...args){
         Fibonacci fibonacci=new Fibonacci();
         for(int i=0;i<18;i++){
             System.out.println(fibonacci.next());
         }
    }
}
