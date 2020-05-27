package DataBaseTest.JDBCDemo.Dao;

public interface UserDao {
    /**
     *检查用户名是否存在
     */
    boolean checkUid(String uid);
    /**
     *检查密码是否正确
     */
    boolean checkPassWord(String password);
}