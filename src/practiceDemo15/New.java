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

    public static void  main(String ...args){
         Map<String,List<String>> stringListMap=New.map();

         Map<String ,List<? extends Object>> listMap=New.map();
         List<String> stringList=New.list();
    }
}
