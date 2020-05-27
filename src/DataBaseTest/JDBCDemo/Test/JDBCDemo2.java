package DataBaseTest.JDBCDemo.Test;

import DataBaseTest.JDBCDemo.Dao.Student;
import DataBaseTest.JDBCDemo.Dao.StudentDao;
import DataBaseTest.JDBCDemo.DaoImpl.StudentDaoImpl;

import java.util.List;

public class JDBCDemo2 {
    public static void main(String[] args){
        StudentDao studentDao =new StudentDaoImpl();
        List<Student>stu=studentDao.getAllStudent();
        for (int i=0;i<stu.size();i++){
            System.out.println(stu.get(i));
        }
    }
}
