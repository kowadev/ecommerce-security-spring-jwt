package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.Category;

public class CategoryMinDTO {
    private Long id;
    private String name;

    public CategoryMinDTO(){}


    public CategoryMinDTO(Category category){
        id= category.getId();
        name = category.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
