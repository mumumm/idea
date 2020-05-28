package firstproject;
package dpp;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.awt.*;

import javax.swing.*;
class MyWindowEventHandle extends WindowAdapter{
    public void windowClosing(WindowEvent arg0){
        System.exit(1);
    }//窗口关闭时触发按下关闭按钮
}//点击关闭窗体时关闭程序
class Studentsystem {
    private String name=null;
    private int number=0;
    private int English=0;
    private int C_program=0;
    private int highmath=0;
    private int P_E=0;
    private int java=0;
    private float AverageScore=0;
    private static float ASEnglish=0;
    private static float ASC_program=0;
    private static float AShighmath=0;
    private static float ASP_E=0;
    private static float ASjava=0;
    private static int AS=0;
    private static Studentsystem All[]=new Studentsystem[100];//设置一个数组存放所有学生
    public Studentsystem(){

    }//作为父类不写此不带参数的构造方法子类又调用了父类的不带参数的构造方法就会出错
    public Studentsystem(String name,int number,int English,int C_program,int highmath,int P_E,int java){
        this.name=name;
        this.number=number;
        this.English=English;
        this.C_program=C_program;
        this.highmath=highmath;
        this.P_E=P_E;
        this.java=java;
        stuAverageScore(English,C_program,highmath,P_E,java);
        AS++;//计算生成了几个对象
        ASEnglish=ASEnglish+English;//保存英语成绩总和
        ASC_program=ASC_program+C_program;//保存c语言成绩总和
        AShighmath=AShighmath+highmath;//保存高数成绩总和
        ASP_E=ASP_E+P_E;//保存体育成绩总和
        ASjava=ASjava+java;//保存java成绩总和
    }
    public String getname(){
        return name;
    } //返回单个学生学号
    public int getnumber(){
        return number;
    } //返回单个学生学号
    public int getEnglish(){
        return English;
    } //返回单个学生英语成绩
    public static float getASEnglish(){
        return ASEnglish/AS;
    } //返回全班英语平均分
    public int getC_program(){
        return C_program;
    }//返回单个学生C语言成绩
    public static float getASC_program(){
        return ASC_program/AS;
    }//返回全班C语言平均分
    public int gethighmath(){
        return highmath;
    }//返回单个学生高数成绩
    public static float geASthighmath(){
        return AShighmath/AS;
    }//返回全班高数平均分
    public int getP_E(){
        return P_E;
    }//返回单个学生体育成绩
    public static float getASP_E(){
        return ASP_E/AS;
    }//返回全班体育平均分
    public int getjava(){
        return java;
    }//返回单个学生JAVA成绩
    public static float getASjava(){
        return ASjava/AS;
    }//返回全班JAVA平均分
    public static int getAS(){
        return AS;
    } //返回生成对象的个数
    public static Studentsystem getAll (int a){
        return All[a];
    }//返回存储学生数组中的元素
    public static int theBandScoreNumberEG(int w,int e){
        int a=0;
        for(int i=0;i<Studentsystem.getAS();i++){
            if(w<=Studentsystem.getAll(i).getEnglish()&&Studentsystem.getAll(i).getEnglish()<=e){
                a++;
            }
        }
        return a;
    }//返回英语分数段的人数
    public static int theBandScoreNumberCP(int w,int e){
        int a=0;
        for(int i=0;i<Studentsystem.getAS();i++){
            if(w<=Studentsystem.getAll(i).getC_program()&&Studentsystem.getAll(i).getC_program()<=e){
                a++;
            }
        }
        return a;
    }//返回C语言分数段的人数
    public static int theBandScoreNumberHM(int w,int e){
        int a=0;
        for(int i=0;i<Studentsystem.getAS();i++){
            if(w<=Studentsystem.getAll(i).gethighmath()&&Studentsystem.getAll(i).gethighmath()<=e){
                a++;
            }
        }
        return a;
    }//返回高数分数段的人数
    public static int theBandScoreNumberJA(int w,int e){
        int a=0;
        for(int i=0;i<Studentsystem.getAS();i++){
            if(w<=Studentsystem.getAll(i).getjava()&&Studentsystem.getAll(i).getjava()<=e){
                a++;
            }
        }
        return a;
    }//返回JAVA分数段的人数
    public static int theBandScoreNumberPE(int w,int e){
        int a=0;
        for(int i=0;i<Studentsystem.getAS();i++){
            if(w<=Studentsystem.getAll(i).getP_E()&&Studentsystem.getAll(i).getP_E()<=e){
                a++;
            }
        }
        return a;
    }//返回体育分数段的人数
    public boolean lowEnglish(Studentsystem a){
        if(a.English<60){return true;
        }else {return false;}
    }//判断英语是否不及格
    public boolean lowC_program(Studentsystem a){
        if(a.C_program<60){return true;
        }else {return false;}
    }//判断c语言是否不及格
    public boolean lowhighmath(Studentsystem a){
        if(a.highmath<60){return true;
        }else {return false;}
    }//判断高数是否不及格
    public boolean lowP_E(Studentsystem a){
        if(a.P_E<60){return true;
        }else {return false;}
    }//判断体育是否不及格
    public boolean lowjava(Studentsystem a){
        if(a.java<60){return true;
        }else {return false;}
    }//判断java是否不及格
    public void stuAverageScore(int English,int C_program,int highmath,int P_E,int java){
        AverageScore=(English+ C_program+highmath+ P_E+ java)/5;
    }//计算单个学生五门成绩平均分
    public float getAverageScore(){
        return AverageScore;
    }//返回每个学生的平均成绩
    public boolean lowStu(Studentsystem a){
        if(a.lowEnglish(a)||a.lowC_program(a)||a.lowhighmath(a)||a.lowP_E(a)||a.lowjava(a)){
            return true;
        }
        return false;
    }//判断是否为不及格学生
    public boolean TopStu(Studentsystem a){
        if(a.getAverageScore()>=80){
            return true;
        }else if(a.English==100||a.C_program==100||a.highmath==100||a.P_E==100||a.java==100){
            return true;
        }else if(a.getAverageScore()>=60&&(a.English>=90||a.C_program>=90||a.highmath>=90||a.P_E>=90||a.java>=90)){
            return true;
        }else{
            return false;
        }
    }//判断学生是否为优等生
    public void AllSTU(Studentsystem a){
        int b=(int) Studentsystem.getAS();
        All[b-1]=a;
    }//将所有学生存入数组c[]
    public void PaiXuAllSTU(){
        for(int i=1;i<Studentsystem.getAS();i++){
            for(int j=0;j<Studentsystem.getAS();j++){
                if(All[i].getAverageScore()>All[j].getAverageScore()){
                    All[99]=All[i];
                    All[i]=All[j];
                    All[j]=All[99];
                }
            }
        }
    }//所有学生成绩按平均分的大小顺序排列
    public static String change(float a){
        String string=Float.toString(a);//将float类型的数据转化为字符串
        return string;
    }//将float类型的数据返回为字符串
    public static String change(int a){
        String string=Integer.toString(a);//将int类型的数据转化为字符串
        return string;
    }//将int类型的数据返回为字符串
    public static int change(String string){
        int a=Integer.parseInt(string);//将字符串变成int型
        return a;
    }//将字符串返回为int类型的数据
    public static boolean ifInt(String string){
        int j=0;
        for(int i=0;i<string.length();i++){
            if(ifNumber(string.charAt(i))){
                //如果字符在‘0’~‘9’之间则不做任何操作
            }else{
                j--;
            }
        }
        if(j==0){
            return false;
        }else{
            return true;
        }
    }//判断字符串是否可以转换为int类型    如果可以转化为int类型返回false 否则返回true
    public static boolean ifNumber(char b){
        int c=(int)b;
        if(48>c){
            return false;
        }else if(57<c){
            return false;
        }else{
            return true;
        }
    }//判断字符是否数字       字符 ‘0’的ascii码是48    字符‘9’的ascii码是57
}
class Student extends Studentsystem{
    private JFrame stu=new JFrame("学生成绩管理系统");//创建一个窗体
    private JFrame stu1=new JFrame("学生成绩管理系统");//创建一个窗体
    private JFrame stu2=new JFrame("学生成绩管理系统");//创建一个窗体
    private JFrame stu3=new JFrame("学生成绩管理系统");//创建一个窗体
    private JFrame stu4=new JFrame("学生成绩管理系统");//创建一个窗体
    private JFrame stu5=new JFrame("学生成绩管理系统");//创建一个窗体
    private JFrame stu6=new JFrame("学生成绩管理系统");//创建一个窗体
    private JFrame stu7=new JFrame("学生成绩管理系统");//创建一个窗体
    private JFrame stu8=new JFrame("学生成绩管理系统");//创建一个窗体
    private JFrame stu9=new JFrame("学生成绩管理系统");//创建一个窗体
    private JLabel lab1_1=new JLabel("这是由我们小组做的学生成绩管理系统",JLabel.CENTER);//创建一个标签
    private JLabel lab1_2=new JLabel("我们小组成员有：",JLabel.CENTER);//创建一个标签
    private JLabel lab1_3=new JLabel("组长：李浩潇  组员：魏亚康、朱早兵、江勇杰",JLabel.CENTER);//创建一个标签
    private JLabel lab2_1=new JLabel("功能1：");//创建一个标签
    private JLabel lab2_2=new JLabel("功能2：");//创建一个标签
    private JLabel lab2_3=new JLabel("功能3：");//创建一个标签
    private JLabel lab2_4=new JLabel("功能4：");//创建一个标签
    private JLabel lab2_5=new JLabel("功能5：");//创建一个标签
    private JLabel lab3_1=new JLabel("  姓名：");//创建一个标签
    private JLabel lab3_2=new JLabel("  学号：");//创建一个标签
    private JLabel lab3_3=new JLabel("  英语：");//创建一个标签
    private JLabel lab3_4=new JLabel(" C语言：");//创建一个标签
    private JLabel lab3_5=new JLabel("  高数：");//创建一个标签
    private JLabel lab3_6=new JLabel("  体育：");//创建一个标签
    private JLabel lab3_7=new JLabel("JAVA：");//创建一个标签
    private JLabel lab5_1=new JLabel("全班每门课程的平均成绩如下：",JLabel.CENTER);//创建一个标签
    private StringBuffer sb1 = new StringBuffer();
    private StringBuffer sb2 = new StringBuffer();
    private StringBuffer sb3 = new StringBuffer();
    private StringBuffer sb4 = new StringBuffer();
    private StringBuffer sb5 = new StringBuffer();
    private JLabel lab5_2=new JLabel("全班英语平均分：",JLabel.CENTER);//创建一个标签
    private JLabel lab5_3=new JLabel("全班C语言平均分：",JLabel.CENTER);//创建一个标签
    private JLabel lab5_4=new JLabel("全班高数平均分：",JLabel.CENTER);//创建一个标签
    private JLabel lab5_5=new JLabel("全班体育平均分：",JLabel.CENTER);//创建一个标签
    private JLabel lab5_6=new JLabel("全班体育平均分：",JLabel.CENTER);//创建一个标签
    private JLabel lab8_1=new JLabel("成功录入学生信息",JLabel.CENTER);//创建一个标签
    private JLabel lab9_1=new JLabel("录入学生信息失败，请重新录入",JLabel.CENTER);//创建一个标签
    private JPanel jp1_1=new JPanel();//实例化JPanel对象
    private JPanel jp2_1=new JPanel();//实例化JPanel对象
    private JPanel jp2_2=new JPanel();//实例化JPanel对象
    private JPanel jp2_3=new JPanel();//实例化JPanel对象
    private JPanel jp2_4=new JPanel();//实例化JPanel对象
    private JPanel jp2_5=new JPanel();//实例化JPanel对象
    private JPanel jp3_1=new JPanel();//实例化JPanel对象
    private JPanel jp3_2=new JPanel();//实例化JPanel对象
    private JPanel jp3_3=new JPanel();//实例化JPanel对象
    private JPanel jp3_4=new JPanel();//实例化JPanel对象
    private JPanel jp3_5=new JPanel();//实例化JPanel对象
    private JPanel jp3_6=new JPanel();//实例化JPanel对象
    private JPanel jp3_7=new JPanel();//实例化JPanel对象
    private JPanel jp3_8=new JPanel();//实例化JPanel对象
    private JPanel jp4_1=new JPanel();//实例化JPanel对象
    private JPanel jp5_1=new JPanel();//实例化JPanel对象
    private JPanel jp5_2=new JPanel();//实例化JPanel对象
    private JPanel jp5_3=new JPanel();//实例化JPanel对象
    private JPanel jp6_1=new JPanel();//实例化JPanel对象
    private JPanel jp7_1=new JPanel();//实例化JPanel对象
    private JPanel jp8_1=new JPanel();//实例化JPanel对象
    private JPanel jp9_1=new JPanel();//实例化JPanel对象
    private JButton but1_1=new JButton("进入学生成绩管理系统");//创建一个按钮
    private JButton but2_1=new JButton("学生条目输入");//创建一个按钮
    private JButton but2_2=new JButton("成绩统计");//创建一个按钮
    private JButton but2_3=new JButton("分数段统计");//创建一个按钮
    private JButton but2_4=new JButton("不及格学生筛选");//创建一个按钮
    private JButton but2_5=new JButton("优秀生筛选");//创建一个按钮
    private JButton but3_1=new JButton("返回学生管理系统");//创建一个按钮
    private JButton but3_2=new JButton("录入学生信息");//创建一个按钮
    private JButton but4_1=new JButton("返回学生管理系统");//创建一个按钮
    private JButton but5_1=new JButton("返回学生管理系统");//创建一个按钮
    private JButton but6_1=new JButton("返回学生管理系统");//创建一个按钮
    private JButton but7_1=new JButton("返回学生管理系统");//创建一个按钮
    private JButton but8_1=new JButton("确定");//创建一个按钮
    private JButton but9_1=new JButton("确定");//创建一个按钮
    private JTextField nameText=new JTextField(20);//设置一个文本输入框
    private JTextField numberText=new JTextField(20);//设置一个文本输入框
    private JTextField EnglishText=new JTextField(20);//设置一个文本输入框
    private JTextField C_ProgramText=new JTextField(20);//设置一个文本输入框
    private JTextField highMathText=new JTextField(20);//设置一个文本输入框
    private JTextField P_EText=new JTextField(20);//设置一个文本输入框
    private JTextField javaText=new JTextField(20);//设置一个文本输入框
    private String[] title_4={"姓名","学号","英语成绩","C语言成绩","高数成绩","体育成绩","JAVA成绩","五门科目平均成绩","班级排名"};//设置表格标题
    private Object[][] student4=new Object[100][9];	//设置表格大小，几行几列
    private JTable table4=new JTable(student4,title_4);//将设置好的参数加入Jtable
    private JScrollPane src4=new JScrollPane(table4);//加入滚动条
    private String[] title_5={"\\","英语成绩","C语言成绩","高数成绩","体育成绩","JAVA成绩"};//设置表格标题
    private Object[][] student5=new Object[5][6];	//设置表格大小，几行几列
    private JTable table5=new JTable(student5,title_5);//将设置好的参数加入Jtable
    private JScrollPane src5=new JScrollPane(table5);//加入滚动条
    private String[] title_6={"学号","英语是否及格","C语言是否及格","高数是否及格","体育是否及格","JAVA是否及格"};	//设置表格标题
    private Object[][] student6=new Object[100][6];	//设置表格大小，几行几列
    private JTable table6=new JTable(student6,title_6);//将设置好的参数加入Jtable
    private JScrollPane src6=new JScrollPane(table6);//加入滚动条
    private String[] title_7={"姓名","学号","英语成绩","C语言成绩","高数成绩","体育成绩","JAVA成绩","五门科目平均成绩"};	//设置表格标题
    private Object[][] student7=new Object[100][8];	//设置表格大小，几行几列
    private JTable table7=new JTable(student7,title_7);//将设置好的参数加入Jtable
    private JScrollPane src7=new JScrollPane(table7);//加入滚动条
    public Student(){
        stu.addWindowListener(new MyWindowEventHandle());//将窗体加入到窗口监听器中
        stu1.addWindowListener(new MyWindowEventHandle());//将窗体加入到窗口监听器中
        stu2.addWindowListener(new MyWindowEventHandle());//将窗体加入到窗口监听器中
        stu3.addWindowListener(new MyWindowEventHandle());//将窗体加入到窗口监听器中
        stu4.addWindowListener(new MyWindowEventHandle());//将窗体加入到窗口监听器中
        stu5.addWindowListener(new MyWindowEventHandle());//将窗体加入到窗口监听器中
        stu6.addWindowListener(new MyWindowEventHandle());//将窗体加入到窗口监听器中
        stu9.addWindowListener(new MyWindowEventHandle());//将窗体加入到窗口监听器中
        stu.setSize(1000,400);//设置窗体大小
        stu.setBackground(Color.WHITE);//设置窗体背景颜色
        stu.setLocation(300, 200);//设置窗体在屏幕中显示的位置
        stu.setLayout(new GridLayout(4,1,3,3));	//设置布局管理器GridLayout
        stu.add(lab1_1);//加入标签
        stu.add(lab1_2);//加入标签
        stu.add(lab1_3);//加入标签
        stu.add(jp1_1);//将JPanel加入窗体
        jp1_1.add(but1_1);//将按钮加入JPanel
        stu.setVisible(true);//显示窗体
        but1_1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                if(arg0.getSource()==but1_1){
                    stu.setVisible(false);//让窗体不显示
                    stu1.setVisible(true);//让窗体显示
                }
            }
        });	 //加入监听动作，如果按下按钮则不显示此窗体而显示别的窗体
        stu1.setSize(1000,400);//设置窗体大小
        stu1.setBackground(Color.WHITE);//设置窗体背景颜色
        stu1.setLocation(300, 200);	//设置窗体在屏幕中显示的位置
        stu1.setLayout(new GridLayout(5,1,3,3));	//设置布局管理器GridLayout
        stu1.add(jp2_1);//将JPanel加入窗体
        stu1.add(jp2_2);//将JPanel加入窗体
        stu1.add(jp2_3);//将JPanel加入窗体
        stu1.add(jp2_4);//将JPanel加入窗体
        stu1.add(jp2_5);//将JPanel加入窗体
        jp2_1.add(lab2_1);//将标签加入JPanel
        jp2_1.add(but2_1);//将按钮加入JPanel
        jp2_2.add(lab2_2);//将标签加入JPanel
        jp2_2.add(but2_2);//将按钮加入JPanel
        jp2_3.add(lab2_3);//将标签加入JPanel
        jp2_3.add(but2_3);//将按钮加入JPanel
        jp2_4.add(lab2_4);//将标签加入JPanel
        jp2_4.add(but2_4);//将按钮加入JPanel
        jp2_5.add(lab2_5);//将标签加入JPanel
        jp2_5.add(but2_5);//将按钮加入JPanel
        but2_1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                if(arg0.getSource()==but2_1){
                    stu1.setVisible(false);//让窗体不显示
                    stu2.setVisible(true);//让窗体显示
                    nameText.setText(null);//初始化文本框编辑输入内容
                    numberText.setText(null);//初始化文本框编辑输入内容
                    EnglishText.setText(null);//初始化文本框编辑输入内容
                    C_ProgramText.setText(null);//初始化文本框编辑输入内容
                    highMathText.setText(null);//初始化文本框编辑输入内容
                    P_EText.setText(null);//初始化文本框编辑输入内容
                    javaText.setText(null);//初始化文本框编辑输入内容
                }
            }
        });	 //加入监听动作，如果按下按钮则不显示此窗体而显示别的窗体
        but2_2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                if(arg0.getSource()==but2_2){
                    stu1.setVisible(false);//让窗体不显示
                    stu3.setVisible(true);//让窗体显示
                    File h=new File("C:"+File.separator+"游戏"+File.separator+"学生综合成绩文件.txt");	//声明File对象
                    Writer cout2=null;
                    try{
                        cout2=new FileWriter(h);
                        String a="";
                        cout2.write(a);
                        cout2.close();
                    }catch(Exception e){
                        System.out.println("不好意思，学生综合成绩文件出错了");
                    }//初始化文件
                    int j=0;
                    for(int i=0;i<Student.getAS();i++)
                    {
                        if(i>0){
                            if(Student.getAll(i).getAverageScore()==Student.getAll(i-1).getAverageScore()){
                                j++;
                            }
                        }
                        student4[i][0]=Student.getAll(i).getname();
                        student4[i][1]=Student.getAll(i).getnumber();
                        student4[i][2]=Student.getAll(i).getEnglish();
                        student4[i][3]=Student.getAll(i).getC_program();
                        student4[i][4]=Student.getAll(i).gethighmath();
                        student4[i][5]=Student.getAll(i).getP_E();
                        student4[i][6]=Student.getAll(i).getjava();
                        student4[i][7]=Student.getAll(i).getAverageScore();
                        student4[i][8]=i+1-j;
                        try{
                            File m=new File("C:"+File.separator+"游戏"+File.separator+"学生综合成绩文件.txt");	//声明File对象
                            Writer out=null;
                            out=new FileWriter(m,true);//通过对象多态性进行实例化
                            out.write(Studentsystem.getAll(i).getname()+" ");//将内容写入文件
                            out.write("学号："+Studentsystem.change(Studentsystem.getAll(i).getnumber())+" ");//调用chane函数将int类型的数据转化为字符串再将内容写入文件
                            out.write("英语："+Studentsystem.change(Studentsystem.getAll(i).getEnglish())+" ");//调用chane函数将int类型的数据转化为字符串再将内容写入文件
                            out.write("C语言："+Studentsystem.change(Studentsystem.getAll(i).getC_program())+" ");//调用chane函数将int类型的数据转化为字符串再将内容写入文件
                            out.write("高数："+Studentsystem.change(Studentsystem.getAll(i).gethighmath())+" ");//调用chane函数将int类型的数据转化为字符串再将内容写入文件
                            out.write("体育："+Studentsystem.change(Studentsystem.getAll(i).getP_E())+" ");//调用将int类型的数据转化为字符串再将内容写入文件
                            out.write("JAVA："+Studentsystem.change(Studentsystem.getAll(i).getjava())+" ");//调用chane函数将int类型的数据转化为字符串再将内容读入文件
                            out.write("五门科目平均成绩："+Studentsystem.change(Studentsystem.getAll(i).getAverageScore())+" ");//调用chane函数将float类型的数据转化为字符串将内容写入文件
                            out.write("名次：第"+Studentsystem.change((i+1-j))+"名");//调用chane函数将float类型的数据转化为字符串将内容写入文件
                            out.write("\r\n");//将换行字符写入文件
                            out.close();//关闭输出流
                        }catch(Exception e){
                            System.out.println("不好意思，出错了");
                        }
                    }
                }
            }
        });	 //加入监听动作，如果按下按钮则不显示此窗体而显示别的窗体
        but2_3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                if(arg0.getSource()==but2_3){
                    stu1.setVisible(false);//让窗体不显示
                    stu4.setVisible(true);//让窗体显示
                    sb1.append("全班英语平均分："+Student.change(Student.getASEnglish()));
                    lab5_2.setText(sb1.toString());
                    sb2.append("全班C语言平均分："+Student.change(Student.getASC_program()));
                    lab5_3.setText(sb2.toString());
                    sb3.append("全班高数平均分："+Student.change(Student.geASthighmath()));
                    lab5_4.setText(sb3.toString());
                    sb4.append("全班体育平均分："+Student.change(Student.getASP_E()));
                    lab5_5.setText(sb4.toString());
                    sb5.append("全班JAVA平均分："+Student.change(Student.getASjava()));
                    lab5_6.setText(sb5.toString());
                    student5[0][0]="<60  ： ";
                    student5[1][0]="60~69：";
                    student5[2][0]="70~79：";
                    student5[3][0]="80~89：";
                    student5[4][0]=">90  ：";
                    student5[0][1]=Studentsystem.theBandScoreNumberEG(0,59);
                    student5[1][1]=Studentsystem.theBandScoreNumberEG(60,69);
                    student5[2][1]=Studentsystem.theBandScoreNumberEG(70,79);
                    student5[3][1]=Studentsystem.theBandScoreNumberEG(80,89);
                    student5[4][1]=Studentsystem.theBandScoreNumberEG(90, 100);
                    student5[0][2]=Studentsystem.theBandScoreNumberCP(0,59);
                    student5[1][2]=Studentsystem.theBandScoreNumberCP(60,69);
                    student5[2][2]=Studentsystem.theBandScoreNumberCP(70,79);
                    student5[3][2]=Studentsystem.theBandScoreNumberCP(80,89);
                    student5[4][2]=Studentsystem.theBandScoreNumberCP(90, 100);
                    student5[0][3]=Studentsystem.theBandScoreNumberHM(0,59);
                    student5[1][3]=Studentsystem.theBandScoreNumberHM(60,69);
                    student5[2][3]=Studentsystem.theBandScoreNumberHM(70,79);
                    student5[3][3]=Studentsystem.theBandScoreNumberHM(80,89);
                    student5[4][3]=Studentsystem.theBandScoreNumberHM(90, 100);
                    student5[0][4]=Studentsystem.theBandScoreNumberPE(0,59);
                    student5[1][4]=Studentsystem.theBandScoreNumberPE(60,69);
                    student5[2][4]=Studentsystem.theBandScoreNumberPE(70,79);
                    student5[3][4]=Studentsystem.theBandScoreNumberPE(80,89);
                    student5[4][4]=Studentsystem.theBandScoreNumberPE(90, 100);
                    student5[0][5]=Studentsystem.theBandScoreNumberJA(0,59);
                    student5[1][5]=Studentsystem.theBandScoreNumberJA(60,69);
                    student5[2][5]=Studentsystem.theBandScoreNumberJA(70,79);
                    student5[3][5]=Studentsystem.theBandScoreNumberJA(80,89);
                    student5[4][5]=Studentsystem.theBandScoreNumberJA(90, 100);
                    try{
                        File n=new File("C:"+File.separator+"游戏"+File.separator+"分数段统计.txt");	//声明File对象
                        Writer cout5=null;
                        cout5=new FileWriter(n);
                        cout5.write("全班每门课程的平均成绩如下：");
                        cout5.write("\r\n");//将内容换行
                        cout5.close();
                    }catch(Exception e){
                        System.out.println("不好意思，分数段统计出错了");
                    }
                }
            }
        });	 //加入监听动作，如果按下按钮则不显示此窗体而显示别的窗体
        but2_4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                if(arg0.getSource()==but2_4){
                    stu1.setVisible(false);//让窗体不显示
                    stu5.setVisible(true);//让窗体显示
                    File l=new File("C:"+File.separator+"游戏"+File.separator+"不及格学生名单.txt");	//声明File对象
                    Writer cout3=null;
                    try{
                        cout3=new FileWriter(l);
                        String a="";
                        cout3.write(a);
                        cout3.close();
                    }catch(Exception e){
                        System.out.println("不好意思，不及格学生名单出错了");
                    }//初始化文件
                    int j=0;
                    for(int i=0;i<Student.getAS();i++){
                        if(Student.getAll(i).lowStu(Student.getAll(i))){
                            student6[i-j][0]=Student.getAll(i).getnumber();
                            if(Student.getAll(i).lowEnglish(Student.getAll(i))){
                                student6[i-j][1]="flase；"+Student.change(Student.getAll(i).getEnglish());
                            }else{
                                student6[i-j][1]="true";
                            }//如果学生此门成绩及格就输出false如果不及格就输入true和学生此门不及格成绩
                            if(Student.getAll(i).lowC_program(Student.getAll(i))){
                                student6[i-j][2]="flase"+Student.change(Student.getAll(i).getC_program());
                            }else{
                                student6[i-j][2]="true";
                            }//如果学生此门成绩及格就输出false如果不及格就输入true和学生此门不及格成绩
                            if(Student.getAll(i).lowhighmath(Student.getAll(i))){
                                student6[i-j][3]="flase；"+Student.change(Student.getAll(i).gethighmath());
                            }else{
                                student6[i-j][3]="true";
                            }//如果学生此门成绩及格就输出false如果不及格就输入true和学生此门不及格成绩
                            if(Student.getAll(i).lowP_E(Student.getAll(i))){
                                student6[i-j][4]="flase；"+Student.change(Student.getAll(i).getP_E());
                            }else{
                                student6[i-j][4]="true";
                            }//如果学生此门成绩及格就输出false如果不及格就输入true和学生此门不及格成绩
                            if(Student.getAll(i).lowjava(Student.getAll(i))){
                                student6[i-j][5]="flase；"+Student.change(Student.getAll(i).getjava());
                            }else{
                                student6[i-j][5]="true";
                            } //如果学生此门成绩及格就输出false如果不及格就输入true和学生此门不及格成绩
                            try{
                                File m=new File("C:"+File.separator+"游戏"+File.separator+"不及格学生名单.txt");	//声明File对象
                                Writer out=null;
                                out=new FileWriter(m,true);//通过对象多态性进行实例化
                                out.write(Studentsystem.getAll(i).getname()+" ");//将内容读入文件
                                out.write("学号："+Studentsystem.change(Studentsystem.getAll(i).getnumber())+" ");//调用change函数将int类型的数据转化为字符串再将内容读入文件
                                if(Studentsystem.getAll(i).lowEnglish(Studentsystem.getAll(i))){
                                    out.write("英语："+Studentsystem.change(Studentsystem.getAll(i).getEnglish())+" ");//调用change函数将int类型的数据转化为字符串将内容读入文件
                                }
                                if(Studentsystem.getAll(i).lowC_program(Studentsystem.getAll(i))){
                                    out.write("C语言："+Studentsystem.change(Studentsystem.getAll(i).getC_program())+" ");//调用change函数将int类型的数据转化为字符串将内容读入文件
                                }
                                if(Studentsystem.getAll(i).lowhighmath(Studentsystem.getAll(i))){
                                    out.write("高数："+Studentsystem.change(Studentsystem.getAll(i).gethighmath())+" ");//调用change函数将int类型的数据转化为字符串将内容读入文件
                                }
                                if(Studentsystem.getAll(i).lowP_E(Studentsystem.getAll(i))){
                                    out.write("体育："+Studentsystem.change(Studentsystem.getAll(i).getP_E())+" ");//调用change函数将int类型的数据转化为字符串将内容读入文件
                                }
                                if(Studentsystem.getAll(i).lowjava(Studentsystem.getAll(i))){
                                    out.write("JAVA："+Studentsystem.change(Studentsystem.getAll(i).getjava())+" ");//调用change函数将int类型的数据转化为字符串将内容读入文件
                                }
                                System.out.print("\n");
                                out.write("\r\n");//将内容换行
                                out.close();//关闭输出流
                            }catch(Exception e){
                                System.out.println("不好意思，出错了");
                            }
                        }else{
                            j++;
                        }//将及格学生剔除不输出
                    }
                }
            }
        });	 //加入监听动作，如果按下按钮则不显示此窗体而显示别的窗体
        but2_5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                if(arg0.getSource()==but2_5){
                    stu1.setVisible(false);//让窗体不显示
                    stu6.setVisible(true);//让窗体显示
                    File m=new File("C:"+File.separator+"游戏"+File.separator+"优秀生.txt");//声明File对象
                    Writer cout4=null;
                    try{
                        cout4=new FileWriter(m);
                        String a="";
                        cout4.write(a);
                        cout4.close();
                    }catch(Exception e){
                        System.out.println("不好意思优秀生名单，出错了");
                    }//初始化文件
                    int j=0;
                    for(int i=0;i<Student.getAS();i++)
                    {
                        if(Student.getAll(i).TopStu(Student.getAll(i))){
                            student7[i-j][0]=Student.getAll(i).getname();
                            student7[i-j][1]=Student.getAll(i).getnumber();
                            student7[i-j][2]=Student.getAll(i).getEnglish();
                            student7[i-j][3]=Student.getAll(i).getC_program();
                            student7[i-j][4]=Student.getAll(i).gethighmath();
                            student7[i-j][5]=Student.getAll(i).getP_E();
                            student7[i-j][6]=Student.getAll(i).getjava();
                            student7[i-j][7]=Student.getAll(i).getAverageScore();
                            try{
                                File l=new File("C:"+File.separator+"游戏"+File.separator+"优秀生.txt");	//声明File对象
                                Writer out=null;
                                out=new FileWriter(l,true);//通过对象多态性进行实例化
                                out.write(Studentsystem.getAll(i).getname()+" ");//将内容读入文件
                                out.write("学号："+Studentsystem.change(Studentsystem.getAll(i).getnumber())+" ");//调用change函数将int类型数据转换为字符串再将字符串写入文件
                                out.write("英语："+Studentsystem.change(Studentsystem.getAll(i).getEnglish())+" ");//调用change函数将int类型数据转换为字符串再将字符串写入文件
                                out.write("C语言："+Studentsystem.change(Studentsystem.getAll(i).getC_program())+" ");//调用change函数将int类型数据转换为字符串再将字符串写入文件
                                out.write("高数："+Studentsystem.change(Studentsystem.getAll(i).gethighmath())+" ");//调用change函数将int类型数据转换为字符串再将字符串写入文件
                                out.write("体育："+Studentsystem.change(Studentsystem.getAll(i).getP_E())+" ");//调用change函数将int类型数据转换为字符串再将字符串写入文件
                                out.write("JAVA："+Studentsystem.change(Studentsystem.getAll(i).getjava())+" ");//调用change函数将int类型数据转换为字符串再将字符串写入文件
                                out.write("五门科目平均成绩："+Studentsystem.change(Studentsystem.getAll(i).getAverageScore())+" ");//调用change函数将float类型数据转换为字符串再将字符串写入文件
                                out.write("\r\n");//将内容读入文件
                                out.close();//关闭输出流
                            }catch(Exception e){
                                System.out.println("不好意思，出错了");
                            }
                        }else{
                            j++;
                        }//剔除不是优秀生的同学，将是优秀生的同学信息输入到表格
                    }
                }
            }
        });	 //加入监听动作，如果按下按钮则不显示此窗体而显示别的窗体
        //设置第三个窗体
        stu2.setSize(1000,400);//设置窗体大小
        stu2.setBackground(Color.WHITE);//设置窗体背景颜色
        stu2.setLocation(300, 200);//设置窗体在屏幕中显示的位置
        stu2.setLayout(new GridLayout(8,1,3,3));	//设置布局管理器GridLayout
        stu2.add(jp3_1);//将JPanel加入窗体
        stu2.add(jp3_2);//将JPanel加入窗体
        stu2.add(jp3_3);//将JPanel加入窗体
        stu2.add(jp3_4);//将JPanel加入窗体
        stu2.add(jp3_5);//将JPanel加入窗体
        stu2.add(jp3_6);//将JPanel加入窗体
        stu2.add(jp3_7);//将JPanel加入窗体
        stu2.add(jp3_8);//将JPanel加入窗体
        jp3_1.add(lab3_1);//将标签加入JPanel
        jp3_1.add(nameText);//将按钮加入JPanel
        jp3_2.add(lab3_2);//将标签加入JPanel
        jp3_2.add(numberText);//将按钮加入JPanel
        jp3_3.add(lab3_3);//将标签加入JPanel
        jp3_3.add(EnglishText);//将按钮加入JPanel
        jp3_4.add(lab3_4);//将标签加入JPanel
        jp3_4.add(C_ProgramText);//将按钮加入JPanel
        jp3_5.add(lab3_5);//将标签加入JPanel
        jp3_5.add(highMathText);//将按钮加入JPanel
        jp3_6.add(lab3_6);//将标签加入JPanel
        jp3_6.add(P_EText);//将按钮加入JPanel
        jp3_7.add(lab3_7);//将标签加入JPanel
        jp3_7.add(javaText);//将按钮加入JPanel
        jp3_8.add(but3_2);//将标签加入JPanel
        jp3_8.add(but3_1);//将按钮加入JPanel
        but3_1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                if(arg0.getSource()==but3_1){
                    stu2.setVisible(false);//让窗体不显示
                    stu1.setVisible(true);//让窗体显示
                    nameText.setText(null);//初始化文本框编辑输入内容
                    numberText.setText(null);//初始化文本框编辑输入内容
                    EnglishText.setText(null);//初始化文本框编辑输入内容
                    C_ProgramText.setText(null);//初始化文本框编辑输入内容
                    highMathText.setText(null);//初始化文本框编辑输入内容
                    P_EText.setText(null);//初始化文本框编辑输入内容
                    javaText.setText(null);//初始化文本框编辑输入内容
                }
            }
        });	 //加入监听动作，如果按下按钮则不显示此窗体而显示别的窗体
        but3_2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                if(arg0.getSource()==but3_2){
                    if(nameText.getText().equals("")){
                        lab9_1.setText("姓名输入不能为空");
                        stu8.setVisible(true);//让窗体显示
                    }else if(numberText.getText().equals(""))
                    {
                        lab9_1.setText("学号输入不能为空");
                        stu8.setVisible(true);//让窗体显示
                    }else if(EnglishText.getText().equals("")){
                        lab9_1.setText("英语成绩输入不能为空");
                        stu8.setVisible(true);//让窗体显示
                    }else if(C_ProgramText.getText().equals("")){
                        lab9_1.setText("C语言成绩输入不能为空");
                        stu8.setVisible(true);//让窗体显示
                    }else if(highMathText.getText().equals("")){
                        lab9_1.setText("高数成绩输入不能为空");
                        stu8.setVisible(true);//让窗体显示
                    }else if(P_EText.getText().equals("")){
                        lab9_1.setText("体育成绩输入不能为空");
                        stu8.setVisible(true);//让窗体显示
                    }else if(javaText.getText().equals("")){
                        lab9_1.setText("JAVA成绩输入不能为空");
                        stu8.setVisible(true);//让窗体显示
                    }else if(Student.ifInt(numberText.getText())){
                        lab9_1.setText("学号输入非法 ");
                        numberText.setText(null);//清空输入内容
                        stu8.setVisible(true);//让窗体显示
                    }else if(Student.ifInt(EnglishText.getText())||Student.change(EnglishText.getText())<0||Student.change(EnglishText.getText())>100){
                        lab9_1.setText("英语成绩输入非法不在0~100之间");
                        EnglishText.setText(null);//清空输入内容
                        stu8.setVisible(true);//让窗体显示
                    }else if(Student.ifInt(C_ProgramText.getText())||Student.change(C_ProgramText.getText())<0||Student.change(C_ProgramText.getText())>100){
                        lab9_1.setText("C语言成绩输入非法不在0~100之间");
                        C_ProgramText.setText(null);//清空输入内容
                        stu8.setVisible(true);//让窗体显示
                    }else if(Student.ifInt(highMathText.getText())||Student.change(highMathText.getText())<0||Student.change(highMathText.getText())>100){
                        lab9_1.setText("高数成绩输入非法不在0~100之间");
                        highMathText.setText(null);//清空输入内容
                        stu8.setVisible(true);//让窗体显示
                    }else if(Student.ifInt(P_EText.getText())||Student.change(P_EText.getText())<0||Student.change(P_EText.getText())>100){
                        lab9_1.setText("体育成绩输入非法不在0~100之间");
                        P_EText.setText(null);//清空输入内容
                        stu8.setVisible(true);//让窗体显示
                    }else if(Student.ifInt(javaText.getText())||Student.change(javaText.getText())<0||Student.change(javaText.getText())>100){
                        lab9_1.setText("JAVA成绩输入非法不在0~100之间");
                        javaText.setText(null);//清空输入内容
                        stu8.setVisible(true);//让窗体显示
                    }//对于文本框非法输入的处理
                    else{
                        stu7.setVisible(true);//让窗体显示
                        String tname=nameText.getText();
                        int tnumber=Student.change(numberText.getText());
                        int tEnglish=Student.change(EnglishText.getText());
                        int tC_Program=Student.change(highMathText.getText());
                        int thighMath=Student.change(C_ProgramText.getText());
                        int tP_E=Student.change((P_EText.getText()));
                        int tjava=Student.change((javaText.getText()));
                        Studentsystem a=new Studentsystem(tname,tnumber,tEnglish,tC_Program,thighMath,tP_E,tjava);//生成一个Student类的对象
                        a.AllSTU(a);//将新生成的对象a存入数组ALL
                        a.PaiXuAllSTU();//将刚输入的学生成绩与之前学生作比较
                        try{
                            File g=new File("C:"+File.separator+"游戏"+File.separator+"原始输入数据.txt");	//声明File对象
                            Writer out=null;
                            out=new FileWriter(g,true);//通过对象多态性进行实例化实例化BufferedReader
                            out.write(nameText.getText()+" ");//将内容写入文件
                            out.write("学号："+numberText.getText()+" ");//将内容写入文件
                            out.write("英语："+EnglishText.getText()+" ");//将内容写入文件
                            out.write("C语言："+highMathText.getText()+" ");//将内容写入文件
                            out.write("高数："+C_ProgramText.getText()+" ");//将内容写入文件
                            out.write("体育："+P_EText.getText()+" ");//将内容读入文件
                            out.write("JAVA："+javaText.getText()+" ");//将内容读入文件
                            out.write("\r\n");//将内容写入文件
                            out.close();//关闭输出入流
                        }catch(Exception e){
                            System.out.println("不好意思，出错了");
                        }
                    }
                }
            }
        });	 //加入监听动作，如果按下按钮则不显示此窗体而显示别的窗体
        //设置第四个窗体
        stu3.setSize(1000,400);//设置窗体大小
        stu3.setBackground(Color.WHITE);//设置窗体背景颜色
        stu3.setLocation(300, 200);//设置窗体在屏幕中显示的位置
        stu3.add(jp4_1,BorderLayout.NORTH);//加入面板
        jp4_1.add(but4_1,BorderLayout.CENTER);//加入按钮
        stu3.add(src4,BorderLayout.CENTER);//加入表格
        but4_1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                if(arg0.getSource()==but4_1){
                    stu3.setVisible(false);//让窗体不显示
                    stu1.setVisible(true);//让窗体显示
                }
            }
        });	 //加入监听动作，如果按下按钮则不显示此窗体而显示别的窗体
        //设置第五个窗体
        stu4.setSize(1000,400);//设置窗体大小
        stu4.setBackground(Color.WHITE);//设置窗体背景颜色
        stu4.setLocation(300, 200);//设置窗体在屏幕中显示的位置
        stu4.setLayout(new GridLayout(2,1,0,0));	//设置布局管理器GridLayout
        stu4.add(jp5_1);//将JPanel加入窗体
        stu4.add(jp5_2);//将JPanel加入窗体
        jp5_1.setLayout(new GridLayout(7,1,0,0));	//设置布局管理器GridLayout
        jp5_1.add(jp5_3);//将JPanel加入JPanel
        jp5_1.add(lab5_1);//将标签加入JPanel
        jp5_1.add(lab5_2);//将按钮加入JPanel
        jp5_1.add(lab5_3);//将标签加入JPanel
        jp5_1.add(lab5_4);//将标签加入JPanel
        jp5_1.add(lab5_5);//将标签加入JPanel
        jp5_1.add(lab5_6);//将标签加入JPanel
        jp5_2.add(src5);//将表格加入JPanel
        jp5_3.add(but5_1);//将按钮加入JPanel
        but5_1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                if(arg0.getSource()==but5_1){
                    stu4.setVisible(false);//让窗体不显示
                    stu1.setVisible(true);//让窗体显示
                    File n=new File("C:"+File.separator+"游戏"+File.separator+"分数段统计.txt");	//声明File对象
                    Writer out=null;
                    try{
                        out=new FileWriter(n,true);//通过对象多态性进行实例化
                        out.write("全班英语平均分："+Studentsystem.change(Studentsystem.getASEnglish()));
                        out.write("\r\n");//将内容换行
                        out.write("全班C语言平均分："+Studentsystem.change(Studentsystem.getASC_program()));
                        out.write("\r\n");//将内容换行
                        out.write("全班高数平均分："+Studentsystem.change(Studentsystem.geASthighmath()));
                        out.write("\r\n");//将内容换行
                        out.write("全班体育平均分："+Studentsystem.change(Studentsystem.getASP_E()));
                        out.write("\r\n");//将内容换行
                        out.write("全班JAVA平均分："+Studentsystem.change(Studentsystem.getASjava()));
                        out.write("\r\n");//将内容换行
                        out.write("分数段         英语    C语言    高数    体育    JAVA");
                        out.write("\r\n");//将内容换行
                        out.write("<60  ："+Studentsystem.change(Studentsystem.theBandScoreNumberEG(0,59)));
                        out.write(" "+Studentsystem.change(Studentsystem.theBandScoreNumberCP(0,59))+" "+Studentsystem.change(Studentsystem.theBandScoreNumberHM(0,59)));
                        out.write(" "+Studentsystem.change(Studentsystem.theBandScoreNumberPE(0,59))+" "+Studentsystem.change(Studentsystem.theBandScoreNumberJA(0,59)));
                        out.write("\r\n");//将内容换行
                        out.write("60~69："+Studentsystem.change(Studentsystem.theBandScoreNumberEG(60,69)));
                        out.write(" "+Studentsystem.change(Studentsystem.theBandScoreNumberCP(60,69))+" "+Studentsystem.change(Studentsystem.theBandScoreNumberHM(60,69)));
                        out.write(" "+Studentsystem.change(Studentsystem.theBandScoreNumberPE(60,69))+" "+Studentsystem.change(Studentsystem.theBandScoreNumberJA(60,69)));
                        out.write("\r\n");//将内容换行
                        out.write("70~79："+Studentsystem.change(Studentsystem.theBandScoreNumberEG(70,79)));
                        out.write(" "+Studentsystem.change(Studentsystem.theBandScoreNumberCP(70,79))+" "+Studentsystem.change(Studentsystem.theBandScoreNumberHM(70,79)));
                        out.write(" "+Studentsystem.change(Studentsystem.theBandScoreNumberPE(70,79))+" "+Studentsystem.change(Studentsystem.theBandScoreNumberJA(70,79)));
                        out.write("\r\n");//将内容换行
                        out.write("80~89："+Studentsystem.change(Studentsystem.theBandScoreNumberEG(80,89)));
                        out.write(" "+Studentsystem.change(Studentsystem.theBandScoreNumberCP(80,89))+" "+Studentsystem.change(Studentsystem.theBandScoreNumberHM(80,89)));
                        out.write(" "+Studentsystem.change(Studentsystem.theBandScoreNumberPE(80,89))+" "+Studentsystem.change(Studentsystem.theBandScoreNumberJA(80,89)));
                        out.write("\r\n");//将内容换行
                        out.write(">90  ："+Studentsystem.change(Studentsystem.theBandScoreNumberEG(90,100)));
                        out.write(" "+Studentsystem.change(Studentsystem.theBandScoreNumberCP(90,100))+" "+Studentsystem.change(Studentsystem.theBandScoreNumberHM(90,100)));
                        out.write(" "+Studentsystem.change(Studentsystem.theBandScoreNumberPE(90,100))+" "+Studentsystem.change(Studentsystem.theBandScoreNumberJA(90,100)));
                        out.write("\r\n");//将内容换行
                        out.close();
                    }catch(Exception e){
                        System.out.println("不好意思，出错了");
                    }
                }
            }
        });	 //加入监听动作，如果按下按钮则不显示此窗体而显示别的窗体
        //设置第六个窗体
        stu5.setSize(1000,400);//设置窗体大小
        stu5.setBackground(Color.WHITE);//设置窗体背景颜色
        stu5.setLocation(300, 200);//设置窗体在屏幕中显示的位置
        stu5.add(jp6_1,BorderLayout.NORTH);//加入面板
        jp6_1.add(but6_1,BorderLayout.CENTER);//加入按钮
        stu5.add(src6,BorderLayout.CENTER);//加入表格
        but6_1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                if(arg0.getSource()==but6_1){
                    stu5.setVisible(false);//让窗体不显示
                    stu1.setVisible(true);//让窗体显示
                }
            }
        });	 //加入监听动作，如果按下按钮则不显示此窗体而显示别的窗体
        //设置第七个窗体
        stu6.setSize(1000,400);//设置窗体大小
        stu6.setBackground(Color.WHITE);//设置窗体背景颜色
        stu6.setLocation(300, 200);//设置窗体在屏幕中显示的位置
        stu6.add(jp7_1,BorderLayout.NORTH);//加入面板
        jp7_1.add(but7_1,BorderLayout.CENTER);//加入按钮
        stu6.add(src7,BorderLayout.CENTER);//加入表格
        but7_1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                if(arg0.getSource()==but7_1){
                    stu6.setVisible(false);//让窗体不显示
                    stu1.setVisible(true);//让窗体显示
                }
            }
        });	 //加入监听动作，如果按下按钮则不显示此窗体而显示别的窗体
        //设置第八个窗体
        stu7.setSize(400,200);//设置窗体大小
        stu7.setBackground(Color.WHITE);//设置窗体背景颜色
        stu7.setLocation(600,300);//设置窗体在屏幕中显示的位置
        stu7.setLayout(new GridLayout(2,1,3,3));
        stu7.add(lab8_1);//加入标签
        stu7.add(jp8_1);//将JPanel加入窗体
        jp8_1.add(but8_1);//将按钮加入JPanel
        but8_1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                if(arg0.getSource()==but8_1){
                    stu7.setVisible(false);//让窗体不显示
                    nameText.setText(null);//清空输入内容
                    numberText.setText(null);//清空输入内容
                    EnglishText.setText(null);//清空输入内容
                    C_ProgramText.setText(null);//清空输入内容
                    highMathText.setText(null);//清空输入内容
                    P_EText.setText(null);//清空输入内容
                    javaText.setText(null);//清空输入内容
                }
            }
        });	 //加入监听动作，如果按下按钮则不显示此窗体而显示别的窗体
        //设置第九个窗体
        stu8.setSize(400,200);//设置窗体大小
        stu8.setBackground(Color.WHITE);//设置窗体背景颜色
        stu8.setLocation(600,300);//设置窗体在屏幕中显示的位置
        stu8.setLayout(new GridLayout(2,1,3,3));
        stu8.add(lab9_1);//加入标签
        stu8.add(jp9_1);//将JPanel加入窗体
        jp9_1.add(but9_1);//将按钮加入JPanel
        but9_1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                if(arg0.getSource()==but9_1){
                    stu8.setVisible(false);//让窗体不显示
                }
            }
        });	 //加入监听动作，如果按下按钮则不显示此窗体而显示别的窗体
    }
}
public  class dpp1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try{
            File o=new File("C:"+File.separator+"游戏");	//声明File对象
            if(o.exists()){}else{o.mkdir();}//如果文件存在则不生成文件；否则生成文件
            File g=new File("C:"+File.separator+"游戏"+File.separator+"原始输入数据.txt");	//声明File对象
            if(g.exists()){}else{g.createNewFile();}//如果文件存在则不生成文件；否则生成文件
            Writer cout1=null;
            cout1=new FileWriter(g);
            String a="";
            cout1.write(a);
            cout1.close();
            File h=new File("C:"+File.separator+"游戏"+File.separator+"学生综合成绩文件.txt");	//声明File对象
            if(h.exists()){}else{h.createNewFile();}//如果文件存在则不生成文件；否则生成文件
            File l=new File("C:"+File.separator+"游戏"+File.separator+"不及格学生名单.txt");	//声明File对象
            if(l.exists()){}else{l.createNewFile();}//如果文件存在则不生成文件；否则生成文件
            File m=new File("C:"+File.separator+"游戏"+File.separator+"优秀生.txt");	//声明File对象
            if(m.exists()){}else{m.createNewFile();}//如果文件存在则不生成文件；否则生成文件
        }catch(Exception e){
            System.out.println("不好意思输入的原始数据，出错了");
        }
        Student a=new Student();
    }
}
//开始日期2017年10月25日 结束日期2017年11月04日

