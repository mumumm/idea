package test2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class test1 {
    /**
     * 给定一个数组，数组成员10个，求出数组中第二大的数的下标
     * @param args
     */
    public static void main(String[] args){
        System.out.println("给定一个数组，数组成员10个，求出数组中第二大的数的下标");
        int[] array ={20,-12,3,43,50,1,42,-90,333,123};
        System.out.println(Arrays.toString(array));
        System.out.print("数组中第二大的数的下标:");
        int secondMaxIndex=method1(array);
        System.out.println(secondMaxIndex);
    }
    public static int method1(int[] array){
        int maxIndex=0;
        int secondMaxIndex=0;
        for (int i=0;i<array.length;i++){
            if(array[i]>array[maxIndex]){
                secondMaxIndex=maxIndex;
                maxIndex=i;
            }else{
                if(array[i]>array[secondMaxIndex]){
                    secondMaxIndex =i;
                }
            }
        }
        return secondMaxIndex;
    }
}
