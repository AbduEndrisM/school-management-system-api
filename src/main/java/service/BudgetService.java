package service;

import dao.*;
import domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

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
    private OtherCost otherCost;

    @Autowired
    private StaffDao staffDao;


    public Staff getStaff(Long id) {
        return staffDao.findById(id).get();
    }

    public void paySalary(Staff staff) {

    }

    public void payBonus(Staff staff) {

    }

    public void payTax(Tax tax) {

    }

    public void payOther(OtherCost otherCost) {

    }


}
