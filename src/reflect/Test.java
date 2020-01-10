package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * @author chentao
 * @version 1.0
 * @date 2019/8/31 上午2:11
 * @description:描述信息
 */
public class Test {

    public static void main(String ...args){

        Class<Father> fatherClass=Father.class ;
        //通过类名获取所有构造函数
        Constructor<?>[] constructors =fatherClass.getConstructors();
        System.out.println("length"+constructors.length);
        for(int i=0;i<constructors.length;i++){
            System.out.println("data"+constructors[i]);
        }

        //获取所有属性列表
        Field [] fields =fatherClass.getDeclaredFields();
        for(int i=0;i<fields.length;i++){
            System.out.println("result:"+fields[i]);
        }
        //获取某个属性
        try {
            /**
             * GetField（字符串名称）
             *
             * 返回一个字段对象，该对象反映由此类对象表示的类或接口的指定公共成员字段。
             * 获取public字段
             */
            Field field=fatherClass.getField("name");
            System.out.println(field);
            Field [] publicFields=fatherClass.getFields();//获取所有的（public）公共的字段

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
