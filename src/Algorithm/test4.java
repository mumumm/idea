package Algorithm;

/**
 * 测试使用数组构成的队列
 *
 */
public class test4 {
    public static void main(String[] args){
        MyQueue myQueue=new MyQueue(5);
        System.out.println("队列的最大长度为："+myQueue.getLength());
        myQueue.push("1");
        myQueue.push("2");
        myQueue.push("3");
        myQueue.push("4");
        myQueue.push("5");
        myQueue.push("6");
        myQueue.output();
        System.out.println("队列的最大长度为："+myQueue.getLength());
        for (int i=0;i<5;i++)
            System.out.println("出队元素的值为："+myQueue.shift());;
        System.out.println("打印队列");
        myQueue.output();
        myQueue.push("1");
        myQueue.push("2");
        myQueue.push("3");
        myQueue.push("4");
        myQueue.push("5");
        myQueue.push("6");
        System.out.println("打印队列");
        myQueue.output();
        for (int i=0;i<4;i++)
            System.out.println("出队元素的值为："+myQueue.shift());;
        System.out.println("打印队列");
        myQueue.output();
        myQueue.push("1");
        myQueue.push("2");
        myQueue.push("3");
        myQueue.push("4");
        myQueue.push("5");
        myQueue.push("6");
        System.out.println("打印队列");
        myQueue.output();
        myQueue.push("1");
        myQueue.push("2");
        myQueue.push("3");
        myQueue.push("4");
        myQueue.push("5");
        myQueue.push("6");
        System.out.println("打印队列");
        myQueue.output();
        myQueue.push("1");
        myQueue.push("2");
        myQueue.push("3");
        myQueue.push("4");
        myQueue.push("5");
        myQueue.push("6");
        System.out.println("打印队列");
        myQueue.output();
        System.out.println("队列的最大长度为："+myQueue.getLength());
    }
}
