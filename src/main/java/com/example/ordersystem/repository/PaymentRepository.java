package com.example.ordersystem.repository;

import com.example.ordersystem.model.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PaymentRepository extends MongoRepository<Payment, String> {

    // Optional methods for custom queries based on your needs
    // (e.g., find payments by order ID, filter by status)
}

