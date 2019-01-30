package practiceDemo7;

/**
 * description:Home基类
 */
public class Homer {

    //返回一个字符
    char doh(char c){
        System.out.println("doh(char)");
        return c;
    }
    //跟上面的方法重载
    float doh(float f){
         System.out.println("doh(float)");
         return 1.0f;
    }


}
