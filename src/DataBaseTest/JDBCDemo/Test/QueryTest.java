package DataBaseTest.JDBCDemo.Test;

import DataBaseTest.JDBCDemo.Dao.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class QueryTest {
    public QueryTest(Connection conn, Statement stat){

    }
    public static void main(String[] args){
        Connection conn=null;
        Statement stat=null;
        try {
            //1、注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2、获取数据库连接
            String url="jdbc:mysql://localhost:3306/studentsystem";
            String user="root";
            String password ="qwer123456";
            conn= DriverManager.getConnection(url,user,password);
            //3、获取数据库的操作对象Statement
            stat =conn.createStatement();
            //4、查询
            String sql="select * from student;";
            ResultSet re=stat.executeQuery(sql);
            /**
             * ResultSet结果集，使用迭代器实现
             *  re.next();
             * 判断结果集有没有下一行数据，如果有移动到下一行并且返回true，没有返回false
             * re.getXXX方法获取这一行的数据
             * get方法要按照数据库中存放类型来使用对应的getXXX方法
             * 例如：数据库中的id为int类型那么就应该使用getTnt()方法
             *      数据库中的name为String类型那么就应该使用getString()方法
             * getXXX（参数） 参数可以传递两种形式：1、数据的索引（列数）
             *                                    2、列的名字（推荐使用）
             */
            List<Student> list =new ArrayList();
            while (re.next()){
                Student stu = new Student();
                stu.setId(re.getInt("id"));
                System.out.print("姓名："+re.getString("name")+"\t");
                stu.setName(re.getString("name"));
                System.out.print("性别："+re.getString("sex")+"\t");
                stu.setSex(re.getString("sex"));
                System.out.print("英语分数："+re.getDouble("EnglishScore")+"\t");
                stu.setEnglishScore(re.getDouble("EnglishScore"));
                System.out.print("高数分数："+re.getDouble("MathScore")+"\t");
                stu.setMathScore(re.getDouble("MathScore"));
                System.out.print("体育分数："+re.getDouble("PEScore")+"\t");
                stu.setPEScore(re.getDouble("PEScore"));
                System.out.print("JAVA分数："+re.getDouble("JavaScore")+"\t");
                stu.setJavaScore(re.getDouble("JavaScore"));
                System.out.print("C语言分数："+re.getDouble("CprogarmScore")+"\t");
                stu.setCprogarmScore(re.getDouble("CprogarmScore"));
                System.out.println("班级："+re.getString("class")+"\t");
                stu.setClassName(re.getString("class"));
                //将student对象填加到list集合中
                list.add(stu);
            }
            for (int i=0;i<list.size();i++){
                System.out.println(list.get(i));
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
