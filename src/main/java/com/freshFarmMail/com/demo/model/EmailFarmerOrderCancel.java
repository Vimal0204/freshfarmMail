package com.freshFarmMail.com.demo.model;

public class EmailFarmerOrderCancel {
    private String to;
    private  String subject="Order Cancellation";
    private int orderId;
    private int quantity;
    private double totalAmount;

    public EmailFarmerOrderCancel() {
    }

    public EmailFarmerOrderCancel(String to, int orderId, int quantity, double totalAmount) {
        this.to = to;
        this.orderId = orderId;
        this.quantity = quantity;
        this.totalAmount = totalAmount;
    }

    public String getSubject() {
        return subject;
    }


    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
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

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "EmailFarmerOrderCancel{" +
                "to='" + to + '\'' +
                ", subject='" + subject + '\'' +
                ", orderId=" + orderId +
                ", quantity=" + quantity +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
