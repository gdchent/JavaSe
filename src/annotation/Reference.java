package annotation;

import java.lang.annotation.*;
import java.lang.annotation.ElementType;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Reference {
    boolean next() default false;

}
