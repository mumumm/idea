package DataBaseTest.JDBCDemo.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTest {
    public static void main(String[] args){
        Connection conn=null;
        Statement stat=null;
        try {
            //1、注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2、获取数据库连接对象Connection
            //url 网址 协议：// ip地址: 端口号/数据库名称
            //如果是自己的电脑 locahost 127.0.0.1 192.168.71.24
            //jdbc:mysql://localhost:3306/studentsystem自己的电脑localhost:3306可以省略不写
            String url="jdbc:mysql://localhost:3306/studentsystem";
            String user="root";
            String password ="qwer123456";
            conn= DriverManager.getConnection(url,user,password);
            /**
             *3、获取数据库的操作对象Statement
             * conn.creatreStatement();返回一个Statement接口
             */
            stat =conn.createStatement();
            /**
             * 4、通过Statement对象执行SQl语句
             * （1）增删改
             * stat.executeUpdate(sql);
             * 返回的结果是受影响的行数
             * (2)查询
             * stat.executeQuery(sql);
             * 返回的结果是ResultSet结果集
             *
             * */
            /**
             * 插入语句
             * insert into student (name,sex,EnglishScore,JavaScore,MathScore,PEScore,CprogarmScore,class) value ('cxk','男',80,80,80,80,80,'篮球班');
             */
            String sql=" update student set name ='mm' where id =2;";
            int count=stat.executeUpdate(sql);
            /**
             * 5、处理结果集
             * 增删改的结果集为受影响的行数
             */
            System.out.println(count+"条数据被修改");

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            /**
             * 6、关闭资源
             */
            try {
                if(conn!=null){
                    conn.close();
                }
                if(stat!=null){
                    stat.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
