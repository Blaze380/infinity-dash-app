package com.infinity.database.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {

    private int id;
    private String name;

    /**
     * @param name
     */
    public Category(String name) {
        this.name = name;
    }

}
