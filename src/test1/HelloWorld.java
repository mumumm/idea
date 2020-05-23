package test1;

public class HelloWorld {
    public static void main(String[] args){
        int aa= method(4,2);
        //System.out.println(aa);
        int bb = method2(4);
        //System.out.println(bb);
        int cc=method3(4,0,1);
        System.out.println(cc);
    }
    public static int method2(int time){
         /*
        该方法的作用为计算2+22+...+22...22
        * */
        if(time==1){
            return 2;
        }
        String str ="";
        for(int i=0;i<time;i++){
            str +=2;
        }
        int num = Integer.parseInt(str);
        return num+method2(--time);
    }
    public static int method(int time,int numType){
        /*
        该方法的作用为计算2+22+...+22...22
        * */
        if(time==1){
           return 2;
        }
        int num=0;
        for(int i=0;i<time;i++){
              num +=2*method1(i);
        }

        return num+method(--time,numType);
    }
    public static int method1(int time){
        /*
        该方法的作用为根据所传的参数time返回一个int类型的10的time次方的数
        * */
        int num=1;
        for(int i=0;i<time;i++){
            num *=10;
        }
        return num;
    }
    public static int method3(int time,int change,int num){
        /*
        num为1~9之间
        该方法的作用为计算num+(num*10+num)+(num*100+num*10+num)...+(num*10的n-1次方+...+num*10+num)
        * */
        if(time==0){
            return 0;
        }
        change=change*10+num;
        System.out.println(change);
        return change+method3(--time,change,num);
    }
}
