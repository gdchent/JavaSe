package practiceString;
public class SubStringTest {

    public static void  main(String ...args){
        String res=subStringAfter("zzzz...abx.mpr",".");
        System.out.println("res"+res);
    }


    /**
     * 截取Java中的字符串中的后缀名  比如以.为结尾的后缀名
     */
    public static String subStringAfter(String url,String lastSperator){

        // abcxxx.xxx.mp4  获取最后一个.的index位置
        int index=url.lastIndexOf(lastSperator);
        String res=url.substring(index,url.length());
        return res;
    }

}
