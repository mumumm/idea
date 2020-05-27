package Game.View;

import Game.Control.SnakeMove;
import Game.Pojo.Snake;
import Game.Pojo.SnakeFood;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainView implements Runnable{
    private JFrame Mainframe=new JFrame();
    private JPanel panleft =new JPanel();
    private JPanel panright =new JPanel();
    private JPanel panright1 =new JPanel();
    private JPanel panright2 =new JPanel();
    private JSplitPane sp=null;
    private NewButton but=null;
    private JButton W=new JButton("w");
    private JButton S=new JButton("s");
    private JButton A=new JButton("a");
    private JButton D=new JButton("d");
    private JButton upSpeed=new JButton("加速");
    private JButton downSpeed=new JButton("减速");
    private JButton pause=new JButton("暂停");
    private JLabel lab=new JLabel();
    private static int speed=500;
    private static String direction="w";
    public MainView(String name){
        Mainframe.setTitle(name);;
        panleft.setLayout(new GridLayout(40,50));
        NewButton.emmm();//调用此方法 给静态数组附上值
        for(int i=0;i<40;i++){
            for(int j=0;j<50;j++){
                but=NewButton.getButton(i, j);
                panleft.add(but);
            }
        }//给界面添加上

        panright.setLayout(new GridLayout(2,1));
        panright.add(panright1);
        panright.add(panright2);
        panright1.setLayout(new GridLayout(2,3));
        panright1.add(upSpeed);
        panright1.add(W);
        panright1.add(downSpeed);
        panright1.add(A);
        panright1.add(S);
        panright1.add(D);

        //以下是按钮监听
        upSpeed.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                if(speed>150){
                    speed=(speed-100);
                }
            }
        });
        downSpeed.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                if(speed<1000){
                    speed=(speed+50);
                }
            }
        });
        W.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                if(arg0.getSource()==W){
                    if(direction.equals("s")){
                        Snake.transposr();
                    }
                    direction="w";
                }
            }
        });
        S.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                if(arg0.getSource()==S){
                    if(direction.equals("w")){
                        Snake.transposr();
                    }
                    direction="s";
                }
            }
        });
        A.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                if(arg0.getSource()==A){
                    if(direction.equals("d")){
                        Snake.transposr();
                    }
                    direction="a";
                }
            }
        });
        D.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                if(arg0.getSource()==D){
                    if(direction.equals("a")){
                        Snake.transposr();
                    }
                    direction="d";
                }
            }
        });
    	/*pause.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent arg0){

    		}
    	});暂停功能尚未实现*/

        //以下是键盘监听;虽然写了也监听不了，但是还是加上吧，因为这个歌虽然在我写的这个里面监听不了
        //但是我发现下面的方法在别的类里面做测试还是可以监听的所以就挂着好看吧
        Mainframe.addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e){
                if('w'==e.getKeyChar()||'s'==e.getKeyChar()||'a'==e.getKeyChar()||'d'==e.getKeyChar()){
                    char a=e.getKeyChar();
                    direction=String.valueOf(a);
                }

            }
        });

        panright2.setLayout(new GridLayout(3,1));
        StringBuffer sb=new StringBuffer("得分：");
        sb.append((Snake.getLength()-3));
        lab.setText(sb.toString());
        panright2.add(lab);

        sp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,panleft,panright);
        sp.setDividerSize(3);
        sp.setDividerLocation(750);
        Mainframe.add(sp);
        Mainframe.setLocation(200, 10);
        Mainframe.setSize(1000,600);
        Mainframe.setVisible(true);
        Mainframe.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent arg0){
                System.exit(1);
            }
        });//窗体监听
    }


    @Override
    public void run() {
        // TODO Auto-generated method stub
        //以下代码功能为使蛇的食物不断闪烁
        for(int i=0;;i++){
            StringBuffer sb=new StringBuffer("得分：");//
            sb.append((Snake.getLength()-3));//
            lab.setText(sb.toString());//此三段作用为更新得分
            if(i%2==0){
                NewButton.getSnakeFood().Change();
            }else{
                NewButton.getSnakeFood().Back();
            }
            try {
                Thread.currentThread().sleep(350);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
    }

    public static int getSpeed(){
        return speed;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        MainView a=new MainView("贪吃蛇");
        Snake.creatSnake();//创建一只蛇
        SnakeMove sm=new SnakeMove();
        Snake.showSnake();//在图形与显示界面，表现出蛇
        NewButton nb1= SnakeFood.creatFood();//
        NewButton.setSnakeFood(nb1);//此两句作用为创造蛇的食物
        Thread t1=new Thread(a);
        t1.start();
        while(true){
            switch(direction){
                case "w":sm.upmove();break;
                case "s":sm.downmove();break;
                case "a":sm.leftmove();break;
                case "d":sm.rightmove();break;
                default: ;
            }
            try {
                Thread.currentThread().sleep(MainView.getSpeed()-Snake.getLength());
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }


}