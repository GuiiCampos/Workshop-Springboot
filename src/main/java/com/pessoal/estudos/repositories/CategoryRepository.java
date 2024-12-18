package com.pessoal.estudos.repositories;

import com.pessoal.estudos.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
