package Algorithm;

public class Node {
    private static Node head=null;
    private static Node tail=null;
    private static int length=0;
    private Node previous=null;
    private Node next=null;
    private Object value;

    public Node() {

    }
    public Node(Object value){
        this.setValue(value);
    }
    public Object getValue() {
        return value;
    }
    public void setValue(Object value) {
        this.value = value;
    }
    public Node getNext() {
        return next;
    }

    public Node getPrevious() {
        return previous;
    }
    public static Node getHead() {
        return head;
    }

    public static int getLength() {
        return length;
    }

    public static Node getTail() {
        return tail;
    }

    public static void setTail(Node tail) {
        Node.tail = tail;
    }

    public static void setLength(int length) {
        Node.length = length;
    }

    public static void setHead(Node head) {
        Node.head = head;
    }
    public void setPrevious(Node previous) {
        this.previous = previous;
    }
    public void setNext(Node next) {
        this.next = next;
    }
}
