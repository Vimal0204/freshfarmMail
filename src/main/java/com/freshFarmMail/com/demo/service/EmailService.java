package com.freshFarmMail.com.demo.service;


import com.freshFarmMail.com.demo.model.EmailCustomerCancelOrder;
import com.freshFarmMail.com.demo.model.EmailCustomerOrderConfirmed;
import com.freshFarmMail.com.demo.model.EmailFarmerOrderReceived;
import com.freshFarmMail.com.demo.model.EmailMessageWelcome;

public interface EmailService {
//    void sendEmail(String to, String subject, String message);
//    public boolean sendEmail(String subject,String message,String to);

    boolean sendEmailWelcome(EmailMessageWelcome emailMessageWelcome);

    boolean sendEmailCustomerOrderConfirmed(EmailCustomerOrderConfirmed emailMessage);

    boolean sendCustomerOrderCancel(EmailCustomerCancelOrder emailMessage);

    boolean sendFarmerOrderReceived(EmailFarmerOrderReceived emailMessage);
}
