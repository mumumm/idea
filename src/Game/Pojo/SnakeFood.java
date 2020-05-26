package Game.Pojo;
import Game.View.NewButton;
public class SnakeFood {
    private static NewButton[][] nb=NewButton.getButtonArray();
    private static Snake   sk=null;
    public static NewButton creatFood(){
        int X,Y;
        X=(int) (Math.random()*40);
        Y=(int) (Math.random()*50);
        while(nb[X][Y].isBody()){
            int x,y;
            x=(int) (Math.random()*41);
            X=x;
            y=(int) (Math.random()*51);
            Y=y;
        };
        Snake sk1=new Snake(X,Y);//
        sk=sk1;//这两段的作用是将创建好的食物的坐标传递到sk
        return nb[X][Y];
    }
    public static Snake getFood(){
        return sk;
    }

}

