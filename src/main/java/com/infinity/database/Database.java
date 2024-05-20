package com.infinity.database;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.infinity.database.queries.CategoryQuery;
import com.infinity.database.queries.ProductQuery;
import com.infinity.database.queries.UserQuery;

public class Database {
    private Statement statement;

    /**
     * @param statement
     */
    public Database(Statement statement) {
        this.statement = statement;
    }

    public static Connection getQuery(String databaseSrc) {
        validateDatabaseSource(databaseSrc);
        createDirectory(databaseSrc);
        try {
            var connection = DriverManager.getConnection("jdbc:sqlite:" + databaseSrc);

            return connection;
        } catch (SQLException e) {

        }
        throw new NullPointerException("Algo deu errado!");
    }

    private static void validateDatabaseSource(String databaseSrc) {
        if (databaseSrc == null) {
            throw new NullPointerException("The database Source is null");
        }
        if (!databaseSrc.endsWith(".db".toLowerCase())) {
            throw new IllegalArgumentException("Wrong database file extension!");
        }
    }

    public static void createTables(Statement statement) throws SQLException {
        statement.executeUpdate(UserQuery.createUserTable());
        statement.executeUpdate(CategoryQuery.createCategoryTable());
        statement.executeUpdate(ProductQuery.createProductTable());
    }

    private static void createDirectory(String databaseDirectory) {
        try {
            int slashLastIndex = databaseDirectory.lastIndexOf("/");
            databaseDirectory = databaseDirectory.substring(0, slashLastIndex);
        } catch (Exception e) {
            e.printStackTrace();
            throw new NullPointerException("Wrong directory Type");
        }
        File dir = new File(databaseDirectory);
        if (!dir.exists()) {
            dir.mkdirs();
        }
    }
}
