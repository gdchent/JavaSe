package practiceDemo14;

/**
 * java自定义一个LinkedList类
 */
public class LinkedList<E> {


   transient Node<E> first; //前一个元素
   transient Node<E> last;  //当前元素   默认2个都是为空
    int size=0;
    //定义一个静态的内部类
    public static class Node<E>{

        E e;
        Node prev;
        Node next;
        //给它一个构造函数
        public Node(Node prev,E e,Node next){
            this.prev=prev;
            this.e=e;
            this.next=next;
        }
    }


    //添加元素的实现方法
    public void linkedLast(E e){
          //创建一个内部类节点实例
        Node l=last;
        Node newNode=new Node(l,e,null);  //创建实例
        // first  last   2个都为空
        first=newNode;
        if(last==null){
            last=newNode ;  //这是当 是第一个的时候
        }else {
              //让上一个节点的 一个字段 去指向 当前节点
            l.next=newNode;
        }

        //然后长度 ++
        size++;

    }
}
