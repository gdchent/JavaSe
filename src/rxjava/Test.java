package rxjava;

import java.time.temporal.Temporal;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Test {

    static int number = 4;


    public static void main(String... args) {

        StaticInitialization staticInitialization = new StaticInitialization();
        //sortNumber3(number);  //数组排序大小

        MyChent myChent1=new MyChent();
        MyChent myChent2=new MyChent();
        MyChent myChent3=myChent1;
        if(myChent1.equals(myChent2)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        if(myChent1.equals(myChent3)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        String string1=new String("str");
        String string2=new String("str");
        if(string1.equals(string2)){
            System.out.println("str_true");
        }else{
            System.out.println("str_false");
        }

       myChent3.clear();
    }


    public static void sortNumber1(int number) {
        int[] intArray = new int[number];
        System.out.println("请输入4个数:");
        Scanner scanner = new Scanner(System.in);
        //通过循环控制输入的4个数字
        for (int i = 0; i < number; i++) {
            intArray[i] = scanner.nextInt();
//            System.out.println(intArray[i]);
        }
        //
        System.out.println("输出排序前的结果====");
        for (int b = 0; b < intArray.length; b++) {
            System.out.println(intArray[b]);
        }
        System.out.println("输出排序前的结果完成====");
        for (int i = 0; i < intArray.length; i++) {

            for (int j = i + 1; j < intArray.length; j++) {
                //判单相邻的2个数的大小
                if (intArray[i] < intArray[j]) {
                    //交换位置
                    int temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
        System.out.println("排序之后的结果=====");
        //然后再遍历输出排列后的数据
        for (int m = 0; m < intArray.length; m++) {
            System.out.println(intArray[m]);
        }
    }

    //冒泡排序就是比较相邻的2个位置
    public static void sortNumber2(int number) {
        int[] intArray = new int[number];
        System.out.println("请输入4个数:");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < number; i++) {
            intArray[i] = scanner.nextInt();
//            System.out.println(intArray[i]);
        }
        for (int i = 0; i < intArray.length-1; i++) {

            if (intArray[i] < intArray[i+1]) {
                     int temp=intArray[i];
                     intArray[i]=intArray[i+1];
                     intArray[i+1]=temp;
            }
        }
        System.out.println("排序后=====");
        for(int i=0;i<intArray.length;i++){
            System.out.println(intArray[i]);
        }
    }
    //2跟3是一样的
    public static void sortNumber3(int number){
        int[] intArray = new int[number];
        System.out.println("请输入4个数:");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < number; i++) {
            intArray[i] = scanner.nextInt();
//            System.out.println(intArray[i]);
        }
        //这里其实最外层的for循环没什么卵用
        for(int i=0;i<intArray.length-1;i++){
            for(int j=0;j<intArray.length-i-1;j++){
                if(intArray[j]<intArray[j+1]){
                    int temp=intArray[j];
                    intArray[j]=intArray[j+1];
                    intArray[j+1]=temp;
                }
            }
        }
        System.out.println("排序后=====");
        for(int i=0;i<intArray.length;i++){
            System.out.println(intArray[i]);
        }
    }

}
