package com.pessoal.estudos.services;

import com.pessoal.estudos.entities.Product;
import com.pessoal.estudos.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository ProductRepository;

    public List<Product> findAll() {
        return ProductRepository.findAll();
    }

    public Product findById(Long id) {
        Product Product = ProductRepository.findById(id).get();
        return Product;
    }
}
