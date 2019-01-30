package extendsDemo;


//基类 ===父类
public abstract class Shape {

    abstract void draw();
    abstract void erase();
    void move(){

    }
    void getColor(){

    }
   void setColor(){

   }



   public static void staticMethod(){
        System.out.println("staticMethod");
   }

   //新的类型可以添加新的方法   这个时候基类不访问新接口的类型 ====因为它是子类所拥有

}
