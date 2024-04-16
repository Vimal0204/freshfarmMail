package com.freshFarmMail.com.demo.model;

public class EmailFarmerOrderReceived {
    private String to;
    private  String subject="New Order Received";
    private int orderId;
    private int quantity;
    private int customerId;
    private double Amount;
    private String paymentMethod;

    public EmailFarmerOrderReceived() {
    }

    public EmailFarmerOrderReceived(String to, int orderId, int quantity, double Amount, String paymentMethod,int customerId) {
        this.to = to;
        this.orderId = orderId;
        this.quantity = quantity;
        this.Amount = Amount;
        this.paymentMethod = paymentMethod;
        this.customerId=customerId;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double amount) {
        Amount = amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "EmailFarmerOrderReceived{" +
                "to='" + to + '\'' +
                ", subject='" + subject + '\'' +
                ", orderId=" + orderId +
                ", quantity=" + quantity +
                ", customerId=" + customerId +
                ", Amount=" + Amount +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }
}
