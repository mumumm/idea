public class HelloWorld {
    public static void main(String[] args){
        int aa= method(4,2);
        System.out.println(aa);
        int bb = method2(4);
        System.out.println(bb);
    }
    public static int method2(int time){
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
        该方法的作用为计算
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
}
