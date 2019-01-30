package rxjava;

public class StringTest {
    String string;
    String str1=null;
    String str2="str2";
    String str3=str1;
    public StringTest(){
        System.out.println("string"+string);
    }

    public StringTest(String string){
        this.str1=string;
    }

}
