package com.example.ordersystem.controller;

import com.example.ordersystem.model.Order;
import com.example.ordersystem.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public ResponseEntity<Order> createOrder(@RequestBody Order order) {
        Order createdOrder = orderService.createOrder(order);
        return ResponseEntity.ok(createdOrder);
    }

    @GetMapping("/{orderId}")
    public ResponseEntity<Order> getOrderDetails(@PathVariable String orderId) {
        Order order = orderService.getOrderDetails(orderId);
        return ResponseEntity.ok(order);
    }

    // Add additional methods for order management functionalities as needed
    // (e.g., update order status, cancel order)
}

