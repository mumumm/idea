package DataBaseTest.JDBCDemo.Test;

import DataBaseTest.JDBCDemo.Utils.JDBCUtils;

import java.sql.*;

public class RemoveTest {
    public static void main(String[] args){
        delelt(1);
    }
    public static  void delelt( int id){
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtils.getConnection();
            String sql ="delete from student where id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,id);
            int result = ps.executeUpdate();
            if(result==0){
                System.out.println("删除失败");
            }else {
                System.out.println("删除了"+result+"条数据");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(conn,stat,rs);
        }
    }

}
