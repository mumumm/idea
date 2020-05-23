package Algorithm;

public class Node {
    private Node previous=null;
    private Node next=null;
    private Object value=null;
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
    public void setPrevious(Node previous) {
        this.previous = previous;
    }
    public void setNext(Node next) {
        this.next = next;
    }
}
