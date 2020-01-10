package demo1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * LeetCode02测试
 * 给出两个LinkedList列表
 * 示例如下：２——>4->3   5->6->4
 * 结果：３４２＋４６５＝８０７
 */
public class LeetCode02 {

    public static void main(String... args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int num=scanner.nextInt();
        System.out.println("num"+num);
        LinkedList<Integer> linkedList1=inputNumber(num);
        Scanner scanner2=new Scanner(System.in);
        System.out.println("请输入第二个数：");
        int num2=scanner2.nextInt();
        LinkedList<Integer> linkedList2=inputNumber(num2);
        System.out.println("获取计算结果:");
        System.out.println(twoNumberList(linkedList1,linkedList2));
    }

    public static LinkedList<Integer> inputNumber(int num){
        LinkedList<Integer> linkedList = new LinkedList<>();
        String numStr1=String.valueOf(num);
        //将整型转化为字符串
        for(int i=0;i<numStr1.length();i++){
            char numChar=numStr1.charAt(i);
            int number=Integer.parseInt(String.valueOf(numChar));
            linkedList.add(number);
        }
        return linkedList;
    }
    //两个数据链表相加
    public static String twoNumberList(LinkedList<Integer> list1, LinkedList<Integer> list2) {

        //如果２个数组长度不一样　取长的
        int size = list1.size()>list2.size()?list1.size():list2.size();
        System.out.println("size:"+size);
        //定义一个同类型的数组　用来快接收位数
        int total[] = new int[size];
        int cout = 0;
        StringBuilder stringBuilder=new StringBuilder();
        //遍历数据
        for (int i = size - 1; i>=0; i--) {
            //记录第一次的时候
            int itemList1 = list1.get(i);
            int itemList2 = list2.get(i);
            total[i] = itemList1 + itemList2;
            if(cout>0){
                total[i]++;
            }

            if (total[i] >= 10) {
                //假设是10 11 12
                total[i] = total[i] % 10;
                cout = 1;

            }
            //System.out.println("数据:"+total[i]);
            stringBuilder.append(total[i]);
            if(i>0){
                stringBuilder.append("->");
            }
        }

        System.out.println(Arrays.toString(total));
        return stringBuilder.toString();
    }

}
