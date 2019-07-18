package com.mum.studentmis.controller;

import com.mum.studentmis.StudentmisApplication;
import com.mum.studentmis.domain.*;
import com.mum.studentmis.service.BudgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.mum.studentmis.service.PaymentService;


//Incomes

@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Autowired
    private BudgetService budgetService;


    @PostMapping("/payment/student/{id}")
    public String paySchoolFee(@PathVariable String id, @RequestBody StudentFee studentFee) {
        return paymentService.studentPayment(studentFee);
    }


    @PostMapping("/payment/donation/{id}")
    public String giveDonation(@PathVariable String id, @RequestBody Donation donation) {
        return paymentService.donationPayment(donation);
    }


    @PostMapping("/payment/other/{id}")
    public String giveOther(@PathVariable String id, @RequestBody OtherIncome otherIncome) {
        return paymentService.otherPayment(otherIncome);
    }

    ////////////////////////////////

    @GetMapping("/student/pays/{id}") //all payments done by a single student done as salary
    public Object[] studentPaymentHistory(@PathVariable String id) {

        return paymentService.studentPaymentHistory(id);

    }



    ///////////

    @GetMapping("/payment/student/all") //all payments done as salary
    public double allStudentFee() {

        return paymentService.allStudentPayments();

    }

    @GetMapping("/payment/donation/all") //all payments done as bonus
    public double allDonation() {
        return paymentService.allDonations();
    }

    @GetMapping("/payment/other/all") //all payments done for tax
    public double allOtherIncome() {
        return paymentService.allOtherIncomes();
    }


    @GetMapping("/payment/total")  //current school balance
    public double totalIncome() {
        return paymentService.totalIncome();
    }

    @GetMapping("payment/all")
    public Object[] getAll() {
        Object object[] = new Object[3];
        object[0] = paymentService.studentFee();
        object[1] =paymentService.Donation();
        object[2] = paymentService.OtherIncome();
        return object;
    }

}
