package demoannotation;

import demoinject.CustomAnnoation;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author chentao
 * @version 1.0
 * @date 2019/7/24 下午9:20
 * @description:描述信息
 */
@CustomAnnoation(
        className = "com.company.com.demoinject.AnnoationClassTest",
        methodName = "show"
)
public class AnnoTest {

    public void execute() {
        System.out.println("执行");

    }


    void testExecute() {
        execute();
    }

    public static void main(String[] args) {


        System.out.println("＝＝＝＝＝测试Ｊａｖａ注解＝＝＝＝＝＝");
        //解析注解
        //获取当前ｃlass文件的字节文件的对象
        Class<AnnoTest> annoTestClass=AnnoTest.class ;
        //获取注解对象
        CustomAnnoation customAnnoation=annoTestClass.getAnnotation(CustomAnnoation.class);
        //
        String classStr=customAnnoation.className();
        System.out.println("ｃlassStr:"+classStr);
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("data:" + i);
                }
            }
        });
        executorService.shutdown();
    }
}
