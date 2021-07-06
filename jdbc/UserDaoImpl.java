package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {

    @Override
    public int insetUser(User user) {

        String insertQuery = "insert into users(id, name) values (?, ?)";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int result = 0;
        try {
            connection = ConnectionUtils.getMySQLConnection();
            preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setInt(1, user.getId());
            preparedStatement.setString(2, user.getName());
            result = preparedStatement.executeUpdate();
            return result;
        } catch (SQLException ex) {
            System.out.println("Error when insert");
        } finally {
            ConnectionUtils.close(preparedStatement, connection);
        }
        return result;
    }

    @Override
    public int updateUser(User user) {
        return 0;
    }

    @Override
    public int deleteUser(int id) {
        String deleteUSer = "delete from users where id = ?";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int result = 0;
        try {
            connection = ConnectionUtils.getMySQLConnection();
            preparedStatement = connection.prepareStatement(deleteUSer);
            preparedStatement.setInt(1, id);
            result = preparedStatement.executeUpdate();
            return result;
        } catch (SQLException ex) {
            System.out.println("Error when delete");
        } finally {
            ConnectionUtils.close(preparedStatement, connection);
        }
        return result;
    }

    @Override
    public List<User> getAllUsers() {
        String selectQuery = "select id, name from users";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        List<User> users = new ArrayList<>();
        try {
            connection = ConnectionUtils.getMySQLConnection();
            preparedStatement = connection.prepareStatement(selectQuery);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                users.add(new User(id, name));
            }
        } catch (SQLException ex) {
            System.out.println("Error when insert");
        } finally {
            ConnectionUtils.close(preparedStatement, connection);
        }
        return users;
    }

}
