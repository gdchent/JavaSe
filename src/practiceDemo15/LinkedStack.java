package practiceDemo15;

import org.w3c.dom.ls.LSSerializer;

/**
 * 思路分析：
 * 1.使用者 创建外部LinkedList实例  内部创建了一个Node<String> top=new Node()
 * 2 .添加元素  linkedlist.push方法添加元素 其内部操作  top=new Node(item,top)
 *
 * @param <T>
 */
public class LinkedStack<T> {


    private static class Node<U> {
        U item;
        Node<U> next;

        //内部节点  默认构造器
        Node() {
            item = null;
            next = null;
        }

        Node(U item, Node<U> next) {
            this.item = item;
            this.next = next;
        }

        //如果
        boolean end() {
            return item == null && next == null;
        }
    }

    private Node<T> top = new Node<>();

    public void push(T item) {
        top = new Node<>(item, top);
    }

    public T pop() {
        T result = top.item;
        if (!top.end()) {
            top = top.next;
        }
        return result;
    }

    public static void main(String... args) {
        LinkedStack<String> linkedStack = new LinkedStack<>();
        for (String s : "Phasers on stun!".split(" ")) {
            System.out.println("item:" + s);
            linkedStack.push(s);

        }
        System.out.println("===============================================");
        String s = null;
        while ((s = linkedStack.pop()) != null) {
            System.out.println(s);
        }
    }
}
