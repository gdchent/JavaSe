package practiceDemo14;

public abstract class Shape extends Object{

    void draw(){
        System.out.println(this+"onDraw");  //这里的this 记住会调用 toString方法
    }

    abstract public String toString();


}
