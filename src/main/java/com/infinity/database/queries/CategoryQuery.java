package com.infinity.database.queries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.infinity.database.models.Category;

public class CategoryQuery {
    public static String createCategoryTable() {
        final String query = "CREATE TABLE IF NOT EXISTS 'category' (id INTEGER PRIMARY KEY AUTOINCREMENT ,name TEXT NOT NULL)";
        return query;
    }

    public static PreparedStatement insertCategory(Category category, Connection connection) throws SQLException {
        final String query = "INSERT INTO category (name) VALUES (?)";
        PreparedStatement pStatement = connection.prepareStatement(query);
        pStatement.setString(1, category.getName());
        return pStatement;
    }

    public static String selectAllCategories() {
        return "SELECT * FROM category";

    }

    public static PreparedStatement updateCategoryById(Category category, Connection connection) throws SQLException {
        final String query = "UPDATE category SET name=? WHERE id=?";
        var pStatement = connection.prepareStatement(query);
        pStatement.setString(1, category.getName());
        pStatement.setInt(2, category.getId());
        return pStatement;
    }

    public static PreparedStatement selectCategoryById(int id, Connection connection) throws SQLException {
        final String query = "SELECT * FROM category WHERE id=?";
        var pStatement = connection.prepareStatement(query);
        pStatement.setInt(1, id);
        return pStatement;

    }

    public static PreparedStatement deleteCategoryById(int id, Connection connection) throws SQLException {
        final String query = "DELETE FROM category WHERE id=?";
        var pStatement = connection.prepareStatement(query);
        pStatement.setInt(1, id);
        return pStatement;

    }
}
