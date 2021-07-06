package jdbc;

import java.util.List;

public interface UserDao {

    int insetUser(User user);
    int updateUser(User user);
    int deleteUser(int id);
    List<User> getAllUsers();
}
