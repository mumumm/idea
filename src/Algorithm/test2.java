package Algorithm;

public class test2 {
    /**
     * 测试用MyLinkList创建栈和队列
     */
    public static void main(String[] args){
        MyLinkList mystack = new MyLinkList();
        //压栈
        mystack.push("我是第一个元素");
        mystack.push("我是第二个元素");
        mystack.push("我是第三个元素");
        mystack.push("我是第四个元素");
        mystack.push("我是第五个元素");
        System.out.println("~~~~~~~~~~打印栈内的值~~~~~~~~~~");
        mystack.output();
        System.out.println("出栈：");
        Node node=mystack.pop();
        if(node!=null){
            System.out.println(node.getValue());
        }else{
            System.out.println("栈内元素已空");
        }
        System.out.println("~~~~~~~~~~打印栈内的值~~~~~~~~~~");
        mystack.output();
        System.out.println("出栈：");
        node=mystack.pop();
        if(node!=null){
            System.out.println(node.getValue());
        }else{
            System.out.println("栈内元素已空");
        }
        System.out.println("~~~~~~~~~~打印栈内的值~~~~~~~~~~");
        mystack.output();

        System.out.println("~~~~~~~~~~我是分割线下面测试队列~~~~~~~~~~");
        MyLinkList myQueue=new MyLinkList();
        //入队
        myQueue.push("我是火车头");
        myQueue.push("我是第一节");
        myQueue.push("我是第二节");
        myQueue.push("我是第三节");
        myQueue.push("我是第四节");
        System.out.println("~~~~~~~~~~打印队列内的值~~~~~~~~~~");
        myQueue.output();
        System.out.println("出队列：");
        node=myQueue.shift();
        if(node!=null){
            System.out.println(node.getValue());
        }else{
            System.out.println("队列内元素已空");
        }
        System.out.println("~~~~~~~~~~打印队列内的值~~~~~~~~~~");
        myQueue.output();
        System.out.println("出队列：");
        node=myQueue.shift();
        if(node!=null){
            System.out.println(node.getValue());
        }else{
            System.out.println("队列内元素已空");
        }
        System.out.println("~~~~~~~~~~打印队列内的值~~~~~~~~~~");
        myQueue.output();
        System.out.println("出队列：");
        node=myQueue.shift();
        if(node!=null){
            System.out.println(node.getValue());
        }else{
            System.out.println("队列内元素已空");
        }

    }

}
