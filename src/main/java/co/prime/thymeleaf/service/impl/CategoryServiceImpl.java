package co.prime.thymeleaf.service.impl;

import co.prime.thymeleaf.model.Category;
import co.prime.thymeleaf.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Override
    public void addCategory(Category category) {

    }

    @Override
    public List<Category> findAll() {
        return null;
    }

    @Override
    public Category findById(Integer id) {
        return null;
    }

    @Override
    public void updateCategory(Integer id, Category newCategory) {

    }

    @Override
    public void deleteCategory(Integer id) {

    }
}
