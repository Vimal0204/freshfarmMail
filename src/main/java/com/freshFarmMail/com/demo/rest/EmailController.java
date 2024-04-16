package com.freshFarmMail.com.demo.rest;
import com.freshFarmMail.com.demo.model.*;
import com.freshFarmMail.com.demo.service.EmailService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EmailController {
    @Value("${mail.password}")
    private String passing;
//    @Autowired
    private EmailService emailService;
    public EmailController(EmailService emailService){
        this.emailService=emailService;
    }

    @GetMapping("/welcome")
    public String welcome(){
        return "email sent successfully";
    }
    @PostMapping("/customerMail/welcome")
    public ResponseEntity<?> sendEmailWelcome(@RequestBody EmailMessageWelcome emailMessage){
        boolean result=  this.emailService.sendEmailWelcome(emailMessage,passing);
        System.out.println(emailMessage);
        if (result) {
            return ResponseEntity.ok("Done....");
        }else{
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Email not sent.");
        }
    }
    @PostMapping("/customerMail/OrderConfirmation")
    public ResponseEntity<?> sendEmailCustomerOrder(@RequestBody EmailCustomerOrderConfirmed emailMessage){
        boolean result=  this.emailService.sendEmailCustomerOrderConfirmed(emailMessage,passing);
        System.out.println(emailMessage);
        if (result) {
            return ResponseEntity.ok("Done....");
        }else{
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Email not sent.");
        }

    }
//
//    @PostMapping("/customerMail/OrderConfirmationViaCashOnDelivery")
//
    @PostMapping("/customerMail/OrderCancelled")
    public ResponseEntity<?> sendEmailCustomerOrderCancel(@RequestBody EmailCustomerCancelOrder emailMessage){
        boolean result=  this.emailService.sendCustomerOrderCancel(emailMessage,passing);
        System.out.println(emailMessage);
        if (result) {
            return ResponseEntity.ok("Done....");
        }else{
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Email not sent.");
        }

    }

    @PostMapping("/farmerMail/OrderConfirmation")
    public ResponseEntity<?> sendEmailFarmerOrder(@RequestBody EmailFarmerOrderReceived emailMessage){
        boolean result=  this.emailService.sendFarmerOrderReceived(emailMessage,passing);
        System.out.println(emailMessage);
        if (result) {
            return ResponseEntity.ok("Done....");
        }else{
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Email not sent.");
        }
    }
//    @PostMapping("/farmerMail/OrderConfirmationViaCashOnDelivery")
//
    @PostMapping("/farmerMail/OrderCancelled")
    public  ResponseEntity<?> sendEmailFarmerOrderCancel(@RequestBody EmailFarmerOrderCancel emailMessage){
        boolean result=  this.emailService.sendFarmerOrderCancel(emailMessage,passing);
        System.out.println(emailMessage);
        if (result) {
            return ResponseEntity.ok("Done....");
        }else{
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Email not sent.");
        }
    }
}
