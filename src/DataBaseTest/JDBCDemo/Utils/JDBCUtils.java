package DataBaseTest.JDBCDemo.Utils;

import java.sql.*;

/**
 * JDBC工具类
 * 1、获取Connection对象
 * 2、关闭资源
 */
public class JDBCUtils {
    /**
     * 定义四个静态常量
     * @return
     */
    private static final String DRIVER   = "com.mysql.cj.jdbc.Driver";
    private static final String URL      = "jdbc:mysql:///studentsystem";
    private static final String USER     = "root";
    private static final String PASSWORD = "qwer123456";
    static {
        //1、注册驱动
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    /**
     * 获取Connection对象
     * @return
     */
    public static Connection getConnection(){
        Connection conn=null;
        try {
            //2、获取Connection对象
            conn=DriverManager.getConnection(URL,USER,PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            return conn;
        }
    }
    public static void close(Connection conn, Statement stat, ResultSet rs){
        try {
            if(conn!=null){
                conn.close();
            }
            if(stat!=null){
                stat.close();
            }
            if(rs!=null){
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
