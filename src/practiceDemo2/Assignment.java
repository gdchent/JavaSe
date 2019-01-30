package practiceDemo2;

import practiceDemo7.SpaceTest;

public class Assignment {

    public static void main(String ...args){

        //创建2个实例
        Tank tank1=new Tank();
        Tank tank2=new Tank();

        //给成员变量赋值
        tank1.level=9;
        tank2.level=47;
        System.out.println("1:t1.level:"+tank1.level+",tank2.level:"+tank2.level);

        ///把t2的实例 赋值给t1   就是让t1跟t2指向同一个地址
        tank1=tank2;  //tank2已经没有被使用 垃圾回收机制 会自动释放 tank2所实例化的时候的内存
        tank1.level=27 ;//改变它所指向的堆内存的 值


        SpaceTest spaceTest1 =new SpaceTest();
        SpaceTest spaceTest2 =new SpaceTest();
       spaceTest1 = spaceTest2;

       //
    }
}
