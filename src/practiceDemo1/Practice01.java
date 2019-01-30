package practiceDemo1;

/**
 * 练习一
 * 需求分析：Class 定义2个变量 然后把它打印出来
 * 目的：是为了验证Java默认执行了初始化
 */
public class Practice01 {
    int a; //定义整型字段a 不赋值
    char b;

    public void input(){
        System.out.println("a="+a+",b=:"+b);
    }
}
