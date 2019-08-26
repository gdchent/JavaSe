package extendsDemo.js;

/**
 * 工厂方法用来创建实例
 */
public class Factory {

     public BasePerson createPerson(String tag){
         BasePerson clone=JiShengExtends.object(tag);
         //给基类添加方法
//         basePerson.sayName=function(){
//
//         }
          return clone;
     }
}
