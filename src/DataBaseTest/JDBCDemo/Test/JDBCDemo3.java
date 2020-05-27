package DataBaseTest.JDBCDemo.Test;

import DataBaseTest.JDBCDemo.Utils.JDBCUtils;

import java.sql.*;
import java.util.Scanner;

public class JDBCDemo3 {
    public static void main(String[] args){
        Connection conn=null;
        Statement stat=null;
        ResultSet rs =null;
        System.out.println("请输入账号：");
        Scanner scan =new Scanner(System.in);
        String uid=scan.nextLine();
        System.out.println("请输入密码：");
        scan =new Scanner(System.in);
        String password=scan.nextLine();
        try {
            conn = JDBCUtils.getConnection();
            //获取PreparedStatement对象 预加载Statement对象
            // ? 表示占位符
            String sql ="select * from user_info where uid = ?";
            System.out.println(sql);
            PreparedStatement ps = conn.prepareStatement(sql);
            //给预加载PreparedStatement对象的占位符设置参数
            ps.setString(1,uid);
            System.out.println(ps);
            rs = ps.executeQuery();
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

        }
    }
}
