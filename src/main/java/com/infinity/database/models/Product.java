package com.infinity.database.models;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private int id;
    private String name;
    private String brand;
    private String imageSrc;
    private int quantity;
    private int categoryId;
    private double price;

    /**
     * @param name
     * @param brand
     * @param imageSrc
     * @param quantity
     * @param categoryId
     * @param price
     */
    public Product(String name, String brand, String imageSrc, int quantity, int categoryId, double price) {
        this.name = name;
        this.brand = brand;
        this.imageSrc = imageSrc;
        this.quantity = quantity;
        this.categoryId = categoryId;
        this.price = price;
    }

}
