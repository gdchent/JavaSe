package demo11;

import java.util.ArrayList;

/**
 * @author chentao
 * @version 1.0
 * @date 2019/7/4 下午11:48
 * @description:描述信息
 */
public class TestAppleOrangleList {

    //@SuppressWarnings("unchecked") //抑制警告信息
    public static void main(String[] args) {

        ArrayList list=new ArrayList();

        for(int i=0;i<3;i++){
            //创建苹果实例
            Apple apple=new Apple();
            list.add(apple);

        }
        //添加一个橘子
        list.add(new Orangle());
        for(int i=0;i<list.size();i++){
            Object object=list.get(i);
            if(object instanceof Apple){
                Apple apple= (Apple) object;
                System.out.println("id:"+apple.id());
            }
            //如果是橘子
            if(object instanceof Orangle){
                System.out.println("我是橘子");
            }
        }

    }
    static class Apple {
        private static long counter;
        private final long id=counter++;
        public long id(){
            return id;
        }
    }
    static class Orangle{

    }
}

