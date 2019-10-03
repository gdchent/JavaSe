package demo1;

import java.util.Random;

/**
 * http://blog.sina.com.cn/s/blog_93dc666c0101h3gd.html
 * 测试Random随机数
 * 关于Ｊａｖａ中的随机数
 * 1 math包下面的random方法　　返回的是一个Double类型的值区间是０的闭区间到１的开区间
 * ２　ｕtil下面的Ｒandom类该类有２个构造器方法
 * 无参数构造器：创建1.Random()：创建一个新的随机数生成器。
 * 带参数的构造器:Random(long seed)：使用单个 long 种子创建一个新的随机数生成器。
 */
public class RandomTest {

    public static void main(String ... args){

        //参数填写不填写构造器参数是否给　结果是一样的。
        Random random=new Random(10);
        int value=random.nextInt(5)+1;
        System.out.println(value);

        int mathValue= (int) (Math.random()*3);
        System.out.println("mathValue:"+mathValue);
    }
}
