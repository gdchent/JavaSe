package extendsDemo.js;

//用Java方式实现js说的寄生式继承
public class JiShengExtends {

    //按照逻辑第一步创建一个object方法
    public static BasePerson object(String tag) {
        //这个方法里面作了什么逻辑
        //创建子类实例 这个类要是obj的子类
        //创建一个老师实例
        //这里要创建一堆的子类对象
        BasePerson basePerson=null ;
        switch (tag) {
            case BasePersonTag.TEACHER: //如果是创建学习则创建学生
                basePerson=new Teacher();
                break;
            case BasePersonTag.STUDENT :
                basePerson=new Student();
                break;
        }
        return basePerson;
    }

}
