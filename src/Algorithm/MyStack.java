package Algorithm;

import java.lang.reflect.Array;

/**
 * 使用数组实现栈
 */
public class MyStack {
    private int top    = -1;
    private int bottom = 0;
    private int length  = 0;
    private Object[] myStack = null;
    /**
     * 无参数的构造方法栈的长度默认为10
     */
    public MyStack(){
        this.length=10;
        Object[] obj=new Object[10];
        this.myStack=obj;
    }

    /**
     * 传入的参数length决定了栈的长度
     * @param length
     */
    public MyStack(int length){
        this.length=length;
        Object[] obj=new Object[length];
        this.myStack=obj;
    }
    public void push(Object value){
        if(this.top==this.myStack.length-1){
            //判断栈的空间是否足够，不够则将栈的长度增加10
            Object[] obj=new Object[this.myStack.length+10];
            this.length +=10;
            for (int i=0;i<this.myStack.length;i++){
                obj[i]=this.myStack[i];
            }
            this.myStack=obj;
            this.myStack[++top]=value;
        }else{
            this.myStack[++top]=value;
        }
    }
    public Object pop(){
        if(this.top<0){
            System.err.println("栈内无元素出栈失败");
            return null;
        }else{
            Object topValue=myStack[top];
            myStack[top]=null;
            --top;
            return topValue;
        }
    }
    public void output(){
        if (top==-1){
            System.out.println("栈内无元素");
        }else {
            for (int i=0;i<top+1;i++){
                System.out.print(myStack[i]+"\t\t");
            }
            System.out.println();
        }
    }
    public int getLength() {
        return this.length;
    }
}
