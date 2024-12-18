package com.pessoal.estudos.services;

import com.pessoal.estudos.entities.Order;
import com.pessoal.estudos.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order findById(Long id) {
        Order order = orderRepository.findById(id).get();
        return order;
    }
}
