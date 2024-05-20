package com.infinity.database;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;

import java.io.File;

import org.junit.Test;

public class DatabaseTest {

    @Test
    public void insertDatabaseSourceShouldReturnStatementObject() {
        var statement = Database.getQuery("resources/database/applicationa.db");
        assertNotNull(statement);
    }

    @Test
    public void insertWrongDatabaseSourceShouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> {
            Database.getQuery("resources/database/application");
        });
    }

    @Test
    public void insertNullDatabaseSourceShouldThrowNullPointerException() {
        assertThrows("Insert null database source should throw NullPointerException", NullPointerException.class,
                () -> {
                    Database.getQuery(null);
                });
    }

    @Test
    public void createDatabaseInADirectoryThatDoesNotExistsShouldSuccess() {
        Database.getQuery("resources/test/unknown_directory/database/application.db");
        var file = new File("resources/test/unknown_directory/database/application.db");
        if (file.exists()) {
            file.delete();
        }

    }

    @Test
    public void createDatabaseWithIncorrectDirectoryPatternShouldThrowNullPointerException() {
        assertThrows("Create Database with incorrect directory pattern should throw NullPointerException",
                NullPointerException.class, () -> {
                    Database.getQuery(".\\resources\\test\\unknown_directory\\database\\application.db");
                    var file = new File(".\\resources\\test\\unknown_directory\\database\\application.db");
                    if (file.exists()) {
                        file.delete();
                    }
                });
    }
}
