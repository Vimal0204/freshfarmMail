package com.freshFarmMail.com.demo.service;

import com.freshFarmMail.com.demo.model.EmailCustomerCancelOrder;
import com.freshFarmMail.com.demo.model.EmailCustomerOrderConfirmed;
import com.freshFarmMail.com.demo.model.EmailFarmerOrderReceived;
import com.freshFarmMail.com.demo.model.EmailMessageWelcome;
import org.springframework.stereotype.Service;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

@Service
public class EmailServiceImpl implements EmailService{



                @Override
                public boolean sendEmailWelcome(EmailMessageWelcome emailMessageWelcome,String pass) {
                String subject=emailMessageWelcome.getSubject();
                String to=emailMessageWelcome.getTo();
                String message = "Dear  "+emailMessageWelcome.getCustomerName()+",\n\n"
                                + "Welcome to Fresh Farm - the freshest marketplace for all your agricultural needs! We're thrilled to have you on board as a part of our community dedicated to bringing the best of nature's bounty to your fingertips.\n\n"
                                + "Fresh Farm is your go-to destination if you're a buyer seeking the freshest fruits, vegetables, dairy products, grains, and pulses. We believe in connecting producers directly with consumers like you, ensuring transparency, quality, and fair prices every step of the way.\n\n"
                                + "As you embark on your journey with us, here's a glimpse of what to expect:\n\n"
                                + "A Variety of Products: From crisp vegetables to luscious fruits, and creamy dairy products to wholesome grains and pulses, our platform offers a diverse range of fresh produce sourced directly from farms.\n\n"
                                + "Easy Access: You can conveniently log in using Google to access a world of freshness.\n\n"
                                + "User-Friendly Experience: Our app and website are designed to provide you with a seamless browsing and purchasing experience. Explore our intuitive interface to discover new items, read about our sellers, and make hassle-free transactions.\n\n"
                                + "Support Local Farmers: By choosing Fresh Farm, you're not just getting superior quality produce; you're also supporting local farmers and producers, helping them thrive and grow their businesses.\n\n"
                                + "To learn more about us, explore our offerings, and discover additional information about our mission, vision, and the incredible individuals behind our platform, feel free to visit our website \n https://jumbosahu19.wixsite.com/freshfarm.\n\n"
                                + "Once again, thank you for choosing Fresh Farm. We're excited to have you with us and can't wait to see how you embrace freshness in every bite.\n\n"
                                + "Happy browsing and happy shopping!\n\n"
                                + "Warm regards,\n"
                                + "Fresh Farm Team";
                        boolean f=false;
                        String host="smtp.gmail.com";
                        String from="freshfarmv@gmail.com";

                        //get the system properties
                        Properties properties = System.getProperties();
                        System.out.println("PROPERTIES "+properties);

                        //setting important information to properties object

                        //host set
                        properties.put("mail.smtp.host", host);
                        properties.put("mail.smtp.port","465");
                        properties.put("mail.smtp.ssl.enable","true");
                        properties.put("mail.smtp.auth","true");

                        //Step 1: to get the session object..
                        Session session=Session.getInstance(properties, new Authenticator() {
                                @Override
                                protected PasswordAuthentication getPasswordAuthentication() {
                                        return new PasswordAuthentication("freshfarmv@gmail.com", pass);
                                }



                        });

                        session.setDebug(true);

                        //Step 2 : compose the message [text,multi media]
                        MimeMessage m = new MimeMessage(session);

                        try {

                                //from email
                                m.setFrom(from);

                                //adding recipient to message
                                m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

                                //adding subject to message
                                m.setSubject(subject);


                                //adding text to message
                                m.setText(message);

                                //send

                                //Step 3 : send the message using Transport class
                                Transport.send(m);

                                System.out.println("Sent success...................");
                                f=true;


                        }catch (Exception e) {
                                e.printStackTrace();
                        }
                        return f;
        }

