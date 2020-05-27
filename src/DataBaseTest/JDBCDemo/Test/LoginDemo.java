package DataBaseTest.JDBCDemo.Test;

import DataBaseTest.JDBCDemo.Utils.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class LoginDemo {
    public static void main(String[] args){
        System.out.println("请输入账号：");
        Scanner scan =new Scanner(System.in);
        String uid=scan.nextLine();
        System.out.println("请输入密码：");
         scan =new Scanner(System.in);
        String password=scan.nextLine();
        Connection conn = null;
        Statement  stat = null;
        ResultSet  rs   = null;
        try {
            conn = JDBCUtils.getConnection();
            stat = conn.createStatement();
            String sql="select * from user_info where uid = '"+uid+"';";
            rs   = stat.executeQuery(sql);
            if(rs.next()!=false){
                if(rs.getString("password").equals(password)){
                    System.out.println("登陆成功！！欢迎你"+rs.getString("username"));
                }else {
                    System.out.println("密码错误！！");
                }
            }else {
                System.out.println("账号不存在！！");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(conn,stat,rs);
        }

    }
}
