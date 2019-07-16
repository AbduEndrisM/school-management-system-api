package controller;

import domain.Income;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IncomeController {


    @GetMapping("/")
    public Income payTuition(@ModelAttribute Income income){


        return null;
    }

}
