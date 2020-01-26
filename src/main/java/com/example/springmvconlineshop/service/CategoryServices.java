package com.example.springmvconlineshop.service;

import com.example.springmvconlineshop.domain.Category;

import java.util.List;

public interface CategoryServices {
    Category create(Category category);
    Category findById(int id);
    List<Category> findAll();

}
