package com.example.ordersystem.service;

import com.example.ordersystem.model.Order;
import com.example.ordersystem.repository.OrderRepository;

import org.springframework.context.annotation.Lazy;
// import com.example.ordersystem.service.inventory.InventoryService; // (Optional
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final OrderRepository orderRepository;
    private final PaymentService paymentService; // Injected as a dependency

    @Lazy
    public OrderService(OrderRepository orderRepository, PaymentService paymentService) {
        this.orderRepository = orderRepository;
        this.paymentService = paymentService;
    }

    public Order createOrder(Order order) {
        // ... (rest of logic)
        Order savedOrder = orderRepository.save(order);
        paymentService.initiatePaymentWithOrder(savedOrder); // Initiate payment during order creation
        return savedOrder;
    }

    public Order getOrderDetails(String orderId) {
        return orderRepository.findById(orderId).orElseThrow();
    }

    public Order updateOrderStatus(String orderId, String newStatus) {
        Order order = getOrderDetails(orderId);
        order.setStatus(newStatus);
        return orderRepository.save(order);
    }

    // Additional methods for order cancellation, searching, etc. (see previous response)

    // (Optional) Methods for user management (if applicable)
}
