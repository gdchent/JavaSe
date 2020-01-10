package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(value={ElementType.TYPE,ElementType.METHOD})
public @interface TestInterface {


}
