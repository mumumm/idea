package Algorithm;

public class MyQueue {
    private int front    = 0;
    private int rear     = 0;
    private int length   = 0;
    private Object[] myQueue = null;
    public MyQueue(){
        this.length=10;
        Object[] obj=new Object[10];
        this.myQueue=obj;
    }
    public MyQueue(int length){
        this.length=length;
        Object[] obj=new Object[length];
        this.myQueue=obj;
    }
    public void push(Object value){
        if((this.rear+1)%(this.myQueue.length)==this.front){
            //判断栈的空间是否足够，不够则将栈的长度增加10
            Object[] obj=new Object[this.myQueue.length+10];
            this.length +=10;
            int index=0;
            for (int i=this.front;i!=this.rear;i++){
                i %=this.myQueue.length;
                obj[index++]=this.myQueue[i];
            }
            this.myQueue=obj;
            this.myQueue[index++]=value;
            this.front=0;
            this.rear=index;
        }else{
            myQueue[this.rear++]=value;
            rear %= this.myQueue.length;
        }
    }
    public Object shift(){
        if(this.rear==this.front){
            System.err.println("队列内无元素出队失败");
            return null;
        }else{
            Object frontValue=myQueue[this.front];
            myQueue[front]=null;
            front++;
            return frontValue;
        }
    }
    public void output(){
        if (this.rear==this.front){
            System.out.println("栈内无元素");
        }else {
            for (int i=this.front;i!=this.rear;i++){
                i %=this.myQueue.length;
                System.out.print(this.myQueue[i]+"\t\t");
            }
            System.out.println();
        }
    }
    public int getLength() {
        return this.length;
    }
}
