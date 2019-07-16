package service;

import dao.*;
import domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class BudgetService {
    @Autowired
    private SalaryDao salaryDao;

    @Autowired
    private BonusDao bonusDao;

    @Autowired
    private TaxDao taxDao;

    @Autowired
    private OtherCostDao otherCostDao;


    public String paySalary(Salary salary) {
        try {
            salaryDao.save(salary);
        } catch (Exception e) {
            return "Error in paying" + e.getMessage();
        }

        return "successfully Payed";
    }

    public String payBonus(Bonus bonus) {

        try {
            bonusDao.save(bonus);
        } catch (Exception e) {
            return "Error in saving" + e.getMessage();
        }

        return "successfully saved";
    }


    public String payTax(Tax tax) {
        try {
            taxDao.save(tax);
        } catch (Exception e) {
            return "Error in saving" + e.getMessage();
        }

        return "successfully saved";
    }



    public String payOther(OtherCost otherCost) {

        try{
            otherCostDao.save(otherCost);
        }
        catch (Exception e){
            return "Error in saving"+ e.getMessage();
        }

        return "successfully saved";
    }


    public List<Salary> allSalaries(){
        return salaryDao.findAll();
    }

    public List<Bonus> allBonus(){
        return bonusDao.findAll();
    }
    public List<Tax> allTaxes(){
        return taxDao.findAll();
    }
    public List<OtherCost> allOtherCosts(){
        return otherCostDao.findAll();
    }


}
