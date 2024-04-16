package com.freshFarmMail.com.demo.model;

public class EmailFarmerOrderReceived {
    private String to;
    private  String subject="New Order Received";
    private int orderId;
    private int totalItem;
    private double totalAmount;
    private String paymentMethod;

    public EmailFarmerOrderReceived() {
    }

    public EmailFarmerOrderReceived(String to, int orderId, int totalItem, double totalAmount, String paymentMethod) {
        this.to = to;
        this.orderId = orderId;
        this.totalItem = totalItem;
        this.totalAmount = totalAmount;
        this.paymentMethod = paymentMethod;
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

    public int getTotalItem() {
        return totalItem;
    }

    public void setTotalItem(int totalItem) {
        this.totalItem = totalItem;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
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
                ", orderId=" + orderId +
                ", totalItem=" + totalItem +
                ", totalAmount=" + totalAmount +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }
}
