package com.infinity.database.parsing;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.infinity.database.models.Category;
import com.infinity.database.models.Product;
import com.infinity.database.models.User;

public class QueryParse {

    public static User queryToUser(ResultSet result) throws SQLException {
        return new User(
                result.getInt("id"),
                result.getString("name"),
                result.getString("email"),
                result.getString("password"),
                result.getString("phone_number"));

    }

    public static Category queryToCategory(ResultSet result) throws SQLException {
        return new Category(
                result.getInt("id"),
                result.getString("name"));
    }

    public static Product queryToProduct(ResultSet result) throws SQLException {
        return new Product(result.getInt("id"), result.getString("name"),
                result.getString("brand"),
                result.getString("unage_src"),
                result.getInt("quantity"),
                result.getInt("category_id"),
                result.getDouble("price"));
    }
}
