package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE) //只能应用于类上
@Retention(RetentionPolicy.RUNTIME) //在程序运行时候有效
public @interface DbTable {
    String name() default "";

}
