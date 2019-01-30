package practiceDemo7;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test {


    public static void main(String ...args){
        Test test=new Test();
        Proxy.newProxyInstance(test.getClass().getClassLoader(), test.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                return null;
            }
        });


        File dir=new File("E:/abc/abcd/");

        //判断是不是存在
        if(!dir.exists()){
            System.out.println("创建成功");
            dir.mkdirs();//创建多层目录
        }
        File file=new File(dir,"test.txt");
        if(file.exists()){
            System.out.println("已经创建");
        }else{
            System.out.println("未创建");
          //  file.mkdir();
//            try {
//                file.createNewFile();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
        }
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
