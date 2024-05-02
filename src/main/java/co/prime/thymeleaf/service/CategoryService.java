package co.prime.thymeleaf.service;

import co.prime.thymeleaf.model.Category;

import java.util.List;

public interface CategoryService {
    void addCategory(Category category);

    List<Category> findAll();

    Category findById(Integer id);

    void updateCategory(Integer id, Category newCategory);

    void deleteCategory(Integer id);

}
