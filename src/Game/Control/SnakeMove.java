package Game.Control;

import Game.Pojo.Snake;
import Game.Pojo.SnakeFood;
import Game.View.NewButton;

public class SnakeMove {

    public SnakeMove(){

    }
    public void upmove(){
        Snake sk=move1();
        int X;
        X=Snake.getHead().getX();
        Snake.getHead().setX(--X);
        this.move2(sk);
    }
    public void downmove(){
        Snake sk=move1();
        int X;
        X=Snake.getHead().getX();
        Snake.getHead().setX(++X);
        this.move2(sk);
    }
    public void leftmove(){
        Snake sk=move1();
        int Y;
        Y=Snake.getHead().getY();
        Snake.getHead().setY(--Y);
        this.move2(sk);
    }
    public void rightmove(){
        Snake sk=move1();
        int Y;
        Y=Snake.getHead().getY();
        Snake.getHead().setY(++Y);
        this.move2(sk);
    }
    private Snake move1(){
        Snake sk=Snake.getTail();//得到最后一个节点
        Snake sk1=new Snake(sk.getX(),sk.getY());//将改变之前尾节点的X,Y的值放入对象sk1
        while(sk.getBefore()!=null){
            int x=sk.getBefore().getX();
            sk.setX(x);
            int y=sk.getBefore().getY();
            sk.setY(y);
            sk=sk.getBefore();
        }//除第一个节点外，每个节点的所携带的值更新为它的上一节点的值
        return sk1;//将改变之前尾节点的X,Y的值放入对象sk1中返回给调用处
    }
    private void move2(Snake sk){
        if(this.isGameOver()){
            System.exit(1);
        }
        NewButton nb=NewButton.getButton(sk.getX(), sk.getY());//记录下上一次移动之后留下来的多余的蛇尾巴
        if(this.isEatFood()){
            Snake.addSnakeBody(sk.getX(), sk.getY());//增加蛇的长度
            NewButton nb1=SnakeFood.creatFood();//
            NewButton.setSnakeFood(nb1);//此两句作用为创造新的蛇的食物
        }
        else{
            nb.Back();//去除已经不是蛇身体的的按钮的颜色
            nb.becomeNoBody();//去除此按钮是蛇身体的标记
        }
        Snake.showSnake();//在图形与显示界面，表现出蛇
    }
    private boolean isGameOver(){
        if(
                Snake.getHead().getX()<0||Snake.getHead().getX()>39||
                        Snake.getHead().getY()<0||Snake.getHead().getY()>49||
                        /*以上为是否撞墙导致游戏结束的判断*/
                        NewButton.getButton(Snake.getHead().getX(), Snake.getHead().getY()).isBody()
            /*以上为是否撞到蛇自己的身体导致游戏结束的判断*/
        ){
            return true;
        }else{
            return false;
        }
    }//是否违反了游戏规则导致游戏结束
    private boolean isEatFood(){
        if(Snake.getHead().getX()== SnakeFood.getFood().getX()&&
                Snake.getHead().getY()==SnakeFood.getFood().getY()){
            return true;
        }else{
            return false;
        }
    }//是否吃到了食物导致蛇的身体变长

}