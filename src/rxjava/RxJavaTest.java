package rxjava;

public class RxJavaTest {
    public static void main(String ...args){
        byte a = 127;
        byte b = 127;
        //a = a + b;   //报
        // 错
        int c=(a+=b);

        /**
         * 分析:
         * 成员变量string 定义并未被初始化
         * 成员变量str1定义并初始化为null
         * 成员变量str2定义并初始化为"str2"
         *成员变量str3为null
         */
        StringTest stringTest1=new StringTest();
        StringTest stringTest2=new StringTest("测试String构造器");
        System.out.println("str1:"+stringTest2.str1);
        System.out.println("str2:"+stringTest2.str2);
        System.out.println("str3:"+stringTest2.str3);

    }
}
