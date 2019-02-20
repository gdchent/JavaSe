package practiceDemo7;

import java.util.ArrayList;
import java.util.List;

/**
 * description:测试类
 */
public class Hide {

    private Lisa lisa;
    public static void main(String ... args){
         Bart bart=new Bart();
        bart.doh(1);
        bart.doh('x');
        bart.doh(new Milhouse());

        String str1=new String("str");
        String str2=new String("str");
        List<String> strings=new ArrayList<>();
        strings.add(str1);
        strings.add(str2);
        for(String str:strings){
            System.out.println("str:"+str);
        }
    }
}
