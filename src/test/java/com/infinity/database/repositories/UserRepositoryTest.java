package com.infinity.database.repositories;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

import com.infinity.database.Database;
import com.infinity.database.models.User;

public class UserRepositoryTest {
    private Connection connection;
    private UserRepository userRepository;
    private User user;

    @Before
    public void createConnection() {
        connection = Database.getQuery("resources/test/database/application.db");
        try {
            Database.createTables(connection.createStatement());
            userRepository = new UserRepository(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        user = new User();
        user.setEmail("test@gmail.com");
        user.setPassword("test");
    }

    @Test(expected = NullPointerException.class)
    public void VerifyingIfUserExistsByNullValueShouldThrowNullPointerException() {
        userRepository.existsByNameAndPassword(null);
    }

    @Test
    public void VerifyingIfUserExistsByEmailAndPasswordShouldReturnTrue() {
        assertTrue(userRepository.existsByNameAndPassword(user));
    }

    @Test
    public void VerifyingIfUserExistsByEmailAndPasswordShouldReturnFalse() {
        user.setPassword("123");
        assertFalse(userRepository.existsByNameAndPassword(user));
    }

    @Test(expected = NullPointerException.class)
    public void findUserByNullValueShouldThrowNullPointerException() {
        userRepository.getUserByNameAndPassword(null);
    }

    @Test(expected = NullPointerException.class)
    public void saveUserByNullValueShouldThrowNullPointerException() {
        userRepository.saveUser(null);
    }

    @Test(expected = NullPointerException.class)
    public void saveUserIncompleteValuesShouldReturnThrowNullPointerException() {
        userRepository.saveUser(user);
    }

    @Test()
    public void saveUserWithCorrectValuesShouldNotThrowAnException() {
        user.setPhoneNumber("12345");
        user.setName("test");
        userRepository.saveUser(user);
        // assertNotEquals(void.class, userRepository.saveUser(user));
    }
}
