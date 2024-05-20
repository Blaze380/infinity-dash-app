package com.infinity.database.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.infinity.database.models.Product;
import com.infinity.database.parsing.QueryParse;
import com.infinity.database.queries.ProductQuery;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ProductRepository {
    private Connection connection;

    public void saveProduct(Product product) {
        try (PreparedStatement pStatement = ProductQuery.insertProduct(product, connection)) {
            pStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new NullPointerException("Product Must not be null");
        }
    }

    public void updateProduct(Product product) {
        try (PreparedStatement pStatement = ProductQuery.updateProductById(product, connection)) {
            pStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new NullPointerException("Product Must not be null");
        }
    }

    public Product getProductById(Product product) {
        try (PreparedStatement pStatement = ProductQuery.selectProductsById(product.getId(), connection)) {
            ResultSet result = pStatement.executeQuery();
            return QueryParse.queryToProduct(result);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new NullPointerException("Product Id Must not be null");
        }
    }

    public void deleteProductById(Product product) {
        try (PreparedStatement pStatement = ProductQuery.deleteProductById(product.getId(), connection)) {
            pStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new NullPointerException("Product Id Must not be null");
        }
    }

    public List<Product> getAllProducts() {
        List<Product> categories = new ArrayList<Product>();
        try (Statement statement = connection.createStatement()) {
            ResultSet result = statement.executeQuery(ProductQuery.selectAllProducts());
            while (result.next()) {
                categories.add(QueryParse.queryToProduct(result));
            }
            return categories;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new UnsupportedOperationException("Error While Fetching categories");
        }
    }
}
