package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = ElementType.TYPE) //作用于类
@Retention(RetentionPolicy.RUNTIME) //在程序运行时候有效
public @interface Table {
    String value();

    String name();
}