        @Override
        public boolean sendEmailCustomerOrderConfirmed(EmailCustomerOrderConfirmed emailMessage,String pass) {
                String subject=emailMessage.getSubject();
                String to=emailMessage.getTo();
                String message = "Dear "+emailMessage.getCustomerName()+",\n\n"
                        + "We're excited to inform you that your order has been confirmed. Here are the details:\n\n"
                        + "- Order ID: "+emailMessage.getOrderId()+"\n"
                        + "- Total Items: "+emailMessage.getTotalItem()+"\n"
                        + "- Total Amount: "+emailMessage.getTotalAmount()+"\n"
                        + "- Payment Method: "+emailMessage.getPaymentMethod()+"\n\n"
                        + "Thank you for shopping with us! If you have any questions or concerns regarding your order, please don't hesitate to contact us at freshfarmv@gmail.com\n\n"
                        + "Best regards,\n"
                        + "The Fresh Farm Team";
                boolean f=false;
                String host="smtp.gmail.com";
                String from="freshfarmv@gmail.com";

                //get the system properties
                Properties properties = System.getProperties();
                System.out.println("PROPERTIES "+properties);

                //setting important information to properties object

                //host set
                properties.put("mail.smtp.host", host);
                properties.put("mail.smtp.port","465");
                properties.put("mail.smtp.ssl.enable","true");
                properties.put("mail.smtp.auth","true");

                //Step 1: to get the session object..
                Session session=Session.getInstance(properties, new Authenticator() {
                        @Override
                        protected PasswordAuthentication getPasswordAuthentication() {
                                return new PasswordAuthentication("freshfarmv@gmail.com", pass);
                        }



                });

                session.setDebug(true);

                //Step 2 : compose the message [text,multi media]
                MimeMessage m = new MimeMessage(session);

                try {

                        //from email
                        m.setFrom(from);

                        //adding recipient to message
                        m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

                        //adding subject to message
                        m.setSubject(subject);


                        //adding text to message
                        m.setText(message);

                        //send

                        //Step 3 : send the message using Transport class
                        Transport.send(m);

                        System.out.println("Sent success...................");
                        f=true;


                }catch (Exception e) {
                        e.printStackTrace();
                }
                return f;
        }
        @Override
        public boolean sendCustomerOrderCancel(EmailCustomerCancelOrder emailMessage,String pass){
                String subject=emailMessage.getSubject();
                String to=emailMessage.getTo();
                String message = "Subject: Order Cancellation Confirmation\n\n"
                        + "Dear "+emailMessage.getCustomerName()+",\n\n"
                        + "We regret to inform you that your order has been canceled. Here are the details:\n\n"
                        + "- Order ID: "+emailMessage.getOrderId()+"\n"
                        + "- Total Items: "+emailMessage.getTotalItem()+"\n"
                        + "- Payment Method: "+emailMessage.getPaymentMethod()+"\n"
                        + "- Refund Status: "+emailMessage.getRefundStatus()+"\n\n"
                        + "If you have canceled this order by mistake or if you need further assistance, please feel free to reach out to us at freshfarmv@gmail.com \n Our support team will be happy to assist you.\n\n"
                        + "We apologize for any inconvenience caused and hope to serve you better in the future.\n\n"
                        + "Best regards,\n"
                        + "The Fresh Farm Team";
                boolean f=false;
                String host="smtp.gmail.com";
                String from="freshfarmv@gmail.com";

                //get the system properties
                Properties properties = System.getProperties();
                System.out.println("PROPERTIES "+properties);

                //setting important information to properties object

                //host set
                properties.put("mail.smtp.host", host);
                properties.put("mail.smtp.port","465");
                properties.put("mail.smtp.ssl.enable","true");
                properties.put("mail.smtp.auth","true");

                //Step 1: to get the session object..
                Session session=Session.getInstance(properties, new Authenticator() {
                        @Override
                        protected PasswordAuthentication getPasswordAuthentication() {
                                return new PasswordAuthentication("freshfarmv@gmail.com", pass);
                        }



                });

                session.setDebug(true);

                //Step 2 : compose the message [text,multi media]
                MimeMessage m = new MimeMessage(session);

                try {

                        //from email
                        m.setFrom(from);

                        //adding recipient to message
                        m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

                        //adding subject to message
                        m.setSubject(subject);


                        //adding text to message
                        m.setText(message);

                        //send

                        //Step 3 : send the message using Transport class
                        Transport.send(m);

                        System.out.println("Sent success...................");
                        f=true;


                }catch (Exception e) {
                        e.printStackTrace();
                }
                return f;
        }

        @Override
        public boolean sendFarmerOrderReceived(EmailFarmerOrderReceived emailMessage,String pass) {
                String subject=emailMessage.getSubject();
                String to=emailMessage.getTo();
                String message = "Dear "+emailMessage.getFarmerName()+",\n\n"
                        + "We're excited to inform you that you have received a new order. Here are the details:\n\n"
                        + "- Order ID: "+emailMessage.getOrderId()+"\n"
                        + "- Total Items: "+emailMessage.getTotalItem()+"\n"
                        + "- Total Amount: "+emailMessage.getTotalAmount()+"\n"
                        + "- Payment Method: "+emailMessage.getPaymentMethod()+"\n\n"
                        + "Please review the order details and prepare the items for shipment. Once the order is ready to be dispatched, please update the order status accordingly on our platform.\n\n"
                        + "If you have any questions or need further assistance regarding this order, please don't hesitate to contact us at freshfarmv@gmail.com \n Our support team is here to help.\n\n"
                        + "Thank you for your prompt attention to this matter.\n\n"
                        + "Best regards,\n"
                        + "The Fresh Farm Team";

                boolean f=false;
                String host="smtp.gmail.com";
                String from="freshfarmv@gmail.com";

                //get the system properties
                Properties properties = System.getProperties();
                System.out.println("PROPERTIES "+properties);

                //setting important information to properties object

                //host set
                properties.put("mail.smtp.host", host);
                properties.put("mail.smtp.port","465");
                properties.put("mail.smtp.ssl.enable","true");
                properties.put("mail.smtp.auth","true");

                //Step 1: to get the session object..
                Session session=Session.getInstance(properties, new Authenticator() {
                        @Override
                        protected PasswordAuthentication getPasswordAuthentication() {
                                return new PasswordAuthentication("freshfarmv@gmail.com",pass);
                        }



                });

                session.setDebug(true);

                //Step 2 : compose the message [text,multi media]
                MimeMessage m = new MimeMessage(session);

                try {

                        //from email
                        m.setFrom(from);

                        //adding recipient to message
                        m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

                        //adding subject to message
                        m.setSubject(subject);


                        //adding text to message
                        m.setText(message);

                        //send

                        //Step 3 : send the message using Transport class
                        Transport.send(m);

                        System.out.println("Sent success...................");
                        f=true;


                }catch (Exception e) {
                        e.printStackTrace();
                }
                return f;
        }
}
