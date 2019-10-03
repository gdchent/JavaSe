package demo1;

import java.util.Stack;

/**
 * Stack栈的测试
 */
public class StackTest {
    public static void main(String[] args) {

        Stack<String>  stack=new Stack<>();
        stack.push("我是栈１");
        stack.push("我是栈２");
        for(int i=0;i<stack.size();i++){
            System.out.println(stack.peek());
        }
    }
}
