package com.mum.studentmis.controller;


import com.mum.studentmis.domain.*;
import com.mum.studentmis.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.mum.studentmis.service.BudgetService;


//Costs

@RestController
public class BudgetController {

    @Autowired
    PaymentService paymentService;
    @Autowired
    private BudgetService budgetService;

    @PostMapping("/budget/salary/{id}")
    public String paySalary(@PathVariable String id, @RequestBody Salary salary) {

        return budgetService.paySalary(salary);
    }


    @PostMapping("/budget/bonus/{id}")
    public String payBonus(@PathVariable String id, @RequestBody Bonus bonus) {

//        System.out.println("Welcome to MUM");
        return budgetService.payBonus(bonus);
    }


    @PostMapping("/budget/tax/{id}")
    public String payTax(@PathVariable String id, @RequestBody Tax tax) {
        return budgetService.payTax(tax);

    }


    @PostMapping("/budget/other/{id}")
    public String payOtherCost(@PathVariable String id, @RequestBody OtherCost otherCost) {
        return budgetService.payOther(otherCost);
    }

    ////////////////////////////////

    @GetMapping("/budget/salary/all") //all payments done as salary
    public double allSalary() {
        return budgetService.allSalaries();
    }

    @GetMapping("/budget/bonus/all") //all payments done as bonus
    public double allBonus() {
        return budgetService.allBonus();
    }

    @GetMapping("/budget/tax/all") //all payments done for tax
    public double allTax() {
      return   budgetService.allTaxes();
    }

    @GetMapping("/budget/other/all") //all other costs
    public double allOtherCost() {
        return budgetService.allOtherCosts();
    }


    @GetMapping("/budget/total")  //current school balance
    public double totalCost() {
return budgetService.totalCost();

    }

    @GetMapping("/budget/balance")  //current school balance
    public double paySalary() {
return this.totalCost() -paymentService.totalIncome();

    }


}
