package com.freshFarmMail.com.demo.service;


import com.freshFarmMail.com.demo.model.*;

public interface EmailService {

    boolean sendEmailWelcome(EmailMessageWelcome emailMessageWelcome,String pass);

    boolean sendEmailCustomerOrderConfirmed(EmailCustomerOrderConfirmed emailMessage,String pass);

    boolean sendCustomerOrderCancel(EmailCustomerCancelOrder emailMessage,String pass);

    boolean sendFarmerOrderReceived(EmailFarmerOrderReceived emailMessage,String pass);

    boolean sendFarmerOrderCancel(EmailFarmerOrderCancel emailMessage, String passing);
}
