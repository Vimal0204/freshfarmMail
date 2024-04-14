package com.freshFarmMail.com.demo.model;

public class EmailMessageWelcome {

    private String customerName;
    private String to;
    private String subject="Welcome to Fresh Farm - Your Platform for Fresh Produce!";
    ;

    public EmailMessageWelcome() {
    }

    public EmailMessageWelcome(String customerName, String to) {
        this.customerName = customerName;
        this.to = to;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
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

//    public void setSubject(String subject) {
//        this.subject = subject;
//    }
//
//    public String getMessage() {
//        return message;
//    }

//    public void setMessage(String message) {
//        this.message = message;
//    }

    @Override
    public String toString() {
        return "EmailMessageWelcome{" +
                "customerName='" + customerName + '\'' +
                ", to='" + to + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
