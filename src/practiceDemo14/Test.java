package practiceDemo14;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.*;
import java.util.LinkedList;

/**
 * ArrayList源码分析：
 * 第一步：new ArrayList创建了一个空数组
 * 第二步：第一次添加元素 扩展容量为10  之后的扩展算法;原来数组大小+原来数组的一半
 * 特点：不适合进行删除或者插入操作  线程不安全  适合在单线程访问使用
 */
public class Test {


    public static void main(String ...args){
        Order order=new Order();

        Order<String> stringOrder=new Order<>();
        stringOrder.t="";
        LinkedList<String> strings=new LinkedList<>();
        strings.add("111");
        strings.add("222");
        strings.add("333");
        strings.add("444");
        System.out.println("size:"+strings.size());

        String []stringsArr=new String[strings.size()];
        Object []stringArr= (String[]) strings.toArray(stringsArr);

        System.out.println("stringArr"+stringArr[0]);
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("sdf");
        arrayList.add("sdfgfdg1");
        arrayList.add("sdfgfdg2");
        arrayList.add("sdfgfdg3");
        arrayList.add("sdfgfdg4");
        arrayList.add("sdfgfdg5");
        arrayList.add("sdfgfdg6");
        arrayList.add("sdfgfdg7");
        arrayList.add("sdfgfdg8");
        arrayList.add("sdfgfdg9");
        arrayList.add("sdfgfdg10");
        arrayList.add("sdfgfdg11");

        int minCapacity=10 ;
        Object[] elementData={};
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        if(newCapacity-minCapacity<0){
            newCapacity=minCapacity;
        }
        System.out.println("newCapacity:"+newCapacity);
        elementData = Arrays.copyOf(elementData, newCapacity); //复制一个数组  长度为10
        System.out.println(elementData.length);


        //第一步骤  创建 空数组
        String strArray[]={};
        //扩容
        String afterStrArray[]=Arrays.copyOf(strArray,10);
        System.out.println(afterStrArray.length);
        arrayList.get(10);
        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.get(10);


        Set<String> set=new HashSet<>();
        Map<String,String> stringStringMap=new HashMap<>();
    }
}
