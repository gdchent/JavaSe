package practiceMap;

import java.util.*;

/**
 * 遍历map的四种方式
 */
public class GetItemMap {


    public static void  main(String ...args){
        //获取HashMap对象
        Map<String,String> hashMap=new HashMap<String, String>();
        //放置对象
        hashMap.put("key1",null);
        hashMap.put("key2","value2");
        hashMap.put("key3","value3");
        hashMap.put("key4","value4");
        hashMap.put("key5",String.valueOf(3));
        getItemMap1(hashMap);
        getItemMap2(hashMap);
        getItemMap3(hashMap);
        getItemMap4(hashMap);


        Integer a=5;
        Integer b=5;
        int res=a.compareTo(b);
        System.out.println(String.valueOf(res));
    }

    //方法1 普遍使用  二次取值
    public static void getItemMap1(Map<String,String> map){
        //通过ketSet方法
        //第一步通过获取Set类型的key
        System.out.println("通过Map.keySet遍历key和value：");
        Set<String> setKey=map.keySet();
        for(String key:setKey){
            System.out.println("key="+key+",value="+map.get(key));
        }
    }

    //方法2
    public static void getItemMap2(Map<String,String> map){
        System.out.println("通过Map.entrySet使用iterator遍历key和value：");
        Iterator<Map.Entry<String,String>> iterator =map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String> entry=iterator.next();
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }
    }
    //方法3  //第三种：推荐，尤其是容量大时
    public static void getItemMap3(Map<String,String> map){
        System.out.println("通过Map.entrySet遍历key和value");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }
    }
    //第四种
    public static void getItemMap4(Map<String,String> map) {
        //第四种
        System.out.println("通过Map.values()遍历所有的value，但不能遍历key");
        for (String v : map.values()) {
            System.out.println("value= " + v);
        }
    }
}
