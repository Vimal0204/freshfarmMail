package com.freshFarmMail.com.demo.model;

public class EmailCustomerCancelOrder {
    private String to;
    private String customerName;
    private  String subject="Order Cancellation Confirmation";
    private int orderId;
    private int quantity;
    private double totalAmount;


    public EmailCustomerCancelOrder() {
    }

    public EmailCustomerCancelOrder(String to, String customerName, int orderId, int quantity, double totalAmount) {
        this.to = to;
        this.customerName = customerName;
        this.orderId = orderId;
        this.quantity = quantity;
        this.totalAmount = totalAmount;

    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
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

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }


    @Override
    public String toString() {
        return "EmailCustomerCancelOrder{" +
                "to='" + to + '\'' +
                ", customerName='" + customerName + '\'' +
                ", orderId=" + orderId +
                ", quantity=" + quantity +
                ", totalAmount =" + totalAmount + '\'' +
                '}';
    }
}
