package practiceDemo15;


/**
 * 创建所需要的泛型基类
 */
public class Coffee {

    private long counter =0 ;
    private  long id=counter ++;


    //实现object的toString方法
    @Override
    public String toString() {
        return getClass().getSimpleName()+" "+id;
    }

}
