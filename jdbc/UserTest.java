package jdbc;

import java.util.List;

public class UserTest {

    public static void main(String[] args) {

        UserDao userDao = new UserDaoImpl();
        List<User> users = userDao.getAllUsers();
        for (User user : users) {
            System.out.println(user);
        }

//        User user = new User(2, "Loi");
//        userDao.insetUser(user);

        userDao.deleteUser(2);
    }
}
