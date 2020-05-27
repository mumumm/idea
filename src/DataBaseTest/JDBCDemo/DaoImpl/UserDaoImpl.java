package DataBaseTest.JDBCDemo.DaoImpl;
import DataBaseTest.JDBCDemo.Dao.User;
import DataBaseTest.JDBCDemo.Dao.UserDao;
public class UserDaoImpl implements UserDao {
    private User user;
    public void login(){
        if(checkUid(user.getUid())){
            if(checkPassWord(user.getPassword())){
                System.out.println("登陆成功！！欢迎你"+user.getUsername());
            }else{

            }

        }else {
            System.out.println("账号错误，请重新输入！！");
        }
    }
    @Override
    public boolean checkUid(String uid) {
        if(uid.equals(user.getUid())){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean checkPassWord(String password) {
        if(password.equals(user.getPassword())){
            return true;
        }else {
            return false;
        }
    }
}
