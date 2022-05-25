package gb_pattern.Lesson_06;

import java.sql.*;

public class UserMapper {

    public User getUser(int id) {
        User user = IdentityMap.isInto(id);
        if (user != null) {
            return user;
        } else {
            User found = find(id);
            IdentityMap.adUser(found);
            return found;
        }
    }

    public User find(int id) {
        Connection connection;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gb_patterns", "root", "root");
            PreparedStatement statement = connection.prepareStatement("select id, nick_name from users where id = ?");
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) return new User(resultSet.getInt(1), resultSet.getString(2));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
