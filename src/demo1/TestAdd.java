package demo1;

import java.util.HashMap;

/**
 * 2个数字相加
 */
public class TestAdd {

    public static void main(String... args) {

        int[] nums = new int[]{96, 26, 19, 188, 45, 199, 171};
        int tagget = 216;
        Integer res[] = twoNums(nums, tagget);

        System.out.println(res);
        Integer resVal[] = twoNumberValues(nums, tagget);
        if(resVal.length>0){
            System.out.println(resVal[0]);
            System.out.println(resVal[1]);
        }
        HashMap<Integer, Integer> integerHashMap = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            integerHashMap.put(i,nums[i]);
        }
        //用于判断Ｈashmap中是否包含某个ｖａｌｕｅ
        if(integerHashMap.containsValue(171)){
            System.out.println("包含１７１");
        }

        String a="string";
        String b="string";
        System.out.println(a==b);

    }

    /**
     * leetCode习题练习＝＝这里使用ｈashmap方式 获取２个数的索引
     *
     * @param nums
     * @param target
     * @return
     */
    public static Integer[] twoNums(int[] nums, int target) {

        HashMap<Integer, Integer> integerHashMap = new HashMap<Integer, Integer>();

        //思路分析　如果
        for (int i = 0; i < nums.length; i++) {
            int complete = target - nums[i];//获取剩余一个数
            if (integerHashMap.containsKey(complete)) {
                return new Integer[]{integerHashMap.get(complete), i};
            }

            //如果保存当前循环过的ｋｅｙ 跟ｖalue
            integerHashMap.put(nums[i], i);
        }
        return new Integer[]{};
    }

    /**
     *从数组中获取２个数据和等于某个数据的２个
     */
    public static Integer[] twoNumberValues(int[] nums, int target) {

        HashMap<Integer, Integer> integerHashMap = new HashMap<Integer, Integer>();

        //思路分析　如果
        for (int i = 0; i < nums.length; i++) {
            int complete = target - nums[i];//获取剩余一个数
            if (integerHashMap.containsValue(complete)) {
                System.out.println("包含");
                return new Integer[]{complete, nums[i]};
            }
            //如果保存当前循环过的ｋｅｙ 跟ｖalue
            integerHashMap.put(i, nums[i]);
        }
        return new Integer[]{};
    }
}
