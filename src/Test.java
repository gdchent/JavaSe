import extendsDemo.Bird;
import extendsDemo.Penguin;
import extendsDemo.Shape;
import extendsDemo.Student;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

/**
 * @version
 * @author
 */
public class Test {

    public static void main(String ...args){

        Student student=new Student();
        student.test();
        //实例化一个企鹅
        Bird bird=new Penguin();
        bird.move();

        int  x=1;
        show();
        System.out.println(x);

        //BigInteger bigInteger=new BigInteger();
        //BigDecimal bigDecimal=new BigDecimal()
        Character character=new Character('6');
        test();
        testString("33","444");
        //System.getProperties().list(System.out);
        System.out.println(new Date());
        //  1  1  2  3   5    8   13
        method(10);
        String str=null;
        System.out.println(str);
        String str1="str";
        String str2=new String("str");
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));

        //字符串
        String string=new String();
        String stringArray=new String("bbbb");
    }


    private static void  method(int num){
        //定义第一个加数a，初始值为1；定义第二个加数b，初始值为1；定义两个加数之和为c，初始值为0
        int a = 1;
        int b = 1;
        int c = 0;
        //首先在控制台打印出数列中第一个数和第二个数的值
        System.out.print(a + "\t" + b + "\t");
        //建立一个for循环，用于循环输出数列中第三位至第十位的数字
        for (int i = 3; i <= num; i++) {
            //第三个数即为c，a+b等于c的值
            c = a + b;
            //将第一个加数a赋值为数列中的第二个数b的值
            a = b;
            //将第二个加数b赋值为数列中的第三个数c的值
            b = c;
            //在第二次循环打印时，将打印数列中的第四个数为：b + c = b + (a + b)
            System.out.print(c + "\t");
        }

    }





    private static void testString(String ...strings){
        for(int i=0;i<strings.length;i++){
            System.out.println("s:"+strings[i]);
        }
    }

    private static void show(){
        int x=2;
        System.out.println("show:"+x);
    }


    private static void test(){
        {
            String s=new String("sss");
            int a=6;
            System.out.println("testA:"+a);
            {

            }
        }
    }
}
