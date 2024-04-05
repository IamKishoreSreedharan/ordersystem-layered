package com.example.ordersystem.model;

public class Order {

    private String id;
    private String items;
    private String status; // e.g., "CREATED", "PROCESSING", "COMPLETED"
    private String paymentId; // Reference to associated Payment object

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public double calculateTotal() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculateTotal'");
    }

    // Optional methods for order total calculation, tracking information, etc.
}
