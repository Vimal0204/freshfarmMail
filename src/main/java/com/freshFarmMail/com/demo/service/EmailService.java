package com.freshFarmMail.com.demo.service;


import com.freshFarmMail.com.demo.model.EmailCustomerCancelOrder;
import com.freshFarmMail.com.demo.model.EmailCustomerOrderConfirmed;
import com.freshFarmMail.com.demo.model.EmailFarmerOrderReceived;
import com.freshFarmMail.com.demo.model.EmailMessageWelcome;

public interface EmailService {

    boolean sendEmailWelcome(EmailMessageWelcome emailMessageWelcome,String pass);

    boolean sendEmailCustomerOrderConfirmed(EmailCustomerOrderConfirmed emailMessage,String pass);

    boolean sendCustomerOrderCancel(EmailCustomerCancelOrder emailMessage,String pass);

    boolean sendFarmerOrderReceived(EmailFarmerOrderReceived emailMessage,String pass);
}
