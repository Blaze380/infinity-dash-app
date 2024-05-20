package com.infinity.database.queries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.infinity.database.models.Product;

public class ProductQuery {
    public static String createProductTable() {
        final String query = "CREATE TABLE IF NOT EXISTS 'products' (id INTEGER  PRIMARY KEY AUTOINCREMENT ,brand TEXT NOT NULL,image_src TEXT NOT NULL,name TEXT NOT NULL, price NUMERIC(10,2) NOT NULL, quantity NUMERIC(10,0) NOT NULL, category_id INTEGER NOT NULL, FOREIGN KEY (category_id) REFERENCES category(id) );";
        return query;
    }

    public static PreparedStatement insertProduct(Product product, Connection connection) throws SQLException {
        final String query = "INSERT INTO products (name,brand,image_src,price,quantity,category_id) VALUES (?,?,?,?,?,?)";
        PreparedStatement pStatement = connection.prepareStatement(query);
        pStatement.setString(1, product.getName());
        pStatement.setString(2, product.getBrand());
        pStatement.setString(3, product.getImageSrc());
        pStatement.setDouble(4, product.getPrice());
        pStatement.setInt(5, product.getQuantity());
        pStatement.setInt(6, product.getCategoryId());
        return pStatement;
    }

    public static String selectAllProducts() {
        return "SELECT * FROM products";

    }

    public static PreparedStatement updateProductById(Product product, Connection connection) throws SQLException {
        final String query = "UPDATE products SET name=?,brand=?,image_src=?,price=?,quantity=?,category_id=? WHERE id=?";
        var pStatement = connection.prepareStatement(query);
        pStatement.setString(1, product.getName());
        pStatement.setString(2, product.getBrand());
        pStatement.setString(3, product.getImageSrc());
        pStatement.setDouble(4, product.getPrice());
        pStatement.setInt(5, product.getQuantity());
        pStatement.setInt(6, product.getCategoryId());
        pStatement.setInt(7, product.getId());
        return pStatement;
    }

    public static PreparedStatement selectProductsById(int id, Connection connection) throws SQLException {
        final String query = "SELECT * FROM products WHERE id=?";
        var pStatement = connection.prepareStatement(query);
        pStatement.setInt(1, id);
        return pStatement;

    }

    public static PreparedStatement deleteProductById(int id, Connection connection) throws SQLException {
        final String query = "DELETE FROM products WHERE id=?";
        var pStatement = connection.prepareStatement(query);
        pStatement.setInt(1, id);
        return pStatement;

    }
}
