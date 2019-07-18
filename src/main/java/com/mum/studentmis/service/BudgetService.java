package com.mum.studentmis.service;

import com.mum.studentmis.dao.BonusDao;
import com.mum.studentmis.dao.OtherCostDao;
import com.mum.studentmis.dao.SalaryDao;
import com.mum.studentmis.dao.TaxDao;
import com.mum.studentmis.domain.Bonus;
import com.mum.studentmis.domain.OtherCost;
import com.mum.studentmis.domain.Salary;
import com.mum.studentmis.domain.Tax;
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
            return "Error in paying: " + e.getMessage();
        }

        return "successfully Payed";
    }

    public String payBonus(Bonus bonus) {

        try {
            bonusDao.save(bonus);
        } catch (Exception e) {
            e.printStackTrace();
            return "Error in saving: " + e.getMessage();
        }

        return "successfully saved";
    }


    public String payTax(Tax tax) {
        try {
            taxDao.save(tax);
        } catch (Exception e) {
            return "Error in saving: " + e.getMessage();
        }

        return "successfully saved";
    }


    public String payOther(OtherCost otherCost) {

        try {
            otherCostDao.save(otherCost);
        } catch (Exception e) {
            return "Error in saving: " + e.getMessage();
        }

        return "successfully saved";
    }


    public double allSalaries() {
        List<Salary> studentFeeList = salaryDao.findAll();
        double totalfee = studentFeeList.stream()
                .mapToDouble(f -> f.getAmount())
                .sum();
        return totalfee;
    }

    public double allBonus() {

        List<Bonus> studentFeeList = bonusDao.findAll();
        double totalfee = studentFeeList.stream()
                .mapToDouble(f -> f.getAmount())
                .sum();
        return totalfee;

    }

    public double allTaxes() {
        List<Tax> studentFeeList = taxDao.findAll();
        double totalfee = studentFeeList.stream()
                .mapToDouble(f -> f.getAmount())
                .sum();
        return totalfee;
    }

    public double allOtherCosts() {
        List<OtherCost> studentFeeList = otherCostDao.findAll();
        double totalfee = studentFeeList.stream()
                .mapToDouble(f -> f.getAmount())
                .sum();
        return totalfee;
    }

    public double totalCost(){
        return allBonus() + allOtherCosts() + allSalaries() + allTaxes();
    }


    public List<Salary> salary() {

return salaryDao.findAll();
    }

    public List<Bonus> bonus() {
    return bonusDao.findAll();
    }

    public List<Tax> tax() {
    return taxDao.findAll();
    }

    public List<OtherCost> otherCost() {
   return otherCostDao.findAll();
    }
}
