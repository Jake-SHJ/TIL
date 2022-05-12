import java.sql.SQLException;
import user.dao.DaoFactory;
import user.dao.UserDao;
import user.domain.User;

public class UserDaoTest {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        UserDao dao = new DaoFactory().userDao();

        User user = new User();
        user.setId("test");
        user.setName("jake");
        user.setPassword("test");

        dao.add(user);

        System.out.println(user.getId() + " 등록 성공");

        User user2 = dao.get(user.getId());
        System.out.println(user2.getName());
        System.out.println(user2.getPassword());

        System.out.println(user2.getId() + " 조회 성공");
    }
}
