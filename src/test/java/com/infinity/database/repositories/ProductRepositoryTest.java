package com.infinity.database.repositories;

import static org.junit.Assert.assertThrows;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

import com.infinity.database.Database;
import com.infinity.database.models.Product;

public class ProductRepositoryTest {
    private ProductRepository productRepository;
    private Product product;

    @Before
    public void init() {
        try {
            var connection = Database.getQuery("/resources/test/database/application.db");
            Database.createTables(connection.createStatement());
            productRepository = new ProductRepository(connection);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        product = new Product("Boné", "Nike", "aws.s3.com", 10, 1, 200);
    }

    @Test
    public void saveProductByNullObjectShouldThrowException() {
        assertThrows("Save product with null object should throw NullPointerException", NullPointerException.class,
                () -> {
                    productRepository.saveProduct(null);
                });
    }

    @Test
    public void saveProductByWithNullNamShouldThrowException() {
        assertThrows("Save product with null name should throw NullPointerException", NullPointerException.class,
                () -> {
                    product.setName(null);
                    productRepository.saveProduct(product);
                });
    }

    @Test
    public void saveProductShouldNotThrowException() {
        productRepository.saveProduct(product);
    }
}
