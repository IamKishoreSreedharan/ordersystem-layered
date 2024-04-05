package com.example.ordersystem.repository;

import com.example.ordersystem.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order, String> {

    // Optional methods for custom queries based on your needs
    // (e.g., find orders by status, search by items)
}

