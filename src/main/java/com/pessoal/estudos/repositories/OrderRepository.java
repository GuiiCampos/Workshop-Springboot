package com.pessoal.estudos.repositories;

import com.pessoal.estudos.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
