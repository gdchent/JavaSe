package annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * 定义一个泛型基类
 */
public class BaseDao<T> {

    public boolean add(T t){
        //通过userbean自动生成 insert语句
        Class clazz=t.getClass();
        Table table= (Table) clazz.getDeclaredAnnotation(Table.class);
        String value=table.value();
        String name=table.name();
        Map<Object,Object> objectMap=getColumnAndValue(clazz,t);

        return true;
    }

    //按照<列明，属性>的格式输出所有的单元格
    private Map<Object, Object> getColumnAndValue(Class<? extends T> clazz, T t) {
        //首先声明了一个map键值对
        Map<Object, Object> map = new HashMap<>();
        //获取clazz类的所有方法
        Method[] methods = clazz.getDeclaredMethods();
        //获取的是类自身声明的所有方法，包含public、protected和private方法
        for (Method method : methods) {
            String methodName = method.getName();
            if(methodName.startsWith("get")) {
                //获得所有的get方法
                Column column = method.getDeclaredAnnotation(Column.class);
                ////getDeclaredAnnotation()返回直接存在于此元素上的所有注释
                //这个方法里放有参数时，返回指定类型的注解。如果存在该元素的指定类型的注释，则返回这些注释，否则返回 null。
                try {
                    map.put(column.value(), method.invoke(t));
                    //invoke执行方法
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }

        return map;
    }

}
