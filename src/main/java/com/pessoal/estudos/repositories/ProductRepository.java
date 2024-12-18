package com.pessoal.estudos.repositories;

import com.pessoal.estudos.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
