package controller;

import domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.PaymentService;

import java.util.List;


//Incomes

@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;


    @PostMapping("/payment/student/{id}")
    public String paySchoolFee(@PathVariable String id, @RequestBody StudentFee studentFee) {
        return paymentService.studentPayment(studentFee);
    }


    @PostMapping("/payment/donation/{id}")
    public String giveDonation(@PathVariable String id, @RequestBody Donation donation) {
        return paymentService.donationPayment(donation);

    }


    @GetMapping("/payment/other/{id}")
    public String giveOther(@PathVariable String id, @RequestBody OtherIncome otherIncome) {
        return paymentService.otherPayment(otherIncome);
    }

    ////////////////////////////////

    @GetMapping("/payment/student/all") //all payments done as salary
    public double allStudentFee(@RequestBody StudentFee studentFee) {

        return paymentService.allStudentPayments();

    }

    @GetMapping("/payment/donation/all") //all payments done as bonus
    public void allDonation(@RequestBody Donation donation) {
        paymentService.allDonations();
    }

    @GetMapping("/payment/other/all") //all payments done for tax
    public void allOtherIncome(@RequestBody OtherIncome otherIncome) {
        paymentService.allOtherIncomes();
    }


    @GetMapping("/payment/total")  //current school balance
    public void totalIncome(@RequestBody Payment payment) {

    }

}
