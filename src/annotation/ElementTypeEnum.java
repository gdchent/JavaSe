package annotation;

public enum ElementTypeEnum {
    TYPE, //表明该注解 可以用于类，接口，或者enum声明
    FIELD, //表明注解可以用于字段声明，包括enum实例
    METHOD, //表明该注解可以用于方法声明
    PARAMETER, //表明该注解可以用于参数声明
    CONSTRUCTOR, //表明该注解可以用于构造函数声明
    LOCAL_VARIABLE, //表明注解可以用于局部变量声明
    ANNOTATION_TYPE,  //表明注解可以用于注解声明
    PACKAGE, //表明该注解可以用于包声明
    TYPE_PARAMETER, //表明该注解可以用于参数类型声明
    TYPE_USE //类型使用

}
