package Game.View;

import java.awt.Color;

import javax.swing.JToggleButton;

public class NewButton extends JToggleButton {
    private static NewButton[][] nb=new NewButton[40][50];
    private boolean snakeBody=false;
    private static NewButton SnakeFood=null;//蛇食物的图形与界面上显示的按钮
    public void Change(){
        this.setBackground(Color.BLACK);
        int X;
        X=(int) (Math.random()*7);
        switch(X){
            case 0:this.setBackground(Color.RED);break;
            case 1:this.setBackground(Color.ORANGE);break;
            case 2:this.setBackground(Color.YELLOW);break;
            case 3:this.setBackground(Color.GREEN);break;
            case 4:this.setBackground(Color.PINK);break;
            case 5:this.setBackground(Color.BLUE);break;
            default: this.setBackground(Color.CYAN);break;
        }
    }//把按钮背景设置为随机一种颜色
    public void change(){
        this.setBackground(Color.BLACK);
    }//把按钮背景设置为黑色
    public void Back(){
        this.setBackground(Color.WHITE);
    }//把按钮背景设置为白色
    public static NewButton[][] getButtonArray(){
        return nb;
    }
    public static NewButton getButton(int x,int y){
        return nb[x][y];
    }//根据所给的数字返回对应静态数组内对应位序号的对象
    public static void emmm(){
        for(int i=0;i<40;i++){
            for(int j=0;j<50;j++){
                nb[i][j]=new NewButton();
                nb[i][j].Back();
            }
        }
    }//给静态数组附上值的静态方法
    public boolean isBody(){
        return this.snakeBody;
    }
    public void becomeBody(){
        this.snakeBody=true;
    }
    public void becomeNoBody(){
        this.snakeBody=false;
    }
    public static void setSnakeFood(NewButton nb){
        SnakeFood=nb;
    }
    public static NewButton getSnakeFood(){
        return SnakeFood;
    }

}
