package comparabletest;

import java.util.ArrayList;
import java.util.Collections;


public class Test {

    public static void  main(String ...args){

        ArrayList list=new ArrayList();
        A a=new A(1);
        B b=new B(3);
        C c=new C(2);
        list.add(a);
        list.add(b);
        list.add(c);
        //排序
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
             System.out.println(list.get(i));
        }
    }
}
