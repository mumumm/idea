package Algorithm;

public class test1 {
    public static void main(String[] args){
        System.out.println("构造链表的方法一：无参构造一个链表");
        MyLinkList link1= new MyLinkList();
        System.out.println("链表长度为："+link1.getLength()+"\n输出链表：");
        link1.output();
        System.out.println("构造链表的方法二：传入一个length，构造一个长度为lengthde的链表");
        MyLinkList link2= new MyLinkList(5);
        System.out.println("链表长度为："+link2.getLength()+"\n输出链表：");
        link2.output();
        System.out.println("构造链表的方法三：直接传入任意个value，构造一个长度为value的个数为的链表");
        MyLinkList link3= new MyLinkList(13,"我是String",12.0,'a',true);
        System.out.println("链表长度为："+link3.getLength()+"\n输出链表：");
        link3.output();
        System.out.println("添加元素的方法有三种，push、unshift、insert");
        System.out.println("删除元素的方法有四种，pop、shift、remove、emptyLinkList");
        System.out.println("修改元素的值方法有一种，putValue");
        System.out.println("得到元素的方法有两种，getNodeByValue，getNodeByIndex");
        System.out.println("得到元素的值方法有一种，getValue");
        System.out.println("输出所有元素的值方法有一种，output");
        System.out.println("~~~~~~~~~~~~将元素插入链表尾部~~~~~~~~~~~~");
        link1.push("first");
        link2.push("second");
        link3.push("third");
        link1.output();
        link2.output();
        link3.output();
        System.out.println("~~~~~~~~~~~~将元素插入链表头部~~~~~~~~~~~~");
        link1.unshift(1);
        link2.unshift(2);
        link3.unshift(3);
        link1.output();
        link2.output();
        link3.output();
        System.out.println("~~~~~~~~~~~~将元素插入链表的第二个位置~~~~~~~~~~~~");
        link1.insert(1,"德玛西亚");
        link2.insert(1,"诺克萨斯");
        link3.insert(1,"弗雷尔卓德");
        link1.output();
        link2.output();
        link3.output();
        System.out.println("~~~~~~~~~~~~修改链表的第二个元素的值~~~~~~~~~~~~");
        link1.putValue(1,"德玛西亚,万众一心");
        link2.putValue(1,"诺克萨斯，绝不姑息");
        link3.putValue(1,"弗雷尔卓德，将会统一");
        link1.output();
        link2.output();
        link3.output();
        System.out.println("~~~~~~~~~~~~查询第二个元素~~~~~~~~~~~~");
        System.out.println(link1.getValue(1));
        System.out.println(link2.getValue(1));
        System.out.println(link3.getValue(1));
        System.out.println("~~~~~~~~~~~~删除第一个元素~~~~~~~~~~~~");
        link1.shift();
        link2.shift();
        link3.shift();
        link1.output();
        link2.output();
        link3.output();
        System.out.println("~~~~~~~~~~~~删除最后一个元素~~~~~~~~~~~~");
        link1.pop();
        link2.pop();
        link3.pop();
        link1.output();
        link2.output();
        link3.output();
        System.out.println("~~~~~~~~~~~~删除第2个的元素~~~~~~~~~~~~");
        link1.remove(1);
        link2.remove(1);
        link3.remove(1);
        link1.output();
        link2.output();
        link3.output();
        System.out.println("~~~~~~~~~~~~清空链表~~~~~~~~~~~~");
        link1.emptyLinkList();
        link2.emptyLinkList();
        link3.emptyLinkList();
        link1.output();
        link2.output();
        link3.output();
        System.out.println("~~~~~~~~~~~~测试getNodeByValue方法和getNodeByIndex方法~~~~~~~~~~~~");
        link1.push(12);
        System.out.println(link1.getNodeByValue(12));
        System.out.println(link1.getNodeByIndex(0));
    }
}
