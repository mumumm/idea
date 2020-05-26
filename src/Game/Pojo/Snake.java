package Game.Pojo;

import Game.View.NewButton;

public class Snake {
    private int X;
    private int Y;
    private static Snake snakehead=null;
    private Snake snakebodybefore=null;
    private Snake snakebodynext=null;
    private static Snake snaketail=null;
    private static int Length=3;
    public Snake(){
        this(14,19);
    }
    public Snake(int x,int y){
        this.setX(x);
        this.setY(y);
    }
    public static void setHead(Snake head){
        snakehead=head;
    }
    public static Snake getHead(){
        return snakehead;
    }
    public static void setTail(Snake tail){
        snaketail =tail;
    }
    public static Snake getTail(){
        return snaketail;
    }
    public void setNext(Snake sb){
        this.snakebodynext=sb;
    }
    public Snake getNext(){
        return this.snakebodynext;
    }
    public void setBefore(Snake sb){
        this.snakebodybefore=sb;
    }
    public  Snake getBefore(){
        return this.snakebodybefore;
    }
    public int getX(){
        return this.X;
    }
    public int getY(){
        return this.Y;
    }
    public void setX(int X){
        this.X=X;
    }
    public void setY(int Y){
        this.Y=Y;
    }
    public static int getLength(){
        return Length;
    }
    public static void addLength(){
        Length++;

    }
    public static void showSnake(){
        Snake sk=Snake.getHead();
        NewButton nb1=NewButton.getButton(sk.getX(), sk.getY());
        nb1.change();
        for(int j=0;j<(Snake.getLength()-1);j++){
            sk=sk.getNext();
            NewButton nb=NewButton.getButton(sk.getX(), sk.getY());
            nb.Change();
            nb.becomeBody();//此按钮标记为蛇的身体
        }
    }//在图形与显示界面，表现出蛇
    public static void creatSnake(){
        Snake sk1=new Snake(15,16);
        Snake sk2=new Snake(15,17);
        Snake sk3=new Snake(15,18);
        Snake.setHead(sk1);
        sk1.setNext(sk2);
        sk2.setBefore(sk1);
        sk2.setNext(sk3);
        sk3.setBefore(sk2);
        Snake.setTail(sk3);
    }//创建一只蛇
    public static void addSnakeBody(int x,int y){
        Snake sk1=new Snake(x,y);
        sk1.setBefore(Snake.getTail());
        Snake.getTail().setNext(sk1);
        Snake.setTail(sk1);
        Snake.addLength();
    }//蛇的身体变长
    public static void transposr(){
        Snake a=Snake.getHead();
        Snake b=Snake.getTail();
        while(a!=b){
            int x,y;
            x=a.getX();
            y=a.getY();
            a.setX(b.getX());
            a.setY(b.getY());
            b.setX(x);
            b.setY(y);
            a=a.getNext();
            b=b.getBefore();
            if(b==a.getBefore()){
                break;
            }
        }
    }//将蛇头和蛇尾前后转置

}