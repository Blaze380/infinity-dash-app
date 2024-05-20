package com.infinity.database.queries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.infinity.database.models.User;

public class UserQuery {
    public static String createUserTable() {
        final String query = "CREATE TABLE IF NOT EXISTS 'user' ( id INTEGER  PRIMARY KEY AUTOINCREMENT, email TEXT UNIQUE, name TEXT NOT NULL, password TEXT NOT NULL,phone_number TEXT  NOT NULL);";
        return query;
    }

    public static PreparedStatement insertUser(User user, Connection connection) throws SQLException {
        final String query = "INSERT INTO user (name,email,password,phone_number) VALUES (?,?,?,?)";
        PreparedStatement pStatement = connection.prepareStatement(query);
        pStatement.setString(1, user.getName());
        pStatement.setString(2, user.getEmail());
        pStatement.setString(3, user.getPassword());
        pStatement.setString(4, user.getPhoneNumber());
        return pStatement;
    }

    public static PreparedStatement findUserByEmailAndPassword(User user, Connection connection) throws SQLException {
        final String query = "SELECT * FROM user WHERE email = ? AND password = ?";
        PreparedStatement pStatement = connection.prepareStatement(query);
        pStatement.setString(1, user.getEmail());
        pStatement.setString(2, user.getPassword());
        return pStatement;
    }

    public static PreparedStatement updateUser(User user, Connection connection) throws SQLException {
        final String query = "UPDATE user  SET name=?,email=?,password=?,phone_number=? WHERE id=?";
        PreparedStatement pStatement = connection.prepareStatement(query);
        pStatement.setString(1, user.getName());
        pStatement.setString(2, user.getEmail());
        pStatement.setString(3, user.getPassword());
        pStatement.setString(4, user.getPhoneNumber());
        pStatement.setInt(5, user.getId());

        return pStatement;
    }

}
