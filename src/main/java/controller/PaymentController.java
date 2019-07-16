package controller;

import domain.Payment;
import domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import service.PaymentService;


//Incomes

@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/student/{id}")
    public Student payTuition(@PathVariable Long id){
        return paymentService.getStudent(id);

    }
    @GetMapping("/student/{id}/payment")
    public Student payTuition(@PathVariable Long id, Payment payment){

         Student student = paymentService.getStudent(id);
//         Income income1= incomeService.ge

        return null;

    }


}
