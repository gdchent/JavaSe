package extendsDemo.js;

/**
 * 测试js高级程序设计 寄生方式实现继承  便于相互理解js跟Java
 */
public class TestJiShengExtends {

    public static void main(String ...args){

        //创建父类实例
        BasePerson basePerson=new BasePerson();
          //创建工厂
        Teacher teacher= (Teacher) JiShengExtends.object(BasePersonTag.TEACHER);
        Student student= (Student) JiShengExtends.object(BasePersonTag.STUDENT);
    }
}
