package practiceDemo15;

import java.util.ArrayList;
import java.util.List;

/**
 * description:函数泛型化 传入一个可变数组
 * 思路分析：传入一个可变的数组 将数组转化为Arraylist集合 ，然后返回一个带T的List集合
 */
public class GenericVarargs {

    public static <T> List<T> makeList(T ...args){
        List<T> result=new ArrayList<>();
        for(T item:args){
            result.add(item);
        }
        return result ;
    }
}
