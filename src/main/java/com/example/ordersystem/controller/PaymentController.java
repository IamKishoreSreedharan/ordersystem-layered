package com.example.ordersystem.controller;

import com.example.ordersystem.model.Payment;
import com.example.ordersystem.service.PaymentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping
    public ResponseEntity<Payment> initiatePayment(@RequestBody Payment payment) {
        Payment initiatedPayment = paymentService.initiatePayment(payment);
        return ResponseEntity.ok(initiatedPayment);
    }

    @PostMapping("/{paymentId}/approve")
    public ResponseEntity<Payment> approvePayment(@PathVariable String paymentId) {
        Payment approvedPayment = paymentService.approvePayment(paymentId);
        return ResponseEntity.ok(approvedPayment);
    }

    // Add additional methods for payment processing functionalities as needed
    // (e.g., handle payment failures, refunds)
}

