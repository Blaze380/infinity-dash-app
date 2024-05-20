package com.infinity.database.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.infinity.database.models.User;
import com.infinity.database.parsing.QueryParse;
import com.infinity.database.queries.UserQuery;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserRepository {
    private Connection connection;

    public void saveUser(User user) {
        try (PreparedStatement pStatement = UserQuery.insertUser(user, connection)) {
            pStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new NullPointerException("The user Must not be null");
        }
    }

    public User getUserByNameAndPassword(User user) {

        try (PreparedStatement pStatement = UserQuery.findUserByEmailAndPassword(user, connection)) {
            ResultSet result = pStatement.executeQuery();
            user = QueryParse.queryToUser(result);
            return user;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new NullPointerException("O Usuário não existe");
        }
    }

    public boolean existsByNameAndPassword(User user) {
        user = getUserByNameAndPassword(user);
        if (user == null)
            throw new NullPointerException("The user Must not be Null!");

        if (user.getEmail() == null || user.getName() == null
                || user.getPassword() == null || user.getPhoneNumber() == null) {
            return false;
        }
        return true;
    }

}
