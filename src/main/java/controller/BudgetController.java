package controller;


import domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import service.BudgetService;


//Costs

@RestController
public class BudgetController {

    @Autowired
    private BudgetService budgetService;

    @GetMapping("/budget/salary/{id}")
    public void paySalary(@PathVariable String id, @RequestBody Salary salary) {

        budgetService.paySalary(salary);
    }


    @GetMapping("/budget/salary/{id}")
    public void payBonus(@PathVariable String id, @RequestBody Bonus bonus) {
        budgetService.payBonus(bonus);
    }


    @GetMapping("/budget/tax/{id}")
    public void payTax(@PathVariable String id, @RequestBody Tax tax) {
budgetService.payTax(tax);

    }


    @GetMapping("/budget/other/{id}")
    public void payOtherCost(@PathVariable String id, @RequestBody OtherCost otherCost) {
budgetService.payOther(otherCost);
    }

    ////////////////////////////////

    @GetMapping("/budget/salary/all") //all payments done as salary
    public void allSalary(@RequestBody Salary salary) {
budgetService.allSalaries();
    }

    @GetMapping("/budget/bonus/all") //all payments done as bonus
    public void allBonus(@RequestBody Salary salary) {
budgetService.allBonus();
    }

    @GetMapping("/budget/tax/all") //all payments done for tax
    public void allTax(@RequestBody Tax tax) {
budgetService.allTaxes();
    }

    @GetMapping("/budget/othercost/all") //all other costs
    public void allOtherCost(@RequestBody Salary salary) {
budgetService.allOtherCosts();
    }


    @GetMapping("/budget/total")  //current school balance
    public void totalCost(@RequestBody Budget budget) {

    }

    @GetMapping("/budget/balance")  //current school balance
    public void paySalary(@RequestBody Budget budget) {


    }


}
