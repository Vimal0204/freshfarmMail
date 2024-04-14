package com.freshFarmMail.com.demo.rest;
import com.freshFarmMail.com.demo.model.EmailCustomerCancelOrder;
import com.freshFarmMail.com.demo.model.EmailCustomerOrderConfirmed;
import com.freshFarmMail.com.demo.model.EmailFarmerOrderReceived;
import com.freshFarmMail.com.demo.model.EmailMessageWelcome;
import com.freshFarmMail.com.demo.service.EmailService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EmailController {
//    @Autowired
    private EmailService emailService;
    public EmailController(EmailService emailService){
        this.emailService=emailService;
    }

    @GetMapping("/welcome")
    public String welcome(){
        return "email sent successfully";
    }
   /* @PostMapping("/sendEmail")
    public ResponseEntity<?> sendEmail(@RequestBody EmailMessageWelcome emailMessage){
        String message= "Dear Parth Khanna,\n\n"
                + "I hope this email finds you well. We are pleased to inform you that your profile has been shortlisted for the position of Junior Data Scientist at our esteemed organization. Your experience and skills align closely with what we are looking for, and we are excited about the possibility of you joining our team.\n\n"
                + "Your package for this role is set at 9 LPA, reflecting our appreciation for the expertise and value we believe you will bring to the team.\n\n"
                + "We received your profile from Wells Found, and we're grateful for their assistance in connecting us with talented individuals like yourself.\n\n"
                + "To proceed further, we would like to schedule a virtual interview via Google Meet. Below, you will find the meeting link for our scheduled session:\n\n"
                + "https://meet.google.com/zms-bduk-rib\n\n"
                + "Please make sure to mark your calendar for the interview, which is scheduled for 14/04/2024 at 9.00 am, IST.\n\n"
                + "Should you have any questions or concerns in the meantime, feel free to reach out to me directly via email or phone.\n\n"
                + "Once again, congratulations on being shortlisted for this opportunity. We look forward to meeting you virtually and discussing how your skills and experiences can contribute to our team's success.\n\n"
                + "Warm regards,\n\n"
                + "Revatti Guntamilleni\n"
                + "Senior Human Resource Manager,\n"
                + "Miquido fresh-farm solutions LLP\n"+"Please reply ASAP";
     boolean result=  this.emailService.sendEmail(emailMessage.getSubject(),message,emailMessage.getTo());
        System.out.println(emailMessage);
        if (result) {
            return ResponseEntity.ok("Done....");
        }else{
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Email not sent.");
        }
    }*/

    @PostMapping("/customerMail/welcome")
    public ResponseEntity<?> sendEmailWelcome(@RequestBody EmailMessageWelcome emailMessage){
        boolean result=  this.emailService.sendEmailWelcome(emailMessage);
        System.out.println(emailMessage);
        if (result) {
            return ResponseEntity.ok("Done....");
        }else{
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Email not sent.");
        }
    }
    @PostMapping("/customerMail/OrderConfirmation")
    public ResponseEntity<?> sendEmailCustomerOrder(@RequestBody EmailCustomerOrderConfirmed emailMessage){
        boolean result=  this.emailService.sendEmailCustomerOrderConfirmed(emailMessage);
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
        boolean result=  this.emailService.sendCustomerOrderCancel(emailMessage);
        System.out.println(emailMessage);
        if (result) {
            return ResponseEntity.ok("Done....");
        }else{
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Email not sent.");
        }

    }

    @PostMapping("/farmerMail/OrderConfirmationViaOnine")
    public ResponseEntity<?> sendEmailFarmerOrder(@RequestBody EmailFarmerOrderReceived emailMessage){
        boolean result=  this.emailService.sendFarmerOrderReceived(emailMessage);
        System.out.println(emailMessage);
        if (result) {
            return ResponseEntity.ok("Done....");
        }else{
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Email not sent.");
        }
    }
//    @PostMapping("/farmerMail/OrderConfirmationViaCashOnDelivery")
//
//    @PostMapping("/farmerMail/OrderCancelled")
}
