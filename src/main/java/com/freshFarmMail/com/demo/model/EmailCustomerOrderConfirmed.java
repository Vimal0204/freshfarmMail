package com.freshFarmMail.com.demo.model;

public class EmailCustomerOrderConfirmed {
    private String to;
    private String customerName;
    private  String subject="Order Confirmed";
    private int totalItem;
    private double totalAmount;
    private String paymentMethod;

    public EmailCustomerOrderConfirmed() {
    }


    public EmailCustomerOrderConfirmed(String to, String customerName, int totalItem, double totalAmount, String paymentMethod) {
        this.to = to;
        this.customerName = customerName;
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

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "EmailCustomerOrderConfirmed{" +
                "to='" + to + '\'' +
                ", customerName='" + customerName + '\'' +
                ", totalItem=" + totalItem +
                ", totalAmount=" + totalAmount +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }
}
