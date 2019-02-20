package practiceDemo13;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class InfiniteRecursion extends Object{




    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String ...args){

        String str=new String("abc");
        String string=new String("abc");
        System.out.println(str.equals(string)+"\t---hash值"+str.hashCode());

        InfiniteRecursion  i1=new InfiniteRecursion();
        InfiniteRecursion  i2=new InfiniteRecursion();
        System.out.println(i1.equals(i2));
        System.out.println(i1==i2);
        String string1=new String("abc");
        String string2=new String("abc");
        System.out.println(string1.equals(string2));
        System.out.println(string1==string2);

        Object object1=new Object();
        Object object2=new Object();
        System.out.println(object1.equals(object2));



    }
}
