package file;

import java.io.*;

public class FileTest {
    public static void  main(String ...args){
        File dir=new File("E:"+File.separator+"A"+File.separator);
        File file=new File(dir,"embedded.mobileprovision");
        File fileTxt=new File(dir,"test.txt");
        if(!file.exists()){
            System.out.println("文件不存在");
            return ;
        }
        System.out.println(file.getAbsoluteFile());
        if(!fileTxt.exists()){
            try {
                fileTxt.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            FileInputStream fileInputStream=new FileInputStream(file);
            ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
            int len=-1;
            byte [] buffer=new byte[1024];
            while ((len=fileInputStream.read())!=-1){
                 byteArrayOutputStream.write(buffer,0,len);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
