package DataBaseTest.JDBCDemo.DaoImpl;

import DataBaseTest.JDBCDemo.Dao.Student;
import DataBaseTest.JDBCDemo.Dao.StudentDao;
import DataBaseTest.JDBCDemo.Utils.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
    @Override
    public List<Student> getAllStudent() {
        List<Student> list=new ArrayList();
        Connection conn =null;
        Statement  stat =null;
        ResultSet  rs   =null;
        //1、获取Connection对象
        conn=JDBCUtils.getConnection();
        try {
            //2、创建Statement对象执行sql语句
            stat=conn.createStatement();
            //3、执行SQL语句
            String sql="select * from Student;";
            //4、处理返回的结果集
            rs=stat.executeQuery(sql);
            while (rs.next()){
                Student stu = new Student();
                stu.setId(rs.getInt("id"));
                stu.setName(rs.getString("name"));
                stu.setSex(rs.getString("sex"));
                stu.setEnglishScore(rs.getDouble("EnglishScore"));
                stu.setMathScore(rs.getDouble("MathScore"));
                stu.setPEScore(rs.getDouble("PEScore"));
                stu.setJavaScore(rs.getDouble("JavaScore"));
                stu.setCprogarmScore(rs.getDouble("CprogarmScore"));
                stu.setClassName(rs.getString("class"));
                //将student对象填加到list集合中
                list.add(stu);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(conn,stat,rs);
        }
        return list;
    }
}
