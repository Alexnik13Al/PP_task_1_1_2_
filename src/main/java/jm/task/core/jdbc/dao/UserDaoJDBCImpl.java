package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.*;
import java.util.List;

public class UserDaoJDBCImpl implements UserDao {

    public UserDaoJDBCImpl() {

    }

    public void createUsersTable() throws SQLException {
        try (Connection connection = Util.getConnection();
             Statement statement = connection.createStatement()) {
            DatabaseMetaData metaData = connection.getMetaData();
            ResultSet tables = metaData.getTables(null, null, "newtable", null);
            if (!tables.next()) {
                String s = "CREATE TABLE `newtable`(id BIGINT NOT NULL AUTO_INCREMENT, name VARCHAR(45) NOT NULL, " +
                        "lastName VARCHAR(45) NOT NULL , age TINYINT NOT NULL , PRIMARY KEY (id))";
                statement.executeUpdate(s);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void dropUsersTable() throws SQLException {

    }

    public void saveUser(String name, String lastName, byte age) throws SQLException {

    }

    public void removeUserById(long id) throws SQLException {

    }

    public List<User> getAllUsers() throws SQLException {
        return null;
    }

    public void cleanUsersTable() throws SQLException {

    }
}
