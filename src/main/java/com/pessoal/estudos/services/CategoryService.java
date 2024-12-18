package com.pessoal.estudos.services;

import com.pessoal.estudos.entities.Category;
import com.pessoal.estudos.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository CategoryRepository;

    public List<Category> findAll() {
        return CategoryRepository.findAll();
    }

    public Category findById(Long id) {
        Category Category = CategoryRepository.findById(id).get();
        return Category;
    }
}
