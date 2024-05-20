package com.infinity.database.repositories;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import java.sql.SQLException;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.infinity.database.Database;
import com.infinity.database.models.Category;

public class CategoryRepositoryTest {
    CategoryRepository categoryRepository;
    private Category category;

    @Before
    public void init() {
        var connection = Database.getQuery("resources/test/database/application.db");
        try {
            Database.createTables(connection.createStatement());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        categoryRepository = new CategoryRepository(connection);
        category = new Category("Roupas");
    }

    @Test
    public void insertNullCategoryShouldThrowNullPointerException() {
        assertThrows("Insert Null Category  Should throw NullPointerException", NullPointerException.class, () -> {
            categoryRepository.saveCategory(null);

        });
    }

    @Test
    public void insertCategoryWithNullNameShouldThrowNullPointerException() {
        assertThrows("Insert Category With null name Should throw NullPointerException", NullPointerException.class,
                () -> {
                    category.setName(null);
                    categoryRepository.saveCategory(category);
                });
    }

    @Test
    public void insertCategoryShouldNotThrowAnException() {
        categoryRepository.saveCategory(category);
    }

    @Test
    public void getCategoryWithNullObjectShouldThrowNullPointerException() {
        assertThrows("Get Category With null Object should return NullPointerException", NullPointerException.class,
                () -> {
                    categoryRepository.getCategoryById(null);
                });
    }

    // @Test
    public void getCategoryByNegativeIdShouldThrowNullPointerException() {
        assertThrows("Get Category By Negative Id should return NullPointerException", NullPointerException.class,
                () -> {
                    category.setId(-1);
                    categoryRepository.getCategoryById(category);
                });
    }

    @Test
    public void getCategoryByIdShouldReturnACategory() {
        category.setId(1);
        assertTrue("Get Category By Id should return a category object",
                categoryRepository.getCategoryById(category) instanceof Category);
    }

    @Test
    public void getAllCategoriesShouldReturnACategoryList() {
        assertTrue("Get all categories should return an List of categories",
                categoryRepository.getAllCategories() instanceof List<Category>);
    }

    @Test
    public void deleteCategoryByNegativeIdShouldThrowNullPointerException() {
        assertThrows("Delete category by null id should throw null pointer exception", NullPointerException.class,
                () -> {
                    category.setId(-1);
                    categoryRepository.deleteCategoryById(category);
                });
    }

    @Test
    public void deleteCategoryByNullObjectShouldThrowNullPointerException() {
        assertThrows("Delete category by null object should throw null pointer exception", NullPointerException.class,
                () -> {
                    categoryRepository.deleteCategoryById(null);
                });
    }

    @Test
    public void deleteCategoryByIdObjectShouldNotThrowException() {
        category.setId(1);
        categoryRepository.deleteCategoryById(category);
    }

    @Test
    public void updateCategoryByNullObjectShouldThrowNullPointerException() {
        assertThrows("Update category by null object should throw NullPointerException", NullPointerException.class,
                () -> {
                    categoryRepository.updateCategory(null);
                });
    }

    @Test
    public void updateCategoryByNegativeIdObjectShouldThrowNullPointerException() {
        assertThrows("Update category by negative id should throw NullPointerException", NullPointerException.class,
                () -> {
                    category.setId(-1);
                    categoryRepository.updateCategory(category);
                });
    }

    @Test
    public void updateCategoryByIdShouldNotThrowException() {
        category.setId(1);
        categoryRepository.updateCategory(category);
    }
}
