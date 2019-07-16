package controller;


import domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import service.BudgetService;


//Costs

@RestController
public class BudgetController {

    @Autowired
    private BudgetService budgetService;




    @GetMapping("/staff/{id}")
    public Staff getStaff(@PathVariable Long id){
        return budgetService.getStaff(id);

    }
    @GetMapping("/staff/{id}/payment")
    public void payTuition(@PathVariable Long id, Payment payment){

        Staff staff = budgetService.getStaff(id);

         budgetService.paySalary(staff);

    }


}
