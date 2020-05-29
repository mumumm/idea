package Algorithm;

import java.util.HashMap;

public class test5 {
    public static void main(String[] args){
//        MyHashMap myHashMap =new MyHashMap();
//        MyHashMap.Node node = myHashMap.new Node();
        int a="德玛".hashCode();
        System.out.println(a);
        HashMap hashMap =new HashMap(1,0.65f);
        int b=hashMap.size();
        hashMap.put("德玛西亚","万众一心");
        b=hashMap.size();
        System.out.println(b);
    }

}
