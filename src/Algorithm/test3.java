package Algorithm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * 测试使用数组构造的栈
 */
public class test3 {
    public static void main(String[] args){
        MyStack myStack= new MyStack();
        myStack.push("盖伦");
        myStack.push("赵信");
        myStack.push("嘉文");
        System.out.println("~~~~~~~~~~打印栈内的值~~~~~~~~~~");
        myStack.output();
        System.out.println("出栈：");
        System.out.println(myStack.pop());
        System.out.println("~~~~~~~~~~打印栈内的值~~~~~~~~~~");
        myStack.output();
        System.out.println("出栈：");
        System.out.println(myStack.pop());
        System.out.println("~~~~~~~~~~打印栈内的值~~~~~~~~~~");
        myStack.output();
        System.out.println("出栈：");
        System.out.println(myStack.pop());
        System.out.println("~~~~~~~~~~打印栈内的值~~~~~~~~~~");
        myStack.output();
        System.out.println("出栈：");
        System.out.println(myStack.pop());
        //测试栈的长度是否会自动增加
        System.out.println("~~~~~~~~~~测试栈的长度是否会自动增加~~~~~~~~~~");
        System.out.println("此时栈的最大长度为："+myStack.getLength());
        for (int i=0;i<11;i++)
            myStack.push("test");
        System.out.println("此时栈的最大长度为："+myStack.getLength());
        System.out.println("~~~~~~~~~~打印栈内的值~~~~~~~~~~");
        myStack.output();

    }

}
