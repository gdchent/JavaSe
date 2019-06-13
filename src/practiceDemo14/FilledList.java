package practiceDemo14;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

public class FilledList<T> {

    private Class<T> type;

    public FilledList(Class<T> type){
        this.type=type;
    }

    public List<T> create(int nElements){
        List<T> result=new ArrayList<>();
        try {
            for(int i=0;i<nElements;i++){
                result.add(type.newInstance());
            }
        }catch (Exception e){
            throw new RuntimeException();
        }finally {

        }
        return result ;
    }

    //main主函数
    public static void main(String ...args){
        FilledList<CountedInteger> countedIntegerFilledList=new FilledList<>(CountedInteger.class);
        System.out.println(countedIntegerFilledList.create(15));

    }
}
