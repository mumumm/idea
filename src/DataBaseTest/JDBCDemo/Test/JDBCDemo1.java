package DataBaseTest.JDBCDemo.Test;

import DataBaseTest.JDBCDemo.Utils.JDBCUtils;

import java.sql.*;

public class JDBCDemo1 {
    public static void main(String[] args){
        //1、获取一个数据库连接对象
        Connection conn=JDBCUtils.getConnection();
        //2、获取Statement对象
        Statement stat = null;
        ResultSet rs=null;
        try {
            stat = conn.createStatement();
            //3、通过Statement对象执行sql语句
            String sql="select * from student where PEScore > 80;";
            //4、执行sql语句返回结果集，处理结果集
            rs = stat.executeQuery(sql);
            while(rs.next()){
                System.out.print(  "姓名：     "+rs.getString("name")+"\t");
                System.out.print(  "性别:      "+rs.getString("sex")+"\t");
                System.out.print(  "英语分数： "+rs.getInt("EnglishScore")+"\t");
                System.out.print(  "高数分数： "+rs.getInt("MathScore")+"\t");
                System.out.print(  "体育分数： "+rs.getInt("PEScore")+"\t");
                System.out.print(  "JAVA分数： "+rs.getInt("JavaScore")+"\t");
                System.out.print(  "C语言分数："+rs.getInt("CprogarmScore")+"\t");
                System.out.println("班级：     "+rs.getString("Class")+"\t");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(conn,stat,rs);
        }
    }

}
