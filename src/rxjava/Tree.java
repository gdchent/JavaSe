package rxjava;

public class Tree {

    int height;
    Tree(){
        //默认构造器
        System.out.println("默认构造器");
    }
    Tree(int initHeight){
        height=initHeight;
        System.out.println("我是重载构造器高度："+initHeight);
    }

    void info(){
        System.out.println("info无参数方法");
    }

    void info(String str){
        System.out.println("有参数的函数"+str);
    }
    /**
     * 因为基本数据类型 较小的类型会自动提升至一个较大的类型
     */
    void f1(char x){
        System.out.println("f1(char)");
    }
    void f1(byte x){
        System.out.println("f1(byte)");
    }
    void f1(short x){
        System.out.println("f1(short)");
    }
    void f1(int x){
        System.out.println("f1(int)");
    }
    void f1(long x){
        System.out.println("f1(long)");
    }
    void f1(float x){
        System.out.println("f1(float)");
    }
    void f1(double x){
        System.out.println("f1(double)");
    }
//    int f1(int x){
//        return 1;   //方法重载行不通 见Java编程思想 82页   因为有时候 忽略方法返回值   比如    f(); 就无法判断了
//    }
    public static void main(String ... args){
        Tree tree=new Tree();
        char x='x';
        tree.f1(x);
    }

}
