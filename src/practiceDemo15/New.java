package practiceDemo15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 杠杆利用参数类型判断
 */
public class New {

    //静态方法
    public static <K,V> Map<K,V> map(){
        return new HashMap<K,V>() ;
    }
    public static <T> List<T> list(){
        return new ArrayList<T>();
    }


    public static void f(Map<String,List<String>> listMap){

    }

    public static void  main(String ...args){
         Map<String,List<String>> stringListMap=New.map();

         Map<String ,List<? extends Object>> listMap=New.map();
         List<String> stringList=New.list();
         f(New.map());

         Class integers=new ArrayList<>().getClass();
         Class arrayList=new ArrayList<>().getClass();
         New mNew=new New();
         mNew.getClass();
         System.out.println(integers.toString());
         System.out.println(integers==arrayList);  //因为都是调用了object的方法 所以是true
    }
}
