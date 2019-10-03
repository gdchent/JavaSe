package demo1;
/**
 * 判断字符是不是大写字符
 */
public class CharasterTest {
    public static void main(String[] args) {

        //定义字符
        char a='C';

        int res=a;
        System.out.println(res);
        //进行自动装箱
        Character characterＡ=a;
        //判断这个字符是不是大写
        System.out.println(Character.isUpperCase(characterＡ));
    }
}
