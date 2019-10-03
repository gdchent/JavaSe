package demoinject;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author chentao
 * @version 1.0
 * @date 2019/7/24 下午9:14
 * @description:描述信息
 */
@Target({ElementType.METHOD,ElementType.TYPE,ElementType.FIELD}) //目标
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomAnnoation {

    String className(); //在使用这个注解的时候就会要强行进行赋值
    String methodName(); //方法

}
