package com.infinity.database.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.infinity.database.models.Category;
import com.infinity.database.models.User;
import com.infinity.database.parsing.QueryParse;
import com.infinity.database.queries.CategoryQuery;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CategoryRepository {
    private Connection connection;

    public void saveCategory(Category category) {
        try (PreparedStatement pStatement = CategoryQuery.insertCategory(category, connection)) {
            pStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new NullPointerException("Category Must not be null");
        }
    }

    public void updateCategory(Category category) {
        validateCategory(category);
        try (PreparedStatement pStatement = CategoryQuery.updateCategoryById(category, connection)) {
            pStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new NullPointerException("Category Must not be null");
        }
    }

    public Category getCategoryById(Category category) {
        validateCategory(category);
        try (PreparedStatement pStatement = CategoryQuery.selectCategoryById(category.getId(), connection)) {
            ResultSet result = pStatement.executeQuery();
            return QueryParse.queryToCategory(result);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new NullPointerException("Category Id Must not be null");
        }
    }

    public void deleteCategoryById(Category category) {
        validateCategory(category);
        try (PreparedStatement pStatement = CategoryQuery.deleteCategoryById(category.getId(), connection)) {
            pStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new NullPointerException("Category Id Must not be null");
        }
    }

    public List<Category> getAllCategories() {
        List<Category> categories = new ArrayList<Category>();
        try (Statement statement = connection.createStatement()) {
            ResultSet result = statement.executeQuery(CategoryQuery.selectAllCategories());
            while (result.next()) {
                categories.add(QueryParse.queryToCategory(result));
            }
            return categories;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new UnsupportedOperationException("Error While Fetching categories");
        }
    }

    private void validateCategory(Category category) {
        if (category.getId() < 1)
            throw new NullPointerException("Category ID Must not be null");
    }
}
