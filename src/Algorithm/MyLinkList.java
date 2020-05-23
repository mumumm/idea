package Algorithm;

public class MyLinkList {
    private  Node head=null;
    private  Node tail=null;
    private  Node index=null;
    private  int length=0;

    /**
     * 这是一个无参构造函数，调用它可以创建一个空链表
     */
    public MyLinkList(){

    }

    /**
     * 这是有一个形参length的构造函数，调用它可以构造一个长度为length的链表
     * @param length
     */
    public MyLinkList(int length){
        for(int i=0;i<length;i++){
            this.push(null);
        }
    }

    /**
     *
     * 通过传递的可变参数给链表的各个节点赋值，可变参数的个数为链表的长度
     * @param value
     */
    public MyLinkList(Object ...value){
        for (Object _value : value){
            this.push(_value);
        }
    }

    /**
     * 根据index找到节点相应节点，修改相应节的值为value
     * 如果index不在链表范围内，则输出插入失败
     * @param index
     * @param value
     */
    public void putValue(int index,Object value){
        if(index<0||index>=this.getLength()){
            System.err.println("输入的index不在链表范围,插入value失败");
        }else {
            this.index=this.head;
            for (int i=0;i<index;i++){
                this.index=this.index.getNext();
            }
            this.index.setValue(value);
        }
    }
    public Object getValue(int index){
        if(index<0||index>=this.getLength()){
            System.err.println("输入的index不在链表范围,查询value失败");
            return null;
        }else {
            this.index=this.head;
            for (int i=0;i<index;i++){
                this.index=this.index.getNext();
            }
            return this.index.getValue();
        }
    }
    /**
     * 在链表的尾部添加一个值为value的节点
     * @param value
     */
    public  void push(Object value){
        Node newNode=new Node(value);
        if(this.getLength()==0){
            this.head=newNode;
            this.tail=newNode;
            this.setLength(++this.length);
        }else {
            this.tail.setNext(newNode);
            newNode.setPrevious(this.tail);
            this.tail=newNode;
            this.setLength(++this.length);
        }

    }

    /**
     * 在链表头部添加一个值为value的节点
     * @param value
     */
    public  void unshift(Object value){
        Node newNode=new Node(value);
        if(this.getLength()==0){
            this.head=newNode;
            this.tail=newNode;
            this.setLength(++this.length);
        }else{
            this.head.setPrevious(newNode);
            newNode.setNext(this.head);
            this.head=newNode;
            this.setLength(++this.length);
        }
    }
    /**
     * 根据输入的index的值插入值为value的节点
     * @param index
     * @param value
     */
    public  void insert( int index,Object value){
        if(index<0||index>=this.getLength()){
            System.err.println("输入的index不在链表范围内，插入失败");
        }else if(index==0){
            this.unshift(value);
        }else {
            Node newNode=new Node(value);
            this.index=this.head;
            for (int i=0;i<index;i++){
                this.index=this.index.getNext();
            }
            newNode.setNext(this.index);
            newNode.setPrevious(this.index.getPrevious());
            this.index.getPrevious().setNext(newNode);
            this.index.setPrevious(newNode);
            this.setLength(++this.length);
        }
    }

    /**、
     * 删除链表的最后一个节点
     */
    public  Node pop(){
        Node node=null;
        switch (this.getLength()){
            case 0:System.err.println("删除失败");
                break;
            case 1:node=this.tail;
                   this.emptyLinkList();
                break;
            default:node=this.tail;
                    this.tail=this.tail.getPrevious();
                    this.tail.getNext().setPrevious(null);
                    this.tail.setNext(null);
                    this.setLength(--this.length);
                break;
        }
        return node;
    }
    /**
     * 删除链表的第一个节点
     */
    public  Node shift(){
        Node node=null;
        switch (this.getLength()){
            case 0:System.err.println("删除失败");
                break;
            case 1:node=this.head;
                   this.emptyLinkList();
                break;
            default:node=this.head;
                    this.head=this.head.getNext();
                    this.head.getPrevious().setNext(null);
                    this.head.setPrevious(null);
                    this.setLength(--this.length);
                break;
        }
        return node;
    }

    /**
     * 清空链表
     */
    public  void emptyLinkList(){
        this.head=null;
        this.tail=null;
        this.setLength(0);
    }
    /**
     * 根据所给的index删除节点
     * @param index
     */
    public  Node remove(int index){
        Node node=null;
        if(index<0||index>=this.getLength()){
            System.err.println("删除失败;输入的index不在链表范围内");
        }else if(index==0){
            node=this.shift();
        }else if(index==this.getLength()-1){
            node=this.pop();
        }else{
            this.index=this.head;
            for (int i=0;i<index;i++){
                this.index=this.index.getNext();
            }
            node=this.index;
            this.index.getPrevious().setNext(this.index.getNext());
            this.index.getNext().setPrevious(this.index.getPrevious());
            this.index.setNext(null);
            this.index.setPrevious(null);
            this.setLength(--this.length);
        }
        return node;
    }

    /**
     * 根据传入的value的值返回链表中第一个与传入value值相同的节点；
     * 若找不到则返回null
     * @param value
     * @return
     */
    public  Node getNodeByValue(Object value){
        if(this.length==0){
            System.out.println("链表内无元素");
        }else{
            this.index=this.head;
            while(this.index!=null){
                if(this.index.getValue().equals(value)){
                    return this.index;
                }
                this.index=this.index.getNext();
            }
            return null;
        }
        return null;
    }

    /**
     * 根据index的值返回Node节点，如果index的值超过链表的范围则返回null
     * @param index
     * @return
     */
    public Node getNodeByIndex(int index){
        if(index>this.getLength()||index<0){
            System.out.println("查询失败,输入的index不在链表的查询范围内");
        }else if(this.length==0){
            System.out.println("链表内无元素");
        }else if(index==0){
            return this.head;
        }else if(index==this.getLength()){
            return this.tail;
        }else{
            this.index=this.head;
            for (int i=0;i<index;i++){
                this.index=this.index.getNext();
                return this.index;
            }
        }
        return null;
    }
    /**
     * 输出链表
     */
    public  void output(){
        if(this.length==0){
            System.out.println("链表内无元素");
        }else{
            this.index=this.head;
            while(this.index!=null){
                Object value=this.index.getValue();
                System.out.print(value+"\t");
                this.index=this.index.getNext();
            }
            System.out.println();
        }
    }

    public  int getLength() {
        return length;
    }

    private  void setLength(int length) {
        this.length = length;
    }
    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

}
